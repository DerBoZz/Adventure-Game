/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

/**
 *
 * @author marcel.zurawka
 */
public class Zuordnung {
    private int einwohnerGold;
    private int einwohnerStein;
    private int einwohnerHolz;
    private int kohleMinen;

    public Zuordnung() {
        this.einwohnerGold = 0;
        this.einwohnerStein = 0;
        this.einwohnerHolz = 0;
        this.kohleMinen = 0;
    }

    
    public void updateZuordnung(int gold, int stein, int holz) {
        this.einwohnerGold = gold;
        this.einwohnerStein = stein;
        this.einwohnerHolz = holz;
    }

    public void setKohleMinen(int kohleMinen) {
        this.kohleMinen = kohleMinen;
    }
    
    public int getEinwohnerGold() {
        return einwohnerGold;
    }

    public int getEinwohnerStein() {
        return einwohnerStein;
    }

    public int getEinwohnerHolz() {
        return einwohnerHolz;
    }

    public int getKohleMinen() {
        return kohleMinen;
    }
}
