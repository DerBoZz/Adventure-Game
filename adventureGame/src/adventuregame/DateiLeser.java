/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author xXiZiXx
 */
public class DateiLeser {

    private JFileChooser fc;

    public DateiLeser() {
        this.fc = new JFileChooser();
    }

    public char[][] karteEinlesen() throws IOException {
        char[][] karte = new char[31][31];
        String zeile = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("adventuregame/data/Karte.map")));
        int j = 0;
        while ((zeile = br.readLine()) != null) {
            for (int i = 0; i < zeile.length(); i++) {
                karte[i][j] = zeile.charAt(i);
            }
            j++;
        }
        br.close();
        return karte;
    }

    public ArrayList<Item> itemEinlesen(String sItemart) throws IOException {
        ArrayList<Item> pool = new <Item> ArrayList();
        String zeile = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("adventuregame/data/" + sItemart + ".data")));
        while ((zeile = br.readLine()) != null) {
            int stelle = 0;
            int[] kosten = new int[5];
            String[] kostenString = new String[5];
            for (int i = 0; i < 5; i++) {
                kosten[i] = 0;
                kostenString[i] = "";
            }
            String itemWertString = "";
            String itemname = "";
            String infoText = "";
            for (int i = 0; i < zeile.length(); i++) {
                if (zeile.charAt(i) == '@') {
                    stelle++;
                } else {
                    switch (stelle) {
                        case 0:
                            itemname += zeile.charAt(i);
                            break;
                        case 1:
                            itemWertString += zeile.charAt(i);
                            break;
                        case 2:
                            kostenString[0] += zeile.charAt(i);
                            break;
                        case 3:
                            kostenString[1] += zeile.charAt(i);
                            break;
                        case 4:
                            kostenString[2] += zeile.charAt(i);
                            break;
                        case 5:
                            kostenString[3] += zeile.charAt(i);
                            break;
                        case 6:
                            kostenString[4] += zeile.charAt(i);
                            break;
                        case 7:
                            infoText += zeile.charAt(i);
                            break;
                    }
                }
            }
            for (int i = 0; i < 5; i++) {
                kosten[i] = Integer.valueOf(kostenString[i]);
            }
            pool.add(new Item(itemname, Integer.valueOf(itemWertString), kosten, infoText));

        }
        br.close();
        return pool;
    }

    public ArrayList<Gebaeude> gebaeudeEinlesen() throws IOException {
        ArrayList<Gebaeude> pool = new <Gebaeude> ArrayList();
        String zeile = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("adventuregame/data/Gebaeude.data")));
        while ((zeile = br.readLine()) != null) {
            int stelle = 0;
            int[] kosten = new int[5];
            String[] kostenString = new String[5];
            for (int i = 0; i < 5; i++) {
                kosten[i] = 0;
                kostenString[i] = "";
            }
            String itemWertString = "";
            String itemname = "";
            String infoText = "";
            for (int i = 0; i < zeile.length(); i++) {
                if (zeile.charAt(i) == '@') {
                    stelle++;
                } else {
                    switch (stelle) {
                        case 0:
                            itemname += zeile.charAt(i);
                            break;
                        case 1:
                            itemWertString += zeile.charAt(i);
                            break;
                        case 2:
                            kostenString[0] += zeile.charAt(i);
                            break;
                        case 3:
                            kostenString[1] += zeile.charAt(i);
                            break;
                        case 4:
                            kostenString[2] += zeile.charAt(i);
                            break;
                        case 5:
                            kostenString[3] += zeile.charAt(i);
                            break;
                        case 6:
                            kostenString[4] += zeile.charAt(i);
                            break;
                        case 7:
                            infoText += zeile.charAt(i);
                            break;
                    }
                }
            }
            for (int i = 0; i < 5; i++) {
                kosten[i] = Integer.valueOf(kostenString[i]);
            }
            pool.add(new Gebaeude(itemname, Integer.valueOf(itemWertString), kosten, infoText, geschichteEinlesen(itemname)));

        }
        br.close();
        return pool;
    }

    public ArrayList<Gegner> gegnerEinlesen() throws IOException {
        ArrayList<Gegner> liste = new <Gegner> ArrayList();
        String zeile = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("adventuregame/data/Gegner.enemy")));
        while ((zeile = br.readLine()) != null) {
            int counter = 0;
            String sAngriffswert = "";
            String gegnerName = "";
            String sHp = "";
            char gebiet = '0';
            for (int i = 0; i < zeile.length(); i++) {
                if (zeile.charAt(i) == '@') {
                    counter++;
                } else {
                    switch (counter) {
                        case 0:
                            gegnerName += zeile.charAt(i);
                            break;
                        case 1:
                            sHp += zeile.charAt(i);
                            break;
                        case 2:
                            sAngriffswert += zeile.charAt(i);
                            break;
                        case 3:
                            gebiet = zeile.charAt(i);
                            break;
                    }
                }
            }
            liste.add(new Gegner(gegnerName, Integer.valueOf(sHp), Integer.valueOf(sAngriffswert), gebiet));
        }
        br.close();
        return liste;
    }

    public ArrayList<String> geschichteEinlesen(String name) throws IOException {
        ArrayList<String> geschichte = new ArrayList<String>();
        try {
            String geschichtenPart = "";
            String zeile = "";

            BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("adventuregame/data/story/" + name + ".plsdontlook")));
            while ((zeile = br.readLine()) != null) {
                geschichtenPart = "";
                for (int i = 0; i < zeile.length(); i++) {
                    geschichtenPart += zeile.charAt(i);
                }
                geschichte.add(geschichtenPart);
            }
            br.close();
        } catch (NullPointerException npe) {
            geschichte = null;
        }
        return geschichte;
    }
}
