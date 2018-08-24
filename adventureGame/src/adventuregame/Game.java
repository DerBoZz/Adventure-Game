/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.io.IOException;

/**
 *
 * @author marcel.zurawka
 */
public class Game {

    private Rohstoffe rohstoffe;
    private Zuordnung zuordnung;
    private GegnerListen gegnerListe;
    private Itempools itempools;
    private Dorf dorf;
    private Kampf kampf;
    private Spieler spieler;
    private DateiLeser reader;
    private char[][] karte;
    private Geschichte geschichte;
    private Position bruderPosition;

    public Game() throws IOException {
        this.rohstoffe = new Rohstoffe();
        this.zuordnung = new Zuordnung();
        this.gegnerListe = new GegnerListen();
        this.itempools = new Itempools();
        this.reader = new DateiLeser();
        this.karte = new char[31][31];
        this.karte = this.reader.karteEinlesen();
        this.gegnerListe.datenInit(reader.gegnerEinlesen());
        initialisieren();
        this.dorf = new Dorf(stadtPosition(), reader.gebaeudeEinlesen());
        this.spieler = new Spieler(this.dorf.getPosition(), reader.itemEinlesen("Zauber"), itempools.getWaffenpool().get(0),itempools.getRuestungenpool().get(0));
        itempools.getWaffenpool().remove(0);
        itempools.getRuestungenpool().remove(0);
        this.kampf = new Kampf(this.spieler);
        this.geschichte = new Geschichte(this.reader.geschichteEinlesen("GeschichteAnfang"), this.reader.geschichteEinlesen("GeschichteEnde"));
        this.bruderPosition = randomHoehle();
    }

    public Geschichte getGeschichte() {
        return geschichte;
    }

    public DateiLeser getReader() {
        return reader;
    }
    public Position getBruderPosition(){
        return bruderPosition;
    }
    public void updateRohstoffe() {
        double holzFaktor = this.dorf.getZufriedenheit() / 50;
        if (dorf.getGebaeudeGebaut(2)) {
            holzFaktor += 0.5;
        }
        double faktorBergbau = this.dorf.getZufriedenheit() / 50 + this.dorf.getBergkarrenAnzahl() * 0.05;
        rohstoffe.updateRohstoffListe((int) (zuordnung.getEinwohnerHolz() * holzFaktor), (int) (zuordnung.getEinwohnerStein() * faktorBergbau), (int) (zuordnung.getEinwohnerGold() * faktorBergbau), (int) (zuordnung.getKohleMinen() * faktorBergbau));
    }

    private void initialisieren() throws IOException {
        itempools.setWaffenpool(reader.itemEinlesen("Waffen"));
        itempools.setRuestungenpool(reader.itemEinlesen("Ruestungen"));
        itempools.setMagieWaffenpool(reader.itemEinlesen("Magiewaffen"));
        itempools.setMagieRuestungenpool(reader.itemEinlesen("Magieruestungen"));
        itempools.setHaendlerItems(reader.itemEinlesen("HaendlerItems"));
        itempools.setSchmiedeItems(reader.itemEinlesen("SchmiedeItems"));
    }

    private Position randomHoehle() {
        Position p = null;
        int r = (int) (Math.random() * 100);
        if (r < 25) {
            p = new Position(0, 0);
        } else if (r < 50) {
            p = new Position(30, 0);
        } else if (r < 75) {
            p = new Position(0, 30);
        } else if (r < 100) {
            p = new Position(30, 30);
        }
        return p;
    }

    private Position stadtPosition() {
        Position p = null;
        for (int y = 0; y < 31; y++) {
            for (int x = 0; x < 31; x++) {
                if (karte[x][y] == 'C') {
                    p = new Position(x, y);
                }
            }
        }
        return p;
    }

    public Zuordnung getZuordnung() {
        return zuordnung;
    }

    public Kampf getKampf() {
        return kampf;
    }

    public Rohstoffe getRohstoffe() {
        return rohstoffe;
    }

    public GegnerListen getGegnerListe() {
        return gegnerListe;
    }

    public Spieler getSpieler() {
        return spieler;
    }

    public char[][] getKarte() {
        return karte;
    }

    public Dorf getDorf() {
        return dorf;
    }

    public Itempools getItempool() {
        return itempools;
    }

    public boolean gegnerErscheint() {
        boolean gegnerDa = false;
        Gegner tmpGegner = null;
        if (karte[spieler.getPosition().getX()][spieler.getPosition().getY()] == 'K') {
            if (this.getZuordnung().getKohleMinen() >= 10 && ! dorf.mineBelegtAufPosition(spieler.getPosition())) {
                tmpGegner = this.gegnerListe.gegnerErscheint(karte, spieler);
            }
        } else {
            tmpGegner = this.gegnerListe.gegnerErscheint(karte, spieler);
        }
        if (tmpGegner != null) {
            this.kampf.setDerzeitigerGegner(tmpGegner);
            gegnerDa = true;
        }
        return gegnerDa;
    }
}
