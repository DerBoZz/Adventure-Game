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
public class Kampf {

    private Spieler spieler;
    private Gegner derzeitigerGegner;

    public Kampf(Spieler spieler) {
        this.spieler = spieler;
        this.derzeitigerGegner = null;
    }

    public Gegner getDerzeitigerGegner() {
        return derzeitigerGegner;
    }

    public void setDerzeitigerGegner(Gegner derzeitigerGegner) {
        this.derzeitigerGegner = derzeitigerGegner;
    }

    public int angriff(boolean spielerAmZug) {
        int schaden = 0;

        if (spielerAmZug) {
            //SpielerAngriff
            int schadensbonus = 0;
            if (derzeitigerGegner.getStatuseffekt().equals("Brennend")) {
                schadensbonus = 2 * this.spieler.getZauber().get(1).getLevel();
            }
            schaden = (int) (this.spieler.getEquipWaffe().getWert() * schadensFaktorNormalerAngriff()) + schadensbonus;
            this.derzeitigerGegner.setHp(this.derzeitigerGegner.getHp() - schaden);
        } else {
            //GegnerAngriff
            if (this.derzeitigerGegner.getStatuseffekt().equals("Eingefroren")) {
                schaden = 0;
                this.derzeitigerGegner.setStatuseffekt("");
            } else {
                schaden = (int) (this.derzeitigerGegner.getAngriffswert() * schadensFaktorNormalerAngriff() - (Math.round(this.spieler.getEquipRuestung().getWert() / 10)));
                this.spieler.setHp(this.spieler.getHp() - schaden);
            }
        }

        return schaden;
    }

    public int magie(int zauber) {
        int schaden = (int)(spieler.getZauber().get(zauber).getWert() * spieler.schadensFaktorMagie(zauber));

        int r = (int) (Math.random() * 100);
        switch (this.spieler.getZauber().get(zauber).getName()) {
            case "Feuerball":
                if (r < 30) {
                    //30% Chance auf Brennen
                    this.derzeitigerGegner.setStatuseffekt("Brennend");
                }
                break;
            case "Frostkugel":
                if (r < 40) {
                    //40% Chance auf Einfrieren
                    this.derzeitigerGegner.setStatuseffekt("Eingefroren");
                }
                break;
        }
        if (this.derzeitigerGegner.getStatuseffekt().equals("Brennend")) {
            //Schaden von Brennen abhängig von Feuerball Level
            schaden += 2 * this.spieler.getZauber().get(1).getLevel();
        }
        this.derzeitigerGegner.setHp(this.derzeitigerGegner.getHp() - schaden);
        return schaden;
    }

    private double schadensFaktorNormalerAngriff() {
        double schadensfaktor = 1;
        if ((int) (Math.random() * 100) < 5) {
            //Kritischer Treffer von 5%
            schadensfaktor = 2.0;
        }
        return schadensfaktor;
    }

    

}
