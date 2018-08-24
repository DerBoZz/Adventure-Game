/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

/**
 *
 * @author Schüler
 */
public class Kohlemine {
    private Position p;
    private boolean besetzt;

    public Kohlemine(Position p) {
        this.p = p;
        this.besetzt = true;
    }

    public Position getP() {
        return p;
    }
    public boolean isBesetzt() {
        return besetzt;
    }
}
