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
public class KartenFeld extends JPanel {

    private Game c;
    private int abstand;

    public KartenFeld(Game aController) {
        this.c = aController;
        this.abstand = 17;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawMap(g);
    }

    private void drawMap(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 550,550);
        for (int y = 0; y < 31; y++) {
            for (int x = 0; x < 31; x++) {
                if (!(c.getSpieler().getPosition().getX() == x && c.getSpieler().getPosition().getY() == y)) {
                    //Alles andere
                    g.setColor(getFarbeVonChar(c.getKarte()[x][y]));
                    g.fillRect(x * abstand, y * abstand, x * abstand + abstand, y * abstand + abstand);
                } else {
                    //Spieler
                    g.setColor(getFarbeVonChar('S'));
                    g.fillRect(x*abstand, y*abstand, x*abstand + abstand, y*abstand + abstand);
                }
            }
        }
    }

    private Color getFarbeVonChar(char feld) {
        Color farbe = Color.BLACK;
        switch (feld) {
            case 'G':
                farbe = new Color(173, 255, 47);
                break;
            case 'F':
                farbe = new Color(69, 139, 116);
                break;
            case 'P':
                farbe = new Color(34, 139, 34);
                break;
            case 'Z':
                farbe = new Color(85, 107, 47);
                break;
            case 'W':
                farbe = new Color(255, 165, 79);
                break;
            case 'O':
                farbe = new Color(139, 90, 43);
                break;
            case 'R':
                farbe = new Color(139, 35, 35);
                break;
            case 'B':
                farbe = new Color(105, 105, 105);
                break;
            case 'Y':
                farbe = new Color(214, 214, 214);
                break;
            case 'H':
                farbe = new Color(162, 181, 205);
                break;
            case 'S':
                farbe = new Color(255, 64, 64);
                break;
            case 'K':
                farbe = new Color(0, 0, 0);
                break;
            case 'C':
                farbe = new Color(250,128,114);
                break;
        }
        return farbe;
    }
}
