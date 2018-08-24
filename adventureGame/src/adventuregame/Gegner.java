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
public class Gegner {
    private String name;
    private int hp;
    private int hpStandartwert;
    private int angriffswert;
    private char gebiet;
    private String statuseffekt;
    
    public Gegner(String name, int hp, int angriffswert, char gebiet) {
        this.name = name;
        this.hp = hp;
        this.hpStandartwert = hp;
        this.angriffswert = angriffswert;
        this.gebiet = gebiet;
        this.statuseffekt = "";
    }

    public String getStatuseffekt() {
        return statuseffekt;
    }

    public void setStatuseffekt(String statuseffekt) {
        this.statuseffekt = statuseffekt;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGebiet() {
        return gebiet;
    }

    public void setGebiet(char gebiet) {
        this.gebiet = gebiet;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void resetHp(){
        this.hp = this.hpStandartwert;
        this.statuseffekt = "";
    }
    
    public int getAngriffswert() {
        return this.angriffswert;
    }
}
