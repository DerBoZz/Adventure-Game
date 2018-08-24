/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcel.zurawka
 */
public class AktualisierungsThread extends Thread{
    private boolean running;
    private GUI g;
    
    public AktualisierungsThread(GUI gui){
        g= gui;
    }
    
    @Override
    public void start(){
        super.start();
        running = true;
    }
    
    public void terminate(){
        running = false;
    }
    public boolean isRunning(){
        return running;
    }
    @Override
    public void run(){
        while(running){
            g.guiAktualisierung();
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(AktualisierungsThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
