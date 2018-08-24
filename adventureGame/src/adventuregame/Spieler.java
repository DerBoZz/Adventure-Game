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
public class Spieler {

    private int hp;
    private boolean zauberLadenBesucht;
    private ArrayList<Item> invWaffen;
    private ArrayList<Item> invRuestungen;
    private int heiltraenke;
    private ArrayList<Zauber> zauber;
    private Item equipWaffe;
    private Item equipRuestung;
    private Position p;

    public Spieler(Position p, ArrayList<Item> zauber, Item startWaffe, Item startRuestung) {
        this.p = p;
        this.hp = 100;

        this.zauberLadenBesucht = false;
        this.zauber = new <Zauber>ArrayList();
        for (int i = 0; i < zauber.size(); i++) {
            this.zauber.add(new Zauber(zauber.get(i).getName(), zauber.get(i).getWert(), zauber.get(i).getKosten(), zauber.get(i).getInfoText()));
        }
        this.heiltraenke = 0;
        this.invWaffen = new <Item>ArrayList();
        this.invRuestungen = new <Item>ArrayList();
        this.invWaffen.add(startWaffe);
        this.invRuestungen.add(startRuestung);

        this.equipWaffe = this.invWaffen.get(0);
        this.equipRuestung = this.invRuestungen.get(0);
    }

    public boolean isZauberLadenBesucht() {
        return zauberLadenBesucht;
    }

    public void setZauberLadenBesucht(boolean zauberLadenBesucht) {
        this.zauberLadenBesucht = zauberLadenBesucht;
    }

    public int getHeilpreis() {
        int preis = (100 - hp) * 30;
        if (hp <= 0) {
            preis = 5000;
        }
        return preis;
    }

    public ArrayList<Zauber> getZauber() {
        return zauber;
    }

    public void setZauber(ArrayList<Zauber> zauber) {
        this.zauber = zauber;
    }

    public int getHp() {
        return hp;
    }

    public int getHeiltraenke() {
        return heiltraenke;
    }

    public void setHeiltraenke(int heiltraenke) {
        this.heiltraenke = heiltraenke;
    }

    public void benutzeHeiltrank() {
        if (this.heiltraenke > 0) {
            this.heiltraenke--;
            if ((this.hp + 30) <= 100) {
                this.hp += 30;
            } else {
                this.hp = 100;
            }
        }
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Position getPosition() {
        return p;
    }

    public void setPosition(Position p) {
        this.p = p;
    }

    public ArrayList<Item> getInvWaffen() {
        return invWaffen;
    }

    public ArrayList<Item> getInvRuestungen() {
        return invRuestungen;
    }

    public Item getEquipWaffe() {
        return equipWaffe;
    }

    public Item getEquipRuestung() {
        return equipRuestung;
    }

    public void setEquipWaffeAusInventar(int i) {
        this.equipWaffe = this.invWaffen.get(i);
    }

    public void setEquipRuestungAusInventar(int i) {
        this.equipRuestung = this.invRuestungen.get(i);
    }

    public double schadensFaktorMagie(int zauber) {
        double schadensfaktor = 1;

        //Waffenbonus
        if (zauber == 0 && this.equipWaffe.getName().equals("Orkanstab")) {
            schadensfaktor += 0.35;
        } else if (zauber == 1 && this.equipWaffe.getName().equals("Feuerstab")) {
            schadensfaktor += 0.15;
        } else if (zauber == 2 && this.equipWaffe.getName().equals("Froststab")) {
            schadensfaktor += 0.05;
        }
        if (this.equipWaffe.getName().equals("Elementarschwert")) {
            schadensfaktor += 0.5;
        } else if (this.equipWaffe.getName().equals("ULTIMATUM")) {
            schadensfaktor += 1;
        }
        //Rüstungsbonus
        if (zauber == 0 && this.equipRuestung.getName().equals("Orkanrüstung")) {
            schadensfaktor += 0.35;
        } else if (zauber == 1 && this.equipRuestung.getName().equals("Feuerrüstung")) {
            schadensfaktor += 0.15;
        } else if (zauber == 2 && this.equipRuestung.getName().equals("Frostrüstung")) {
            schadensfaktor += 0.05;
        }
        if (this.equipRuestung.getName().equals("Elementarrüstung")) {
            schadensfaktor += 0.5;
        } else if (this.equipRuestung.getName().equals("ULTIMATUM")) {
            schadensfaktor += 1;
        }
        return schadensfaktor;
    }
}
