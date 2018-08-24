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
public class Rohstoffe {

    private int holz;
    private int stein;
    private int gold;
    private int eisen;
    private int kohle;

    public Rohstoffe() {
        this.holz = 0;
        this.stein = 0;
        this.gold = 0;
        this.eisen = 0;
        this.kohle = 0;
    }
    public boolean genugGold(int aGold){
         boolean genug = false;
        if (aGold <= this.gold) {
            genug = true;
            this.gold -= aGold;
        }
        return genug;
    }
    public boolean genugRohstoffe(int[] kosten) {
        boolean genug = false;
        if (kosten[0] <= holz && kosten[1] <= stein && kosten[2] <= gold && kosten[3] <= eisen && kosten[4] <= kohle) {
            genug = true;
            this.holz -= kosten[0];
            this.stein -= kosten[1];
            this.gold -= kosten[2];
            this.eisen -= kosten[3];
            this.kohle -= kosten[4];
        }
        return genug;
    }

    public void updateRohstoffListe(int einwohnerHolz, int einwohnerStein, int einwohnerGold, int kohleMinen) {
        this.holz += einwohnerHolz;
        this.stein += einwohnerStein;
        this.gold += einwohnerGold;
        this.kohle += kohleMinen;
    }

    public void setEisen(int eisen) {
        this.eisen = eisen;
    }
    
    public int getHolz() {
        return holz;
    }

    public int getStein() {
        return stein;
    }

    public int getGold() {
        return gold;
    }

    public int getEisen() {
        return eisen;
    }

    public int getKohle() {
        return kohle;
    }

}
