/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 *
 * @author marcel.zurawka
 */
public class GUI extends javax.swing.JFrame {

    private Vector<Object> vectorBauListe;
    private Game controller;
    private KartenFeld kartenFeld;
    private GeschichteThread rGT;
    private AktualisierungsThread rAT;

    public GUI(Game controller) {
        this.controller = controller;
        this.vectorBauListe = new Vector<Object>();
        this.rGT = new GeschichteThread(this);
        this.rAT = new AktualisierungsThread(this);
        this.initComponents();
        this.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        panelStadt = new javax.swing.JPanel();
        btnKarte = new javax.swing.JButton();
        btnZuordnung = new javax.swing.JButton();
        btnAusruestung = new javax.swing.JButton();
        btnHaendler = new javax.swing.JButton();
        btnBauen = new javax.swing.JButton();
        btnSchmied = new javax.swing.JButton();
        btnHeilen = new javax.swing.JButton();
        btnZauberladen = new javax.swing.JButton();
        lblGold = new javax.swing.JLabel();
        lblHolz = new javax.swing.JLabel();
        lblStein = new javax.swing.JLabel();
        lblEisen = new javax.swing.JLabel();
        lblKohle = new javax.swing.JLabel();
        lblEinwohner = new javax.swing.JLabel();
        lblMaxEinwohner = new javax.swing.JLabel();
        lblAnzahlEinwohner = new javax.swing.JLabel();
        lblAnzahlMaxEinwohner = new javax.swing.JLabel();
        lblZufriedenheit = new javax.swing.JLabel();
        lblZufriedenheitWert = new javax.swing.JLabel();
        panelZuordnung = new javax.swing.JPanel();
        lblZuordnungGoldmine = new javax.swing.JLabel();
        lblZuordnungSteinbruch = new javax.swing.JLabel();
        lblZuordnungHolzfäller = new javax.swing.JLabel();
        spinnerZuordnungGold = new javax.swing.JSpinner();
        spinnerZuordnungStein = new javax.swing.JSpinner();
        spinnerZuordnungHolz = new javax.swing.JSpinner();
        btnZuordnungBestaetigen = new javax.swing.JButton();
        lblGoldmineBild = new javax.swing.JLabel();
        lblSteinbruchBild = new javax.swing.JLabel();
        lblHolzfaellerBild = new javax.swing.JLabel();
        panelBauen = new javax.swing.JPanel();
        btnBauenFertig = new javax.swing.JButton();
        txaInfoFeldBauen = new javax.swing.JTextArea();
        listBauen = new javax.swing.JList();
        panelSchmied = new javax.swing.JPanel();
        btnSchmiedFertig = new javax.swing.JButton();
        listSchmied = new javax.swing.JList();
        txaInfoFeldSchmied = new javax.swing.JTextArea();
        lblHolzSchmied = new javax.swing.JLabel();
        lblSteinSchmied = new javax.swing.JLabel();
        lblGoldSchmied = new javax.swing.JLabel();
        lblEisenSchmied = new javax.swing.JLabel();
        lblKohleSchmied = new javax.swing.JLabel();
        lblHolzkostenSchmied = new javax.swing.JLabel();
        lblSteinkostenSchmied = new javax.swing.JLabel();
        lblGoldkostenSchmied = new javax.swing.JLabel();
        lblEisenkostenSchmied = new javax.swing.JLabel();
        lblKohlekostenSchmied = new javax.swing.JLabel();
        panelKampf = new javax.swing.JPanel();
        lblKampfAbenteurer = new javax.swing.JLabel();
        lblKampfGegnerName = new javax.swing.JLabel();
        lblKampfTitelAngriffsschaden = new javax.swing.JLabel();
        lblKampfAngriffsschaden = new javax.swing.JLabel();
        lblKampfTitelRuestungswert = new javax.swing.JLabel();
        lblKampfRuestungswert = new javax.swing.JLabel();
        lblKampfTitelAngriffsschadenGegner = new javax.swing.JLabel();
        lblKampfAngriffsschadenGegner = new javax.swing.JLabel();
        lebensbalkenAbenteurer = new adventuregame.Lebensbalken();
        lebensbalkenGegner = new adventuregame.Lebensbalken();
        lblKampfHpWertAbenteurer = new javax.swing.JLabel();
        lblKampfHpWertGegner = new javax.swing.JLabel();
        txaKampf = new javax.swing.JTextArea();
        btnKampfAngriff = new javax.swing.JButton();
        btnKampfMagie = new javax.swing.JButton();
        btnKampfHeiltrank = new javax.swing.JButton();
        comboBoxMagieKampf = new javax.swing.JComboBox();
        panelZauberladen = new javax.swing.JPanel();
        btnZauberladenFertig = new javax.swing.JButton();
        btnZauberladenKaufen = new javax.swing.JButton();
        txaInfoFeldZauberladen = new javax.swing.JTextArea();
        lblGoldZauberladen = new javax.swing.JLabel();
        lblGoldkostenZauberladen = new javax.swing.JLabel();
        iconDonner = new javax.swing.JLabel();
        iconFeuer = new javax.swing.JLabel();
        iconEis = new javax.swing.JLabel();
        lblAnzahlLvL = new javax.swing.JLabel();
        spinnerDonnerLvL = new javax.swing.JSpinner();
        spinnerFeuerLvL = new javax.swing.JSpinner();
        spinnerFrostLvL = new javax.swing.JSpinner();
        panelAusruestung = new javax.swing.JPanel();
        btnAusruestungFertig = new javax.swing.JButton();
        lblAusruestungWaffe = new javax.swing.JLabel();
        lblAusruestungRuestung = new javax.swing.JLabel();
        comboBoxAusruestungWaffe = new javax.swing.JComboBox();
        comboBoxAusruestungRuestung = new javax.swing.JComboBox();
        lblAusruestungAngriffswertTitel = new javax.swing.JLabel();
        lblAusruestungRuestungswertTitel = new javax.swing.JLabel();
        lblAusruestungRuestungswert = new javax.swing.JLabel();
        lblAusruestungAngriffswert = new javax.swing.JLabel();
        txaInfoFeldAusruestung = new javax.swing.JTextArea();
        panelGeschichte = new javax.swing.JPanel();
        lblGeschichteText = new javax.swing.JLabel();
        panelHaendler = new javax.swing.JPanel();
        listHaendler = new javax.swing.JList();
        btnHaendlerFertig = new javax.swing.JButton();
        txaInfoFeldHaendler = new javax.swing.JTextArea();
        lblHolzHaendler = new javax.swing.JLabel();
        lblSteinHaendler = new javax.swing.JLabel();
        lblGoldHaendler = new javax.swing.JLabel();
        lblEisenHaendler = new javax.swing.JLabel();
        lblKohleHaendler = new javax.swing.JLabel();
        lblHolzkostenHaendler = new javax.swing.JLabel();
        lblSteinkostenHaendler = new javax.swing.JLabel();
        lblGoldkostenHaendler = new javax.swing.JLabel();
        lblEisenkostenHaendler = new javax.swing.JLabel();
        lblKohlekostenHaendler = new javax.swing.JLabel();
        panelKarte = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farm & Fight");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(532, 555));
        setMinimumSize(new java.awt.Dimension(532, 555));
        setResizable(false);

        mainPanel.setAlignmentX(0.0F);
        mainPanel.setAlignmentY(0.0F);
        mainPanel.setMaximumSize(new java.awt.Dimension(532, 555));
        mainPanel.setMinimumSize(new java.awt.Dimension(532, 555));
        mainPanel.setPreferredSize(new java.awt.Dimension(532, 555));

        panelStadt.setBackground(new java.awt.Color(255, 255, 255));
        panelStadt.setAlignmentX(0.0F);
        panelStadt.setAlignmentY(0.0F);
        panelStadt.setMaximumSize(new java.awt.Dimension(532, 555));
        panelStadt.setMinimumSize(new java.awt.Dimension(532, 555));
        panelStadt.setPreferredSize(new java.awt.Dimension(532, 555));

        btnKarte.setBackground(new java.awt.Color(204, 204, 204));
        btnKarte.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnKarte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Hauptmenue/Karte.JPG"))); // NOI18N
        btnKarte.setText("Karte");
        btnKarte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnKarte.setFocusable(false);
        btnKarte.setMaximumSize(new java.awt.Dimension(120, 38));
        btnKarte.setMinimumSize(new java.awt.Dimension(120, 38));
        btnKarte.setPreferredSize(new java.awt.Dimension(120, 38));
        btnKarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKarteActionPerformed(evt);
            }
        });

        btnZuordnung.setBackground(new java.awt.Color(204, 204, 204));
        btnZuordnung.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnZuordnung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Hauptmenue/Zuordnung.jpg"))); // NOI18N
        btnZuordnung.setText("Zuordnung");
        btnZuordnung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnZuordnung.setFocusable(false);
        btnZuordnung.setMaximumSize(new java.awt.Dimension(120, 38));
        btnZuordnung.setMinimumSize(new java.awt.Dimension(120, 38));
        btnZuordnung.setPreferredSize(new java.awt.Dimension(120, 38));
        btnZuordnung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZuordnungActionPerformed(evt);
            }
        });

        btnAusruestung.setBackground(new java.awt.Color(204, 204, 204));
        btnAusruestung.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnAusruestung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Hauptmenue/Ausruestung.JPG"))); // NOI18N
        btnAusruestung.setText("Ausrüstung");
        btnAusruestung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnAusruestung.setFocusable(false);
        btnAusruestung.setMaximumSize(new java.awt.Dimension(120, 38));
        btnAusruestung.setMinimumSize(new java.awt.Dimension(120, 38));
        btnAusruestung.setPreferredSize(new java.awt.Dimension(120, 38));
        btnAusruestung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAusruestungActionPerformed(evt);
            }
        });

        btnHaendler.setBackground(new java.awt.Color(204, 204, 204));
        btnHaendler.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnHaendler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Hauptmenue/Haendler.JPG"))); // NOI18N
        btnHaendler.setText("Händler");
        btnHaendler.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnHaendler.setFocusable(false);
        btnHaendler.setMaximumSize(new java.awt.Dimension(120, 38));
        btnHaendler.setMinimumSize(new java.awt.Dimension(120, 38));
        btnHaendler.setPreferredSize(new java.awt.Dimension(120, 38));
        btnHaendler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHaendlerActionPerformed(evt);
            }
        });

        btnBauen.setBackground(new java.awt.Color(204, 204, 204));
        btnBauen.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnBauen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Hauptmenue/Bauen.JPG"))); // NOI18N
        btnBauen.setText("Bauen");
        btnBauen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnBauen.setFocusable(false);
        btnBauen.setMaximumSize(new java.awt.Dimension(120, 38));
        btnBauen.setMinimumSize(new java.awt.Dimension(120, 38));
        btnBauen.setPreferredSize(new java.awt.Dimension(120, 38));
        btnBauen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBauenActionPerformed(evt);
            }
        });

        btnSchmied.setBackground(new java.awt.Color(204, 204, 204));
        btnSchmied.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnSchmied.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Hauptmenue/Schmiede.JPG"))); // NOI18N
        btnSchmied.setText("Schmied");
        btnSchmied.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnSchmied.setFocusable(false);
        btnSchmied.setMaximumSize(new java.awt.Dimension(120, 38));
        btnSchmied.setMinimumSize(new java.awt.Dimension(120, 38));
        btnSchmied.setPreferredSize(new java.awt.Dimension(120, 38));
        btnSchmied.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchmiedActionPerformed(evt);
            }
        });

        btnHeilen.setBackground(new java.awt.Color(204, 204, 204));
        btnHeilen.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnHeilen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Hauptmenue/Heilen.jpg"))); // NOI18N
        btnHeilen.setText("Heilen");
        btnHeilen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnHeilen.setFocusable(false);
        btnHeilen.setMaximumSize(new java.awt.Dimension(120, 38));
        btnHeilen.setMinimumSize(new java.awt.Dimension(120, 38));
        btnHeilen.setPreferredSize(new java.awt.Dimension(120, 38));
        btnHeilen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeilenActionPerformed(evt);
            }
        });

        btnZauberladen.setBackground(new java.awt.Color(204, 204, 204));
        btnZauberladen.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnZauberladen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Hauptmenue/Zauber.jpg"))); // NOI18N
        btnZauberladen.setText("Zauber");
        btnZauberladen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnZauberladen.setFocusable(false);
        btnZauberladen.setMaximumSize(new java.awt.Dimension(120, 38));
        btnZauberladen.setMinimumSize(new java.awt.Dimension(120, 38));
        btnZauberladen.setPreferredSize(new java.awt.Dimension(120, 38));
        btnZauberladen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZauberladenActionPerformed(evt);
            }
        });

        lblGold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Rohstoffe/Gold.jpg"))); // NOI18N

        lblHolz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Rohstoffe/Holz.jpg"))); // NOI18N

        lblStein.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Rohstoffe/Stein.jpg"))); // NOI18N

        lblEisen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Rohstoffe/Eisen.jpg"))); // NOI18N

        lblKohle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Rohstoffe/Kohle.jpg"))); // NOI18N

        lblEinwohner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Hauptmenue/Dorfbewohner.JPG"))); // NOI18N
        lblEinwohner.setText("Einwohner:");

        lblMaxEinwohner.setText("Max Einwohner:");

        lblZufriedenheit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Hauptmenue/Zufriedenheit.JPG"))); // NOI18N
        lblZufriedenheit.setText("Zufriedenheit:");

        javax.swing.GroupLayout panelStadtLayout = new javax.swing.GroupLayout(panelStadt);
        panelStadt.setLayout(panelStadtLayout);
        panelStadtLayout.setHorizontalGroup(
            panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStadtLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStadtLayout.createSequentialGroup()
                        .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStein, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHolz, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelStadtLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblAnzahlEinwohner, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146)
                                .addComponent(lblMaxEinwohner)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAnzahlMaxEinwohner, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelStadtLayout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEisen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblKohle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHaendler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lblEinwohner)
                    .addGroup(panelStadtLayout.createSequentialGroup()
                        .addComponent(lblZufriedenheit)
                        .addGap(18, 18, 18)
                        .addComponent(lblZufriedenheitWert, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelStadtLayout.createSequentialGroup()
                        .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKarte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSchmied, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnZuordnung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGold, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelStadtLayout.createSequentialGroup()
                                .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBauen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHeilen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAusruestung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnZauberladen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(68, 68, 68))
        );
        panelStadtLayout.setVerticalGroup(
            panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStadtLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMaxEinwohner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAnzahlMaxEinwohner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEinwohner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAnzahlEinwohner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStadtLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblZufriedenheit))
                    .addGroup(panelStadtLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblZufriedenheitWert, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblGold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStein, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEisen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHolz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKohle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHaendler, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelStadtLayout.createSequentialGroup()
                        .addComponent(btnKarte, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnZuordnung, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBauen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAusruestung, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(panelStadtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSchmied, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHeilen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnZauberladen, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(173, 173, 173))
        );

        panelZuordnung.setBackground(new java.awt.Color(255, 255, 255));
        panelZuordnung.setAlignmentX(0.0F);
        panelZuordnung.setAlignmentY(0.0F);
        panelZuordnung.setMaximumSize(new java.awt.Dimension(532, 555));
        panelZuordnung.setMinimumSize(new java.awt.Dimension(532, 555));
        panelZuordnung.setPreferredSize(new java.awt.Dimension(532, 555));

        lblZuordnungGoldmine.setText("Goldmine:");

        lblZuordnungSteinbruch.setText("Steinbruch:");

        lblZuordnungHolzfäller.setText("Holzfäller:");

        spinnerZuordnungGold.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spinnerZuordnungGold.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerZuordnungGoldStateChanged(evt);
            }
        });

        spinnerZuordnungStein.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spinnerZuordnungStein.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerZuordnungSteinStateChanged(evt);
            }
        });

        spinnerZuordnungHolz.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spinnerZuordnungHolz.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerZuordnungHolzStateChanged(evt);
            }
        });

        btnZuordnungBestaetigen.setBackground(new java.awt.Color(204, 204, 204));
        btnZuordnungBestaetigen.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnZuordnungBestaetigen.setText("Bestätigen");
        btnZuordnungBestaetigen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnZuordnungBestaetigen.setFocusable(false);
        btnZuordnungBestaetigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZuordnungBestaetigenActionPerformed(evt);
            }
        });

        lblGoldmineBild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Zuordnung/Goldmine.jpg"))); // NOI18N

        lblSteinbruchBild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Zuordnung/Steinbruch.jpg"))); // NOI18N

        lblHolzfaellerBild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Zuordnung/Holzfaeller.jpg"))); // NOI18N

        javax.swing.GroupLayout panelZuordnungLayout = new javax.swing.GroupLayout(panelZuordnung);
        panelZuordnung.setLayout(panelZuordnungLayout);
        panelZuordnungLayout.setHorizontalGroup(
            panelZuordnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZuordnungLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panelZuordnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelZuordnungLayout.createSequentialGroup()
                        .addComponent(lblZuordnungGoldmine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spinnerZuordnungGold, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelZuordnungLayout.createSequentialGroup()
                        .addGroup(panelZuordnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblZuordnungSteinbruch)
                            .addComponent(lblZuordnungHolzfäller))
                        .addGap(71, 71, 71)
                        .addGroup(panelZuordnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelZuordnungLayout.createSequentialGroup()
                                .addComponent(lblHolzfaellerBild, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerZuordnungHolz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelZuordnungLayout.createSequentialGroup()
                                .addGroup(panelZuordnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblGoldmineBild)
                                    .addComponent(lblSteinbruchBild, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinnerZuordnungStein, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelZuordnungLayout.createSequentialGroup()
                        .addComponent(btnZuordnungBestaetigen, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        panelZuordnungLayout.setVerticalGroup(
            panelZuordnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZuordnungLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelZuordnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelZuordnungLayout.createSequentialGroup()
                        .addComponent(spinnerZuordnungHolz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(panelZuordnungLayout.createSequentialGroup()
                        .addGroup(panelZuordnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGoldmineBild)
                            .addGroup(panelZuordnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblZuordnungGoldmine)
                                .addComponent(spinnerZuordnungGold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addGroup(panelZuordnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelZuordnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblZuordnungSteinbruch)
                                .addComponent(spinnerZuordnungStein, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblSteinbruchBild, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelZuordnungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelZuordnungLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(lblZuordnungHolzfäller))
                            .addGroup(panelZuordnungLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(lblHolzfaellerBild, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(41, 41, 41)
                .addComponent(btnZuordnungBestaetigen, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        panelBauen.setAlignmentX(0.0F);
        panelBauen.setAlignmentY(0.0F);
        panelBauen.setMaximumSize(new java.awt.Dimension(532, 555));
        panelBauen.setMinimumSize(new java.awt.Dimension(532, 555));
        panelBauen.setPreferredSize(new java.awt.Dimension(532, 555));

        btnBauenFertig.setBackground(new java.awt.Color(204, 204, 204));
        btnBauenFertig.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnBauenFertig.setText("Fertig");
        btnBauenFertig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnBauenFertig.setFocusable(false);
        btnBauenFertig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBauenFertigActionPerformed(evt);
            }
        });

        txaInfoFeldBauen.setEditable(false);
        txaInfoFeldBauen.setBackground(new java.awt.Color(204, 204, 204));
        txaInfoFeldBauen.setColumns(20);
        txaInfoFeldBauen.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txaInfoFeldBauen.setLineWrap(true);
        txaInfoFeldBauen.setRows(5);
        txaInfoFeldBauen.setWrapStyleWord(true);
        txaInfoFeldBauen.setAutoscrolls(false);
        txaInfoFeldBauen.setBorder(null);

        listBauen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listBauenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBauenLayout = new javax.swing.GroupLayout(panelBauen);
        panelBauen.setLayout(panelBauenLayout);
        panelBauenLayout.setHorizontalGroup(
            panelBauenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBauenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listBauen, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBauenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBauenFertig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txaInfoFeldBauen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 60, Short.MAX_VALUE))
        );
        panelBauenLayout.setVerticalGroup(
            panelBauenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBauenLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(panelBauenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelBauenLayout.createSequentialGroup()
                        .addComponent(txaInfoFeldBauen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBauenFertig, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listBauen, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139))
        );

        panelSchmied.setAlignmentX(0.0F);
        panelSchmied.setAlignmentY(0.0F);
        panelSchmied.setMaximumSize(new java.awt.Dimension(532, 555));
        panelSchmied.setMinimumSize(new java.awt.Dimension(532, 555));
        panelSchmied.setPreferredSize(new java.awt.Dimension(532, 555));

        btnSchmiedFertig.setBackground(new java.awt.Color(204, 204, 204));
        btnSchmiedFertig.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnSchmiedFertig.setText("Fertig");
        btnSchmiedFertig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnSchmiedFertig.setFocusable(false);
        btnSchmiedFertig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchmiedFertigActionPerformed(evt);
            }
        });

        listSchmied.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSchmiedMouseClicked(evt);
            }
        });

        txaInfoFeldSchmied.setEditable(false);
        txaInfoFeldSchmied.setBackground(new java.awt.Color(204, 204, 204));
        txaInfoFeldSchmied.setColumns(20);
        txaInfoFeldSchmied.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txaInfoFeldSchmied.setLineWrap(true);
        txaInfoFeldSchmied.setRows(5);
        txaInfoFeldSchmied.setWrapStyleWord(true);
        txaInfoFeldSchmied.setAutoscrolls(false);
        txaInfoFeldSchmied.setBorder(null);

        lblHolzSchmied.setText("Holz:");

        lblSteinSchmied.setText("Stein:");

        lblGoldSchmied.setText("Gold:");

        lblEisenSchmied.setText("Eisen:");

        lblKohleSchmied.setText("Kohle:");

        lblHolzkostenSchmied.setText("Holzk");

        lblSteinkostenSchmied.setText("Steink");

        lblGoldkostenSchmied.setText("Goldk");

        lblEisenkostenSchmied.setText("Eisenk");

        lblKohlekostenSchmied.setText("Kohlek");

        javax.swing.GroupLayout panelSchmiedLayout = new javax.swing.GroupLayout(panelSchmied);
        panelSchmied.setLayout(panelSchmiedLayout);
        panelSchmiedLayout.setHorizontalGroup(
            panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSchmiedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSchmiedLayout.createSequentialGroup()
                        .addComponent(listSchmied, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txaInfoFeldSchmied, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSchmiedFertig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelSchmiedLayout.createSequentialGroup()
                        .addGroup(panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHolzSchmied)
                            .addComponent(lblHolzkostenSchmied)
                            .addComponent(lblSteinSchmied)
                            .addComponent(lblSteinkostenSchmied))
                        .addGap(46, 46, 46)
                        .addGroup(panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEisenkostenSchmied)
                            .addComponent(lblEisenSchmied)
                            .addGroup(panelSchmiedLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGoldSchmied)
                                    .addComponent(lblGoldkostenSchmied))
                                .addGap(46, 46, 46)
                                .addGroup(panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKohleSchmied)
                                    .addComponent(lblKohlekostenSchmied))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        panelSchmiedLayout.setVerticalGroup(
            panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSchmiedLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelSchmiedLayout.createSequentialGroup()
                        .addComponent(txaInfoFeldSchmied, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSchmiedFertig, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listSchmied, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSchmiedLayout.createSequentialGroup()
                        .addGroup(panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHolzSchmied)
                            .addComponent(lblGoldSchmied))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGoldkostenSchmied)
                            .addComponent(lblHolzkostenSchmied)))
                    .addGroup(panelSchmiedLayout.createSequentialGroup()
                        .addComponent(lblKohleSchmied)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKohlekostenSchmied)))
                .addGap(18, 18, 18)
                .addGroup(panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSteinSchmied)
                    .addComponent(lblEisenSchmied))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSchmiedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSteinkostenSchmied)
                    .addComponent(lblEisenkostenSchmied))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        panelKampf.setBackground(new java.awt.Color(255, 255, 255));
        panelKampf.setAlignmentX(0.0F);
        panelKampf.setAlignmentY(0.0F);
        panelKampf.setMaximumSize(new java.awt.Dimension(532, 555));
        panelKampf.setMinimumSize(new java.awt.Dimension(532, 555));
        panelKampf.setPreferredSize(new java.awt.Dimension(532, 555));

        lblKampfAbenteurer.setText("Der Abenteurer");

        lblKampfGegnerName.setText("Gegner 1");

        lblKampfTitelAngriffsschaden.setText("Angriffsschaden:");

        lblKampfAngriffsschaden.setText("wertA");

        lblKampfTitelRuestungswert.setText("Rüstungswert:");

        lblKampfRuestungswert.setText("wertR");

        lblKampfTitelAngriffsschadenGegner.setText("Angriffsschaden:");

        lblKampfAngriffsschadenGegner.setText("wertAG");

        javax.swing.GroupLayout lebensbalkenAbenteurerLayout = new javax.swing.GroupLayout(lebensbalkenAbenteurer);
        lebensbalkenAbenteurer.setLayout(lebensbalkenAbenteurerLayout);
        lebensbalkenAbenteurerLayout.setHorizontalGroup(
            lebensbalkenAbenteurerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lebensbalkenAbenteurerLayout.setVerticalGroup(
            lebensbalkenAbenteurerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        lebensbalkenGegner.setPreferredSize(new java.awt.Dimension(100, 0));

        javax.swing.GroupLayout lebensbalkenGegnerLayout = new javax.swing.GroupLayout(lebensbalkenGegner);
        lebensbalkenGegner.setLayout(lebensbalkenGegnerLayout);
        lebensbalkenGegnerLayout.setHorizontalGroup(
            lebensbalkenGegnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lebensbalkenGegnerLayout.setVerticalGroup(
            lebensbalkenGegnerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        lblKampfHpWertAbenteurer.setText("HP:");

        lblKampfHpWertGegner.setText("HP:");

        txaKampf.setEditable(false);
        txaKampf.setColumns(20);
        txaKampf.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        txaKampf.setLineWrap(true);
        txaKampf.setRows(5);
        txaKampf.setWrapStyleWord(true);
        txaKampf.setAlignmentX(0.0F);
        txaKampf.setAlignmentY(0.0F);
        txaKampf.setAutoscrolls(false);

        btnKampfAngriff.setBackground(new java.awt.Color(204, 204, 204));
        btnKampfAngriff.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnKampfAngriff.setText("Angriff");
        btnKampfAngriff.setToolTipText("Normaler Angriff");
        btnKampfAngriff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnKampfAngriff.setFocusable(false);
        btnKampfAngriff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKampfAngriffActionPerformed(evt);
            }
        });

        btnKampfMagie.setBackground(new java.awt.Color(204, 204, 204));
        btnKampfMagie.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnKampfMagie.setText("Magie");
        btnKampfMagie.setToolTipText("Wähle dein Zauber aus");
        btnKampfMagie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnKampfMagie.setFocusable(false);
        btnKampfMagie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKampfMagieActionPerformed(evt);
            }
        });

        btnKampfHeiltrank.setBackground(new java.awt.Color(204, 204, 204));
        btnKampfHeiltrank.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnKampfHeiltrank.setText("Heiltrank");
        btnKampfHeiltrank.setToolTipText("+30 HP");
        btnKampfHeiltrank.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnKampfHeiltrank.setFocusable(false);
        btnKampfHeiltrank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKampfHeiltrankActionPerformed(evt);
            }
        });

        comboBoxMagieKampf.setToolTipText("");

        javax.swing.GroupLayout panelKampfLayout = new javax.swing.GroupLayout(panelKampf);
        panelKampf.setLayout(panelKampfLayout);
        panelKampfLayout.setHorizontalGroup(
            panelKampfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKampfLayout.createSequentialGroup()
                .addGroup(panelKampfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelKampfLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(panelKampfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKampfTitelRuestungswert)
                            .addComponent(lblKampfRuestungswert)
                            .addGroup(panelKampfLayout.createSequentialGroup()
                                .addGroup(panelKampfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKampfHpWertAbenteurer)
                                    .addComponent(lebensbalkenAbenteurer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblKampfTitelAngriffsschaden)
                                    .addComponent(lblKampfAngriffsschaden)
                                    .addComponent(lblKampfAbenteurer))
                                .addGap(148, 148, 148)
                                .addGroup(panelKampfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKampfGegnerName)
                                    .addComponent(lebensbalkenGegner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblKampfHpWertGegner)
                                    .addComponent(lblKampfTitelAngriffsschadenGegner)
                                    .addComponent(lblKampfAngriffsschadenGegner))))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelKampfLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(panelKampfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txaKampf)
                            .addGroup(panelKampfLayout.createSequentialGroup()
                                .addComponent(btnKampfAngriff, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnKampfMagie, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(btnKampfHeiltrank, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKampfLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBoxMagieKampf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        panelKampfLayout.setVerticalGroup(
            panelKampfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKampfLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelKampfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelKampfLayout.createSequentialGroup()
                        .addGroup(panelKampfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKampfGegnerName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKampfAbenteurer))
                        .addGap(18, 18, 18)
                        .addComponent(lblKampfHpWertAbenteurer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lebensbalkenAbenteurer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lblKampfTitelAngriffsschaden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKampfAngriffsschaden)
                        .addGap(18, 18, 18)
                        .addComponent(lblKampfTitelRuestungswert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKampfRuestungswert)
                        .addGap(44, 44, 44)
                        .addComponent(comboBoxMagieKampf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelKampfLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblKampfHpWertGegner)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lebensbalkenGegner, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lblKampfTitelAngriffsschadenGegner)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKampfAngriffsschadenGegner)))
                .addGap(18, 18, 18)
                .addGroup(panelKampfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKampfHeiltrank, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKampfMagie, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKampfAngriff, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(txaKampf, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        panelZauberladen.setAlignmentX(0.0F);
        panelZauberladen.setAlignmentY(0.0F);
        panelZauberladen.setMaximumSize(new java.awt.Dimension(532, 555));
        panelZauberladen.setMinimumSize(new java.awt.Dimension(532, 555));
        panelZauberladen.setPreferredSize(new java.awt.Dimension(532, 555));

        btnZauberladenFertig.setBackground(new java.awt.Color(204, 204, 204));
        btnZauberladenFertig.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnZauberladenFertig.setText("Fertig");
        btnZauberladenFertig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnZauberladenFertig.setFocusable(false);
        btnZauberladenFertig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZauberladenFertigActionPerformed(evt);
            }
        });

        btnZauberladenKaufen.setBackground(new java.awt.Color(204, 204, 204));
        btnZauberladenKaufen.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnZauberladenKaufen.setText("Kaufen");
        btnZauberladenKaufen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnZauberladenKaufen.setFocusable(false);
        btnZauberladenKaufen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZauberladenKaufenActionPerformed(evt);
            }
        });

        txaInfoFeldZauberladen.setEditable(false);
        txaInfoFeldZauberladen.setBackground(new java.awt.Color(204, 204, 204));
        txaInfoFeldZauberladen.setColumns(20);
        txaInfoFeldZauberladen.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txaInfoFeldZauberladen.setLineWrap(true);
        txaInfoFeldZauberladen.setRows(5);
        txaInfoFeldZauberladen.setWrapStyleWord(true);
        txaInfoFeldZauberladen.setAutoscrolls(false);
        txaInfoFeldZauberladen.setBorder(null);

        lblGoldZauberladen.setText("Preis(Gold):");

        lblGoldkostenZauberladen.setText("0");

        iconDonner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Kampf/Zauber/Donnerschlag.JPG"))); // NOI18N
        iconDonner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconDonnerMouseClicked(evt);
            }
        });

        iconFeuer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Kampf/Zauber/Feuerball.JPG"))); // NOI18N
        iconFeuer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconFeuerMouseClicked(evt);
            }
        });

        iconEis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adventuregame/grafic/Kampf/Zauber/Frostkugel.JPG"))); // NOI18N
        iconEis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconEisMouseClicked(evt);
            }
        });

        lblAnzahlLvL.setText("Anzahl LvL:");

        spinnerDonnerLvL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerDonnerLvLStateChanged(evt);
            }
        });

        spinnerFeuerLvL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerFeuerLvLStateChanged(evt);
            }
        });

        spinnerFrostLvL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerFrostLvLStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelZauberladenLayout = new javax.swing.GroupLayout(panelZauberladen);
        panelZauberladen.setLayout(panelZauberladenLayout);
        panelZauberladenLayout.setHorizontalGroup(
            panelZauberladenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZauberladenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelZauberladenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelZauberladenLayout.createSequentialGroup()
                        .addComponent(lblAnzahlLvL)
                        .addGap(18, 18, 18)
                        .addGroup(panelZauberladenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconEis)
                            .addComponent(spinnerFrostLvL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(panelZauberladenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconDonner)
                            .addComponent(spinnerDonnerLvL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(panelZauberladenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconFeuer)
                            .addComponent(spinnerFeuerLvL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelZauberladenLayout.createSequentialGroup()
                        .addGroup(panelZauberladenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblGoldZauberladen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGoldkostenZauberladen, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnZauberladenKaufen, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(panelZauberladenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnZauberladenFertig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txaInfoFeldZauberladen, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 65, Short.MAX_VALUE))
        );
        panelZauberladenLayout.setVerticalGroup(
            panelZauberladenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelZauberladenLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(panelZauberladenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelZauberladenLayout.createSequentialGroup()
                        .addComponent(iconDonner)
                        .addGap(21, 21, 21)
                        .addComponent(spinnerDonnerLvL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelZauberladenLayout.createSequentialGroup()
                        .addComponent(iconEis)
                        .addGap(21, 21, 21)
                        .addGroup(panelZauberladenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerFrostLvL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnzahlLvL)))
                    .addComponent(txaInfoFeldZauberladen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelZauberladenLayout.createSequentialGroup()
                        .addComponent(iconFeuer)
                        .addGap(21, 21, 21)
                        .addComponent(spinnerFeuerLvL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addGroup(panelZauberladenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelZauberladenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnZauberladenKaufen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnZauberladenFertig, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelZauberladenLayout.createSequentialGroup()
                        .addComponent(lblGoldZauberladen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGoldkostenZauberladen)))
                .addGap(173, 173, 173))
        );

        panelAusruestung.setAlignmentX(0.0F);
        panelAusruestung.setAlignmentY(0.0F);
        panelAusruestung.setMaximumSize(new java.awt.Dimension(532, 555));
        panelAusruestung.setMinimumSize(new java.awt.Dimension(532, 555));
        panelAusruestung.setPreferredSize(new java.awt.Dimension(532, 555));

        btnAusruestungFertig.setBackground(new java.awt.Color(204, 204, 204));
        btnAusruestungFertig.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnAusruestungFertig.setText("Fertig");
        btnAusruestungFertig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnAusruestungFertig.setFocusable(false);
        btnAusruestungFertig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAusruestungFertigActionPerformed(evt);
            }
        });

        lblAusruestungWaffe.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblAusruestungWaffe.setText("Waffe");

        lblAusruestungRuestung.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblAusruestungRuestung.setText("Rüstung");

        comboBoxAusruestungWaffe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxAusruestungWaffeItemStateChanged(evt);
            }
        });

        comboBoxAusruestungRuestung.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxAusruestungRuestungItemStateChanged(evt);
            }
        });

        lblAusruestungAngriffswertTitel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAusruestungAngriffswertTitel.setText("Angriffswert:");

        lblAusruestungRuestungswertTitel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAusruestungRuestungswertTitel.setText("Rüstungswert:");

        lblAusruestungRuestungswert.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblAusruestungAngriffswert.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txaInfoFeldAusruestung.setEditable(false);
        txaInfoFeldAusruestung.setBackground(new java.awt.Color(204, 204, 204));
        txaInfoFeldAusruestung.setColumns(20);
        txaInfoFeldAusruestung.setLineWrap(true);
        txaInfoFeldAusruestung.setRows(5);
        txaInfoFeldAusruestung.setWrapStyleWord(true);
        txaInfoFeldAusruestung.setBorder(null);
        txaInfoFeldAusruestung.setMaximumSize(new java.awt.Dimension(80, 70));
        txaInfoFeldAusruestung.setMinimumSize(new java.awt.Dimension(80, 70));
        txaInfoFeldAusruestung.setPreferredSize(new java.awt.Dimension(80, 70));

        javax.swing.GroupLayout panelAusruestungLayout = new javax.swing.GroupLayout(panelAusruestung);
        panelAusruestung.setLayout(panelAusruestungLayout);
        panelAusruestungLayout.setHorizontalGroup(
            panelAusruestungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAusruestungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAusruestungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAusruestungLayout.createSequentialGroup()
                        .addGroup(panelAusruestungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAusruestungRuestung)
                            .addComponent(lblAusruestungWaffe))
                        .addGap(18, 18, 18)
                        .addGroup(panelAusruestungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAusruestungLayout.createSequentialGroup()
                                .addComponent(comboBoxAusruestungWaffe, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAusruestungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAusruestungAngriffswertTitel)
                                    .addComponent(lblAusruestungAngriffswert, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelAusruestungLayout.createSequentialGroup()
                                .addComponent(comboBoxAusruestungRuestung, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelAusruestungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAusruestungRuestungswertTitel)
                                    .addComponent(lblAusruestungRuestungswert, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelAusruestungLayout.createSequentialGroup()
                        .addComponent(txaInfoFeldAusruestung, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnAusruestungFertig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        panelAusruestungLayout.setVerticalGroup(
            panelAusruestungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAusruestungLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblAusruestungAngriffswertTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAusruestungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAusruestungAngriffswert, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAusruestungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAusruestungWaffe)
                        .addComponent(comboBoxAusruestungWaffe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addComponent(lblAusruestungRuestungswertTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAusruestungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAusruestungRuestungswert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAusruestungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAusruestungRuestung)
                        .addComponent(comboBoxAusruestungRuestung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(panelAusruestungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txaInfoFeldAusruestung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAusruestungFertig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(219, 219, 219))
        );

        panelGeschichte.setBackground(new java.awt.Color(255, 255, 255));
        panelGeschichte.setAlignmentX(0.0F);
        panelGeschichte.setAlignmentY(0.0F);
        panelGeschichte.setMaximumSize(new java.awt.Dimension(532, 555));
        panelGeschichte.setMinimumSize(new java.awt.Dimension(532, 555));
        panelGeschichte.setPreferredSize(new java.awt.Dimension(532, 555));

        javax.swing.GroupLayout panelGeschichteLayout = new javax.swing.GroupLayout(panelGeschichte);
        panelGeschichte.setLayout(panelGeschichteLayout);
        panelGeschichteLayout.setHorizontalGroup(
            panelGeschichteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeschichteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGeschichteText, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGeschichteLayout.setVerticalGroup(
            panelGeschichteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeschichteLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(lblGeschichteText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        panelHaendler.setAlignmentX(0.0F);
        panelHaendler.setAlignmentY(0.0F);
        panelHaendler.setMaximumSize(new java.awt.Dimension(532, 555));
        panelHaendler.setMinimumSize(new java.awt.Dimension(532, 555));
        panelHaendler.setPreferredSize(new java.awt.Dimension(532, 555));

        listHaendler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listHaendlerMouseClicked(evt);
            }
        });

        btnHaendlerFertig.setBackground(new java.awt.Color(204, 204, 204));
        btnHaendlerFertig.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        btnHaendlerFertig.setText("Fertig");
        btnHaendlerFertig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnHaendlerFertig.setFocusable(false);
        btnHaendlerFertig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHaendlerFertigActionPerformed(evt);
            }
        });

        txaInfoFeldHaendler.setEditable(false);
        txaInfoFeldHaendler.setBackground(new java.awt.Color(204, 204, 204));
        txaInfoFeldHaendler.setColumns(20);
        txaInfoFeldHaendler.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        txaInfoFeldHaendler.setLineWrap(true);
        txaInfoFeldHaendler.setRows(5);
        txaInfoFeldHaendler.setWrapStyleWord(true);
        txaInfoFeldHaendler.setAutoscrolls(false);
        txaInfoFeldHaendler.setBorder(null);

        lblHolzHaendler.setText("Holz:");

        lblSteinHaendler.setText("Stein:");

        lblGoldHaendler.setText("Gold:");

        lblEisenHaendler.setText("Eisen:");

        lblKohleHaendler.setText("Kohle:");

        lblHolzkostenHaendler.setText("Holzk");

        lblSteinkostenHaendler.setText("Steink");

        lblGoldkostenHaendler.setText("Goldk");

        lblEisenkostenHaendler.setText("Eisenk");

        lblKohlekostenHaendler.setText("Kohlek");

        javax.swing.GroupLayout panelHaendlerLayout = new javax.swing.GroupLayout(panelHaendler);
        panelHaendler.setLayout(panelHaendlerLayout);
        panelHaendlerLayout.setHorizontalGroup(
            panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHaendlerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listHaendler, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHaendlerLayout.createSequentialGroup()
                        .addGroup(panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHolzHaendler)
                            .addComponent(lblHolzkostenHaendler)
                            .addComponent(lblSteinHaendler)
                            .addComponent(lblSteinkostenHaendler))
                        .addGap(46, 46, 46)
                        .addGroup(panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEisenkostenHaendler)
                            .addComponent(lblEisenHaendler)
                            .addGroup(panelHaendlerLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGoldHaendler)
                                    .addComponent(lblGoldkostenHaendler))
                                .addGap(46, 46, 46)
                                .addGroup(panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKohleHaendler)
                                    .addComponent(lblKohlekostenHaendler))))))
                .addGap(18, 18, 18)
                .addGroup(panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txaInfoFeldHaendler, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHaendlerFertig, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        panelHaendlerLayout.setVerticalGroup(
            panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHaendlerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listHaendler, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txaInfoFeldHaendler, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHaendlerLayout.createSequentialGroup()
                        .addGroup(panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHolzHaendler)
                            .addComponent(lblGoldHaendler))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGoldkostenHaendler)
                            .addComponent(lblHolzkostenHaendler)))
                    .addGroup(panelHaendlerLayout.createSequentialGroup()
                        .addComponent(lblKohleHaendler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKohlekostenHaendler)))
                .addGap(18, 18, 18)
                .addGroup(panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSteinHaendler)
                    .addComponent(lblEisenHaendler))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHaendlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSteinkostenHaendler)
                    .addComponent(lblEisenkostenHaendler)
                    .addComponent(btnHaendlerFertig, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        panelKarte.setMaximumSize(new java.awt.Dimension(532, 555));
        panelKarte.setMinimumSize(new java.awt.Dimension(532, 555));
        panelKarte.setPreferredSize(new java.awt.Dimension(532, 555));

        javax.swing.GroupLayout panelKarteLayout = new javax.swing.GroupLayout(panelKarte);
        panelKarte.setLayout(panelKarteLayout);
        panelKarteLayout.setHorizontalGroup(
            panelKarteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        panelKarteLayout.setVerticalGroup(
            panelKarteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelStadt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelZuordnung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelBauen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelSchmied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelKampf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelZauberladen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelAusruestung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelGeschichte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelHaendler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelKarte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelStadt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelZuordnung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelBauen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelSchmied, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelKampf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelZauberladen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelAusruestung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelGeschichte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelHaendler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelKarte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZuordnungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZuordnungActionPerformed
        panelStadt.setVisible(false);
        panelZuordnung.setVisible(true);
    }//GEN-LAST:event_btnZuordnungActionPerformed

    private void spinnerZuordnungGoldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerZuordnungGoldStateChanged
        if (alleVergeben()) {
            spinnerZuordnungGold.setValue((int) spinnerZuordnungGold.getValue() - 1);
        }
    }//GEN-LAST:event_spinnerZuordnungGoldStateChanged

    private void spinnerZuordnungSteinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerZuordnungSteinStateChanged
        if (alleVergeben()) {
            spinnerZuordnungStein.setValue((int) spinnerZuordnungStein.getValue() - 1);
        }
    }//GEN-LAST:event_spinnerZuordnungSteinStateChanged

    private void spinnerZuordnungHolzStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerZuordnungHolzStateChanged
        if (alleVergeben()) {
            spinnerZuordnungHolz.setValue((int) spinnerZuordnungHolz.getValue() - 1);
        }
    }//GEN-LAST:event_spinnerZuordnungHolzStateChanged

    private void btnKarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKarteActionPerformed
        if (controller.getSpieler().getHp() <= 0) {
            JOptionPane.showMessageDialog(panelStadt, "Versuch halt tot in die Wildniss zu gehen IS OK !");
        } else {
            panelStadt.setVisible(false);
            panelKarte.setVisible(true);
            kartenFeld.setVisible(true);
            kartenFeld.requestFocus();
            kartenFeld.repaint();
        }
    }//GEN-LAST:event_btnKarteActionPerformed

    private void btnKampfAngriffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKampfAngriffActionPerformed
        int schaden = controller.getKampf().angriff(true);
        updateHpBar();
        txaKampf.setText("Abenteurer verursacht " + schaden + " Schaden");
        gegenAngriff();
    }//GEN-LAST:event_btnKampfAngriffActionPerformed

    private void btnZuordnungBestaetigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZuordnungBestaetigenActionPerformed
        controller.getZuordnung().updateZuordnung((int) spinnerZuordnungGold.getValue(), (int) spinnerZuordnungStein.getValue(), (int) spinnerZuordnungHolz.getValue());
        panelZuordnung.setVisible(false);
        panelStadt.setVisible(true);
    }//GEN-LAST:event_btnZuordnungBestaetigenActionPerformed

    private void btnAusruestungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAusruestungActionPerformed
        if (controller.getSpieler().getHp() == 0) {
            JOptionPane.showMessageDialog(panelStadt, "Is auch kein Problem sich an Toten zu vergreifen du widerwertiges Stück!");
        } else {
            panelStadt.setVisible(false);
            panelAusruestung.setVisible(true);
            ArrayList<Item> waffenListe = controller.getSpieler().getInvWaffen();
            ArrayList<Item> ruestungListe = controller.getSpieler().getInvRuestungen();
            for (int i = 0; i < waffenListe.size(); i++) {
                comboBoxAusruestungWaffe.addItem(waffenListe.get(i).getName());
            }
            for (int i = 0; i < ruestungListe.size(); i++) {
                comboBoxAusruestungRuestung.addItem(ruestungListe.get(i).getName());
            }
            comboBoxAusruestungWaffe.setSelectedItem(controller.getSpieler().getEquipWaffe().getName());
            comboBoxAusruestungRuestung.setSelectedItem(controller.getSpieler().getEquipRuestung().getName());
            lblAusruestungAngriffswert.setText(Integer.toString(controller.getSpieler().getInvWaffen().get(comboBoxAusruestungWaffe.getSelectedIndex()).getWert()));
            lblAusruestungRuestungswert.setText(Integer.toString(controller.getSpieler().getInvRuestungen().get(comboBoxAusruestungRuestung.getSelectedIndex()).getWert()));
            txaInfoFeldAusruestung.setText("");
        }
    }//GEN-LAST:event_btnAusruestungActionPerformed

    private void btnAusruestungFertigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAusruestungFertigActionPerformed
        panelAusruestung.setVisible(false);
        panelStadt.setVisible(true);
        controller.getSpieler().setEquipWaffeAusInventar(comboBoxAusruestungWaffe.getSelectedIndex());
        controller.getSpieler().setEquipRuestungAusInventar(comboBoxAusruestungRuestung.getSelectedIndex());
        comboBoxAusruestungWaffe.removeAllItems();
        comboBoxAusruestungRuestung.removeAllItems();
        stadtButtonsAnzeigen();
    }//GEN-LAST:event_btnAusruestungFertigActionPerformed

    private void comboBoxAusruestungWaffeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxAusruestungWaffeItemStateChanged
        try {
            lblAusruestungAngriffswert.setText(Integer.toString(controller.getSpieler().getInvWaffen().get(comboBoxAusruestungWaffe.getSelectedIndex()).getWert()));
            txaInfoFeldAusruestung.setText(controller.getSpieler().getInvWaffen().get(comboBoxAusruestungWaffe.getSelectedIndex()).getInfoText());
        } catch (ArrayIndexOutOfBoundsException aiobe) {

        }
    }//GEN-LAST:event_comboBoxAusruestungWaffeItemStateChanged

    private void comboBoxAusruestungRuestungItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxAusruestungRuestungItemStateChanged
        try {
            lblAusruestungRuestungswert.setText(Integer.toString(controller.getSpieler().getInvRuestungen().get(comboBoxAusruestungRuestung.getSelectedIndex()).getWert()));
            txaInfoFeldAusruestung.setText(controller.getSpieler().getInvRuestungen().get(comboBoxAusruestungRuestung.getSelectedIndex()).getInfoText());
        } catch (ArrayIndexOutOfBoundsException aiobe) {

        }
    }//GEN-LAST:event_comboBoxAusruestungRuestungItemStateChanged

    private void btnBauenFertigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBauenFertigActionPerformed
        panelBauen.setVisible(false);
        panelGeschichte.setVisible(false);
        stadtButtonsAnzeigen();
        panelStadt.setVisible(true);
    }//GEN-LAST:event_btnBauenFertigActionPerformed

    private void listBauenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBauenMouseClicked
        if (evt.getClickCount() == 2) {
            String selectedName = listBauen.getModel().getElementAt(listBauen.getSelectedIndex()).toString();
            int index = listBauen.getSelectedIndex();
            int[] kosten = controller.getDorf().getGebaeudeListe().get(listBauen.getSelectedIndex()).getKosten();
            String msg = "Möchtest du für " + kosten[0] + " Holz, " + kosten[1] + " Stein, " + kosten[2] + " Gold, " + kosten[3] + " Eisen, " + kosten[4] + " Kohle ein " + selectedName + " bauen?";

            int auswahl = JOptionPane.showOptionDialog(panelBauen, msg, "Bauen?", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Ja", "Nein"}, "Ja");
            if (auswahl == 0) {
                boolean nichtGenugRohstoffe = true;

                if (controller.getRohstoffe().genugRohstoffe(controller.getDorf().getGebaeudeListe().get(index).getKosten())) {
                    nichtGenugRohstoffe = false;
                    if (!selectedName.equals("Haus")) {
                        if (controller.getDorf().getGebaeudeNachName(selectedName).getAnzeigeText() != null) {
                            starteTextThread(controller.getDorf().getGebaeudeNachName(selectedName).getAnzeigeText(), panelBauen);
                        }
                        vectorBauListe.remove(index);
                        controller.getDorf().setGebaeudeGebaut(selectedName);
                        controller.getDorf().getGebaeudeListe().remove(index);
                    } else {
                        controller.getDorf().setGebaeudeGebaut(selectedName);
                    }
                }
                if (controller.getDorf().getGebaeudeGebaut(0) && controller.getDorf().getGebaeudeGebaut(1) && vectorBauListe.isEmpty()) {
                    for (int i = 0; i < controller.getDorf().getGebaeudeListe().size(); i++) {
                        vectorBauListe.add(controller.getDorf().getGebaeudeListe().get(i).getName());
                    }
                }
                if (nichtGenugRohstoffe) {
                    JOptionPane.showMessageDialog(panelBauen, "Nicht genug Rohstoffe!");
                } else {
                    listBauen.setListData(vectorBauListe);
                }
                listBauen.setSelectedIndex(0);
                txaInfoFeldBauen.setText(controller.getDorf().getGebaeudeListe().get(listBauen.getSelectedIndex()).getInfoText());
            }
        } else if (evt.getClickCount() == 1) {
            txaInfoFeldBauen.setText(controller.getDorf().getGebaeudeListe().get(listBauen.getSelectedIndex()).getInfoText());
        }
    }//GEN-LAST:event_listBauenMouseClicked

    private void btnBauenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBauenActionPerformed
        panelStadt.setVisible(false);
        panelBauen.setVisible(true);
        listBauen.setSelectedIndex(0);
        txaInfoFeldBauen.setText(controller.getDorf().getGebaeudeListe().get(listBauen.getSelectedIndex()).getInfoText());
    }//GEN-LAST:event_btnBauenActionPerformed

    private void btnHaendlerFertigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaendlerFertigActionPerformed
        panelHaendler.setVisible(false);
        panelStadt.setVisible(true);
    }//GEN-LAST:event_btnHaendlerFertigActionPerformed

    private void btnSchmiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchmiedActionPerformed
        panelStadt.setVisible(false);
        panelSchmied.setVisible(true);
        updateSchmied();
    }//GEN-LAST:event_btnSchmiedActionPerformed

    private void btnHeilenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeilenActionPerformed
        int preis = controller.getSpieler().getHeilpreis();
        if (controller.getSpieler().getHp() <= 0) {
            //Falls spieler tot
            int auswahl = JOptionPane.showOptionDialog(panelStadt, "Möchtest du dich für " + Integer.toString(preis) + " Gold wiederbeleben?", "Heilen?", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Ja", "Nein"}, "Ja");
            if (auswahl == 0) {
                if (controller.getRohstoffe().genugGold(preis)) {
                    controller.getSpieler().setHp(100);
                } else {
                    JOptionPane.showMessageDialog(panelStadt, "Nicht genug Rohstoffe!");
                }
            }
        } else if (preis > 0) {
            //Nicht full-hp
            int auswahl = JOptionPane.showOptionDialog(panelStadt, "Möchtest du dich für " + Integer.toString(preis) + " Gold heilen?", "Heilen?", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Ja", "Nein"}, "Ja");
            if (auswahl == 0) {
                if (controller.getRohstoffe().genugGold(preis)) {
                    controller.getSpieler().setHp(100);
                } else {
                    JOptionPane.showMessageDialog(panelStadt, "Nicht genug Rohstoffe!");
                }
            }
        } else {
            //Full-HP
            JOptionPane.showMessageDialog(panelStadt, "No Healerino 4 u !");
        }
    }//GEN-LAST:event_btnHeilenActionPerformed

    private void btnZauberladenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZauberladenActionPerformed
        //Damit button Zauberladen immer sichtbar ist
        if (!controller.getSpieler().isZauberLadenBesucht()) {
            controller.getSpieler().setZauberLadenBesucht(true);
        }
        panelStadt.setVisible(false);
        panelZauberladen.setVisible(true);
        txaInfoFeldZauberladen.setText("Durch Anklicken der Zauber erfahrt ihr mehr!");
        spinnerDonnerLvL.setValue(controller.getSpieler().getZauber().get(0).getLevel());
        spinnerFeuerLvL.setValue(controller.getSpieler().getZauber().get(1).getLevel());
        spinnerFrostLvL.setValue(controller.getSpieler().getZauber().get(2).getLevel());
    }//GEN-LAST:event_btnZauberladenActionPerformed

    private void btnKampfMagieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKampfMagieActionPerformed
        String zauberName = controller.getSpieler().getZauber().get(comboBoxMagieKampf.getSelectedIndex()).getName();
        if (controller.getSpieler().getZauber().get(comboBoxMagieKampf.getSelectedIndex()).getLevel() > 0) {
            int schaden = controller.getKampf().magie(comboBoxMagieKampf.getSelectedIndex());
            txaKampf.setText("Abenteurer verursacht " + schaden + " Schaden mit dem Zauber " + zauberName);
            gegenAngriff();
        } else {
            //Falls Zauber noch nicht gelernt ist
            txaKampf.setText("Versuche einen anderen Zauber!");
        }
    }//GEN-LAST:event_btnKampfMagieActionPerformed

    private void btnKampfHeiltrankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKampfHeiltrankActionPerformed
        controller.getSpieler().benutzeHeiltrank();
        if (controller.getSpieler().getHeiltraenke() == 0) {
            btnKampfHeiltrank.setEnabled(false);
        }
        txaKampf.setText("Abenteurer trinkt Heiltrank und heilt sich um 30 HP");
        gegenAngriff();
    }//GEN-LAST:event_btnKampfHeiltrankActionPerformed

    private void btnHaendlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHaendlerActionPerformed
        panelStadt.setVisible(false);
        panelHaendler.setVisible(true);
        updateHaendler();
    }//GEN-LAST:event_btnHaendlerActionPerformed

    private void listHaendlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listHaendlerMouseClicked
        if (evt.getClickCount() == 2) {
            int index = listHaendler.getSelectedIndex();
            int indexInPool = index;
            boolean nichtGenugRohstoffe = true;
            int auswahl = JOptionPane.showOptionDialog(panelHaendler, "Möchtest du es wirklich kaufen?", "Kaufen?", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Ja", "Nein"}, "Ja");
            if (auswahl == 0) {
                if (index >= (controller.getItempool().getHaendlerItems().size() + controller.getItempool().getMagieWaffenpool().size())) {
                    //Rüstung
                    indexInPool -= controller.getItempool().getHaendlerItems().size() + controller.getItempool().getMagieWaffenpool().size();
                    if (controller.getRohstoffe().genugRohstoffe(controller.getItempool().getMagieRuestungenpool().get(indexInPool).getKosten())) {
                        controller.getSpieler().getInvRuestungen().add(controller.getItempool().getMagieRuestungenpool().get(indexInPool));
                        controller.getItempool().getMagieRuestungenpool().remove(indexInPool);
                        nichtGenugRohstoffe = false;
                    }
                } else if (index >= controller.getItempool().getHaendlerItems().size() && index < (controller.getItempool().getMagieWaffenpool().size() + controller.getItempool().getHaendlerItems().size())) {
                    //Waffe ausgewählt
                    indexInPool -= controller.getItempool().getHaendlerItems().size();
                    if (controller.getRohstoffe().genugRohstoffe(controller.getItempool().getMagieWaffenpool().get(indexInPool).getKosten())) {
                        controller.getSpieler().getInvWaffen().add(controller.getItempool().getMagieWaffenpool().get(indexInPool));
                        controller.getItempool().getMagieWaffenpool().remove(indexInPool);
                        nichtGenugRohstoffe = false;
                    }
                } else if (index < controller.getItempool().getHaendlerItems().size()) {
                    if (controller.getRohstoffe().genugRohstoffe(controller.getItempool().getHaendlerItems().get(indexInPool).getKosten()) && !controller.getItempool().getHaendlerItems().get(indexInPool).getName().equals("Eisenbarren")) {
                        switch (controller.getItempool().getHaendlerItems().get(indexInPool).getName()) {
                            case "Heiltrank":
                                controller.getSpieler().setHeiltraenke(controller.getSpieler().getHeiltraenke() + 1);
                                break;
                            case "Karte":
                                controller.getItempool().getHaendlerItems().remove(indexInPool);
                                btnKarte.setVisible(true);
                                break;
                        }
                        nichtGenugRohstoffe = false;
                    } else if (controller.getItempool().getHaendlerItems().get(indexInPool).getName().equals("Eisenbarren")) {
                        try {
                            int anzahl = Integer.parseInt(JOptionPane.showInputDialog(panelHaendler, "Die Anzahl der Eisenbarren eingeben:", "Anzahl?"));

                            if (anzahl > 0) {
                                if (controller.getRohstoffe().genugGold(controller.getItempool().getHaendlerItems().get(indexInPool).getKosten()[2] * anzahl)) {
                                    nichtGenugRohstoffe = false;
                                    controller.getRohstoffe().setEisen(controller.getRohstoffe().getEisen() + anzahl);
                                }
                            }
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(panelHaendler, "Falsche Eingabe!");
                            nichtGenugRohstoffe = false;
                        }
                    }
                }
                if (nichtGenugRohstoffe) {
                    JOptionPane.showMessageDialog(panelHaendler, "Nicht genug Rohstoffe!");
                } else {
                    updateHaendler();
                }
            }
        } else if (evt.getClickCount() == 1) {
            int index = listHaendler.getSelectedIndex();
            int indexInPool = index;
            int[] kosten = new int[5];

            if (index >= (controller.getItempool().getHaendlerItems().size() + controller.getItempool().getMagieWaffenpool().size())) {
                //Rüstung
                indexInPool -= controller.getItempool().getHaendlerItems().size() + controller.getItempool().getMagieWaffenpool().size();
                txaInfoFeldHaendler.setText(controller.getItempool().getMagieRuestungenpool().get(indexInPool).getInfoText());
                kosten = controller.getItempool().getMagieRuestungenpool().get(indexInPool).getKosten();

            } else if (index >= controller.getItempool().getHaendlerItems().size() && index < (controller.getItempool().getMagieWaffenpool().size() + controller.getItempool().getHaendlerItems().size())) {
                //Waffe ausgewählt
                indexInPool -= controller.getItempool().getHaendlerItems().size();
                txaInfoFeldHaendler.setText(controller.getItempool().getMagieWaffenpool().get(indexInPool).getInfoText());
                kosten = controller.getItempool().getMagieWaffenpool().get(indexInPool).getKosten();
            } else if (index < controller.getItempool().getHaendlerItems().size()) {
                txaInfoFeldHaendler.setText(controller.getItempool().getHaendlerItems().get(indexInPool).getInfoText());
                kosten = controller.getItempool().getHaendlerItems().get(indexInPool).getKosten();
            }
            lblHolzkostenHaendler.setText(Integer.toString(kosten[0]));
            lblSteinkostenHaendler.setText(Integer.toString(kosten[1]));
            lblGoldkostenHaendler.setText(Integer.toString(kosten[2]));
            lblEisenkostenHaendler.setText(Integer.toString(kosten[3]));
            lblKohlekostenHaendler.setText(Integer.toString(kosten[4]));
        }
    }//GEN-LAST:event_listHaendlerMouseClicked

    private void btnZauberladenFertigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZauberladenFertigActionPerformed
        panelZauberladen.setVisible(false);
        panelStadt.setVisible(true);
    }//GEN-LAST:event_btnZauberladenFertigActionPerformed

    private void btnZauberladenKaufenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZauberladenKaufenActionPerformed
        if (controller.getRohstoffe().genugGold(kostenZauberLeveln())) {
            controller.getSpieler().getZauber().get(0).setLevel((int) spinnerDonnerLvL.getValue());
            controller.getSpieler().getZauber().get(1).setLevel((int) spinnerFeuerLvL.getValue());
            controller.getSpieler().getZauber().get(2).setLevel((int) spinnerFrostLvL.getValue());
            lblGoldkostenZauberladen.setText("0");
            txaInfoFeldZauberladen.setText("Gekauft!");
        } else {
            txaInfoFeldZauberladen.setText("Nicht genug Rohstoffe!");
        }
    }//GEN-LAST:event_btnZauberladenKaufenActionPerformed

    private void iconDonnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconDonnerMouseClicked
        txaInfoFeldZauberladen.setText(controller.getSpieler().getZauber().get(0).getInfoText());
    }//GEN-LAST:event_iconDonnerMouseClicked

    private void iconFeuerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconFeuerMouseClicked
        txaInfoFeldZauberladen.setText(controller.getSpieler().getZauber().get(1).getInfoText());
    }//GEN-LAST:event_iconFeuerMouseClicked

    private void iconEisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconEisMouseClicked
        txaInfoFeldZauberladen.setText(controller.getSpieler().getZauber().get(2).getInfoText());
    }//GEN-LAST:event_iconEisMouseClicked

    private void spinnerDonnerLvLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDonnerLvLStateChanged
        if ((int) spinnerDonnerLvL.getValue() < controller.getSpieler().getZauber().get(0).getLevel()) {
            spinnerDonnerLvL.setValue((int) spinnerDonnerLvL.getValue() + 1);
        } else if ((int) spinnerDonnerLvL.getValue() > 9) {
            spinnerDonnerLvL.setValue((int) spinnerDonnerLvL.getValue() - 1);
        }
        lblGoldkostenZauberladen.setText(Integer.toString(kostenZauberLeveln()));
    }//GEN-LAST:event_spinnerDonnerLvLStateChanged

    private void spinnerFeuerLvLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerFeuerLvLStateChanged
        if ((int) spinnerFeuerLvL.getValue() < controller.getSpieler().getZauber().get(1).getLevel()) {
            spinnerFeuerLvL.setValue((int) spinnerFeuerLvL.getValue() + 1);
        } else if ((int) spinnerFeuerLvL.getValue() > 9) {
            spinnerFeuerLvL.setValue((int) spinnerFeuerLvL.getValue() - 1);
        }
        lblGoldkostenZauberladen.setText(Integer.toString(kostenZauberLeveln()));
    }//GEN-LAST:event_spinnerFeuerLvLStateChanged

    private void spinnerFrostLvLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerFrostLvLStateChanged
        if ((int) spinnerFrostLvL.getValue() < controller.getSpieler().getZauber().get(2).getLevel()) {
            spinnerFrostLvL.setValue((int) spinnerFrostLvL.getValue() + 1);
        } else if ((int) spinnerFrostLvL.getValue() > 9) {
            spinnerFrostLvL.setValue((int) spinnerFrostLvL.getValue() - 1);
        }
        lblGoldkostenZauberladen.setText(Integer.toString(kostenZauberLeveln()));
    }//GEN-LAST:event_spinnerFrostLvLStateChanged

    private void btnSchmiedFertigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchmiedFertigActionPerformed
        panelSchmied.setVisible(false);
        panelStadt.setVisible(true);
    }//GEN-LAST:event_btnSchmiedFertigActionPerformed

    private void listSchmiedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSchmiedMouseClicked
        if (evt.getClickCount() == 2) {
            int index = listSchmied.getSelectedIndex();
            int indexInPool = index;
            boolean nichtGenugRohstoffe = true;
            int auswahl = JOptionPane.showOptionDialog(panelSchmied, "Möchtest du es wirklich schmieden?", "Schmieden?", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Ja", "Nein"}, "Ja");
            if (auswahl == 0) {
                if (index >= (controller.getItempool().getSchmiedeItems().size() + controller.getItempool().getWaffenpool().size())) {
                    //Rüstung
                    indexInPool -= controller.getItempool().getSchmiedeItems().size() + controller.getItempool().getWaffenpool().size();
                    if (controller.getRohstoffe().genugRohstoffe(controller.getItempool().getRuestungenpool().get(indexInPool).getKosten())) {
                        controller.getSpieler().getInvRuestungen().add(controller.getItempool().getRuestungenpool().get(indexInPool));
                        controller.getItempool().getRuestungenpool().remove(indexInPool);
                        nichtGenugRohstoffe = false;
                    }
                } else if (index >= controller.getItempool().getSchmiedeItems().size() && index < (controller.getItempool().getWaffenpool().size() + controller.getItempool().getSchmiedeItems().size())) {
                    //Waffe ausgewählt
                    indexInPool -= controller.getItempool().getSchmiedeItems().size();
                    if (controller.getRohstoffe().genugRohstoffe(controller.getItempool().getWaffenpool().get(indexInPool).getKosten())) {
                        controller.getSpieler().getInvWaffen().add(controller.getItempool().getWaffenpool().get(indexInPool));
                        controller.getItempool().getWaffenpool().remove(indexInPool);
                        nichtGenugRohstoffe = false;
                    }
                } else if (index < controller.getItempool().getSchmiedeItems().size()) {
                    if (controller.getRohstoffe().genugRohstoffe(controller.getItempool().getSchmiedeItems().get(indexInPool).getKosten())) {
                        switch (controller.getItempool().getSchmiedeItems().get(indexInPool).getName()) {
                            case "Bergkarre":
                                controller.getDorf().setBergkarrenAnzahl(controller.getDorf().getBergkarrenAnzahl() + 1);
                                controller.getItempool().getSchmiedeItems().get(indexInPool).getKosten()[3] += 25;
                                break;
                        }
                        nichtGenugRohstoffe = false;
                    }
                }
                if (nichtGenugRohstoffe) {
                    JOptionPane.showMessageDialog(panelSchmied, "Nicht genug Rohstoffe!");
                } else {
                    updateSchmied();
                }
            }
        } else if (evt.getClickCount() == 1) {
            int index = listSchmied.getSelectedIndex();
            int indexInPool = index;
            int[] kosten = new int[5];

            if (index >= (controller.getItempool().getSchmiedeItems().size() + controller.getItempool().getWaffenpool().size())) {
                //Rüstung
                indexInPool -= controller.getItempool().getSchmiedeItems().size() + controller.getItempool().getWaffenpool().size();
                txaInfoFeldSchmied.setText(controller.getItempool().getRuestungenpool().get(indexInPool).getInfoText());
                kosten = controller.getItempool().getRuestungenpool().get(indexInPool).getKosten();

            } else if (index >= controller.getItempool().getSchmiedeItems().size() && index < (controller.getItempool().getWaffenpool().size() + controller.getItempool().getSchmiedeItems().size())) {
                //Waffe ausgewählt
                indexInPool -= controller.getItempool().getSchmiedeItems().size();
                txaInfoFeldSchmied.setText(controller.getItempool().getWaffenpool().get(indexInPool).getInfoText());
                kosten = controller.getItempool().getWaffenpool().get(indexInPool).getKosten();
            } else if (index < controller.getItempool().getSchmiedeItems().size()) {
                txaInfoFeldSchmied.setText(controller.getItempool().getSchmiedeItems().get(indexInPool).getInfoText());
                kosten = controller.getItempool().getSchmiedeItems().get(indexInPool).getKosten();
            }
            lblHolzkostenSchmied.setText(Integer.toString(kosten[0]));
            lblSteinkostenSchmied.setText(Integer.toString(kosten[1]));
            lblGoldkostenSchmied.setText(Integer.toString(kosten[2]));
            lblEisenkostenSchmied.setText(Integer.toString(kosten[3]));
            lblKohlekostenSchmied.setText(Integer.toString(kosten[4]));
        }
    }//GEN-LAST:event_listSchmiedMouseClicked

    private void gegenAngriff() {
        //Gegner tot?
        if (controller.getKampf().getDerzeitigerGegner().getHp() <= 0) {
            JOptionPane.showMessageDialog(panelKampf, "Du hast deinen Gegner besiegt!");
            //Endboss ?
            if (controller.getKampf().getDerzeitigerGegner().getName().equals("DER ENDBOSS") && controller.getSpieler().getPosition().getX() == controller.getBruderPosition().getX() && controller.getSpieler().getPosition().getY() == controller.getBruderPosition().getY()) {
                panelKampf.setVisible(false);
                starteTextThread(controller.getGeschichte().getGeschichteStringEnde(), panelGeschichte);
            } else if (controller.getKarte()[controller.getSpieler().getPosition().getX()][controller.getSpieler().getPosition().getY()] == 'K') {
                //Auf KohleMine ?
                kohleMine();
            } else {
                //Falls Gegner tot dann Karte anzeigen
                panelKampf.setVisible(false);
                panelKarte.setVisible(true);
                kartenFeld.setVisible(true);
                kartenFeld.requestFocus();
                kartenFeld.repaint();
            }
            controller.getKampf().getDerzeitigerGegner().resetHp();
            controller.getKampf().setDerzeitigerGegner(null);
        } else {
            //Gegenangriff
            int schaden = controller.getKampf().angriff(false);
            updateHpBar();
            if (schaden == 0) {
                txaKampf.setText(txaKampf.getText() + "\n" + "Gegner kann nicht angreifen weil er eingefroren ist!");
            } else {
                //Gegner Angriff
                txaKampf.setText(txaKampf.getText() + "\n" + controller.getKampf().getDerzeitigerGegner().getName() + " verursacht " + schaden + " Schaden");
            }
            //Spieler tot?
            if (controller.getSpieler().getHp() <= 0) {
                panelKampf.setVisible(false);
                controller.getSpieler().setPosition(new Position(controller.getDorf().getPosition().getX(), controller.getDorf().getPosition().getY()));
                panelStadt.setVisible(true);
                controller.getKampf().getDerzeitigerGegner().resetHp();
                controller.getKampf().setDerzeitigerGegner(null);
                JOptionPane.showMessageDialog(panelKampf, "Du bist gestorben :( sadlife");
            }
        }
    }

    private int kostenZauberLeveln() {
        int donnerMagieKosten = (int) spinnerDonnerLvL.getValue() * controller.getSpieler().getZauber().get(0).getKosten()[2] - controller.getSpieler().getZauber().get(0).getLevel() * controller.getSpieler().getZauber().get(0).getKosten()[2];
        int feuerMagieKosten = (int) spinnerFeuerLvL.getValue() * controller.getSpieler().getZauber().get(1).getKosten()[2] - controller.getSpieler().getZauber().get(1).getLevel() * controller.getSpieler().getZauber().get(1).getKosten()[2];
        int frostMagieKosten = (int) spinnerFrostLvL.getValue() * controller.getSpieler().getZauber().get(2).getKosten()[2] - controller.getSpieler().getZauber().get(2).getLevel() * controller.getSpieler().getZauber().get(2).getKosten()[2];
        return donnerMagieKosten + feuerMagieKosten + frostMagieKosten;
    }

    private void updateHpBar() {
        //HP-Anzeige
        lebensbalkenGegner.setHp(controller.getKampf().getDerzeitigerGegner().getHp());
        lebensbalkenAbenteurer.setHp(controller.getSpieler().getHp());
        lblKampfHpWertAbenteurer.setText("HP: " + controller.getSpieler().getHp());
        lblKampfHpWertGegner.setText("HP: " + controller.getKampf().getDerzeitigerGegner().getHp());
        lebensbalkenAbenteurer.repaint();
        lebensbalkenGegner.repaint();
    }

    private void inKampf() {
        kartenFeld.setVisible(false);
        panelKarte.setVisible(false);
        txaKampf.setText("");
        updateHpBar();
        //Info anzeigen (über Spieler)
        lblKampfAngriffsschaden.setText(Integer.toString(controller.getSpieler().getEquipWaffe().getWert()));
        lblKampfRuestungswert.setText(Integer.toString(controller.getSpieler().getEquipRuestung().getWert()));

        //Heiltränke aktivieren
        if (controller.getSpieler().getHeiltraenke() > 0) {
            btnKampfHeiltrank.setEnabled(true);
        } else {
            btnKampfHeiltrank.setEnabled(false);
        }
        comboBoxMagieKampf.removeAllItems();
        //Zauber einfügen
        for (int i = 0; i < controller.getSpieler().getZauber().size(); i++) {
            comboBoxMagieKampf.addItem(controller.getSpieler().getZauber().get(i).getName() + " DMG: " + (int) (controller.getSpieler().getZauber().get(i).getWert() * controller.getSpieler().schadensFaktorMagie(i)));
        }
        comboBoxMagieKampf.setVisible(true);
        btnKampfMagie.setEnabled(true);
        //Info über Gegner anzeigen
        lblKampfGegnerName.setText(controller.getKampf().getDerzeitigerGegner().getName());
        lblKampfAngriffsschadenGegner.setText(Integer.toString(controller.getKampf().getDerzeitigerGegner().getAngriffswert()));

        lblKampfGegnerName.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("adventuregame/grafic/Gegner/" + controller.getKampf().getDerzeitigerGegner().getName() + ".jpg")));

        panelKampf.setVisible(true);
    }

    public void guiAktualisierung() {
        controller.updateRohstoffe();
        controller.getDorf().bewohnerErscheint();
        Rohstoffe r = controller.getRohstoffe();
        lblAnzahlEinwohner.setText(Integer.toString(controller.getDorf().getAnzahlEinwohner()));
        lblAnzahlMaxEinwohner.setText(Integer.toString(controller.getDorf().getMaxAnzahlEinwohner()));
        lblZufriedenheitWert.setText(Integer.toString(controller.getDorf().getZufriedenheit()) + "%");
        lblGold.setText(Integer.toString(r.getGold()));
        lblHolz.setText(Integer.toString(r.getHolz()));
        lblKohle.setText(Integer.toString(r.getKohle()));
        lblStein.setText(Integer.toString(r.getStein()));
        lblEisen.setText(Integer.toString(r.getEisen()));
    }

    private boolean alleVergeben() {
        boolean b = false;
        if ((int) spinnerZuordnungGold.getValue() + (int) spinnerZuordnungHolz.getValue() + (int) spinnerZuordnungStein.getValue() > controller.getDorf().getAnzahlEinwohner()) {
            b = true;
            JOptionPane.showMessageDialog(this, "Alle Einwohner zugeordnet!");
        }
        return b;
    }

    private void stadtButtonsAnzeigen() {
        if (controller.getDorf().getGebaeudeGebaut(3)) {
            btnSchmied.setVisible(true);
        }
        if (controller.getDorf().getGebaeudeGebaut(4)) {
            btnZauberladen.setVisible(true);
            btnZauberladen.setEnabled(false);
            btnZauberladen.setToolTipText("Ohne Hut und ohne Stab siehst du aus wie eine Mad!");
        }
        if ((controller.getSpieler().getEquipRuestung().getName().equals("Zauberhut") && controller.getSpieler().getEquipWaffe().getName().equals("Zauberstab")) || controller.getSpieler().isZauberLadenBesucht()) {
            btnZauberladen.setEnabled(true);
            btnZauberladen.setToolTipText("");
        }
        if (controller.getDorf().getGebaeudeGebaut(5)) {
            btnHeilen.setVisible(true);
        }
        if (controller.getDorf().getGebaeudeGebaut(6)) {
            btnHaendler.setVisible(true);
        }
    }

    private void updateHaendler() {
        Vector<Object> vectorKaufListe = new Vector<Object>();
        for (int i = 0; i < controller.getItempool().getHaendlerItems().size(); i++) {
            vectorKaufListe.add(controller.getItempool().getHaendlerItems().get(i).getName());
        }
        for (int i = 0; i < controller.getItempool().getMagieWaffenpool().size(); i++) {
            vectorKaufListe.add(controller.getItempool().getMagieWaffenpool().get(i).getName());
        }
        for (int i = 0; i < controller.getItempool().getMagieRuestungenpool().size(); i++) {
            vectorKaufListe.add(controller.getItempool().getMagieRuestungenpool().get(i).getName());
        }
        listHaendler.setListData(vectorKaufListe);
        listHaendler.setSelectedIndex(0);

        int[] kosten = controller.getItempool().getHaendlerItems().get(0).getKosten();
        lblHolzkostenHaendler.setText(Integer.toString(kosten[0]));
        lblSteinkostenHaendler.setText(Integer.toString(kosten[1]));
        lblGoldkostenHaendler.setText(Integer.toString(kosten[2]));
        lblEisenkostenHaendler.setText(Integer.toString(kosten[3]));
        lblKohlekostenHaendler.setText(Integer.toString(kosten[4]));
        txaInfoFeldHaendler.setText(controller.getItempool().getHaendlerItems().get(0).getInfoText());
    }

    private void updateSchmied() {
        Vector<Object> vectorSchmiedeListe = new Vector<Object>();

        for (int i = 0; i < controller.getItempool().getSchmiedeItems().size(); i++) {
            vectorSchmiedeListe.add(controller.getItempool().getSchmiedeItems().get(i).getName());
        }
        for (int i = 0; i < controller.getItempool().getWaffenpool().size(); i++) {
            vectorSchmiedeListe.add(controller.getItempool().getWaffenpool().get(i).getName());
        }
        for (int i = 0; i < controller.getItempool().getRuestungenpool().size(); i++) {
            vectorSchmiedeListe.add(controller.getItempool().getRuestungenpool().get(i).getName());
        }
        listSchmied.setListData(vectorSchmiedeListe);
        listSchmied.setSelectedIndex(0);

        int[] kosten = controller.getItempool().getSchmiedeItems().get(0).getKosten();
        lblHolzkostenSchmied.setText(Integer.toString(kosten[0]));
        lblSteinkostenSchmied.setText(Integer.toString(kosten[1]));
        lblGoldkostenSchmied.setText(Integer.toString(kosten[2]));
        lblEisenkostenSchmied.setText(Integer.toString(kosten[3]));
        lblKohlekostenSchmied.setText(Integer.toString(kosten[4]));
        txaInfoFeldSchmied.setText(controller.getItempool().getSchmiedeItems().get(0).getInfoText());
    }

    private void starteTextThread(ArrayList<String> texte, JPanel panelDavor) {
        panelBauen.setVisible(false);
        panelStadt.setVisible(false);
        panelKarte.setVisible(false);
        kartenFeld.setVisible(false);
        panelZauberladen.setVisible(false);
        panelHaendler.setVisible(false);
        panelSchmied.setVisible(false);
        panelGeschichte.setVisible(true);
        rGT = new GeschichteThread(this);
        rGT.start(texte, panelDavor);
    }

    private void kohleMine() {
        if (controller.getDorf().getMinen().isEmpty()) {
            //Aller erste Kohlemine
            panelKampf.setVisible(false);
            panelKarte.setVisible(false);
            kartenFeld.setVisible(false);
            ArrayList<String> tmpString = new ArrayList<String>();
            tmpString.add("Jetzt machst du richtig Kohle!");
            tmpString.add("Schau doch mal in der Schmiede nach");
            tmpString.add("wie du deine Kohle verbrennen kannst.");
            tmpString.add("ENDE");
            starteTextThread(tmpString, panelKarte);
        } else if (!controller.getDorf().mineBelegtAufPosition(controller.getSpieler().getPosition())) {
            panelKampf.setVisible(false);
            panelKarte.setVisible(true);
            kartenFeld.setVisible(true);
            kartenFeld.requestFocus();
            kartenFeld.repaint();
            JOptionPane.showMessageDialog(panelKarte, "Du hast eine Kohlemine eingenommen!");
        }
        if (!controller.getDorf().mineBelegtAufPosition(controller.getSpieler().getPosition()) || controller.getDorf().getMinen().isEmpty()) {
            controller.getZuordnung().setKohleMinen(controller.getZuordnung().getKohleMinen() + 1);
            controller.getDorf().getMinen().add(new Kohlemine(controller.getSpieler().getPosition()));
        }
    }

    public void anzeigeText(String text, Color farbe, JPanel panelDavor) {
        if (text.equals("ENDE")) {
            panelGeschichte.setVisible(false);
            panelDavor.setVisible(true);
            if (panelDavor == panelKarte) {
                kartenFeld.setVisible(true);
                kartenFeld.requestFocus();
            }
            if (panelDavor == panelGeschichte) {
                System.exit(0);
            }
            if (!rAT.isRunning()) {
                rAT.start();
            }
        } else {
            lblGeschichteText.setForeground(farbe);
            lblGeschichteText.setText(text);
        }
    }

    private void init() {
        //Hinzufügen eines Keylisteners damit wir laufen können

        panelStadt.setLocation(0, 0);
        panelZuordnung.setLocation(0, 0);
        panelKampf.setLocation(0, 0);
        panelAusruestung.setLocation(0, 0);
        panelBauen.setLocation(0, 0);
        panelHaendler.setLocation(0, 0);
        panelZauberladen.setLocation(0, 0);
        panelSchmied.setLocation(0, 0);
        panelKarte.setLocation(0, 0);
        panelGeschichte.setLocation(0, 0);

        panelZuordnung.setVisible(false);
        panelKampf.setVisible(false);
        panelAusruestung.setVisible(false);
        panelBauen.setVisible(false);
        panelHaendler.setVisible(false);
        panelZauberladen.setVisible(false);
        panelSchmied.setVisible(false);
        panelStadt.setVisible(false);
        panelKarte.setVisible(false);
        panelGeschichte.setVisible(true);

        btnSchmied.setVisible(false);
        btnHaendler.setVisible(false);
        btnZauberladen.setVisible(false);
        btnHeilen.setVisible(false);
        btnKarte.setVisible(false);

        btnKampfHeiltrank.setEnabled(false);

        kartenFeld = new KartenFeld(controller);
        kartenFeld.setSize(527, 527);
        kartenFeld.setBackground(Color.WHITE);
        mainPanel.add(kartenFeld);
        kartenFeld.setLocation(0, 0);
        kartenFeld.setVisible(false);
        panelKarte.add(kartenFeld);

        StyleContext.NamedStyle centerStyle = StyleContext.getDefaultStyleContext().new NamedStyle();
        StyleConstants.setAlignment(centerStyle, StyleConstants.ALIGN_CENTER);
        txaKampf.setHighlighter(null);
        txaKampf.removeMouseListener(null);
        txaKampf.setAutoscrolls(false);
        txaKampf.setFont(new Font("Arial", Font.PLAIN, 18));
        txaInfoFeldBauen.setHighlighter(null);
        txaInfoFeldBauen.removeMouseListener(null);
        txaInfoFeldHaendler.setHighlighter(null);
        txaInfoFeldHaendler.removeMouseListener(null);
        txaInfoFeldSchmied.setHighlighter(null);
        txaInfoFeldSchmied.removeMouseListener(null);
        txaInfoFeldZauberladen.setHighlighter(null);
        txaInfoFeldZauberladen.removeMouseListener(null);

        ((JSpinner.DefaultEditor) spinnerZuordnungGold.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spinnerZuordnungGold.getEditor()).getTextField().setHighlighter(null);
        ((JSpinner.DefaultEditor) spinnerZuordnungStein.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spinnerZuordnungStein.getEditor()).getTextField().setHighlighter(null);
        ((JSpinner.DefaultEditor) spinnerZuordnungHolz.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spinnerZuordnungHolz.getEditor()).getTextField().setHighlighter(null);

        ((JSpinner.DefaultEditor) spinnerDonnerLvL.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spinnerDonnerLvL.getEditor()).getTextField().setHighlighter(null);
        ((JSpinner.DefaultEditor) spinnerFrostLvL.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spinnerFrostLvL.getEditor()).getTextField().setHighlighter(null);
        ((JSpinner.DefaultEditor) spinnerFeuerLvL.getEditor()).getTextField().setEditable(false);
        ((JSpinner.DefaultEditor) spinnerFeuerLvL.getEditor()).getTextField().setHighlighter(null);

        vectorBauListe.add("Brunnen");
        vectorBauListe.add("Rathaus");
        listBauen.setListData(vectorBauListe);
        listBauen.setSelectedIndex(0);

        lblGeschichteText.setFont(new Font("Arial", Font.PLAIN, 18));
        lblGeschichteText.setHorizontalAlignment(SwingConstants.CENTER);

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(d.width / 2 - 200, d.height / 2 - 200);
        kartenFeld.addKeyListener(keylistenerInit());
        starteTextThread(controller.getGeschichte().getGeschichteStringAnfang(), panelStadt);
    }

    private KeyListener keylistenerInit() {
        KeyListener k = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (kartenFeld.isVisible()) {
                    Position alteSpielerPosition = controller.getSpieler().getPosition();
                    Position neueSpielerPosition = alteSpielerPosition;
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_UP:
                            if (alteSpielerPosition.getY() >= 1) {
                                neueSpielerPosition = new Position(alteSpielerPosition.getX(), alteSpielerPosition.getY() - 1);
                            }
                            break;
                        case KeyEvent.VK_DOWN:
                            if (alteSpielerPosition.getY() <= 29) {
                                neueSpielerPosition = new Position(alteSpielerPosition.getX(), alteSpielerPosition.getY() + 1);
                            }
                            break;
                        case KeyEvent.VK_RIGHT:
                            if (alteSpielerPosition.getX() <= 29) {
                                neueSpielerPosition = new Position(alteSpielerPosition.getX() + 1, alteSpielerPosition.getY());
                            }
                            break;
                        case KeyEvent.VK_LEFT:
                            if (alteSpielerPosition.getX() >= 1) {
                                neueSpielerPosition = new Position(alteSpielerPosition.getX() - 1, alteSpielerPosition.getY());
                            }
                            break;
                        case KeyEvent.VK_H:
                            if (controller.getSpieler().getHeiltraenke() > 0 && controller.getSpieler().getHp() < 100) {
                                controller.getSpieler().benutzeHeiltrank();
                                JOptionPane.showMessageDialog(panelKarte, "Du hast dich auf " + controller.getSpieler().getHp() + " HP geheilt!");
                            }
                    }
                    //Hat man sich Bewegt?
                    if ((neueSpielerPosition.getX() != alteSpielerPosition.getX()) || (neueSpielerPosition.getY() != alteSpielerPosition.getY())) {
                        controller.getSpieler().setPosition(neueSpielerPosition);
                        kartenFeld.repaint();
                        //Kampf?
                        if (controller.gegnerErscheint()) {
                            inKampf();
                        } else if (controller.getKarte()[controller.getSpieler().getPosition().getX()][controller.getSpieler().getPosition().getY()] == 'K' && !controller.getDorf().mineBelegtAufPosition(neueSpielerPosition)) {
                            //Kohle-Mine? ohne Gegner? & Zum ersten mal auf dieser Mine
                            kohleMine();
                        } else if (controller.getDorf().getPosition().getX() == neueSpielerPosition.getX() && controller.getDorf().getPosition().getY() == neueSpielerPosition.getY()) {
                            //In der Stadt?
                            panelKarte.setVisible(false);
                            kartenFeld.setVisible(false);
                            panelStadt.setVisible(true);
                        }
                    }
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        return k;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAusruestung;
    private javax.swing.JButton btnAusruestungFertig;
    private javax.swing.JButton btnBauen;
    private javax.swing.JButton btnBauenFertig;
    private javax.swing.JButton btnHaendler;
    private javax.swing.JButton btnHaendlerFertig;
    private javax.swing.JButton btnHeilen;
    private javax.swing.JButton btnKampfAngriff;
    private javax.swing.JButton btnKampfHeiltrank;
    private javax.swing.JButton btnKampfMagie;
    private javax.swing.JButton btnKarte;
    private javax.swing.JButton btnSchmied;
    private javax.swing.JButton btnSchmiedFertig;
    private javax.swing.JButton btnZauberladen;
    private javax.swing.JButton btnZauberladenFertig;
    private javax.swing.JButton btnZauberladenKaufen;
    private javax.swing.JButton btnZuordnung;
    private javax.swing.JButton btnZuordnungBestaetigen;
    private javax.swing.JComboBox comboBoxAusruestungRuestung;
    private javax.swing.JComboBox comboBoxAusruestungWaffe;
    private javax.swing.JComboBox comboBoxMagieKampf;
    private javax.swing.JLabel iconDonner;
    private javax.swing.JLabel iconEis;
    private javax.swing.JLabel iconFeuer;
    private javax.swing.JLabel lblAnzahlEinwohner;
    private javax.swing.JLabel lblAnzahlLvL;
    private javax.swing.JLabel lblAnzahlMaxEinwohner;
    private javax.swing.JLabel lblAusruestungAngriffswert;
    private javax.swing.JLabel lblAusruestungAngriffswertTitel;
    private javax.swing.JLabel lblAusruestungRuestung;
    private javax.swing.JLabel lblAusruestungRuestungswert;
    private javax.swing.JLabel lblAusruestungRuestungswertTitel;
    private javax.swing.JLabel lblAusruestungWaffe;
    private javax.swing.JLabel lblEinwohner;
    private javax.swing.JLabel lblEisen;
    private javax.swing.JLabel lblEisenHaendler;
    private javax.swing.JLabel lblEisenSchmied;
    private javax.swing.JLabel lblEisenkostenHaendler;
    private javax.swing.JLabel lblEisenkostenSchmied;
    private javax.swing.JLabel lblGeschichteText;
    private javax.swing.JLabel lblGold;
    private javax.swing.JLabel lblGoldHaendler;
    private javax.swing.JLabel lblGoldSchmied;
    private javax.swing.JLabel lblGoldZauberladen;
    private javax.swing.JLabel lblGoldkostenHaendler;
    private javax.swing.JLabel lblGoldkostenSchmied;
    private javax.swing.JLabel lblGoldkostenZauberladen;
    private javax.swing.JLabel lblGoldmineBild;
    private javax.swing.JLabel lblHolz;
    private javax.swing.JLabel lblHolzHaendler;
    private javax.swing.JLabel lblHolzSchmied;
    private javax.swing.JLabel lblHolzfaellerBild;
    private javax.swing.JLabel lblHolzkostenHaendler;
    private javax.swing.JLabel lblHolzkostenSchmied;
    private javax.swing.JLabel lblKampfAbenteurer;
    private javax.swing.JLabel lblKampfAngriffsschaden;
    private javax.swing.JLabel lblKampfAngriffsschadenGegner;
    private javax.swing.JLabel lblKampfGegnerName;
    private javax.swing.JLabel lblKampfHpWertAbenteurer;
    private javax.swing.JLabel lblKampfHpWertGegner;
    private javax.swing.JLabel lblKampfRuestungswert;
    private javax.swing.JLabel lblKampfTitelAngriffsschaden;
    private javax.swing.JLabel lblKampfTitelAngriffsschadenGegner;
    private javax.swing.JLabel lblKampfTitelRuestungswert;
    private javax.swing.JLabel lblKohle;
    private javax.swing.JLabel lblKohleHaendler;
    private javax.swing.JLabel lblKohleSchmied;
    private javax.swing.JLabel lblKohlekostenHaendler;
    private javax.swing.JLabel lblKohlekostenSchmied;
    private javax.swing.JLabel lblMaxEinwohner;
    private javax.swing.JLabel lblStein;
    private javax.swing.JLabel lblSteinHaendler;
    private javax.swing.JLabel lblSteinSchmied;
    private javax.swing.JLabel lblSteinbruchBild;
    private javax.swing.JLabel lblSteinkostenHaendler;
    private javax.swing.JLabel lblSteinkostenSchmied;
    private javax.swing.JLabel lblZufriedenheit;
    private javax.swing.JLabel lblZufriedenheitWert;
    private javax.swing.JLabel lblZuordnungGoldmine;
    private javax.swing.JLabel lblZuordnungHolzfäller;
    private javax.swing.JLabel lblZuordnungSteinbruch;
    private adventuregame.Lebensbalken lebensbalkenAbenteurer;
    private adventuregame.Lebensbalken lebensbalkenGegner;
    private javax.swing.JList listBauen;
    private javax.swing.JList listHaendler;
    private javax.swing.JList listSchmied;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelAusruestung;
    private javax.swing.JPanel panelBauen;
    private javax.swing.JPanel panelGeschichte;
    private javax.swing.JPanel panelHaendler;
    private javax.swing.JPanel panelKampf;
    private javax.swing.JPanel panelKarte;
    private javax.swing.JPanel panelSchmied;
    private javax.swing.JPanel panelStadt;
    private javax.swing.JPanel panelZauberladen;
    private javax.swing.JPanel panelZuordnung;
    private javax.swing.JSpinner spinnerDonnerLvL;
    private javax.swing.JSpinner spinnerFeuerLvL;
    private javax.swing.JSpinner spinnerFrostLvL;
    private javax.swing.JSpinner spinnerZuordnungGold;
    private javax.swing.JSpinner spinnerZuordnungHolz;
    private javax.swing.JSpinner spinnerZuordnungStein;
    private javax.swing.JTextArea txaInfoFeldAusruestung;
    private javax.swing.JTextArea txaInfoFeldBauen;
    private javax.swing.JTextArea txaInfoFeldHaendler;
    private javax.swing.JTextArea txaInfoFeldSchmied;
    private javax.swing.JTextArea txaInfoFeldZauberladen;
    private javax.swing.JTextArea txaKampf;
    // End of variables declaration//GEN-END:variables

}
