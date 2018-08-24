/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcel.zurawka
 */
public class Run {

    public static void main(String[] args) {

        try {
            Game s;
            s = new Game();
            GUI gui = new GUI(s);
            gui.setVisible(true);
            
        } catch (IOException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        
    }}
}
