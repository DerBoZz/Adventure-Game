/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.util.ArrayList;

/**
 *
 * @author marcel.zurawka
 */
public class GegnerListen {

    private ArrayList<Gegner> gegnerGrasListe;
    private ArrayList<Gegner> gegnerFlussListe;
    private ArrayList<Gegner> gegnerWaldListe;

    private ArrayList<Gegner> gegnerSumpfListe;
    private ArrayList<Gegner> gegnerWuesteListe;
    private ArrayList<Gegner> gegnerOrktalListe;

    private ArrayList<Gegner> gegnerHoellenlandschaftListe;
    private ArrayList<Gegner> gegnerGebirgeListe;
    private ArrayList<Gegner> gegnerGeisterwaldListe;

    private ArrayList<Gegner> gegnerHoehlenListe;
    private ArrayList<Gegner> gegnerKohleMineListe;

    public GegnerListen() {
        this.gegnerGrasListe = new <Gegner> ArrayList();
        this.gegnerFlussListe = new <Gegner> ArrayList();
        this.gegnerWaldListe = new <Gegner> ArrayList();
        this.gegnerSumpfListe = new <Gegner> ArrayList();
        this.gegnerWuesteListe = new <Gegner> ArrayList();
        this.gegnerOrktalListe = new <Gegner> ArrayList();
        this.gegnerHoellenlandschaftListe = new <Gegner> ArrayList();
        this.gegnerGebirgeListe = new <Gegner> ArrayList();
        this.gegnerGeisterwaldListe = new <Gegner> ArrayList();
        this.gegnerHoehlenListe = new <Gegner> ArrayList();
        this.gegnerKohleMineListe = new <Gegner> ArrayList();
    }

    public Gegner gegnerErscheint(char[][] aKarte, Spieler aSpieler) {
        int r = (int) (Math.random() * 100);
        Gegner derzeitigerGegner = null;
        switch (aKarte[aSpieler.getPosition().getX()][aSpieler.getPosition().getY()]) {
            case 'G':
                //Auf Gras chance von 10%
                if (r < 10) {
                    derzeitigerGegner = gegnerGrasListe.get((int) (Math.random() * gegnerGrasListe.size()));
                }
                break;
            case 'F':
                //70% im Fluss
                if (r < 70) {
                    derzeitigerGegner = gegnerFlussListe.get((int) (Math.random() * gegnerFlussListe.size()));
                }
                break;
            case 'P':
                //30% im Wald
                if (r < 30) {
                    derzeitigerGegner = gegnerWaldListe.get((int) (Math.random() * gegnerWaldListe.size()));
                }
                break;
            case 'Z':
                //35% im Sumpf
                if (r < 35) {
                    derzeitigerGegner = gegnerSumpfListe.get((int) (Math.random() * gegnerSumpfListe.size()));
                }
                break;
            case 'W':
                //15%  in Wüste
                if (r < 15) {
                    derzeitigerGegner = gegnerWuesteListe.get((int) (Math.random() * gegnerWuesteListe.size()));
                }
                break;
            case 'O':
                //25% im Orktal
                if (r < 25) {
                    derzeitigerGegner = gegnerOrktalListe.get((int) (Math.random() * gegnerOrktalListe.size()));
                }
                break;
            case 'R':
                //40% in Höllenlandschaft
                if (r < 40) {
                    derzeitigerGegner = gegnerHoellenlandschaftListe.get((int) (Math.random() * gegnerHoellenlandschaftListe.size()));
                }
                break;
            case 'B':
                //40% im Gebirge
                if (r < 40) {
                    derzeitigerGegner = gegnerGebirgeListe.get((int) (Math.random() * gegnerGebirgeListe.size()));
                }
                break;
            case 'Y':
                //40% in Geisterwald
                if (r < 40) {
                    derzeitigerGegner = gegnerGeisterwaldListe.get((int) (Math.random() * gegnerGeisterwaldListe.size()));
                }
                break;
            case 'H':
                //100% in Hoehle
                if (r < 100) {
                    derzeitigerGegner = gegnerHoehlenListe.get((int) (Math.random() * gegnerHoehlenListe.size()));
                }
                break;
            case 'K':
                //75% in Kohlemine
                if (r < 75) {
                    derzeitigerGegner = gegnerKohleMineListe.get((int) (Math.random() * gegnerKohleMineListe.size()));
                }
        }
        return derzeitigerGegner;
    }

    public void datenInit(ArrayList<Gegner> tmpGegnerListe) {
        for (int i = 0; i < tmpGegnerListe.size(); i++) {
            char tmpGebiet = tmpGegnerListe.get(i).getGebiet();
            switch (tmpGebiet) {
                case 'G':
                    this.gegnerGrasListe.add(tmpGegnerListe.get(i));
                    break;
                case 'F':
                    this.gegnerFlussListe.add(tmpGegnerListe.get(i));
                    break;
                case 'P':
                    this.gegnerWaldListe.add(tmpGegnerListe.get(i));
                    break;
                case 'Z':
                    this.gegnerSumpfListe.add(tmpGegnerListe.get(i));
                    break;
                case 'W':
                    this.gegnerWuesteListe.add(tmpGegnerListe.get(i));
                    break;
                case 'O':
                    this.gegnerOrktalListe.add(tmpGegnerListe.get(i));
                    break;
                case 'R':
                    this.gegnerHoellenlandschaftListe.add(tmpGegnerListe.get(i));
                    break;
                case 'B':
                    this.gegnerGebirgeListe.add(tmpGegnerListe.get(i));
                    break;
                case 'Y':
                    this.gegnerGeisterwaldListe.add(tmpGegnerListe.get(i));
                    break;
                case 'H':
                    this.gegnerHoehlenListe.add(tmpGegnerListe.get(i));
                    break;
                case 'K':
                    this.gegnerKohleMineListe.add(tmpGegnerListe.get(i));
                    break;
            }
        }
    }

}
