/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author xXiZiXx
 */
public class GeschichteThread extends Thread {

    private boolean running;
    private GUI g;
    private Color farbe;
    private ArrayList<String> texte;
    private JPanel panelDavor;

    public GeschichteThread(GUI gui) {
        g = gui;
        farbe = Color.BLACK;
        panelDavor = null;
        texte = new ArrayList<String>();
    }

    public void start(ArrayList<String> aTexte, JPanel aPanelDavor) {
        super.start();
        running = true;
        this.texte = aTexte;
        this.panelDavor = aPanelDavor;
    }

    private void terminate() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            for (int i = 0; i < texte.size(); i++) {
                if (!texte.get(i).equals("ENDE")) {
                    while (this.farbe.getRGB() != -1) {
                        g.anzeigeText(texte.get(i), farbe, panelDavor);
                        try {
                            Thread.sleep(150);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(AktualisierungsThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        farbe = farbe.brighter();
                    }
                    this.farbe = Color.BLACK;
                } else {
                    g.anzeigeText(texte.get(i), farbe, panelDavor);
                    terminate();
                }

            }
        }
    }
}
