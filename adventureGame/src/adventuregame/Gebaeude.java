/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.util.ArrayList;

/**
 *
 * @author xXiZiXx
 */
public class Gebaeude extends Item{
    private ArrayList<String> anzeigeText;

    public Gebaeude(String name, int wert, int[] kosten, String infoText, ArrayList<String>aAnzeigeText) {
        super(name, wert, kosten, infoText);
        this.anzeigeText = aAnzeigeText;
    }

    public ArrayList<String> getAnzeigeText() {
        return anzeigeText;
    }
}
