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
public class Itempools {
    private ArrayList<Item> waffenpool;
    private ArrayList<Item> ruestungenpool;
    private ArrayList<Item> magieWaffenpool;
    private ArrayList<Item> magieRuestungenpool;
    private ArrayList<Item> haendlerItems;
    private ArrayList<Item> schmiedeItems;
    
    public Itempools() {
        this.waffenpool = new <Item> ArrayList();
        this.ruestungenpool = new <Item> ArrayList();
        this.magieWaffenpool= new <Item> ArrayList();
        this.magieRuestungenpool= new <Item> ArrayList();
        this.haendlerItems = new <Item> ArrayList();
        this.schmiedeItems = new <Item> ArrayList();
    }

    public ArrayList<Item> getSchmiedeItems() {
        return schmiedeItems;
    }

    public void setSchmiedeItems(ArrayList<Item> schmiedeItems) {
        this.schmiedeItems = schmiedeItems;
    }

    public ArrayList<Item> getHaendlerItems() {
        return haendlerItems;
    }

    public void setHaendlerItems(ArrayList<Item> items) {
        this.haendlerItems = items;
    }
    
    public void setWaffenpool(ArrayList<Item> aWaffenpool) {
        this.waffenpool = aWaffenpool;
    }

    public ArrayList<Item> getWaffenpool() {
        return waffenpool;
    }
    
    public ArrayList<Item> getRuestungenpool() {
        return ruestungenpool;
    }

    public void setRuestungenpool(ArrayList<Item> ruestungenpool) {
        this.ruestungenpool = ruestungenpool;
    }

    public ArrayList<Item> getMagieWaffenpool() {
        return magieWaffenpool;
    }

    public void setMagieWaffenpool(ArrayList<Item> magieWaffenpool) {
        this.magieWaffenpool = magieWaffenpool;
    }

    public ArrayList<Item> getMagieRuestungenpool() {
        return magieRuestungenpool;
    }

    public void setMagieRuestungenpool(ArrayList<Item> magieRuestungenpool) {
        this.magieRuestungenpool = magieRuestungenpool;
    }

  
    
}
