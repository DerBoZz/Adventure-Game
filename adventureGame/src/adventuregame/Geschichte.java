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
public class Geschichte {
    private ArrayList<String> geschichteStringAnfang;
    private ArrayList<String> geschichteStringEnde;

    public Geschichte(ArrayList<String> aGeschichteStringAnfang, ArrayList<String> aGeschichteStringEnde) {
        this.geschichteStringAnfang = aGeschichteStringAnfang;
        this.geschichteStringEnde = aGeschichteStringEnde;
    }


    public ArrayList<String> getGeschichteStringAnfang() {
        return geschichteStringAnfang;
    }

    public void setGeschichteStringAnfang(ArrayList<String> geschichteStringAnfang) {
        this.geschichteStringAnfang = geschichteStringAnfang;
    }

    public ArrayList<String> getGeschichteStringEnde() {
        return geschichteStringEnde;
    }

    public void setGeschichteStringEnde(ArrayList<String> geschichteStringEnde) {
        this.geschichteStringEnde = geschichteStringEnde;
    }
}
