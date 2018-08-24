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
public class Item {
    protected String name;
    protected int wert;
    protected String infoText;
    protected int[] kosten; //Holz, Stein, Gold, Eisen, Kohle
    
    public Item(String name,int wert,int[] kosten, String infoText) {
        this.name = name;
        this.wert = wert;
        this.infoText = infoText;
        this.kosten = kosten;
    }

    protected String getInfoText() {
        return infoText;
    }

    protected void setInfoText(String infoText) {
        this.infoText = infoText;
    }

    protected int[] getKosten() {
        return kosten;
    }

    protected void setKosten(int[] aKosten) {
        this.kosten = aKosten;
    }

    
    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getWert() {
        return wert;
    }

    protected void setWert(int wert) {
        this.wert = wert;
    }
    
    
}
