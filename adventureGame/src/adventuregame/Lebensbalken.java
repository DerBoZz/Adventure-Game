/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author marcel.zurawka
 */
public class Lebensbalken extends JPanel {

    private int hp;
    
    public Lebensbalken() {
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(0, 0, hp, 10);
    }
    public void setHp(int hp){
        this.hp = hp;
    }
}
