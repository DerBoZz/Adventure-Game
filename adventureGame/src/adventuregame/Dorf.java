/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.util.ArrayList;

/**
 *
 * @author Schüler
 */
public class Dorf {

    private Position pos;
    private ArrayList<Kohlemine> minen;
    private boolean[] gebaeudeGebaut;
    private int bergkarrenAnzahl;
    
    private int anzahlEinwohner;
    private int maxAnzahlEinwohner;
    private int zufriedenheit;
    
    private ArrayList<Gebaeude> gebaeudeListe;

    public Dorf(Position aPos, ArrayList<Gebaeude> gebaeudeListe) {
        this.pos = aPos;
        this.gebaeudeListe = gebaeudeListe;
        this.gebaeudeGebaut = new boolean[this.gebaeudeListe.size()];
        this.minen = new ArrayList<Kohlemine>();
        for (int i = 0; i < this.gebaeudeGebaut.length; i++) {
            this.gebaeudeGebaut[i] = false;
        }

        this.bergkarrenAnzahl = 0;
        this.anzahlEinwohner = 5;
        this.maxAnzahlEinwohner = 10;
        this.zufriedenheit = 50;
    }

    public ArrayList<Kohlemine> getMinen() {
        return minen;
    }

    public boolean mineBelegtAufPosition(Position p){
        boolean mineBelegt = false;
        for(int i = 0; i < minen.size();i++){
            if(minen.get(i).getP().getX() == p.getX() && minen.get(i).getP().getY() == p.getY()){
                mineBelegt = true;
            }
        }
        return mineBelegt;
    }

    public int getBergkarrenAnzahl() {
        return bergkarrenAnzahl;
    }

    public void setBergkarrenAnzahl(int bergkarrenAnzahl) {
        this.bergkarrenAnzahl = bergkarrenAnzahl;
    }

    public ArrayList<Gebaeude> getGebaeudeListe() {
        return gebaeudeListe;
    }
    public Gebaeude getGebaeudeNachName(String name){
        Gebaeude g = null;
        for(int i = 0; i < gebaeudeListe.size();i++){
            if(gebaeudeListe.get(i).getName().equals(name)){
                g = gebaeudeListe.get(i);
            }
        }
        return g;
    }

    public boolean getGebaeudeGebaut(int i) {
        return gebaeudeGebaut[i];
    }

    public void setGebaeudeGebaut(String name) {
        switch (name) {
            case "Brunnen":
                gebaeudeGebaut[0] = true;
                break;
            case "Rathaus":
                gebaeudeGebaut[1] = true;
                break;
            case "Sägewerk":
                gebaeudeGebaut[2] = true;
                break;
            case "Schmiede":
                gebaeudeGebaut[3] = true;
                break;
            case "Zauberladen":
                gebaeudeGebaut[4] = true;
                break;
            case "Kräuterladen":
                gebaeudeGebaut[5] = true;
                break;
            case "Marktplatz":
                gebaeudeGebaut[6] = true;
                break;
            case "Statue":
                gebaeudeGebaut[7] = true;
                this.zufriedenheit += 5;
                break;
            case "Therme":
                gebaeudeGebaut[8] = true;
                this.zufriedenheit += 10;
                break;
            case "Kirche":
                gebaeudeGebaut[9] = true;
                this.zufriedenheit += 15;
                break;
            case "Galgen":
                gebaeudeGebaut[10] = true;
                this.zufriedenheit += 5;
                break;
            case "Schießstand":
                gebaeudeGebaut[11] = true;
                this.zufriedenheit += 15;
                break;
            case "Haus":
                this.maxAnzahlEinwohner += 5;
                this.gebaeudeListe.get(0).getKosten()[0] += 50;
                break;
        }
    }

    public int getMaxAnzahlEinwohner() {
        return maxAnzahlEinwohner;
    }

    public Position getPosition() {
        return pos;
    }

    public int getAnzahlEinwohner() {
        return this.anzahlEinwohner;
    }

    public int getZufriedenheit() {
        return zufriedenheit;
    }

    public void bewohnerErscheint() {
        if (anzahlEinwohner < maxAnzahlEinwohner) {
            int r = (int) (Math.random() * 100);
            if (r < 10) {
                anzahlEinwohner++;
            }
        }
    }
}
