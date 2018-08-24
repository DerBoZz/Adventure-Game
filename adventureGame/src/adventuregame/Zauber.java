/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

/**
 *
 * @author xXiZiXx
 */
public class Zauber extends Item {

    private int level;

    public Zauber(String name, int wert, int[] kosten, String infoText) {
        super(name, wert, kosten, infoText);
        this.level = 0;
    }

    @Override
    public int getWert() {
        int retWert = this.wert;
        if (this.level == 0) {
            retWert = 0;
        }
        return retWert;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int aLevel) {
        if (aLevel != this.level) {
            this.level = aLevel;
            this.wert += this.wert * ((this.level - 1) * 0.1);
        }
    }

}
