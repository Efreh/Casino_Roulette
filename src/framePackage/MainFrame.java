//Главное окно игры
package framePackage;

import logicPackage.*;
import animationsSounds.*;
import java.io.*;

public class MainFrame extends javax.swing.JFrame {

    public Player player = new Player();                                                        //Объект профиля игрока
    public ChipManager chipMngr = new ChipManager(player);                                      //Объект менеджера полей ставок //Принимает данные профиля игрока
    public WinLogic winner = new WinLogic(framePackage.MainFrame.this);                         //Объект логики игры // Принимает в параметр mainFrame
    public SetChips setChipsFrame = new SetChips(framePackage.MainFrame.this, chipMngr, player);//Создание фрейма SetChips как объекта для передачи параметров в него
    FountSoundsPlayer soundsPlayer = new FountSoundsPlayer();
    public EffectsSoundPlayer effectPlayer = new EffectsSoundPlayer();
    SettingsFrame settingsFrame = new SettingsFrame(framePackage.MainFrame.this);

    public MainFrame() {
        initComponents();
        player.playerSetLabelText(lPlayerName, lPlayerButget, bPlayer);                         //В конструкторе выставляется параметры объекта игрока 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        maskPanel = new javax.swing.JPanel();
        roulettePanel = new javax.swing.JPanel();
        labOut00 = new javax.swing.JLabel();
        labOut27 = new javax.swing.JLabel();
        labOut10 = new javax.swing.JLabel();
        labOut25 = new javax.swing.JLabel();
        labOut29 = new javax.swing.JLabel();
        labOut12 = new javax.swing.JLabel();
        labOut8 = new javax.swing.JLabel();
        labOut19 = new javax.swing.JLabel();
        labOut31 = new javax.swing.JLabel();
        labOut18 = new javax.swing.JLabel();
        labOut6 = new javax.swing.JLabel();
        labOut21 = new javax.swing.JLabel();
        labOut33 = new javax.swing.JLabel();
        labOut16 = new javax.swing.JLabel();
        labOut4 = new javax.swing.JLabel();
        labOut23 = new javax.swing.JLabel();
        labOut35 = new javax.swing.JLabel();
        labOut14 = new javax.swing.JLabel();
        labOut2 = new javax.swing.JLabel();
        labOut0 = new javax.swing.JLabel();
        labOut28 = new javax.swing.JLabel();
        labOut9 = new javax.swing.JLabel();
        labOut26 = new javax.swing.JLabel();
        labOut30 = new javax.swing.JLabel();
        labOut11 = new javax.swing.JLabel();
        labOut7 = new javax.swing.JLabel();
        labOut20 = new javax.swing.JLabel();
        labOut32 = new javax.swing.JLabel();
        labOut17 = new javax.swing.JLabel();
        labOut5 = new javax.swing.JLabel();
        labOut22 = new javax.swing.JLabel();
        labOut34 = new javax.swing.JLabel();
        labOut15 = new javax.swing.JLabel();
        labOut3 = new javax.swing.JLabel();
        labOut24 = new javax.swing.JLabel();
        labOut36 = new javax.swing.JLabel();
        labOut13 = new javax.swing.JLabel();
        labOut1 = new javax.swing.JLabel();
        b00 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        bg3to6 = new javax.swing.JButton();
        bg6to9 = new javax.swing.JButton();
        bg9to12 = new javax.swing.JButton();
        bg12to15 = new javax.swing.JButton();
        bg15to18 = new javax.swing.JButton();
        bg18to21 = new javax.swing.JButton();
        bg21to24 = new javax.swing.JButton();
        bg24to27 = new javax.swing.JButton();
        bg27to30 = new javax.swing.JButton();
        bg30to33 = new javax.swing.JButton();
        bg33to36 = new javax.swing.JButton();
        bg2to5 = new javax.swing.JButton();
        bg5to8 = new javax.swing.JButton();
        bg8to11 = new javax.swing.JButton();
        bg11to14 = new javax.swing.JButton();
        bg14to17 = new javax.swing.JButton();
        bg17to20 = new javax.swing.JButton();
        bg20to23 = new javax.swing.JButton();
        bg23to26 = new javax.swing.JButton();
        bg26to29 = new javax.swing.JButton();
        bg29to32 = new javax.swing.JButton();
        bg32to35 = new javax.swing.JButton();
        bg1to4 = new javax.swing.JButton();
        bg4to7 = new javax.swing.JButton();
        bg7to10 = new javax.swing.JButton();
        bg10to13 = new javax.swing.JButton();
        bg13to16 = new javax.swing.JButton();
        bg16to19 = new javax.swing.JButton();
        bg19to22 = new javax.swing.JButton();
        bg22to25 = new javax.swing.JButton();
        bg25to28 = new javax.swing.JButton();
        bg28to31 = new javax.swing.JButton();
        bg31to34 = new javax.swing.JButton();
        bv1to2 = new javax.swing.JButton();
        bv4to5 = new javax.swing.JButton();
        bv7to8 = new javax.swing.JButton();
        bv10to11 = new javax.swing.JButton();
        bv13to14 = new javax.swing.JButton();
        bv16to17 = new javax.swing.JButton();
        bv19to20 = new javax.swing.JButton();
        bv22to23 = new javax.swing.JButton();
        bv25to26 = new javax.swing.JButton();
        bv28to29 = new javax.swing.JButton();
        bv31to32 = new javax.swing.JButton();
        bv34to35 = new javax.swing.JButton();
        bc1_2_4_5 = new javax.swing.JButton();
        bc4_5_7_8 = new javax.swing.JButton();
        bc7_8_10_11 = new javax.swing.JButton();
        bc10_11_13_14 = new javax.swing.JButton();
        bc13_14_16_17 = new javax.swing.JButton();
        bc16_17_19_20 = new javax.swing.JButton();
        bc19_20_22_23 = new javax.swing.JButton();
        bc22_23_25_26 = new javax.swing.JButton();
        bc25_26_28_29 = new javax.swing.JButton();
        bc28_29_31_32 = new javax.swing.JButton();
        bc31_32_34_35 = new javax.swing.JButton();
        bv2to3 = new javax.swing.JButton();
        bv5to6 = new javax.swing.JButton();
        bv8to9 = new javax.swing.JButton();
        bv11to12 = new javax.swing.JButton();
        bv14to15 = new javax.swing.JButton();
        bv17to18 = new javax.swing.JButton();
        bv20to21 = new javax.swing.JButton();
        bv23to24 = new javax.swing.JButton();
        bv26to27 = new javax.swing.JButton();
        bv29to30 = new javax.swing.JButton();
        bv32to33 = new javax.swing.JButton();
        bv35to36 = new javax.swing.JButton();
        bc2_3_5_6 = new javax.swing.JButton();
        bc5_6_8_9 = new javax.swing.JButton();
        bc8_9_11_12 = new javax.swing.JButton();
        bc11_12_14_15 = new javax.swing.JButton();
        bc14_15_17_18 = new javax.swing.JButton();
        bc17_18_20_21 = new javax.swing.JButton();
        bc20_21_23_24 = new javax.swing.JButton();
        bc23_24_26_27 = new javax.swing.JButton();
        bc26_27_29_30 = new javax.swing.JButton();
        bc29_30_32_33 = new javax.swing.JButton();
        bc32_33_35_36 = new javax.swing.JButton();
        b2to1_3_36 = new javax.swing.JButton();
        b2to1_2_35 = new javax.swing.JButton();
        b2to1_1_34 = new javax.swing.JButton();
        b1st12 = new javax.swing.JButton();
        b2nd12 = new javax.swing.JButton();
        b3rd12 = new javax.swing.JButton();
        b1of18 = new javax.swing.JButton();
        b_even = new javax.swing.JButton();
        b_red = new javax.swing.JButton();
        b_black = new javax.swing.JButton();
        b_odd = new javax.swing.JButton();
        b19of36 = new javax.swing.JButton();
        b0of3 = new javax.swing.JButton();
        b1of3 = new javax.swing.JButton();
        b1of6 = new javax.swing.JButton();
        b4of6 = new javax.swing.JButton();
        b4of9 = new javax.swing.JButton();
        b7of9 = new javax.swing.JButton();
        b7of12 = new javax.swing.JButton();
        b10of12 = new javax.swing.JButton();
        b10of15 = new javax.swing.JButton();
        b13of15 = new javax.swing.JButton();
        b13of18 = new javax.swing.JButton();
        b16of18 = new javax.swing.JButton();
        b16of21 = new javax.swing.JButton();
        b19of21v = new javax.swing.JButton();
        b19of24vv = new javax.swing.JButton();
        b22of24v = new javax.swing.JButton();
        b22of27vv = new javax.swing.JButton();
        b25of27v = new javax.swing.JButton();
        b25of30vv = new javax.swing.JButton();
        b28of30v = new javax.swing.JButton();
        b28of33vv = new javax.swing.JButton();
        b31of33v = new javax.swing.JButton();
        b31of36vv = new javax.swing.JButton();
        b34of36v = new javax.swing.JButton();
        setChips = new javax.swing.JButton();
        clearAllField = new javax.swing.JButton();
        bPlayer = new javax.swing.JButton();
        lPlayerName = new javax.swing.JLabel();
        lPlayerButget = new javax.swing.JLabel();
        bRollBall = new javax.swing.JButton();
        lPlayerCurrentStav = new javax.swing.JLabel();
        notifLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bSaveProfile = new javax.swing.JButton();
        bLoadProfile = new javax.swing.JButton();
        bSettings = new javax.swing.JButton();
        mainFountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casino Roulette");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        maskPanel.setOpaque(false);
        maskPanel.setLayout(null);

        roulettePanel.setOpaque(false);
        roulettePanel.setLayout(null);

        labOut00.setName("37"); // NOI18N
        roulettePanel.add(labOut00);
        labOut00.setBounds(155, 20, 15, 15);

        labOut27.setName("27"); // NOI18N
        roulettePanel.add(labOut27);
        labOut27.setBounds(177, 21, 15, 15);

        labOut10.setName("10"); // NOI18N
        roulettePanel.add(labOut10);
        labOut10.setBounds(198, 25, 15, 15);

        labOut25.setName("25"); // NOI18N
        roulettePanel.add(labOut25);
        labOut25.setBounds(220, 33, 15, 15);

        labOut29.setName("29"); // NOI18N
        roulettePanel.add(labOut29);
        labOut29.setBounds(240, 45, 15, 15);

        labOut12.setName("12"); // NOI18N
        roulettePanel.add(labOut12);
        labOut12.setBounds(257, 61, 15, 15);

        labOut8.setName("8"); // NOI18N
        roulettePanel.add(labOut8);
        labOut8.setBounds(270, 80, 15, 15);

        labOut19.setName("19"); // NOI18N
        roulettePanel.add(labOut19);
        labOut19.setBounds(282, 100, 15, 15);

        labOut31.setName("31"); // NOI18N
        roulettePanel.add(labOut31);
        labOut31.setBounds(290, 120, 15, 15);

        labOut18.setName("18"); // NOI18N
        roulettePanel.add(labOut18);
        labOut18.setBounds(291, 145, 15, 15);

        labOut6.setName("6"); // NOI18N
        roulettePanel.add(labOut6);
        labOut6.setBounds(291, 165, 15, 15);

        labOut21.setName("21"); // NOI18N
        roulettePanel.add(labOut21);
        labOut21.setBounds(289, 188, 15, 15);

        labOut33.setName("33"); // NOI18N
        roulettePanel.add(labOut33);
        labOut33.setBounds(283, 208, 15, 15);

        labOut16.setName("16"); // NOI18N
        roulettePanel.add(labOut16);
        labOut16.setBounds(272, 230, 15, 15);

        labOut4.setName("4"); // NOI18N
        roulettePanel.add(labOut4);
        labOut4.setBounds(259, 249, 15, 15);

        labOut23.setName("23"); // NOI18N
        roulettePanel.add(labOut23);
        labOut23.setBounds(240, 263, 15, 15);

        labOut35.setName("35"); // NOI18N
        roulettePanel.add(labOut35);
        labOut35.setBounds(223, 274, 15, 15);

        labOut14.setName("14"); // NOI18N
        roulettePanel.add(labOut14);
        labOut14.setBounds(200, 285, 15, 15);

        labOut2.setName("2"); // NOI18N
        roulettePanel.add(labOut2);
        labOut2.setBounds(178, 290, 15, 15);

        labOut0.setName("0"); // NOI18N
        roulettePanel.add(labOut0);
        labOut0.setBounds(155, 291, 15, 15);

        labOut28.setName("28"); // NOI18N
        roulettePanel.add(labOut28);
        labOut28.setBounds(132, 290, 15, 15);

        labOut9.setName("9"); // NOI18N
        roulettePanel.add(labOut9);
        labOut9.setBounds(111, 285, 15, 15);

        labOut26.setName("26"); // NOI18N
        roulettePanel.add(labOut26);
        labOut26.setBounds(90, 275, 15, 15);

        labOut30.setName("30"); // NOI18N
        roulettePanel.add(labOut30);
        labOut30.setBounds(70, 264, 15, 15);

        labOut11.setName("11"); // NOI18N
        roulettePanel.add(labOut11);
        labOut11.setBounds(52, 248, 15, 15);

        labOut7.setName("7"); // NOI18N
        roulettePanel.add(labOut7);
        labOut7.setBounds(40, 230, 15, 15);

        labOut20.setName("20"); // NOI18N
        roulettePanel.add(labOut20);
        labOut20.setBounds(29, 210, 15, 15);

        labOut32.setName("32"); // NOI18N
        roulettePanel.add(labOut32);
        labOut32.setBounds(22, 189, 15, 15);

        labOut17.setName("17"); // NOI18N
        roulettePanel.add(labOut17);
        labOut17.setBounds(20, 166, 15, 15);

        labOut5.setName("5"); // NOI18N
        roulettePanel.add(labOut5);
        labOut5.setBounds(20, 145, 15, 15);

        labOut22.setName("22"); // NOI18N
        roulettePanel.add(labOut22);
        labOut22.setBounds(22, 122, 15, 15);

        labOut34.setName("34"); // NOI18N
        roulettePanel.add(labOut34);
        labOut34.setBounds(30, 100, 15, 15);

        labOut15.setName("15"); // NOI18N
        roulettePanel.add(labOut15);
        labOut15.setBounds(40, 80, 15, 15);

        labOut3.setName("3"); // NOI18N
        roulettePanel.add(labOut3);
        labOut3.setBounds(54, 63, 15, 15);

        labOut24.setName("24"); // NOI18N
        roulettePanel.add(labOut24);
        labOut24.setBounds(71, 48, 15, 15);

        labOut36.setName("36"); // NOI18N
        roulettePanel.add(labOut36);
        labOut36.setBounds(91, 35, 15, 15);

        labOut13.setName("13"); // NOI18N
        roulettePanel.add(labOut13);
        labOut13.setBounds(112, 26, 15, 15);

        labOut1.setName("1"); // NOI18N
        roulettePanel.add(labOut1);
        labOut1.setBounds(135, 20, 15, 15);

        maskPanel.add(roulettePanel);
        roulettePanel.setBounds(110, 110, 330, 330);

        b00.setToolTipText("00");
        b00.setBorder(null);
        b00.setBorderPainted(false);
        b00.setContentAreaFilled(false);
        b00.setFocusable(false);
        b00.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b00.setMaximumSize(new java.awt.Dimension(30, 30));
        b00.setMinimumSize(new java.awt.Dimension(30, 30));
        b00.setName("00"); // NOI18N
        b00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b00ActionPerformed(evt);
            }
        });
        maskPanel.add(b00);
        b00.setBounds(505, 165, 30, 30);

        b0.setToolTipText("0");
        b0.setBorder(null);
        b0.setBorderPainted(false);
        b0.setContentAreaFilled(false);
        b0.setFocusable(false);
        b0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b0.setMaximumSize(new java.awt.Dimension(30, 30));
        b0.setMinimumSize(new java.awt.Dimension(30, 30));
        b0.setName("0"); // NOI18N
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        maskPanel.add(b0);
        b0.setBounds(505, 260, 30, 30);

        b1.setToolTipText("");
        b1.setBorder(null);
        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setFocusable(false);
        b1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1.setMaximumSize(new java.awt.Dimension(30, 30));
        b1.setMinimumSize(new java.awt.Dimension(30, 30));
        b1.setName("1 red nechet"); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        maskPanel.add(b1);
        b1.setBounds(544, 277, 30, 30);

        b2.setToolTipText("");
        b2.setBorder(null);
        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setFocusable(false);
        b2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2.setMaximumSize(new java.awt.Dimension(30, 30));
        b2.setMinimumSize(new java.awt.Dimension(30, 30));
        b2.setName("2 black chet"); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        maskPanel.add(b2);
        b2.setBounds(544, 212, 30, 30);

        b3.setToolTipText("");
        b3.setBorder(null);
        b3.setBorderPainted(false);
        b3.setContentAreaFilled(false);
        b3.setFocusable(false);
        b3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b3.setMaximumSize(new java.awt.Dimension(30, 30));
        b3.setMinimumSize(new java.awt.Dimension(30, 30));
        b3.setName("3 red nechet"); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        maskPanel.add(b3);
        b3.setBounds(543, 146, 30, 30);

        b4.setToolTipText("");
        b4.setBorder(null);
        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);
        b4.setFocusable(false);
        b4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b4.setMaximumSize(new java.awt.Dimension(30, 30));
        b4.setMinimumSize(new java.awt.Dimension(30, 30));
        b4.setName("4 black chet"); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        maskPanel.add(b4);
        b4.setBounds(586, 277, 30, 30);

        b5.setToolTipText("");
        b5.setBorder(null);
        b5.setBorderPainted(false);
        b5.setContentAreaFilled(false);
        b5.setFocusable(false);
        b5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b5.setMaximumSize(new java.awt.Dimension(30, 30));
        b5.setMinimumSize(new java.awt.Dimension(30, 30));
        b5.setName("5 red nechet"); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        maskPanel.add(b5);
        b5.setBounds(586, 212, 30, 30);

        b6.setToolTipText("");
        b6.setBorder(null);
        b6.setBorderPainted(false);
        b6.setContentAreaFilled(false);
        b6.setFocusable(false);
        b6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b6.setMaximumSize(new java.awt.Dimension(30, 30));
        b6.setMinimumSize(new java.awt.Dimension(30, 30));
        b6.setName("6 black chet"); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        maskPanel.add(b6);
        b6.setBounds(586, 146, 30, 30);

        b7.setToolTipText("");
        b7.setBorder(null);
        b7.setBorderPainted(false);
        b7.setContentAreaFilled(false);
        b7.setFocusable(false);
        b7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b7.setMaximumSize(new java.awt.Dimension(30, 30));
        b7.setMinimumSize(new java.awt.Dimension(30, 30));
        b7.setName("7 red nechet"); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        maskPanel.add(b7);
        b7.setBounds(628, 277, 30, 30);

        b8.setToolTipText("");
        b8.setBorder(null);
        b8.setBorderPainted(false);
        b8.setContentAreaFilled(false);
        b8.setFocusable(false);
        b8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b8.setMaximumSize(new java.awt.Dimension(30, 30));
        b8.setMinimumSize(new java.awt.Dimension(30, 30));
        b8.setName("8 black chet"); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        maskPanel.add(b8);
        b8.setBounds(628, 212, 30, 30);

        b9.setToolTipText("");
        b9.setBorder(null);
        b9.setBorderPainted(false);
        b9.setContentAreaFilled(false);
        b9.setFocusable(false);
        b9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b9.setMaximumSize(new java.awt.Dimension(30, 30));
        b9.setMinimumSize(new java.awt.Dimension(30, 30));
        b9.setName("9 red nechet"); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        maskPanel.add(b9);
        b9.setBounds(628, 146, 30, 30);

        b10.setToolTipText("");
        b10.setBorder(null);
        b10.setBorderPainted(false);
        b10.setContentAreaFilled(false);
        b10.setFocusable(false);
        b10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b10.setMaximumSize(new java.awt.Dimension(30, 30));
        b10.setMinimumSize(new java.awt.Dimension(30, 30));
        b10.setName("10 black chet"); // NOI18N
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        maskPanel.add(b10);
        b10.setBounds(671, 277, 30, 30);

        b11.setToolTipText("");
        b11.setBorder(null);
        b11.setBorderPainted(false);
        b11.setContentAreaFilled(false);
        b11.setFocusable(false);
        b11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b11.setMaximumSize(new java.awt.Dimension(30, 30));
        b11.setMinimumSize(new java.awt.Dimension(30, 30));
        b11.setName("11 black nechet"); // NOI18N
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        maskPanel.add(b11);
        b11.setBounds(671, 212, 30, 30);

        b12.setToolTipText("");
        b12.setBorder(null);
        b12.setBorderPainted(false);
        b12.setContentAreaFilled(false);
        b12.setFocusable(false);
        b12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b12.setMaximumSize(new java.awt.Dimension(30, 30));
        b12.setMinimumSize(new java.awt.Dimension(30, 30));
        b12.setName("12 red chet"); // NOI18N
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        maskPanel.add(b12);
        b12.setBounds(671, 146, 30, 30);

        b13.setToolTipText("");
        b13.setBorder(null);
        b13.setBorderPainted(false);
        b13.setContentAreaFilled(false);
        b13.setFocusable(false);
        b13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b13.setMaximumSize(new java.awt.Dimension(30, 30));
        b13.setMinimumSize(new java.awt.Dimension(30, 30));
        b13.setName("13 black nechet"); // NOI18N
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        maskPanel.add(b13);
        b13.setBounds(713, 277, 30, 30);

        b14.setToolTipText("");
        b14.setBorder(null);
        b14.setBorderPainted(false);
        b14.setContentAreaFilled(false);
        b14.setFocusable(false);
        b14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b14.setMaximumSize(new java.awt.Dimension(30, 30));
        b14.setMinimumSize(new java.awt.Dimension(30, 30));
        b14.setName("14 red chet"); // NOI18N
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        maskPanel.add(b14);
        b14.setBounds(713, 212, 30, 30);

        b15.setToolTipText("");
        b15.setBorder(null);
        b15.setBorderPainted(false);
        b15.setContentAreaFilled(false);
        b15.setFocusable(false);
        b15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b15.setMaximumSize(new java.awt.Dimension(30, 30));
        b15.setMinimumSize(new java.awt.Dimension(30, 30));
        b15.setName("15 black nechet"); // NOI18N
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        maskPanel.add(b15);
        b15.setBounds(713, 146, 30, 30);

        b16.setToolTipText("");
        b16.setBorder(null);
        b16.setBorderPainted(false);
        b16.setContentAreaFilled(false);
        b16.setFocusable(false);
        b16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b16.setMaximumSize(new java.awt.Dimension(30, 30));
        b16.setMinimumSize(new java.awt.Dimension(30, 30));
        b16.setName("16 red chet"); // NOI18N
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        maskPanel.add(b16);
        b16.setBounds(755, 277, 30, 30);

        b17.setToolTipText("");
        b17.setBorder(null);
        b17.setBorderPainted(false);
        b17.setContentAreaFilled(false);
        b17.setFocusable(false);
        b17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b17.setMaximumSize(new java.awt.Dimension(30, 30));
        b17.setMinimumSize(new java.awt.Dimension(30, 30));
        b17.setName("17 black nechet"); // NOI18N
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        maskPanel.add(b17);
        b17.setBounds(755, 212, 30, 30);

        b18.setToolTipText("");
        b18.setBorder(null);
        b18.setBorderPainted(false);
        b18.setContentAreaFilled(false);
        b18.setFocusable(false);
        b18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b18.setMaximumSize(new java.awt.Dimension(30, 30));
        b18.setMinimumSize(new java.awt.Dimension(30, 30));
        b18.setName("18 red chet"); // NOI18N
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        maskPanel.add(b18);
        b18.setBounds(756, 146, 30, 30);

        b19.setToolTipText("");
        b19.setBorder(null);
        b19.setBorderPainted(false);
        b19.setContentAreaFilled(false);
        b19.setFocusable(false);
        b19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b19.setMaximumSize(new java.awt.Dimension(30, 30));
        b19.setMinimumSize(new java.awt.Dimension(30, 30));
        b19.setName("19 red nechet"); // NOI18N
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        maskPanel.add(b19);
        b19.setBounds(798, 277, 30, 30);

        b20.setToolTipText("");
        b20.setBorder(null);
        b20.setBorderPainted(false);
        b20.setContentAreaFilled(false);
        b20.setFocusable(false);
        b20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b20.setMaximumSize(new java.awt.Dimension(30, 30));
        b20.setMinimumSize(new java.awt.Dimension(30, 30));
        b20.setName("20 black chet"); // NOI18N
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        maskPanel.add(b20);
        b20.setBounds(798, 212, 30, 30);

        b21.setToolTipText("");
        b21.setBorder(null);
        b21.setBorderPainted(false);
        b21.setContentAreaFilled(false);
        b21.setFocusable(false);
        b21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b21.setMaximumSize(new java.awt.Dimension(30, 30));
        b21.setMinimumSize(new java.awt.Dimension(30, 30));
        b21.setName("21 red nechet"); // NOI18N
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        maskPanel.add(b21);
        b21.setBounds(798, 146, 30, 30);

        b22.setToolTipText("");
        b22.setBorder(null);
        b22.setBorderPainted(false);
        b22.setContentAreaFilled(false);
        b22.setFocusable(false);
        b22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b22.setMaximumSize(new java.awt.Dimension(30, 30));
        b22.setMinimumSize(new java.awt.Dimension(30, 30));
        b22.setName("22 black chet"); // NOI18N
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        maskPanel.add(b22);
        b22.setBounds(840, 277, 30, 30);

        b23.setToolTipText("");
        b23.setBorder(null);
        b23.setBorderPainted(false);
        b23.setContentAreaFilled(false);
        b23.setFocusable(false);
        b23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b23.setMaximumSize(new java.awt.Dimension(30, 30));
        b23.setMinimumSize(new java.awt.Dimension(30, 30));
        b23.setName("23 red nechet"); // NOI18N
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        maskPanel.add(b23);
        b23.setBounds(840, 212, 30, 30);

        b24.setToolTipText("");
        b24.setBorder(null);
        b24.setBorderPainted(false);
        b24.setContentAreaFilled(false);
        b24.setFocusable(false);
        b24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b24.setMaximumSize(new java.awt.Dimension(30, 30));
        b24.setMinimumSize(new java.awt.Dimension(30, 30));
        b24.setName("24 black chet"); // NOI18N
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        maskPanel.add(b24);
        b24.setBounds(841, 146, 30, 30);

        b25.setToolTipText("");
        b25.setBorder(null);
        b25.setBorderPainted(false);
        b25.setContentAreaFilled(false);
        b25.setFocusable(false);
        b25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b25.setMaximumSize(new java.awt.Dimension(30, 30));
        b25.setMinimumSize(new java.awt.Dimension(30, 30));
        b25.setName("25 red nechet"); // NOI18N
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });
        maskPanel.add(b25);
        b25.setBounds(883, 277, 30, 30);

        b26.setToolTipText("");
        b26.setBorder(null);
        b26.setBorderPainted(false);
        b26.setContentAreaFilled(false);
        b26.setFocusable(false);
        b26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b26.setMaximumSize(new java.awt.Dimension(30, 30));
        b26.setMinimumSize(new java.awt.Dimension(30, 30));
        b26.setName("26 black chet"); // NOI18N
        b26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b26ActionPerformed(evt);
            }
        });
        maskPanel.add(b26);
        b26.setBounds(883, 212, 30, 30);

        b27.setToolTipText("");
        b27.setBorder(null);
        b27.setBorderPainted(false);
        b27.setContentAreaFilled(false);
        b27.setFocusable(false);
        b27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b27.setMaximumSize(new java.awt.Dimension(30, 30));
        b27.setMinimumSize(new java.awt.Dimension(30, 30));
        b27.setName("27 red nechet"); // NOI18N
        b27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b27ActionPerformed(evt);
            }
        });
        maskPanel.add(b27);
        b27.setBounds(883, 146, 30, 30);

        b28.setToolTipText("");
        b28.setBorder(null);
        b28.setBorderPainted(false);
        b28.setContentAreaFilled(false);
        b28.setFocusable(false);
        b28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b28.setMaximumSize(new java.awt.Dimension(30, 30));
        b28.setMinimumSize(new java.awt.Dimension(30, 30));
        b28.setName("28 black chet"); // NOI18N
        b28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28ActionPerformed(evt);
            }
        });
        maskPanel.add(b28);
        b28.setBounds(925, 277, 30, 30);

        b29.setToolTipText("");
        b29.setBorder(null);
        b29.setBorderPainted(false);
        b29.setContentAreaFilled(false);
        b29.setFocusable(false);
        b29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b29.setMaximumSize(new java.awt.Dimension(30, 30));
        b29.setMinimumSize(new java.awt.Dimension(30, 30));
        b29.setName("29 black nechet"); // NOI18N
        b29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b29ActionPerformed(evt);
            }
        });
        maskPanel.add(b29);
        b29.setBounds(925, 212, 30, 30);

        b30.setToolTipText("");
        b30.setBorder(null);
        b30.setBorderPainted(false);
        b30.setContentAreaFilled(false);
        b30.setFocusable(false);
        b30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b30.setMaximumSize(new java.awt.Dimension(30, 30));
        b30.setMinimumSize(new java.awt.Dimension(30, 30));
        b30.setName("30 red chet"); // NOI18N
        b30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b30ActionPerformed(evt);
            }
        });
        maskPanel.add(b30);
        b30.setBounds(925, 146, 30, 30);

        b31.setToolTipText("");
        b31.setBorder(null);
        b31.setBorderPainted(false);
        b31.setContentAreaFilled(false);
        b31.setFocusable(false);
        b31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b31.setMaximumSize(new java.awt.Dimension(30, 30));
        b31.setMinimumSize(new java.awt.Dimension(30, 30));
        b31.setName("31 black nechet"); // NOI18N
        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31ActionPerformed(evt);
            }
        });
        maskPanel.add(b31);
        b31.setBounds(967, 277, 30, 30);

        b32.setToolTipText("");
        b32.setBorder(null);
        b32.setBorderPainted(false);
        b32.setContentAreaFilled(false);
        b32.setFocusable(false);
        b32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b32.setMaximumSize(new java.awt.Dimension(30, 30));
        b32.setMinimumSize(new java.awt.Dimension(30, 30));
        b32.setName("32 red chet"); // NOI18N
        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b32ActionPerformed(evt);
            }
        });
        maskPanel.add(b32);
        b32.setBounds(967, 212, 30, 30);

        b33.setToolTipText("");
        b33.setBorder(null);
        b33.setBorderPainted(false);
        b33.setContentAreaFilled(false);
        b33.setFocusable(false);
        b33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b33.setMaximumSize(new java.awt.Dimension(30, 30));
        b33.setMinimumSize(new java.awt.Dimension(30, 30));
        b33.setName("33 black nechet"); // NOI18N
        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b33ActionPerformed(evt);
            }
        });
        maskPanel.add(b33);
        b33.setBounds(968, 146, 30, 30);

        b34.setToolTipText("");
        b34.setBorder(null);
        b34.setBorderPainted(false);
        b34.setContentAreaFilled(false);
        b34.setFocusable(false);
        b34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b34.setMaximumSize(new java.awt.Dimension(30, 30));
        b34.setMinimumSize(new java.awt.Dimension(30, 30));
        b34.setName("34 red chet"); // NOI18N
        b34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b34ActionPerformed(evt);
            }
        });
        maskPanel.add(b34);
        b34.setBounds(1010, 277, 30, 30);

        b35.setToolTipText("");
        b35.setBorder(null);
        b35.setBorderPainted(false);
        b35.setContentAreaFilled(false);
        b35.setFocusable(false);
        b35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b35.setMaximumSize(new java.awt.Dimension(30, 30));
        b35.setMinimumSize(new java.awt.Dimension(30, 30));
        b35.setName("35 black nechet"); // NOI18N
        b35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b35ActionPerformed(evt);
            }
        });
        maskPanel.add(b35);
        b35.setBounds(1010, 212, 30, 30);

        b36.setToolTipText("");
        b36.setBorder(null);
        b36.setBorderPainted(false);
        b36.setContentAreaFilled(false);
        b36.setFocusable(false);
        b36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b36.setMaximumSize(new java.awt.Dimension(30, 30));
        b36.setMinimumSize(new java.awt.Dimension(30, 30));
        b36.setName("36 red chet"); // NOI18N
        b36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b36ActionPerformed(evt);
            }
        });
        maskPanel.add(b36);
        b36.setBounds(1010, 146, 30, 30);

        bg3to6.setToolTipText("");
        bg3to6.setBorder(null);
        bg3to6.setBorderPainted(false);
        bg3to6.setContentAreaFilled(false);
        bg3to6.setFocusable(false);
        bg3to6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg3to6.setMaximumSize(new java.awt.Dimension(30, 30));
        bg3to6.setMinimumSize(new java.awt.Dimension(30, 30));
        bg3to6.setName(""); // NOI18N
        bg3to6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg3to6ActionPerformed(evt);
            }
        });
        maskPanel.add(bg3to6);
        bg3to6.setBounds(565, 146, 30, 30);

        bg6to9.setToolTipText("");
        bg6to9.setBorder(null);
        bg6to9.setBorderPainted(false);
        bg6to9.setContentAreaFilled(false);
        bg6to9.setFocusable(false);
        bg6to9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg6to9.setMaximumSize(new java.awt.Dimension(30, 30));
        bg6to9.setMinimumSize(new java.awt.Dimension(30, 30));
        bg6to9.setName(""); // NOI18N
        bg6to9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg6to9ActionPerformed(evt);
            }
        });
        maskPanel.add(bg6to9);
        bg6to9.setBounds(606, 146, 30, 30);

        bg9to12.setToolTipText("");
        bg9to12.setBorder(null);
        bg9to12.setBorderPainted(false);
        bg9to12.setContentAreaFilled(false);
        bg9to12.setFocusable(false);
        bg9to12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg9to12.setMaximumSize(new java.awt.Dimension(30, 30));
        bg9to12.setMinimumSize(new java.awt.Dimension(30, 30));
        bg9to12.setName(""); // NOI18N
        bg9to12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg9to12ActionPerformed(evt);
            }
        });
        maskPanel.add(bg9to12);
        bg9to12.setBounds(651, 146, 30, 30);

        bg12to15.setToolTipText("");
        bg12to15.setBorder(null);
        bg12to15.setBorderPainted(false);
        bg12to15.setContentAreaFilled(false);
        bg12to15.setFocusable(false);
        bg12to15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg12to15.setMaximumSize(new java.awt.Dimension(30, 30));
        bg12to15.setMinimumSize(new java.awt.Dimension(30, 30));
        bg12to15.setName(""); // NOI18N
        bg12to15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg12to15ActionPerformed(evt);
            }
        });
        maskPanel.add(bg12to15);
        bg12to15.setBounds(693, 146, 30, 30);

        bg15to18.setToolTipText("");
        bg15to18.setBorder(null);
        bg15to18.setBorderPainted(false);
        bg15to18.setContentAreaFilled(false);
        bg15to18.setFocusable(false);
        bg15to18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg15to18.setMaximumSize(new java.awt.Dimension(30, 30));
        bg15to18.setMinimumSize(new java.awt.Dimension(30, 30));
        bg15to18.setName(""); // NOI18N
        bg15to18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg15to18ActionPerformed(evt);
            }
        });
        maskPanel.add(bg15to18);
        bg15to18.setBounds(735, 146, 30, 30);

        bg18to21.setToolTipText("");
        bg18to21.setBorder(null);
        bg18to21.setBorderPainted(false);
        bg18to21.setContentAreaFilled(false);
        bg18to21.setFocusable(false);
        bg18to21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg18to21.setMaximumSize(new java.awt.Dimension(30, 30));
        bg18to21.setMinimumSize(new java.awt.Dimension(30, 30));
        bg18to21.setName(""); // NOI18N
        bg18to21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg18to21ActionPerformed(evt);
            }
        });
        maskPanel.add(bg18to21);
        bg18to21.setBounds(778, 146, 30, 30);

        bg21to24.setToolTipText("");
        bg21to24.setBorder(null);
        bg21to24.setBorderPainted(false);
        bg21to24.setContentAreaFilled(false);
        bg21to24.setFocusable(false);
        bg21to24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg21to24.setMaximumSize(new java.awt.Dimension(30, 30));
        bg21to24.setMinimumSize(new java.awt.Dimension(30, 30));
        bg21to24.setName(""); // NOI18N
        bg21to24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg21to24ActionPerformed(evt);
            }
        });
        maskPanel.add(bg21to24);
        bg21to24.setBounds(820, 146, 30, 30);

        bg24to27.setToolTipText("");
        bg24to27.setBorder(null);
        bg24to27.setBorderPainted(false);
        bg24to27.setContentAreaFilled(false);
        bg24to27.setFocusable(false);
        bg24to27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg24to27.setMaximumSize(new java.awt.Dimension(30, 30));
        bg24to27.setMinimumSize(new java.awt.Dimension(30, 30));
        bg24to27.setName(""); // NOI18N
        bg24to27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg24to27ActionPerformed(evt);
            }
        });
        maskPanel.add(bg24to27);
        bg24to27.setBounds(863, 146, 30, 30);

        bg27to30.setToolTipText("");
        bg27to30.setBorder(null);
        bg27to30.setBorderPainted(false);
        bg27to30.setContentAreaFilled(false);
        bg27to30.setFocusable(false);
        bg27to30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg27to30.setMaximumSize(new java.awt.Dimension(30, 30));
        bg27to30.setMinimumSize(new java.awt.Dimension(30, 30));
        bg27to30.setName(""); // NOI18N
        bg27to30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg27to30ActionPerformed(evt);
            }
        });
        maskPanel.add(bg27to30);
        bg27to30.setBounds(905, 146, 30, 30);

        bg30to33.setToolTipText("");
        bg30to33.setBorder(null);
        bg30to33.setBorderPainted(false);
        bg30to33.setContentAreaFilled(false);
        bg30to33.setFocusable(false);
        bg30to33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg30to33.setMaximumSize(new java.awt.Dimension(30, 30));
        bg30to33.setMinimumSize(new java.awt.Dimension(30, 30));
        bg30to33.setName(""); // NOI18N
        bg30to33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg30to33ActionPerformed(evt);
            }
        });
        maskPanel.add(bg30to33);
        bg30to33.setBounds(948, 146, 30, 30);

        bg33to36.setToolTipText("");
        bg33to36.setBorder(null);
        bg33to36.setBorderPainted(false);
        bg33to36.setContentAreaFilled(false);
        bg33to36.setFocusable(false);
        bg33to36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg33to36.setMaximumSize(new java.awt.Dimension(30, 30));
        bg33to36.setMinimumSize(new java.awt.Dimension(30, 30));
        bg33to36.setName(""); // NOI18N
        bg33to36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg33to36ActionPerformed(evt);
            }
        });
        maskPanel.add(bg33to36);
        bg33to36.setBounds(990, 146, 30, 30);

        bg2to5.setToolTipText("");
        bg2to5.setBorder(null);
        bg2to5.setBorderPainted(false);
        bg2to5.setContentAreaFilled(false);
        bg2to5.setFocusable(false);
        bg2to5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg2to5.setMaximumSize(new java.awt.Dimension(30, 30));
        bg2to5.setMinimumSize(new java.awt.Dimension(30, 30));
        bg2to5.setName(""); // NOI18N
        bg2to5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg2to5ActionPerformed(evt);
            }
        });
        maskPanel.add(bg2to5);
        bg2to5.setBounds(566, 212, 30, 30);

        bg5to8.setToolTipText("");
        bg5to8.setBorder(null);
        bg5to8.setBorderPainted(false);
        bg5to8.setContentAreaFilled(false);
        bg5to8.setFocusable(false);
        bg5to8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg5to8.setMaximumSize(new java.awt.Dimension(30, 30));
        bg5to8.setMinimumSize(new java.awt.Dimension(30, 30));
        bg5to8.setName(""); // NOI18N
        bg5to8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg5to8ActionPerformed(evt);
            }
        });
        maskPanel.add(bg5to8);
        bg5to8.setBounds(608, 212, 30, 30);

        bg8to11.setToolTipText("");
        bg8to11.setBorder(null);
        bg8to11.setBorderPainted(false);
        bg8to11.setContentAreaFilled(false);
        bg8to11.setFocusable(false);
        bg8to11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg8to11.setMaximumSize(new java.awt.Dimension(30, 30));
        bg8to11.setMinimumSize(new java.awt.Dimension(30, 30));
        bg8to11.setName(""); // NOI18N
        bg8to11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg8to11ActionPerformed(evt);
            }
        });
        maskPanel.add(bg8to11);
        bg8to11.setBounds(651, 212, 30, 30);

        bg11to14.setToolTipText("");
        bg11to14.setBorder(null);
        bg11to14.setBorderPainted(false);
        bg11to14.setContentAreaFilled(false);
        bg11to14.setFocusable(false);
        bg11to14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg11to14.setMaximumSize(new java.awt.Dimension(30, 30));
        bg11to14.setMinimumSize(new java.awt.Dimension(30, 30));
        bg11to14.setName(""); // NOI18N
        bg11to14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg11to14ActionPerformed(evt);
            }
        });
        maskPanel.add(bg11to14);
        bg11to14.setBounds(693, 212, 30, 30);

        bg14to17.setToolTipText("");
        bg14to17.setBorder(null);
        bg14to17.setBorderPainted(false);
        bg14to17.setContentAreaFilled(false);
        bg14to17.setFocusable(false);
        bg14to17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg14to17.setMaximumSize(new java.awt.Dimension(30, 30));
        bg14to17.setMinimumSize(new java.awt.Dimension(30, 30));
        bg14to17.setName(""); // NOI18N
        bg14to17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg14to17ActionPerformed(evt);
            }
        });
        maskPanel.add(bg14to17);
        bg14to17.setBounds(735, 212, 30, 30);

        bg17to20.setToolTipText("");
        bg17to20.setBorder(null);
        bg17to20.setBorderPainted(false);
        bg17to20.setContentAreaFilled(false);
        bg17to20.setFocusable(false);
        bg17to20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg17to20.setMaximumSize(new java.awt.Dimension(30, 30));
        bg17to20.setMinimumSize(new java.awt.Dimension(30, 30));
        bg17to20.setName(""); // NOI18N
        bg17to20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg17to20ActionPerformed(evt);
            }
        });
        maskPanel.add(bg17to20);
        bg17to20.setBounds(777, 212, 30, 30);

        bg20to23.setToolTipText("");
        bg20to23.setBorder(null);
        bg20to23.setBorderPainted(false);
        bg20to23.setContentAreaFilled(false);
        bg20to23.setFocusable(false);
        bg20to23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg20to23.setMaximumSize(new java.awt.Dimension(30, 30));
        bg20to23.setMinimumSize(new java.awt.Dimension(30, 30));
        bg20to23.setName(""); // NOI18N
        bg20to23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg20to23ActionPerformed(evt);
            }
        });
        maskPanel.add(bg20to23);
        bg20to23.setBounds(820, 212, 30, 30);

        bg23to26.setToolTipText("");
        bg23to26.setBorder(null);
        bg23to26.setBorderPainted(false);
        bg23to26.setContentAreaFilled(false);
        bg23to26.setFocusable(false);
        bg23to26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg23to26.setMaximumSize(new java.awt.Dimension(30, 30));
        bg23to26.setMinimumSize(new java.awt.Dimension(30, 30));
        bg23to26.setName(""); // NOI18N
        bg23to26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg23to26ActionPerformed(evt);
            }
        });
        maskPanel.add(bg23to26);
        bg23to26.setBounds(862, 212, 30, 30);

        bg26to29.setToolTipText("");
        bg26to29.setBorder(null);
        bg26to29.setBorderPainted(false);
        bg26to29.setContentAreaFilled(false);
        bg26to29.setFocusable(false);
        bg26to29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg26to29.setMaximumSize(new java.awt.Dimension(30, 30));
        bg26to29.setMinimumSize(new java.awt.Dimension(30, 30));
        bg26to29.setName(""); // NOI18N
        bg26to29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg26to29ActionPerformed(evt);
            }
        });
        maskPanel.add(bg26to29);
        bg26to29.setBounds(905, 212, 30, 30);

        bg29to32.setToolTipText("");
        bg29to32.setBorder(null);
        bg29to32.setBorderPainted(false);
        bg29to32.setContentAreaFilled(false);
        bg29to32.setFocusable(false);
        bg29to32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg29to32.setMaximumSize(new java.awt.Dimension(30, 30));
        bg29to32.setMinimumSize(new java.awt.Dimension(30, 30));
        bg29to32.setName(""); // NOI18N
        bg29to32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg29to32ActionPerformed(evt);
            }
        });
        maskPanel.add(bg29to32);
        bg29to32.setBounds(947, 212, 30, 30);

        bg32to35.setToolTipText("");
        bg32to35.setBorder(null);
        bg32to35.setBorderPainted(false);
        bg32to35.setContentAreaFilled(false);
        bg32to35.setFocusable(false);
        bg32to35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg32to35.setMaximumSize(new java.awt.Dimension(30, 30));
        bg32to35.setMinimumSize(new java.awt.Dimension(30, 30));
        bg32to35.setName(""); // NOI18N
        bg32to35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg32to35ActionPerformed(evt);
            }
        });
        maskPanel.add(bg32to35);
        bg32to35.setBounds(990, 212, 30, 30);

        bg1to4.setToolTipText("");
        bg1to4.setBorder(null);
        bg1to4.setBorderPainted(false);
        bg1to4.setContentAreaFilled(false);
        bg1to4.setFocusable(false);
        bg1to4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg1to4.setMaximumSize(new java.awt.Dimension(30, 30));
        bg1to4.setMinimumSize(new java.awt.Dimension(30, 30));
        bg1to4.setName(""); // NOI18N
        bg1to4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg1to4ActionPerformed(evt);
            }
        });
        maskPanel.add(bg1to4);
        bg1to4.setBounds(566, 277, 30, 30);

        bg4to7.setToolTipText("");
        bg4to7.setBorder(null);
        bg4to7.setBorderPainted(false);
        bg4to7.setContentAreaFilled(false);
        bg4to7.setFocusable(false);
        bg4to7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg4to7.setMaximumSize(new java.awt.Dimension(30, 30));
        bg4to7.setMinimumSize(new java.awt.Dimension(30, 30));
        bg4to7.setName(""); // NOI18N
        bg4to7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg4to7ActionPerformed(evt);
            }
        });
        maskPanel.add(bg4to7);
        bg4to7.setBounds(608, 277, 30, 30);

        bg7to10.setToolTipText("");
        bg7to10.setBorder(null);
        bg7to10.setBorderPainted(false);
        bg7to10.setContentAreaFilled(false);
        bg7to10.setFocusable(false);
        bg7to10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg7to10.setMaximumSize(new java.awt.Dimension(30, 30));
        bg7to10.setMinimumSize(new java.awt.Dimension(30, 30));
        bg7to10.setName(""); // NOI18N
        bg7to10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg7to10ActionPerformed(evt);
            }
        });
        maskPanel.add(bg7to10);
        bg7to10.setBounds(651, 277, 30, 30);

        bg10to13.setToolTipText("");
        bg10to13.setBorder(null);
        bg10to13.setBorderPainted(false);
        bg10to13.setContentAreaFilled(false);
        bg10to13.setFocusable(false);
        bg10to13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg10to13.setMaximumSize(new java.awt.Dimension(30, 30));
        bg10to13.setMinimumSize(new java.awt.Dimension(30, 30));
        bg10to13.setName(""); // NOI18N
        bg10to13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg10to13ActionPerformed(evt);
            }
        });
        maskPanel.add(bg10to13);
        bg10to13.setBounds(693, 277, 30, 30);

        bg13to16.setToolTipText("");
        bg13to16.setBorder(null);
        bg13to16.setBorderPainted(false);
        bg13to16.setContentAreaFilled(false);
        bg13to16.setFocusable(false);
        bg13to16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg13to16.setMaximumSize(new java.awt.Dimension(30, 30));
        bg13to16.setMinimumSize(new java.awt.Dimension(30, 30));
        bg13to16.setName(""); // NOI18N
        bg13to16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg13to16ActionPerformed(evt);
            }
        });
        maskPanel.add(bg13to16);
        bg13to16.setBounds(735, 277, 30, 30);

        bg16to19.setToolTipText("");
        bg16to19.setBorder(null);
        bg16to19.setBorderPainted(false);
        bg16to19.setContentAreaFilled(false);
        bg16to19.setFocusable(false);
        bg16to19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg16to19.setMaximumSize(new java.awt.Dimension(30, 30));
        bg16to19.setMinimumSize(new java.awt.Dimension(30, 30));
        bg16to19.setName(""); // NOI18N
        bg16to19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg16to19ActionPerformed(evt);
            }
        });
        maskPanel.add(bg16to19);
        bg16to19.setBounds(777, 277, 30, 30);

        bg19to22.setToolTipText("");
        bg19to22.setBorder(null);
        bg19to22.setBorderPainted(false);
        bg19to22.setContentAreaFilled(false);
        bg19to22.setFocusable(false);
        bg19to22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg19to22.setMaximumSize(new java.awt.Dimension(30, 30));
        bg19to22.setMinimumSize(new java.awt.Dimension(30, 30));
        bg19to22.setName(""); // NOI18N
        bg19to22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg19to22ActionPerformed(evt);
            }
        });
        maskPanel.add(bg19to22);
        bg19to22.setBounds(820, 277, 30, 30);

        bg22to25.setToolTipText("");
        bg22to25.setBorder(null);
        bg22to25.setBorderPainted(false);
        bg22to25.setContentAreaFilled(false);
        bg22to25.setFocusable(false);
        bg22to25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg22to25.setMaximumSize(new java.awt.Dimension(30, 30));
        bg22to25.setMinimumSize(new java.awt.Dimension(30, 30));
        bg22to25.setName(""); // NOI18N
        bg22to25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg22to25ActionPerformed(evt);
            }
        });
        maskPanel.add(bg22to25);
        bg22to25.setBounds(862, 277, 30, 30);

        bg25to28.setToolTipText("");
        bg25to28.setBorder(null);
        bg25to28.setBorderPainted(false);
        bg25to28.setContentAreaFilled(false);
        bg25to28.setFocusable(false);
        bg25to28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg25to28.setMaximumSize(new java.awt.Dimension(30, 30));
        bg25to28.setMinimumSize(new java.awt.Dimension(30, 30));
        bg25to28.setName(""); // NOI18N
        bg25to28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg25to28ActionPerformed(evt);
            }
        });
        maskPanel.add(bg25to28);
        bg25to28.setBounds(905, 277, 30, 30);

        bg28to31.setToolTipText("");
        bg28to31.setBorder(null);
        bg28to31.setBorderPainted(false);
        bg28to31.setContentAreaFilled(false);
        bg28to31.setFocusable(false);
        bg28to31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg28to31.setMaximumSize(new java.awt.Dimension(30, 30));
        bg28to31.setMinimumSize(new java.awt.Dimension(30, 30));
        bg28to31.setName(""); // NOI18N
        bg28to31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg28to31ActionPerformed(evt);
            }
        });
        maskPanel.add(bg28to31);
        bg28to31.setBounds(947, 277, 30, 30);

        bg31to34.setToolTipText("");
        bg31to34.setBorder(null);
        bg31to34.setBorderPainted(false);
        bg31to34.setContentAreaFilled(false);
        bg31to34.setFocusable(false);
        bg31to34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg31to34.setMaximumSize(new java.awt.Dimension(30, 30));
        bg31to34.setMinimumSize(new java.awt.Dimension(30, 30));
        bg31to34.setName(""); // NOI18N
        bg31to34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bg31to34ActionPerformed(evt);
            }
        });
        maskPanel.add(bg31to34);
        bg31to34.setBounds(990, 277, 30, 30);

        bv1to2.setToolTipText("");
        bv1to2.setBorder(null);
        bv1to2.setBorderPainted(false);
        bv1to2.setContentAreaFilled(false);
        bv1to2.setFocusable(false);
        bv1to2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv1to2.setMaximumSize(new java.awt.Dimension(30, 30));
        bv1to2.setMinimumSize(new java.awt.Dimension(30, 30));
        bv1to2.setName(""); // NOI18N
        bv1to2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv1to2ActionPerformed(evt);
            }
        });
        maskPanel.add(bv1to2);
        bv1to2.setBounds(543, 246, 30, 30);

        bv4to5.setToolTipText("");
        bv4to5.setBorder(null);
        bv4to5.setBorderPainted(false);
        bv4to5.setContentAreaFilled(false);
        bv4to5.setFocusable(false);
        bv4to5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv4to5.setMaximumSize(new java.awt.Dimension(30, 30));
        bv4to5.setMinimumSize(new java.awt.Dimension(30, 30));
        bv4to5.setName(""); // NOI18N
        bv4to5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv4to5ActionPerformed(evt);
            }
        });
        maskPanel.add(bv4to5);
        bv4to5.setBounds(586, 246, 30, 30);

        bv7to8.setToolTipText("");
        bv7to8.setBorder(null);
        bv7to8.setBorderPainted(false);
        bv7to8.setContentAreaFilled(false);
        bv7to8.setFocusable(false);
        bv7to8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv7to8.setMaximumSize(new java.awt.Dimension(30, 30));
        bv7to8.setMinimumSize(new java.awt.Dimension(30, 30));
        bv7to8.setName(""); // NOI18N
        bv7to8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv7to8ActionPerformed(evt);
            }
        });
        maskPanel.add(bv7to8);
        bv7to8.setBounds(629, 246, 30, 30);

        bv10to11.setToolTipText("");
        bv10to11.setBorder(null);
        bv10to11.setBorderPainted(false);
        bv10to11.setContentAreaFilled(false);
        bv10to11.setFocusable(false);
        bv10to11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv10to11.setMaximumSize(new java.awt.Dimension(30, 30));
        bv10to11.setMinimumSize(new java.awt.Dimension(30, 30));
        bv10to11.setName(""); // NOI18N
        bv10to11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv10to11ActionPerformed(evt);
            }
        });
        maskPanel.add(bv10to11);
        bv10to11.setBounds(671, 246, 30, 30);

        bv13to14.setToolTipText("");
        bv13to14.setBorder(null);
        bv13to14.setBorderPainted(false);
        bv13to14.setContentAreaFilled(false);
        bv13to14.setFocusable(false);
        bv13to14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv13to14.setMaximumSize(new java.awt.Dimension(30, 30));
        bv13to14.setMinimumSize(new java.awt.Dimension(30, 30));
        bv13to14.setName(""); // NOI18N
        bv13to14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv13to14ActionPerformed(evt);
            }
        });
        maskPanel.add(bv13to14);
        bv13to14.setBounds(713, 246, 30, 30);

        bv16to17.setToolTipText("");
        bv16to17.setBorder(null);
        bv16to17.setBorderPainted(false);
        bv16to17.setContentAreaFilled(false);
        bv16to17.setFocusable(false);
        bv16to17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv16to17.setMaximumSize(new java.awt.Dimension(30, 30));
        bv16to17.setMinimumSize(new java.awt.Dimension(30, 30));
        bv16to17.setName(""); // NOI18N
        bv16to17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv16to17ActionPerformed(evt);
            }
        });
        maskPanel.add(bv16to17);
        bv16to17.setBounds(755, 246, 30, 30);

        bv19to20.setToolTipText("");
        bv19to20.setBorder(null);
        bv19to20.setBorderPainted(false);
        bv19to20.setContentAreaFilled(false);
        bv19to20.setFocusable(false);
        bv19to20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv19to20.setMaximumSize(new java.awt.Dimension(30, 30));
        bv19to20.setMinimumSize(new java.awt.Dimension(30, 30));
        bv19to20.setName(""); // NOI18N
        bv19to20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv19to20ActionPerformed(evt);
            }
        });
        maskPanel.add(bv19to20);
        bv19to20.setBounds(798, 246, 30, 30);

        bv22to23.setToolTipText("");
        bv22to23.setBorder(null);
        bv22to23.setBorderPainted(false);
        bv22to23.setContentAreaFilled(false);
        bv22to23.setFocusable(false);
        bv22to23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv22to23.setMaximumSize(new java.awt.Dimension(30, 30));
        bv22to23.setMinimumSize(new java.awt.Dimension(30, 30));
        bv22to23.setName(""); // NOI18N
        bv22to23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv22to23ActionPerformed(evt);
            }
        });
        maskPanel.add(bv22to23);
        bv22to23.setBounds(841, 246, 30, 30);

        bv25to26.setToolTipText("");
        bv25to26.setBorder(null);
        bv25to26.setBorderPainted(false);
        bv25to26.setContentAreaFilled(false);
        bv25to26.setFocusable(false);
        bv25to26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv25to26.setMaximumSize(new java.awt.Dimension(30, 30));
        bv25to26.setMinimumSize(new java.awt.Dimension(30, 30));
        bv25to26.setName(""); // NOI18N
        bv25to26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv25to26ActionPerformed(evt);
            }
        });
        maskPanel.add(bv25to26);
        bv25to26.setBounds(883, 246, 30, 30);

        bv28to29.setToolTipText("");
        bv28to29.setBorder(null);
        bv28to29.setBorderPainted(false);
        bv28to29.setContentAreaFilled(false);
        bv28to29.setFocusable(false);
        bv28to29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv28to29.setMaximumSize(new java.awt.Dimension(30, 30));
        bv28to29.setMinimumSize(new java.awt.Dimension(30, 30));
        bv28to29.setName(""); // NOI18N
        bv28to29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv28to29ActionPerformed(evt);
            }
        });
        maskPanel.add(bv28to29);
        bv28to29.setBounds(925, 246, 30, 30);

        bv31to32.setToolTipText("");
        bv31to32.setBorder(null);
        bv31to32.setBorderPainted(false);
        bv31to32.setContentAreaFilled(false);
        bv31to32.setFocusable(false);
        bv31to32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv31to32.setMaximumSize(new java.awt.Dimension(30, 30));
        bv31to32.setMinimumSize(new java.awt.Dimension(30, 30));
        bv31to32.setName(""); // NOI18N
        bv31to32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv31to32ActionPerformed(evt);
            }
        });
        maskPanel.add(bv31to32);
        bv31to32.setBounds(967, 246, 30, 30);

        bv34to35.setToolTipText("");
        bv34to35.setBorder(null);
        bv34to35.setBorderPainted(false);
        bv34to35.setContentAreaFilled(false);
        bv34to35.setFocusable(false);
        bv34to35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv34to35.setMaximumSize(new java.awt.Dimension(30, 30));
        bv34to35.setMinimumSize(new java.awt.Dimension(30, 30));
        bv34to35.setName(""); // NOI18N
        bv34to35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv34to35ActionPerformed(evt);
            }
        });
        maskPanel.add(bv34to35);
        bv34to35.setBounds(1010, 246, 30, 30);

        bc1_2_4_5.setToolTipText("");
        bc1_2_4_5.setBorder(null);
        bc1_2_4_5.setBorderPainted(false);
        bc1_2_4_5.setContentAreaFilled(false);
        bc1_2_4_5.setFocusable(false);
        bc1_2_4_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc1_2_4_5.setMaximumSize(new java.awt.Dimension(30, 30));
        bc1_2_4_5.setMinimumSize(new java.awt.Dimension(30, 30));
        bc1_2_4_5.setName(""); // NOI18N
        bc1_2_4_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc1_2_4_5ActionPerformed(evt);
            }
        });
        maskPanel.add(bc1_2_4_5);
        bc1_2_4_5.setBounds(565, 246, 30, 30);

        bc4_5_7_8.setToolTipText("");
        bc4_5_7_8.setBorder(null);
        bc4_5_7_8.setBorderPainted(false);
        bc4_5_7_8.setContentAreaFilled(false);
        bc4_5_7_8.setFocusable(false);
        bc4_5_7_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc4_5_7_8.setMaximumSize(new java.awt.Dimension(30, 30));
        bc4_5_7_8.setMinimumSize(new java.awt.Dimension(30, 30));
        bc4_5_7_8.setName(""); // NOI18N
        bc4_5_7_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc4_5_7_8ActionPerformed(evt);
            }
        });
        maskPanel.add(bc4_5_7_8);
        bc4_5_7_8.setBounds(607, 246, 30, 30);

        bc7_8_10_11.setToolTipText("");
        bc7_8_10_11.setBorder(null);
        bc7_8_10_11.setBorderPainted(false);
        bc7_8_10_11.setContentAreaFilled(false);
        bc7_8_10_11.setFocusable(false);
        bc7_8_10_11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc7_8_10_11.setMaximumSize(new java.awt.Dimension(30, 30));
        bc7_8_10_11.setMinimumSize(new java.awt.Dimension(30, 30));
        bc7_8_10_11.setName(""); // NOI18N
        bc7_8_10_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc7_8_10_11ActionPerformed(evt);
            }
        });
        maskPanel.add(bc7_8_10_11);
        bc7_8_10_11.setBounds(650, 246, 30, 30);

        bc10_11_13_14.setToolTipText("");
        bc10_11_13_14.setBorder(null);
        bc10_11_13_14.setBorderPainted(false);
        bc10_11_13_14.setContentAreaFilled(false);
        bc10_11_13_14.setFocusable(false);
        bc10_11_13_14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc10_11_13_14.setMaximumSize(new java.awt.Dimension(30, 30));
        bc10_11_13_14.setMinimumSize(new java.awt.Dimension(30, 30));
        bc10_11_13_14.setName(""); // NOI18N
        bc10_11_13_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc10_11_13_14ActionPerformed(evt);
            }
        });
        maskPanel.add(bc10_11_13_14);
        bc10_11_13_14.setBounds(692, 246, 30, 30);

        bc13_14_16_17.setToolTipText("");
        bc13_14_16_17.setBorder(null);
        bc13_14_16_17.setBorderPainted(false);
        bc13_14_16_17.setContentAreaFilled(false);
        bc13_14_16_17.setFocusable(false);
        bc13_14_16_17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc13_14_16_17.setMaximumSize(new java.awt.Dimension(30, 30));
        bc13_14_16_17.setMinimumSize(new java.awt.Dimension(30, 30));
        bc13_14_16_17.setName(""); // NOI18N
        bc13_14_16_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc13_14_16_17ActionPerformed(evt);
            }
        });
        maskPanel.add(bc13_14_16_17);
        bc13_14_16_17.setBounds(734, 246, 30, 30);

        bc16_17_19_20.setToolTipText("");
        bc16_17_19_20.setBorder(null);
        bc16_17_19_20.setBorderPainted(false);
        bc16_17_19_20.setContentAreaFilled(false);
        bc16_17_19_20.setFocusable(false);
        bc16_17_19_20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc16_17_19_20.setMaximumSize(new java.awt.Dimension(30, 30));
        bc16_17_19_20.setMinimumSize(new java.awt.Dimension(30, 30));
        bc16_17_19_20.setName(""); // NOI18N
        bc16_17_19_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc16_17_19_20ActionPerformed(evt);
            }
        });
        maskPanel.add(bc16_17_19_20);
        bc16_17_19_20.setBounds(776, 246, 30, 30);

        bc19_20_22_23.setToolTipText("");
        bc19_20_22_23.setBorder(null);
        bc19_20_22_23.setBorderPainted(false);
        bc19_20_22_23.setContentAreaFilled(false);
        bc19_20_22_23.setFocusable(false);
        bc19_20_22_23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc19_20_22_23.setMaximumSize(new java.awt.Dimension(30, 30));
        bc19_20_22_23.setMinimumSize(new java.awt.Dimension(30, 30));
        bc19_20_22_23.setName(""); // NOI18N
        bc19_20_22_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc19_20_22_23ActionPerformed(evt);
            }
        });
        maskPanel.add(bc19_20_22_23);
        bc19_20_22_23.setBounds(819, 246, 30, 30);

        bc22_23_25_26.setToolTipText("");
        bc22_23_25_26.setBorder(null);
        bc22_23_25_26.setBorderPainted(false);
        bc22_23_25_26.setContentAreaFilled(false);
        bc22_23_25_26.setFocusable(false);
        bc22_23_25_26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc22_23_25_26.setMaximumSize(new java.awt.Dimension(30, 30));
        bc22_23_25_26.setMinimumSize(new java.awt.Dimension(30, 30));
        bc22_23_25_26.setName(""); // NOI18N
        bc22_23_25_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc22_23_25_26ActionPerformed(evt);
            }
        });
        maskPanel.add(bc22_23_25_26);
        bc22_23_25_26.setBounds(862, 246, 30, 30);

        bc25_26_28_29.setToolTipText("");
        bc25_26_28_29.setBorder(null);
        bc25_26_28_29.setBorderPainted(false);
        bc25_26_28_29.setContentAreaFilled(false);
        bc25_26_28_29.setFocusable(false);
        bc25_26_28_29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc25_26_28_29.setMaximumSize(new java.awt.Dimension(30, 30));
        bc25_26_28_29.setMinimumSize(new java.awt.Dimension(30, 30));
        bc25_26_28_29.setName(""); // NOI18N
        bc25_26_28_29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc25_26_28_29ActionPerformed(evt);
            }
        });
        maskPanel.add(bc25_26_28_29);
        bc25_26_28_29.setBounds(904, 246, 30, 30);

        bc28_29_31_32.setToolTipText("");
        bc28_29_31_32.setBorder(null);
        bc28_29_31_32.setBorderPainted(false);
        bc28_29_31_32.setContentAreaFilled(false);
        bc28_29_31_32.setFocusable(false);
        bc28_29_31_32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc28_29_31_32.setMaximumSize(new java.awt.Dimension(30, 30));
        bc28_29_31_32.setMinimumSize(new java.awt.Dimension(30, 30));
        bc28_29_31_32.setName(""); // NOI18N
        bc28_29_31_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc28_29_31_32ActionPerformed(evt);
            }
        });
        maskPanel.add(bc28_29_31_32);
        bc28_29_31_32.setBounds(946, 246, 30, 30);

        bc31_32_34_35.setToolTipText("");
        bc31_32_34_35.setBorder(null);
        bc31_32_34_35.setBorderPainted(false);
        bc31_32_34_35.setContentAreaFilled(false);
        bc31_32_34_35.setFocusable(false);
        bc31_32_34_35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc31_32_34_35.setMaximumSize(new java.awt.Dimension(30, 30));
        bc31_32_34_35.setMinimumSize(new java.awt.Dimension(30, 30));
        bc31_32_34_35.setName(""); // NOI18N
        bc31_32_34_35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc31_32_34_35ActionPerformed(evt);
            }
        });
        maskPanel.add(bc31_32_34_35);
        bc31_32_34_35.setBounds(988, 246, 30, 30);

        bv2to3.setToolTipText("");
        bv2to3.setBorder(null);
        bv2to3.setBorderPainted(false);
        bv2to3.setContentAreaFilled(false);
        bv2to3.setFocusable(false);
        bv2to3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv2to3.setMaximumSize(new java.awt.Dimension(30, 30));
        bv2to3.setMinimumSize(new java.awt.Dimension(30, 30));
        bv2to3.setName(""); // NOI18N
        bv2to3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv2to3ActionPerformed(evt);
            }
        });
        maskPanel.add(bv2to3);
        bv2to3.setBounds(543, 180, 30, 30);

        bv5to6.setToolTipText("");
        bv5to6.setBorder(null);
        bv5to6.setBorderPainted(false);
        bv5to6.setContentAreaFilled(false);
        bv5to6.setFocusable(false);
        bv5to6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv5to6.setMaximumSize(new java.awt.Dimension(30, 30));
        bv5to6.setMinimumSize(new java.awt.Dimension(30, 30));
        bv5to6.setName(""); // NOI18N
        bv5to6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv5to6ActionPerformed(evt);
            }
        });
        maskPanel.add(bv5to6);
        bv5to6.setBounds(586, 180, 30, 30);

        bv8to9.setToolTipText("");
        bv8to9.setBorder(null);
        bv8to9.setBorderPainted(false);
        bv8to9.setContentAreaFilled(false);
        bv8to9.setFocusable(false);
        bv8to9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv8to9.setMaximumSize(new java.awt.Dimension(30, 30));
        bv8to9.setMinimumSize(new java.awt.Dimension(30, 30));
        bv8to9.setName(""); // NOI18N
        bv8to9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv8to9ActionPerformed(evt);
            }
        });
        maskPanel.add(bv8to9);
        bv8to9.setBounds(629, 180, 30, 30);

        bv11to12.setToolTipText("");
        bv11to12.setBorder(null);
        bv11to12.setBorderPainted(false);
        bv11to12.setContentAreaFilled(false);
        bv11to12.setFocusable(false);
        bv11to12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv11to12.setMaximumSize(new java.awt.Dimension(30, 30));
        bv11to12.setMinimumSize(new java.awt.Dimension(30, 30));
        bv11to12.setName(""); // NOI18N
        bv11to12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv11to12ActionPerformed(evt);
            }
        });
        maskPanel.add(bv11to12);
        bv11to12.setBounds(671, 180, 30, 30);

        bv14to15.setToolTipText("");
        bv14to15.setBorder(null);
        bv14to15.setBorderPainted(false);
        bv14to15.setContentAreaFilled(false);
        bv14to15.setFocusable(false);
        bv14to15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv14to15.setMaximumSize(new java.awt.Dimension(30, 30));
        bv14to15.setMinimumSize(new java.awt.Dimension(30, 30));
        bv14to15.setName(""); // NOI18N
        bv14to15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv14to15ActionPerformed(evt);
            }
        });
        maskPanel.add(bv14to15);
        bv14to15.setBounds(713, 180, 30, 30);

        bv17to18.setToolTipText("");
        bv17to18.setBorder(null);
        bv17to18.setBorderPainted(false);
        bv17to18.setContentAreaFilled(false);
        bv17to18.setFocusable(false);
        bv17to18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv17to18.setMaximumSize(new java.awt.Dimension(30, 30));
        bv17to18.setMinimumSize(new java.awt.Dimension(30, 30));
        bv17to18.setName(""); // NOI18N
        bv17to18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv17to18ActionPerformed(evt);
            }
        });
        maskPanel.add(bv17to18);
        bv17to18.setBounds(755, 180, 30, 30);

        bv20to21.setToolTipText("");
        bv20to21.setBorder(null);
        bv20to21.setBorderPainted(false);
        bv20to21.setContentAreaFilled(false);
        bv20to21.setFocusable(false);
        bv20to21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv20to21.setMaximumSize(new java.awt.Dimension(30, 30));
        bv20to21.setMinimumSize(new java.awt.Dimension(30, 30));
        bv20to21.setName(""); // NOI18N
        bv20to21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv20to21ActionPerformed(evt);
            }
        });
        maskPanel.add(bv20to21);
        bv20to21.setBounds(798, 180, 30, 30);

        bv23to24.setToolTipText("");
        bv23to24.setBorder(null);
        bv23to24.setBorderPainted(false);
        bv23to24.setContentAreaFilled(false);
        bv23to24.setFocusable(false);
        bv23to24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv23to24.setMaximumSize(new java.awt.Dimension(30, 30));
        bv23to24.setMinimumSize(new java.awt.Dimension(30, 30));
        bv23to24.setName(""); // NOI18N
        bv23to24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv23to24ActionPerformed(evt);
            }
        });
        maskPanel.add(bv23to24);
        bv23to24.setBounds(841, 180, 30, 30);

        bv26to27.setToolTipText("");
        bv26to27.setBorder(null);
        bv26to27.setBorderPainted(false);
        bv26to27.setContentAreaFilled(false);
        bv26to27.setFocusable(false);
        bv26to27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv26to27.setMaximumSize(new java.awt.Dimension(30, 30));
        bv26to27.setMinimumSize(new java.awt.Dimension(30, 30));
        bv26to27.setName(""); // NOI18N
        bv26to27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv26to27ActionPerformed(evt);
            }
        });
        maskPanel.add(bv26to27);
        bv26to27.setBounds(883, 180, 30, 30);

        bv29to30.setToolTipText("");
        bv29to30.setBorder(null);
        bv29to30.setBorderPainted(false);
        bv29to30.setContentAreaFilled(false);
        bv29to30.setFocusable(false);
        bv29to30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv29to30.setMaximumSize(new java.awt.Dimension(30, 30));
        bv29to30.setMinimumSize(new java.awt.Dimension(30, 30));
        bv29to30.setName(""); // NOI18N
        bv29to30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv29to30ActionPerformed(evt);
            }
        });
        maskPanel.add(bv29to30);
        bv29to30.setBounds(925, 180, 30, 30);

        bv32to33.setToolTipText("");
        bv32to33.setBorder(null);
        bv32to33.setBorderPainted(false);
        bv32to33.setContentAreaFilled(false);
        bv32to33.setFocusable(false);
        bv32to33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv32to33.setMaximumSize(new java.awt.Dimension(30, 30));
        bv32to33.setMinimumSize(new java.awt.Dimension(30, 30));
        bv32to33.setName(""); // NOI18N
        bv32to33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv32to33ActionPerformed(evt);
            }
        });
        maskPanel.add(bv32to33);
        bv32to33.setBounds(967, 180, 30, 30);

        bv35to36.setToolTipText("");
        bv35to36.setBorder(null);
        bv35to36.setBorderPainted(false);
        bv35to36.setContentAreaFilled(false);
        bv35to36.setFocusable(false);
        bv35to36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bv35to36.setMaximumSize(new java.awt.Dimension(30, 30));
        bv35to36.setMinimumSize(new java.awt.Dimension(30, 30));
        bv35to36.setName(""); // NOI18N
        bv35to36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bv35to36ActionPerformed(evt);
            }
        });
        maskPanel.add(bv35to36);
        bv35to36.setBounds(1010, 180, 30, 30);

        bc2_3_5_6.setToolTipText("");
        bc2_3_5_6.setBorder(null);
        bc2_3_5_6.setBorderPainted(false);
        bc2_3_5_6.setContentAreaFilled(false);
        bc2_3_5_6.setFocusable(false);
        bc2_3_5_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc2_3_5_6.setMaximumSize(new java.awt.Dimension(30, 30));
        bc2_3_5_6.setMinimumSize(new java.awt.Dimension(30, 30));
        bc2_3_5_6.setName(""); // NOI18N
        bc2_3_5_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc2_3_5_6ActionPerformed(evt);
            }
        });
        maskPanel.add(bc2_3_5_6);
        bc2_3_5_6.setBounds(565, 180, 30, 30);

        bc5_6_8_9.setToolTipText("");
        bc5_6_8_9.setBorder(null);
        bc5_6_8_9.setBorderPainted(false);
        bc5_6_8_9.setContentAreaFilled(false);
        bc5_6_8_9.setFocusable(false);
        bc5_6_8_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc5_6_8_9.setMaximumSize(new java.awt.Dimension(30, 30));
        bc5_6_8_9.setMinimumSize(new java.awt.Dimension(30, 30));
        bc5_6_8_9.setName(""); // NOI18N
        bc5_6_8_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc5_6_8_9ActionPerformed(evt);
            }
        });
        maskPanel.add(bc5_6_8_9);
        bc5_6_8_9.setBounds(607, 180, 30, 30);

        bc8_9_11_12.setToolTipText("");
        bc8_9_11_12.setBorder(null);
        bc8_9_11_12.setBorderPainted(false);
        bc8_9_11_12.setContentAreaFilled(false);
        bc8_9_11_12.setFocusable(false);
        bc8_9_11_12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc8_9_11_12.setMaximumSize(new java.awt.Dimension(30, 30));
        bc8_9_11_12.setMinimumSize(new java.awt.Dimension(30, 30));
        bc8_9_11_12.setName(""); // NOI18N
        bc8_9_11_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc8_9_11_12ActionPerformed(evt);
            }
        });
        maskPanel.add(bc8_9_11_12);
        bc8_9_11_12.setBounds(650, 180, 30, 30);

        bc11_12_14_15.setToolTipText("");
        bc11_12_14_15.setBorder(null);
        bc11_12_14_15.setBorderPainted(false);
        bc11_12_14_15.setContentAreaFilled(false);
        bc11_12_14_15.setFocusable(false);
        bc11_12_14_15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc11_12_14_15.setMaximumSize(new java.awt.Dimension(30, 30));
        bc11_12_14_15.setMinimumSize(new java.awt.Dimension(30, 30));
        bc11_12_14_15.setName(""); // NOI18N
        bc11_12_14_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc11_12_14_15ActionPerformed(evt);
            }
        });
        maskPanel.add(bc11_12_14_15);
        bc11_12_14_15.setBounds(692, 180, 30, 30);

        bc14_15_17_18.setToolTipText("");
        bc14_15_17_18.setBorder(null);
        bc14_15_17_18.setBorderPainted(false);
        bc14_15_17_18.setContentAreaFilled(false);
        bc14_15_17_18.setFocusable(false);
        bc14_15_17_18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc14_15_17_18.setMaximumSize(new java.awt.Dimension(30, 30));
        bc14_15_17_18.setMinimumSize(new java.awt.Dimension(30, 30));
        bc14_15_17_18.setName(""); // NOI18N
        bc14_15_17_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc14_15_17_18ActionPerformed(evt);
            }
        });
        maskPanel.add(bc14_15_17_18);
        bc14_15_17_18.setBounds(734, 180, 30, 30);

        bc17_18_20_21.setToolTipText("");
        bc17_18_20_21.setBorder(null);
        bc17_18_20_21.setBorderPainted(false);
        bc17_18_20_21.setContentAreaFilled(false);
        bc17_18_20_21.setFocusable(false);
        bc17_18_20_21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc17_18_20_21.setMaximumSize(new java.awt.Dimension(30, 30));
        bc17_18_20_21.setMinimumSize(new java.awt.Dimension(30, 30));
        bc17_18_20_21.setName(""); // NOI18N
        bc17_18_20_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc17_18_20_21ActionPerformed(evt);
            }
        });
        maskPanel.add(bc17_18_20_21);
        bc17_18_20_21.setBounds(776, 180, 30, 30);

        bc20_21_23_24.setToolTipText("");
        bc20_21_23_24.setBorder(null);
        bc20_21_23_24.setBorderPainted(false);
        bc20_21_23_24.setContentAreaFilled(false);
        bc20_21_23_24.setFocusable(false);
        bc20_21_23_24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc20_21_23_24.setMaximumSize(new java.awt.Dimension(30, 30));
        bc20_21_23_24.setMinimumSize(new java.awt.Dimension(30, 30));
        bc20_21_23_24.setName(""); // NOI18N
        bc20_21_23_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc20_21_23_24ActionPerformed(evt);
            }
        });
        maskPanel.add(bc20_21_23_24);
        bc20_21_23_24.setBounds(819, 180, 30, 30);

        bc23_24_26_27.setToolTipText("");
        bc23_24_26_27.setBorder(null);
        bc23_24_26_27.setBorderPainted(false);
        bc23_24_26_27.setContentAreaFilled(false);
        bc23_24_26_27.setFocusable(false);
        bc23_24_26_27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc23_24_26_27.setMaximumSize(new java.awt.Dimension(30, 30));
        bc23_24_26_27.setMinimumSize(new java.awt.Dimension(30, 30));
        bc23_24_26_27.setName(""); // NOI18N
        bc23_24_26_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc23_24_26_27ActionPerformed(evt);
            }
        });
        maskPanel.add(bc23_24_26_27);
        bc23_24_26_27.setBounds(862, 180, 30, 30);

        bc26_27_29_30.setToolTipText("");
        bc26_27_29_30.setBorder(null);
        bc26_27_29_30.setBorderPainted(false);
        bc26_27_29_30.setContentAreaFilled(false);
        bc26_27_29_30.setFocusable(false);
        bc26_27_29_30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc26_27_29_30.setMaximumSize(new java.awt.Dimension(30, 30));
        bc26_27_29_30.setMinimumSize(new java.awt.Dimension(30, 30));
        bc26_27_29_30.setName(""); // NOI18N
        bc26_27_29_30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc26_27_29_30ActionPerformed(evt);
            }
        });
        maskPanel.add(bc26_27_29_30);
        bc26_27_29_30.setBounds(904, 180, 30, 30);

        bc29_30_32_33.setToolTipText("");
        bc29_30_32_33.setBorder(null);
        bc29_30_32_33.setBorderPainted(false);
        bc29_30_32_33.setContentAreaFilled(false);
        bc29_30_32_33.setFocusable(false);
        bc29_30_32_33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc29_30_32_33.setMaximumSize(new java.awt.Dimension(30, 30));
        bc29_30_32_33.setMinimumSize(new java.awt.Dimension(30, 30));
        bc29_30_32_33.setName(""); // NOI18N
        bc29_30_32_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc29_30_32_33ActionPerformed(evt);
            }
        });
        maskPanel.add(bc29_30_32_33);
        bc29_30_32_33.setBounds(946, 180, 30, 30);

        bc32_33_35_36.setToolTipText("");
        bc32_33_35_36.setBorder(null);
        bc32_33_35_36.setBorderPainted(false);
        bc32_33_35_36.setContentAreaFilled(false);
        bc32_33_35_36.setFocusable(false);
        bc32_33_35_36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bc32_33_35_36.setMaximumSize(new java.awt.Dimension(30, 30));
        bc32_33_35_36.setMinimumSize(new java.awt.Dimension(30, 30));
        bc32_33_35_36.setName(""); // NOI18N
        bc32_33_35_36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc32_33_35_36ActionPerformed(evt);
            }
        });
        maskPanel.add(bc32_33_35_36);
        bc32_33_35_36.setBounds(988, 180, 30, 30);

        b2to1_3_36.setToolTipText("");
        b2to1_3_36.setBorder(null);
        b2to1_3_36.setBorderPainted(false);
        b2to1_3_36.setContentAreaFilled(false);
        b2to1_3_36.setFocusable(false);
        b2to1_3_36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2to1_3_36.setMaximumSize(new java.awt.Dimension(30, 30));
        b2to1_3_36.setMinimumSize(new java.awt.Dimension(30, 30));
        b2to1_3_36.setName(""); // NOI18N
        b2to1_3_36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2to1_3_36ActionPerformed(evt);
            }
        });
        maskPanel.add(b2to1_3_36);
        b2to1_3_36.setBounds(1053, 146, 30, 30);

        b2to1_2_35.setToolTipText("");
        b2to1_2_35.setBorder(null);
        b2to1_2_35.setBorderPainted(false);
        b2to1_2_35.setContentAreaFilled(false);
        b2to1_2_35.setFocusable(false);
        b2to1_2_35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2to1_2_35.setMaximumSize(new java.awt.Dimension(30, 30));
        b2to1_2_35.setMinimumSize(new java.awt.Dimension(30, 30));
        b2to1_2_35.setName(""); // NOI18N
        b2to1_2_35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2to1_2_35ActionPerformed(evt);
            }
        });
        maskPanel.add(b2to1_2_35);
        b2to1_2_35.setBounds(1053, 212, 30, 30);

        b2to1_1_34.setToolTipText("");
        b2to1_1_34.setBorder(null);
        b2to1_1_34.setBorderPainted(false);
        b2to1_1_34.setContentAreaFilled(false);
        b2to1_1_34.setFocusable(false);
        b2to1_1_34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2to1_1_34.setMaximumSize(new java.awt.Dimension(30, 30));
        b2to1_1_34.setMinimumSize(new java.awt.Dimension(30, 30));
        b2to1_1_34.setName(""); // NOI18N
        b2to1_1_34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2to1_1_34ActionPerformed(evt);
            }
        });
        maskPanel.add(b2to1_1_34);
        b2to1_1_34.setBounds(1053, 277, 30, 30);

        b1st12.setToolTipText("");
        b1st12.setBorder(null);
        b1st12.setBorderPainted(false);
        b1st12.setContentAreaFilled(false);
        b1st12.setFocusable(false);
        b1st12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1st12.setMaximumSize(new java.awt.Dimension(30, 30));
        b1st12.setMinimumSize(new java.awt.Dimension(30, 30));
        b1st12.setName(""); // NOI18N
        b1st12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1st12ActionPerformed(evt);
            }
        });
        maskPanel.add(b1st12);
        b1st12.setBounds(555, 335, 140, 30);

        b2nd12.setToolTipText("");
        b2nd12.setBorder(null);
        b2nd12.setBorderPainted(false);
        b2nd12.setContentAreaFilled(false);
        b2nd12.setFocusable(false);
        b2nd12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2nd12.setMaximumSize(new java.awt.Dimension(30, 30));
        b2nd12.setMinimumSize(new java.awt.Dimension(30, 30));
        b2nd12.setName(""); // NOI18N
        b2nd12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2nd12ActionPerformed(evt);
            }
        });
        maskPanel.add(b2nd12);
        b2nd12.setBounds(722, 335, 140, 30);

        b3rd12.setToolTipText("");
        b3rd12.setBorder(null);
        b3rd12.setBorderPainted(false);
        b3rd12.setContentAreaFilled(false);
        b3rd12.setFocusable(false);
        b3rd12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b3rd12.setMaximumSize(new java.awt.Dimension(30, 30));
        b3rd12.setMinimumSize(new java.awt.Dimension(30, 30));
        b3rd12.setName(""); // NOI18N
        b3rd12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3rd12ActionPerformed(evt);
            }
        });
        maskPanel.add(b3rd12);
        b3rd12.setBounds(892, 335, 140, 30);

        b1of18.setToolTipText("");
        b1of18.setBorder(null);
        b1of18.setBorderPainted(false);
        b1of18.setContentAreaFilled(false);
        b1of18.setFocusable(false);
        b1of18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1of18.setMaximumSize(new java.awt.Dimension(30, 30));
        b1of18.setMinimumSize(new java.awt.Dimension(30, 30));
        b1of18.setName(""); // NOI18N
        b1of18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1of18ActionPerformed(evt);
            }
        });
        maskPanel.add(b1of18);
        b1of18.setBounds(543, 375, 74, 40);

        b_even.setToolTipText("");
        b_even.setBorder(null);
        b_even.setBorderPainted(false);
        b_even.setContentAreaFilled(false);
        b_even.setFocusable(false);
        b_even.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_even.setMaximumSize(new java.awt.Dimension(30, 30));
        b_even.setMinimumSize(new java.awt.Dimension(30, 30));
        b_even.setName(""); // NOI18N
        b_even.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_evenActionPerformed(evt);
            }
        });
        maskPanel.add(b_even);
        b_even.setBounds(628, 375, 74, 40);

        b_red.setToolTipText("");
        b_red.setBorder(null);
        b_red.setBorderPainted(false);
        b_red.setContentAreaFilled(false);
        b_red.setFocusable(false);
        b_red.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_red.setMaximumSize(new java.awt.Dimension(30, 30));
        b_red.setMinimumSize(new java.awt.Dimension(30, 30));
        b_red.setName(""); // NOI18N
        b_red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_redActionPerformed(evt);
            }
        });
        maskPanel.add(b_red);
        b_red.setBounds(712, 375, 74, 40);

        b_black.setToolTipText("");
        b_black.setBorder(null);
        b_black.setBorderPainted(false);
        b_black.setContentAreaFilled(false);
        b_black.setFocusable(false);
        b_black.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_black.setMaximumSize(new java.awt.Dimension(30, 30));
        b_black.setMinimumSize(new java.awt.Dimension(30, 30));
        b_black.setName(""); // NOI18N
        b_black.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_blackActionPerformed(evt);
            }
        });
        maskPanel.add(b_black);
        b_black.setBounds(798, 375, 74, 40);

        b_odd.setToolTipText("");
        b_odd.setBorder(null);
        b_odd.setBorderPainted(false);
        b_odd.setContentAreaFilled(false);
        b_odd.setFocusable(false);
        b_odd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b_odd.setMaximumSize(new java.awt.Dimension(30, 30));
        b_odd.setMinimumSize(new java.awt.Dimension(30, 30));
        b_odd.setName(""); // NOI18N
        b_odd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_oddActionPerformed(evt);
            }
        });
        maskPanel.add(b_odd);
        b_odd.setBounds(883, 375, 74, 40);

        b19of36.setToolTipText("");
        b19of36.setBorder(null);
        b19of36.setBorderPainted(false);
        b19of36.setContentAreaFilled(false);
        b19of36.setFocusable(false);
        b19of36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b19of36.setMaximumSize(new java.awt.Dimension(30, 30));
        b19of36.setMinimumSize(new java.awt.Dimension(30, 30));
        b19of36.setName(""); // NOI18N
        b19of36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19of36ActionPerformed(evt);
            }
        });
        maskPanel.add(b19of36);
        b19of36.setBounds(967, 375, 74, 40);

        b0of3.setToolTipText("");
        b0of3.setBorder(null);
        b0of3.setBorderPainted(false);
        b0of3.setContentAreaFilled(false);
        b0of3.setFocusable(false);
        b0of3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b0of3.setMaximumSize(new java.awt.Dimension(30, 30));
        b0of3.setMinimumSize(new java.awt.Dimension(30, 30));
        b0of3.setName(""); // NOI18N
        b0of3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0of3ActionPerformed(evt);
            }
        });
        maskPanel.add(b0of3);
        b0of3.setBounds(523, 115, 30, 30);

        b1of3.setToolTipText("");
        b1of3.setBorder(null);
        b1of3.setBorderPainted(false);
        b1of3.setContentAreaFilled(false);
        b1of3.setFocusable(false);
        b1of3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1of3.setMaximumSize(new java.awt.Dimension(30, 30));
        b1of3.setMinimumSize(new java.awt.Dimension(30, 30));
        b1of3.setName(""); // NOI18N
        b1of3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1of3ActionPerformed(evt);
            }
        });
        maskPanel.add(b1of3);
        b1of3.setBounds(543, 115, 30, 30);

        b1of6.setToolTipText("");
        b1of6.setBorder(null);
        b1of6.setBorderPainted(false);
        b1of6.setContentAreaFilled(false);
        b1of6.setFocusable(false);
        b1of6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1of6.setMaximumSize(new java.awt.Dimension(30, 30));
        b1of6.setMinimumSize(new java.awt.Dimension(30, 30));
        b1of6.setName(""); // NOI18N
        b1of6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1of6ActionPerformed(evt);
            }
        });
        maskPanel.add(b1of6);
        b1of6.setBounds(565, 115, 30, 30);

        b4of6.setToolTipText("");
        b4of6.setBorder(null);
        b4of6.setBorderPainted(false);
        b4of6.setContentAreaFilled(false);
        b4of6.setFocusable(false);
        b4of6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b4of6.setMaximumSize(new java.awt.Dimension(30, 30));
        b4of6.setMinimumSize(new java.awt.Dimension(30, 30));
        b4of6.setName(""); // NOI18N
        b4of6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4of6ActionPerformed(evt);
            }
        });
        maskPanel.add(b4of6);
        b4of6.setBounds(586, 115, 30, 30);

        b4of9.setToolTipText("");
        b4of9.setBorder(null);
        b4of9.setBorderPainted(false);
        b4of9.setContentAreaFilled(false);
        b4of9.setFocusable(false);
        b4of9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b4of9.setMaximumSize(new java.awt.Dimension(30, 30));
        b4of9.setMinimumSize(new java.awt.Dimension(30, 30));
        b4of9.setName(""); // NOI18N
        b4of9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4of9ActionPerformed(evt);
            }
        });
        maskPanel.add(b4of9);
        b4of9.setBounds(607, 115, 30, 30);

        b7of9.setToolTipText("");
        b7of9.setBorder(null);
        b7of9.setBorderPainted(false);
        b7of9.setContentAreaFilled(false);
        b7of9.setFocusable(false);
        b7of9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b7of9.setMaximumSize(new java.awt.Dimension(30, 30));
        b7of9.setMinimumSize(new java.awt.Dimension(30, 30));
        b7of9.setName(""); // NOI18N
        b7of9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7of9ActionPerformed(evt);
            }
        });
        maskPanel.add(b7of9);
        b7of9.setBounds(629, 115, 30, 30);

        b7of12.setToolTipText("");
        b7of12.setBorder(null);
        b7of12.setBorderPainted(false);
        b7of12.setContentAreaFilled(false);
        b7of12.setFocusable(false);
        b7of12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b7of12.setMaximumSize(new java.awt.Dimension(30, 30));
        b7of12.setMinimumSize(new java.awt.Dimension(30, 30));
        b7of12.setName(""); // NOI18N
        b7of12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7of12ActionPerformed(evt);
            }
        });
        maskPanel.add(b7of12);
        b7of12.setBounds(650, 115, 30, 30);

        b10of12.setToolTipText("");
        b10of12.setBorder(null);
        b10of12.setBorderPainted(false);
        b10of12.setContentAreaFilled(false);
        b10of12.setFocusable(false);
        b10of12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b10of12.setMaximumSize(new java.awt.Dimension(30, 30));
        b10of12.setMinimumSize(new java.awt.Dimension(30, 30));
        b10of12.setName(""); // NOI18N
        b10of12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10of12ActionPerformed(evt);
            }
        });
        maskPanel.add(b10of12);
        b10of12.setBounds(671, 115, 30, 30);

        b10of15.setToolTipText("");
        b10of15.setBorder(null);
        b10of15.setBorderPainted(false);
        b10of15.setContentAreaFilled(false);
        b10of15.setFocusable(false);
        b10of15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b10of15.setMaximumSize(new java.awt.Dimension(30, 30));
        b10of15.setMinimumSize(new java.awt.Dimension(30, 30));
        b10of15.setName(""); // NOI18N
        b10of15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10of15ActionPerformed(evt);
            }
        });
        maskPanel.add(b10of15);
        b10of15.setBounds(692, 115, 30, 30);

        b13of15.setToolTipText("");
        b13of15.setBorder(null);
        b13of15.setBorderPainted(false);
        b13of15.setContentAreaFilled(false);
        b13of15.setFocusable(false);
        b13of15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b13of15.setMaximumSize(new java.awt.Dimension(30, 30));
        b13of15.setMinimumSize(new java.awt.Dimension(30, 30));
        b13of15.setName(""); // NOI18N
        b13of15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13of15ActionPerformed(evt);
            }
        });
        maskPanel.add(b13of15);
        b13of15.setBounds(713, 115, 30, 30);

        b13of18.setToolTipText("");
        b13of18.setBorder(null);
        b13of18.setBorderPainted(false);
        b13of18.setContentAreaFilled(false);
        b13of18.setFocusable(false);
        b13of18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b13of18.setMaximumSize(new java.awt.Dimension(30, 30));
        b13of18.setMinimumSize(new java.awt.Dimension(30, 30));
        b13of18.setName(""); // NOI18N
        b13of18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13of18ActionPerformed(evt);
            }
        });
        maskPanel.add(b13of18);
        b13of18.setBounds(734, 115, 30, 30);

        b16of18.setToolTipText("");
        b16of18.setBorder(null);
        b16of18.setBorderPainted(false);
        b16of18.setContentAreaFilled(false);
        b16of18.setFocusable(false);
        b16of18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b16of18.setMaximumSize(new java.awt.Dimension(30, 30));
        b16of18.setMinimumSize(new java.awt.Dimension(30, 30));
        b16of18.setName(""); // NOI18N
        b16of18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16of18ActionPerformed(evt);
            }
        });
        maskPanel.add(b16of18);
        b16of18.setBounds(755, 115, 30, 30);

        b16of21.setToolTipText("");
        b16of21.setBorder(null);
        b16of21.setBorderPainted(false);
        b16of21.setContentAreaFilled(false);
        b16of21.setFocusable(false);
        b16of21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b16of21.setMaximumSize(new java.awt.Dimension(30, 30));
        b16of21.setMinimumSize(new java.awt.Dimension(30, 30));
        b16of21.setName(""); // NOI18N
        b16of21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16of21ActionPerformed(evt);
            }
        });
        maskPanel.add(b16of21);
        b16of21.setBounds(776, 115, 30, 30);

        b19of21v.setToolTipText("");
        b19of21v.setBorder(null);
        b19of21v.setBorderPainted(false);
        b19of21v.setContentAreaFilled(false);
        b19of21v.setFocusable(false);
        b19of21v.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b19of21v.setMaximumSize(new java.awt.Dimension(30, 30));
        b19of21v.setMinimumSize(new java.awt.Dimension(30, 30));
        b19of21v.setName(""); // NOI18N
        b19of21v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19of21vActionPerformed(evt);
            }
        });
        maskPanel.add(b19of21v);
        b19of21v.setBounds(798, 115, 30, 30);

        b19of24vv.setToolTipText("");
        b19of24vv.setBorder(null);
        b19of24vv.setBorderPainted(false);
        b19of24vv.setContentAreaFilled(false);
        b19of24vv.setFocusable(false);
        b19of24vv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b19of24vv.setMaximumSize(new java.awt.Dimension(30, 30));
        b19of24vv.setMinimumSize(new java.awt.Dimension(30, 30));
        b19of24vv.setName(""); // NOI18N
        b19of24vv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19of24vvActionPerformed(evt);
            }
        });
        maskPanel.add(b19of24vv);
        b19of24vv.setBounds(819, 115, 30, 30);

        b22of24v.setToolTipText("");
        b22of24v.setBorder(null);
        b22of24v.setBorderPainted(false);
        b22of24v.setContentAreaFilled(false);
        b22of24v.setFocusable(false);
        b22of24v.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b22of24v.setMaximumSize(new java.awt.Dimension(30, 30));
        b22of24v.setMinimumSize(new java.awt.Dimension(30, 30));
        b22of24v.setName(""); // NOI18N
        b22of24v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22of24vActionPerformed(evt);
            }
        });
        maskPanel.add(b22of24v);
        b22of24v.setBounds(841, 115, 30, 30);

        b22of27vv.setToolTipText("");
        b22of27vv.setBorder(null);
        b22of27vv.setBorderPainted(false);
        b22of27vv.setContentAreaFilled(false);
        b22of27vv.setFocusable(false);
        b22of27vv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b22of27vv.setMaximumSize(new java.awt.Dimension(30, 30));
        b22of27vv.setMinimumSize(new java.awt.Dimension(30, 30));
        b22of27vv.setName(""); // NOI18N
        b22of27vv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22of27vvActionPerformed(evt);
            }
        });
        maskPanel.add(b22of27vv);
        b22of27vv.setBounds(862, 115, 30, 30);

        b25of27v.setToolTipText("");
        b25of27v.setBorder(null);
        b25of27v.setBorderPainted(false);
        b25of27v.setContentAreaFilled(false);
        b25of27v.setFocusable(false);
        b25of27v.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b25of27v.setMaximumSize(new java.awt.Dimension(30, 30));
        b25of27v.setMinimumSize(new java.awt.Dimension(30, 30));
        b25of27v.setName(""); // NOI18N
        b25of27v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25of27vActionPerformed(evt);
            }
        });
        maskPanel.add(b25of27v);
        b25of27v.setBounds(883, 115, 30, 30);

        b25of30vv.setToolTipText("");
        b25of30vv.setBorder(null);
        b25of30vv.setBorderPainted(false);
        b25of30vv.setContentAreaFilled(false);
        b25of30vv.setFocusable(false);
        b25of30vv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b25of30vv.setMaximumSize(new java.awt.Dimension(30, 30));
        b25of30vv.setMinimumSize(new java.awt.Dimension(30, 30));
        b25of30vv.setName(""); // NOI18N
        b25of30vv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25of30vvActionPerformed(evt);
            }
        });
        maskPanel.add(b25of30vv);
        b25of30vv.setBounds(904, 115, 30, 30);

        b28of30v.setToolTipText("");
        b28of30v.setBorder(null);
        b28of30v.setBorderPainted(false);
        b28of30v.setContentAreaFilled(false);
        b28of30v.setFocusable(false);
        b28of30v.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b28of30v.setMaximumSize(new java.awt.Dimension(30, 30));
        b28of30v.setMinimumSize(new java.awt.Dimension(30, 30));
        b28of30v.setName(""); // NOI18N
        b28of30v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28of30vActionPerformed(evt);
            }
        });
        maskPanel.add(b28of30v);
        b28of30v.setBounds(925, 115, 30, 30);

        b28of33vv.setToolTipText("");
        b28of33vv.setBorder(null);
        b28of33vv.setBorderPainted(false);
        b28of33vv.setContentAreaFilled(false);
        b28of33vv.setFocusable(false);
        b28of33vv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b28of33vv.setMaximumSize(new java.awt.Dimension(30, 30));
        b28of33vv.setMinimumSize(new java.awt.Dimension(30, 30));
        b28of33vv.setName(""); // NOI18N
        b28of33vv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28of33vvActionPerformed(evt);
            }
        });
        maskPanel.add(b28of33vv);
        b28of33vv.setBounds(946, 115, 30, 30);

        b31of33v.setToolTipText("");
        b31of33v.setBorder(null);
        b31of33v.setBorderPainted(false);
        b31of33v.setContentAreaFilled(false);
        b31of33v.setFocusable(false);
        b31of33v.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b31of33v.setMaximumSize(new java.awt.Dimension(30, 30));
        b31of33v.setMinimumSize(new java.awt.Dimension(30, 30));
        b31of33v.setName(""); // NOI18N
        b31of33v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31of33vActionPerformed(evt);
            }
        });
        maskPanel.add(b31of33v);
        b31of33v.setBounds(967, 115, 30, 30);

        b31of36vv.setToolTipText("");
        b31of36vv.setBorder(null);
        b31of36vv.setBorderPainted(false);
        b31of36vv.setContentAreaFilled(false);
        b31of36vv.setFocusable(false);
        b31of36vv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b31of36vv.setMaximumSize(new java.awt.Dimension(30, 30));
        b31of36vv.setMinimumSize(new java.awt.Dimension(30, 30));
        b31of36vv.setName(""); // NOI18N
        b31of36vv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31of36vvActionPerformed(evt);
            }
        });
        maskPanel.add(b31of36vv);
        b31of36vv.setBounds(988, 115, 30, 30);

        b34of36v.setToolTipText("");
        b34of36v.setBorder(null);
        b34of36v.setBorderPainted(false);
        b34of36v.setContentAreaFilled(false);
        b34of36v.setFocusable(false);
        b34of36v.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b34of36v.setMaximumSize(new java.awt.Dimension(30, 30));
        b34of36v.setMinimumSize(new java.awt.Dimension(30, 30));
        b34of36v.setName(""); // NOI18N
        b34of36v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b34of36vActionPerformed(evt);
            }
        });
        maskPanel.add(b34of36v);
        b34of36v.setBounds(1010, 115, 30, 30);

        setChips.setBackground(new java.awt.Color(51, 153, 0));
        setChips.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ChoiserBlue50x50.png"))); // NOI18N
        setChips.setText("<html>Выбор ставки<p>Ставка: 25$</html>");
        setChips.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setChips.setFocusable(false);
        setChips.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        setChips.setMaximumSize(new java.awt.Dimension(30, 30));
        setChips.setMinimumSize(new java.awt.Dimension(30, 30));
        setChips.setName(""); // NOI18N
        setChips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setChipsActionPerformed(evt);
            }
        });
        maskPanel.add(setChips);
        setChips.setBounds(710, 440, 160, 60);

        clearAllField.setBackground(new java.awt.Color(51, 153, 0));
        clearAllField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/clearAllIcon.png"))); // NOI18N
        clearAllField.setText("Очистить поле");
        clearAllField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearAllField.setFocusable(false);
        clearAllField.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        clearAllField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllFieldActionPerformed(evt);
            }
        });
        maskPanel.add(clearAllField);
        clearAllField.setBounds(890, 440, 160, 60);

        bPlayer.setBackground(new java.awt.Color(51, 153, 0));
        bPlayer.setText("<html>Профиль<p>Игрока</html>");
        bPlayer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bPlayer.setFocusable(false);
        bPlayer.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bPlayer.setIconTextGap(20);
        bPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlayerActionPerformed(evt);
            }
        });
        maskPanel.add(bPlayer);
        bPlayer.setBounds(930, 50, 160, 60);

        lPlayerName.setBackground(new java.awt.Color(51, 153, 0));
        lPlayerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lPlayerName.setText("Имя игрока");
        lPlayerName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lPlayerName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        maskPanel.add(lPlayerName);
        lPlayerName.setBounds(780, 50, 130, 30);

        lPlayerButget.setBackground(new java.awt.Color(51, 153, 0));
        lPlayerButget.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lPlayerButget.setText("Бюджет");
        lPlayerButget.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        maskPanel.add(lPlayerButget);
        lPlayerButget.setBounds(780, 80, 130, 30);

        bRollBall.setBackground(new java.awt.Color(51, 153, 0));
        bRollBall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/rollIcon.png"))); // NOI18N
        bRollBall.setText("<html>Вращать<p>рулетку</html>");
        bRollBall.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bRollBall.setFocusable(false);
        bRollBall.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bRollBall.setIconTextGap(20);
        bRollBall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRollBallActionPerformed(evt);
            }
        });
        maskPanel.add(bRollBall);
        bRollBall.setBounds(530, 440, 160, 60);

        lPlayerCurrentStav.setBackground(new java.awt.Color(51, 153, 0));
        lPlayerCurrentStav.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lPlayerCurrentStav.setText("Ставка: 0");
        lPlayerCurrentStav.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        maskPanel.add(lPlayerCurrentStav);
        lPlayerCurrentStav.setBounds(590, 50, 130, 60);

        notifLabel.setBackground(new java.awt.Color(51, 153, 0));
        notifLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notifLabel.setToolTipText("Очистить уведомления");
        notifLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        notifLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notifLabelMouseClicked(evt);
            }
        });
        maskPanel.add(notifLabel);
        notifLabel.setBounds(460, 50, 130, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dealer_icon44x60.png"))); // NOI18N
        maskPanel.add(jLabel1);
        jLabel1.setBounds(400, 50, 43, 60);

        bSaveProfile.setBackground(new java.awt.Color(51, 153, 0));
        bSaveProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save_icon30x30.png"))); // NOI18N
        bSaveProfile.setToolTipText("Сохранить");
        bSaveProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSaveProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveProfileActionPerformed(evt);
            }
        });
        maskPanel.add(bSaveProfile);
        bSaveProfile.setBounds(1090, 50, 30, 30);

        bLoadProfile.setBackground(new java.awt.Color(51, 153, 0));
        bLoadProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/load_icon30x30.png"))); // NOI18N
        bLoadProfile.setToolTipText("Загрузить");
        bLoadProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bLoadProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoadProfileActionPerformed(evt);
            }
        });
        maskPanel.add(bLoadProfile);
        bLoadProfile.setBounds(1090, 80, 30, 30);

        bSettings.setBackground(new java.awt.Color(51, 153, 0));
        bSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/prop_icon30x26.png"))); // NOI18N
        bSettings.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSettingsActionPerformed(evt);
            }
        });
        maskPanel.add(bSettings);
        bSettings.setBounds(1120, 80, 30, 30);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(maskPanel, gridBagConstraints);

        mainFountLabel.setBackground(new java.awt.Color(51, 102, 0));
        mainFountLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/field.png"))); // NOI18N
        mainFountLabel.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(mainFountLabel, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// <editor-fold defaultstate="collapsed" desc="MORE BUTTON">
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b3, "b3", 35, player.getCurrentRate(), 3);
        winner.currentStavSetter();
    }//GEN-LAST:event_b3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b6, "b6", 35, player.getCurrentRate(), 6);
        winner.currentStavSetter();
    }//GEN-LAST:event_b6ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b2, "b2", 35, player.getCurrentRate(), 2);
        winner.currentStavSetter();
    }//GEN-LAST:event_b2ActionPerformed

    private void bg2to5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg2to5ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg2to5, "bg2to5", 17, player.getCurrentRate(), 2, 5);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg2to5ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b5, "b5", 35, player.getCurrentRate(), 5);
        winner.currentStavSetter();
    }//GEN-LAST:event_b5ActionPerformed

    private void bg5to8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg5to8ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg5to8, "bg5to8", 17, player.getCurrentRate(), 5, 8);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg5to8ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b8, "b8", 35, player.getCurrentRate(), 8);
        winner.currentStavSetter();
    }//GEN-LAST:event_b8ActionPerformed

    private void bg8to11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg8to11ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg8to11, "bg8to11", 17, player.getCurrentRate(), 8, 11);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg8to11ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b11, "b11", 35, player.getCurrentRate(), 11);
        winner.currentStavSetter();
    }//GEN-LAST:event_b11ActionPerformed

    private void bg11to14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg11to14ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg11to14, "bg11to14", 17, player.getCurrentRate(), 11, 14);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg11to14ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b14, "b14", 35, player.getCurrentRate(), 14);
        winner.currentStavSetter();
    }//GEN-LAST:event_b14ActionPerformed

    private void bg14to17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg14to17ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg14to17, "bg14to17", 17, player.getCurrentRate(), 14, 17);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg14to17ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b17, "b17", 35, player.getCurrentRate(), 17);
        winner.currentStavSetter();
    }//GEN-LAST:event_b17ActionPerformed

    private void bg17to20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg17to20ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg17to20, "bg17to20", 17, player.getCurrentRate(), 17, 20);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg17to20ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b20, "b20", 35, player.getCurrentRate(), 20);
        winner.currentStavSetter();
    }//GEN-LAST:event_b20ActionPerformed

    private void bg20to23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg20to23ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg20to23, "bg20to23", 17, player.getCurrentRate(), 20, 23);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg20to23ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b23, "b23", 35, player.getCurrentRate(), 23);
        winner.currentStavSetter();
    }//GEN-LAST:event_b23ActionPerformed

    private void bg23to26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg23to26ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg23to26, "bg23to26", 17, player.getCurrentRate(), 23, 26);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg23to26ActionPerformed

    private void b26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b26ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b26, "b26", 35, player.getCurrentRate(), 26);
        winner.currentStavSetter();
    }//GEN-LAST:event_b26ActionPerformed

    private void bg26to29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg26to29ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg26to29, "bg26to29", 17, player.getCurrentRate(), 26, 29);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg26to29ActionPerformed

    private void b29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b29ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b29, "b29", 35, player.getCurrentRate(), 29);
        winner.currentStavSetter();
    }//GEN-LAST:event_b29ActionPerformed

    private void bg29to32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg29to32ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg29to32, "bg29to32", 17, player.getCurrentRate(), 29, 32);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg29to32ActionPerformed

    private void b32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b32ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b32, "b32", 35, player.getCurrentRate(), 32);
        winner.currentStavSetter();
    }//GEN-LAST:event_b32ActionPerformed

    private void bg32to35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg32to35ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg32to35, "bg32to35", 17, player.getCurrentRate(), 32, 35);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg32to35ActionPerformed

    private void b35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b35ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b35, "b35", 35, player.getCurrentRate(), 35);
        winner.currentStavSetter();
    }//GEN-LAST:event_b35ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b1, "b1", 35, player.getCurrentRate(), 1);
        winner.currentStavSetter();
    }//GEN-LAST:event_b1ActionPerformed

    private void bg1to4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg1to4ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg1to4, "bg1to4", 17, player.getCurrentRate(), 1, 4);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg1to4ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b4, "b4", 35, player.getCurrentRate(), 4);
        winner.currentStavSetter();
    }//GEN-LAST:event_b4ActionPerformed

    private void bg4to7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg4to7ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg4to7, "bg4to7", 17, player.getCurrentRate(), 4, 7);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg4to7ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b7, "b7", 35, player.getCurrentRate(), 7);
        winner.currentStavSetter();
    }//GEN-LAST:event_b7ActionPerformed

    private void bg7to10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg7to10ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg7to10, "bg7to10", 17, player.getCurrentRate(), 7, 10);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg7to10ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b10, "b10", 35, player.getCurrentRate(), 10);
        winner.currentStavSetter();
    }//GEN-LAST:event_b10ActionPerformed

    private void bg10to13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg10to13ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg10to13, "bg10to13", 17, player.getCurrentRate(), 10, 13);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg10to13ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b13, "b13", 35, player.getCurrentRate(), 13);
        winner.currentStavSetter();
    }//GEN-LAST:event_b13ActionPerformed

    private void bg13to16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg13to16ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg13to16, "bg13to16", 17, player.getCurrentRate(), 13, 16);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg13to16ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b16, "b16", 35, player.getCurrentRate(), 16);
        winner.currentStavSetter();
    }//GEN-LAST:event_b16ActionPerformed

    private void bg16to19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg16to19ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg16to19, "bg16to19", 17, player.getCurrentRate(), 16, 19);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg16to19ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b19, "b19", 35, player.getCurrentRate(), 19);
        winner.currentStavSetter();
    }//GEN-LAST:event_b19ActionPerformed

    private void bg19to22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg19to22ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg19to22, "bg19to22", 17, player.getCurrentRate(), 19, 22);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg19to22ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b22, "b22", 35, player.getCurrentRate(), 22);
        winner.currentStavSetter();
    }//GEN-LAST:event_b22ActionPerformed

    private void bg22to25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg22to25ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg22to25, "bg22to25", 17, player.getCurrentRate(), 22, 25);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg22to25ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b25, "b25", 35, player.getCurrentRate(), 25);
        winner.currentStavSetter();
    }//GEN-LAST:event_b25ActionPerformed

    private void bg25to28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg25to28ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg25to28, "bg25to28", 17, player.getCurrentRate(), 25, 28);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg25to28ActionPerformed

    private void b28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b28ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b28, "b28", 35, player.getCurrentRate(), 28);
        winner.currentStavSetter();
    }//GEN-LAST:event_b28ActionPerformed

    private void bg28to31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg28to31ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg28to31, "bg28to31", 17, player.getCurrentRate(), 28, 31);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg28to31ActionPerformed

    private void b31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b31ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b31, "b31", 35, player.getCurrentRate(), 31);
        winner.currentStavSetter();
    }//GEN-LAST:event_b31ActionPerformed

    private void bg31to34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg31to34ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg31to34, "bg31to34", 17, player.getCurrentRate(), 31, 34);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg31to34ActionPerformed

    private void b34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b34ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b34, "b34", 35, player.getCurrentRate(), 34);
        winner.currentStavSetter();
    }//GEN-LAST:event_b34ActionPerformed

    private void b00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b00ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b00, "b00", 35, player.getCurrentRate(), 37);
        winner.currentStavSetter();
    }//GEN-LAST:event_b00ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b0, "b0", 35, player.getCurrentRate(), 0);
        winner.currentStavSetter();
    }//GEN-LAST:event_b0ActionPerformed

    private void bv1to2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv1to2ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv1to2, "bv1to2", 17, player.getCurrentRate(), 1, 2);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv1to2ActionPerformed

    private void bc1_2_4_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc1_2_4_5ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc1_2_4_5, "bc1_2_4_5", 8, player.getCurrentRate(), 1, 2, 4, 5);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc1_2_4_5ActionPerformed

    private void bv4to5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv4to5ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv4to5, "bv4to5", 17, player.getCurrentRate(), 4, 5);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv4to5ActionPerformed

    private void bc4_5_7_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc4_5_7_8ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc4_5_7_8, "bc4_5_7_8", 8, player.getCurrentRate(), 4, 5, 7, 8);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc4_5_7_8ActionPerformed

    private void bv7to8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv7to8ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv7to8, "bv7to8", 17, player.getCurrentRate(), 7, 8);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv7to8ActionPerformed

    private void bc7_8_10_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc7_8_10_11ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc7_8_10_11, "bc7_8_10_11", 8, player.getCurrentRate(), 7, 8, 10, 11);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc7_8_10_11ActionPerformed

    private void bv10to11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv10to11ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv10to11, "bv10to11", 17, player.getCurrentRate(), 10, 11);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv10to11ActionPerformed

    private void bc10_11_13_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc10_11_13_14ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc10_11_13_14, "bc10_11_13_14", 8, player.getCurrentRate(), 10, 11, 13, 14);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc10_11_13_14ActionPerformed

    private void bv13to14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv13to14ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv13to14, "bv13to14", 17, player.getCurrentRate(), 13, 14);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv13to14ActionPerformed

    private void bv16to17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv16to17ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv16to17, "bv16to17", 17, player.getCurrentRate(), 16, 17);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv16to17ActionPerformed

    private void bv19to20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv19to20ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv19to20, "bv19to20", 17, player.getCurrentRate(), 19, 20);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv19to20ActionPerformed

    private void bv22to23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv22to23ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv22to23, "bv22to23", 17, player.getCurrentRate(), 22, 23);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv22to23ActionPerformed

    private void bv25to26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv25to26ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv25to26, "bv25to26", 17, player.getCurrentRate(), 25, 26);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv25to26ActionPerformed

    private void bv28to29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv28to29ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv28to29, "bv28to29", 17, player.getCurrentRate(), 28, 29);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv28to29ActionPerformed

    private void bv31to32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv31to32ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv31to32, "bv31to32", 17, player.getCurrentRate(), 31, 32);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv31to32ActionPerformed

    private void bv34to35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv34to35ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv34to35, "bv34to35", 17, player.getCurrentRate(), 34, 35);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv34to35ActionPerformed

    private void bc13_14_16_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc13_14_16_17ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc13_14_16_17, "bc13_14_16_17", 8, player.getCurrentRate(), 13, 14, 16, 17);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc13_14_16_17ActionPerformed

    private void bc16_17_19_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc16_17_19_20ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc16_17_19_20, "bc16_17_19_20", 8, player.getCurrentRate(), 16, 17, 19, 20);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc16_17_19_20ActionPerformed

    private void bc19_20_22_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc19_20_22_23ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc19_20_22_23, "bc19_20_22_23", 8, player.getCurrentRate(), 19, 20, 22, 23);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc19_20_22_23ActionPerformed

    private void bc22_23_25_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc22_23_25_26ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc22_23_25_26, "bc22_23_25_26", 8, player.getCurrentRate(), 22, 23, 25, 26);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc22_23_25_26ActionPerformed

    private void bc25_26_28_29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc25_26_28_29ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc25_26_28_29, "bc25_26_28_29", 8, player.getCurrentRate(), 25, 26, 28, 29);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc25_26_28_29ActionPerformed

    private void bc28_29_31_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc28_29_31_32ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc28_29_31_32, "bc28_29_31_32", 8, player.getCurrentRate(), 28, 29, 31, 32);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc28_29_31_32ActionPerformed

    private void bc31_32_34_35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc31_32_34_35ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc31_32_34_35, "bc31_32_34_35", 8, player.getCurrentRate(), 31, 32, 34, 35);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc31_32_34_35ActionPerformed

    private void bv2to3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv2to3ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv2to3, "bv2to3", 17, player.getCurrentRate(), 2, 3);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv2to3ActionPerformed

    private void bv5to6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv5to6ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv5to6, "bv5to6", 17, player.getCurrentRate(), 5, 6);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv5to6ActionPerformed

    private void bv8to9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv8to9ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv8to9, "bv8to9", 17, player.getCurrentRate(), 8, 9);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv8to9ActionPerformed

    private void bv11to12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv11to12ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv11to12, "bv11to12", 17, player.getCurrentRate(), 11, 12);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv11to12ActionPerformed

    private void bv14to15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv14to15ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv14to15, "bv14to15", 17, player.getCurrentRate(), 14, 15);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv14to15ActionPerformed

    private void bv17to18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv17to18ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv17to18, "bv17to18", 17, player.getCurrentRate(), 17, 18);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv17to18ActionPerformed

    private void bv20to21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv20to21ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv20to21, "bv20to21", 17, player.getCurrentRate(), 20, 21);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv20to21ActionPerformed

    private void bv23to24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv23to24ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv23to24, "bv23to24", 17, player.getCurrentRate(), 23, 24);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv23to24ActionPerformed

    private void bv26to27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv26to27ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv26to27, "bv26to27", 17, player.getCurrentRate(), 26, 27);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv26to27ActionPerformed

    private void bv29to30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv29to30ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv29to30, "bv29to30", 17, player.getCurrentRate(), 29, 30);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv29to30ActionPerformed

    private void bv32to33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv32to33ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv32to33, "bv32to33", 17, player.getCurrentRate(), 32, 33);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv32to33ActionPerformed

    private void bv35to36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bv35to36ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bv35to36, "bv35to36", 17, player.getCurrentRate(), 35, 36);
        winner.currentStavSetter();
    }//GEN-LAST:event_bv35to36ActionPerformed

    private void bc2_3_5_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc2_3_5_6ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc2_3_5_6, "bc2_3_5_6", 8, player.getCurrentRate(), 2, 3, 5, 6);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc2_3_5_6ActionPerformed

    private void bc5_6_8_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc5_6_8_9ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc5_6_8_9, "bc5_6_8_9", 8, player.getCurrentRate(), 5, 6, 8, 9);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc5_6_8_9ActionPerformed

    private void bc8_9_11_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc8_9_11_12ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc8_9_11_12, "bc8_9_11_12", 8, player.getCurrentRate(), 8, 9, 11, 12);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc8_9_11_12ActionPerformed

    private void bc11_12_14_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc11_12_14_15ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc11_12_14_15, "bc11_12_14_15", 8, player.getCurrentRate(), 11, 12, 14, 15);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc11_12_14_15ActionPerformed

    private void bc14_15_17_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc14_15_17_18ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc14_15_17_18, "bc14_15_17_18", 8, player.getCurrentRate(), 14, 15, 17, 18);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc14_15_17_18ActionPerformed

    private void bc17_18_20_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc17_18_20_21ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc17_18_20_21, "bc17_18_20_21", 8, player.getCurrentRate(), 17, 18, 20, 21);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc17_18_20_21ActionPerformed

    private void bc20_21_23_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc20_21_23_24ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc20_21_23_24, "bc20_21_23_24", 8, player.getCurrentRate(), 20, 21, 23, 24);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc20_21_23_24ActionPerformed

    private void bc23_24_26_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc23_24_26_27ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc23_24_26_27, "bc23_24_26_27", 8, player.getCurrentRate(), 23, 24, 26, 27);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc23_24_26_27ActionPerformed

    private void bc26_27_29_30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc26_27_29_30ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc26_27_29_30, "bc26_27_29_30", 8, player.getCurrentRate(), 26, 27, 29, 30);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc26_27_29_30ActionPerformed

    private void bc29_30_32_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc29_30_32_33ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc29_30_32_33, "bc29_30_32_33", 8, player.getCurrentRate(), 29, 30, 32, 33);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc29_30_32_33ActionPerformed

    private void bc32_33_35_36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc32_33_35_36ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bc32_33_35_36, "bc32_33_35_36", 8, player.getCurrentRate(), 32, 33, 35, 36);
        winner.currentStavSetter();
    }//GEN-LAST:event_bc32_33_35_36ActionPerformed

    private void b2to1_3_36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2to1_3_36ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b2to1_3_36, "b2to1_3_36", 2, player.getCurrentRate(), 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36);
        winner.currentStavSetter();
    }//GEN-LAST:event_b2to1_3_36ActionPerformed

    private void b2to1_2_35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2to1_2_35ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b2to1_2_35, "b2to1_2_35", 2, player.getCurrentRate(), 2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35);
        winner.currentStavSetter();
    }//GEN-LAST:event_b2to1_2_35ActionPerformed

    private void b2to1_1_34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2to1_1_34ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b2to1_1_34, "b2to1_1_35", 2, player.getCurrentRate(), 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34);
        winner.currentStavSetter();
    }//GEN-LAST:event_b2to1_1_34ActionPerformed

    private void b1st12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1st12ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b1st12, "b1st12", 2, player.getCurrentRate(), 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        winner.currentStavSetter();

    }//GEN-LAST:event_b1st12ActionPerformed

    private void b2nd12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2nd12ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b2nd12, "b2nd12", 2, player.getCurrentRate(), 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24);
        winner.currentStavSetter();
    }//GEN-LAST:event_b2nd12ActionPerformed

    private void b1of18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1of18ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b1of18, "b1of18", 1, player.getCurrentRate(), 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        winner.currentStavSetter();
    }//GEN-LAST:event_b1of18ActionPerformed

    private void b_evenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_evenActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b_even, "b_even", 1, player.getCurrentRate(), 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36);
        winner.currentStavSetter();
    }//GEN-LAST:event_b_evenActionPerformed

    private void b_redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_redActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b_red, "b_red", 1, player.getCurrentRate(), 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36);
        winner.currentStavSetter();
    }//GEN-LAST:event_b_redActionPerformed

    private void b_blackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_blackActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b_black, "b_black", 1, player.getCurrentRate(), 2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35);
        winner.currentStavSetter();
    }//GEN-LAST:event_b_blackActionPerformed

    private void b_oddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_oddActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b_odd, "b_odd", 1, player.getCurrentRate(), 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35);
        winner.currentStavSetter();
    }//GEN-LAST:event_b_oddActionPerformed

    private void b19of36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19of36ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b19of36, "b19of36", 1, player.getCurrentRate(), 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36);
        winner.currentStavSetter();
    }//GEN-LAST:event_b19of36ActionPerformed

    private void b31of33vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b31of33vActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b31of33v, "b31of33v", 11, player.getCurrentRate(), 31, 32, 33);
        winner.currentStavSetter();
    }//GEN-LAST:event_b31of33vActionPerformed

    private void b31of36vvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b31of36vvActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b31of36vv, "b31of36vv", 5, player.getCurrentRate(), 31, 32, 33, 34, 35, 36);
        winner.currentStavSetter();
    }//GEN-LAST:event_b31of36vvActionPerformed

    private void b16of21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16of21ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b16of21, "b16of31", 5, player.getCurrentRate(), 16, 17, 18, 19, 20, 21);
        winner.currentStavSetter();
    }//GEN-LAST:event_b16of21ActionPerformed

    private void b7of9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7of9ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b7of9, "b7of9", 11, player.getCurrentRate(), 7, 8, 9);
        winner.currentStavSetter();
    }//GEN-LAST:event_b7of9ActionPerformed

    private void b19of24vvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19of24vvActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b19of24vv, "b19of24vv", 5, player.getCurrentRate(), 19, 20, 21, 22, 23, 24);
        winner.currentStavSetter();
    }//GEN-LAST:event_b19of24vvActionPerformed

    private void b10of15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10of15ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b10of15, "b10of15", 5, player.getCurrentRate(), 10, 11, 12, 13, 14, 15);
        winner.currentStavSetter();
    }//GEN-LAST:event_b10of15ActionPerformed

    private void b22of27vvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22of27vvActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b22of27vv, "b16", 5, player.getCurrentRate(), 22, 23, 24, 25, 26, 27);
        winner.currentStavSetter();
    }//GEN-LAST:event_b22of27vvActionPerformed

    private void b34of36vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b34of36vActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b34of36v, "b34of36v", 11, player.getCurrentRate(), 34, 35, 36);
        winner.currentStavSetter();
    }//GEN-LAST:event_b34of36vActionPerformed

    private void b28of33vvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b28of33vvActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b28of33vv, "b28of33vv", 5, player.getCurrentRate(), 28, 29, 30, 31, 32, 33);
        winner.currentStavSetter();
    }//GEN-LAST:event_b28of33vvActionPerformed

    private void b10of12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10of12ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b10of12, "b10of12", 11, player.getCurrentRate(), 10, 11, 12);
        winner.currentStavSetter();
    }//GEN-LAST:event_b10of12ActionPerformed

    private void b7of12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7of12ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b7of12, "b7of12", 5, player.getCurrentRate(), 7, 8, 9, 10, 11, 12);
        winner.currentStavSetter();
    }//GEN-LAST:event_b7of12ActionPerformed

    private void b19of21vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19of21vActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b19of21v, "b19of21v", 11, player.getCurrentRate(), 19, 20, 21);
        winner.currentStavSetter();
    }//GEN-LAST:event_b19of21vActionPerformed

    private void b25of27vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25of27vActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b25of27v, "b25of27v", 11, player.getCurrentRate(), 25, 26, 27);
        winner.currentStavSetter();
    }//GEN-LAST:event_b25of27vActionPerformed

    private void b13of15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13of15ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b13of15, "b13of15", 11, player.getCurrentRate(), 13, 14, 15);
        winner.currentStavSetter();
    }//GEN-LAST:event_b13of15ActionPerformed

    private void b4of6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4of6ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b4of6, "b4of6", 11, player.getCurrentRate(), 4, 5, 6);
        winner.currentStavSetter();
    }//GEN-LAST:event_b4of6ActionPerformed

    private void b28of30vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b28of30vActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b28of30v, "b28of30v", 11, player.getCurrentRate(), 28, 29, 30);
        winner.currentStavSetter();
    }//GEN-LAST:event_b28of30vActionPerformed

    private void b22of24vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22of24vActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b22of24v, "b22of24v", 11, player.getCurrentRate(), 22, 23, 24);
        winner.currentStavSetter();
    }//GEN-LAST:event_b22of24vActionPerformed

    private void b16of18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16of18ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b16of18, "b16of18", 11, player.getCurrentRate(), 16, 17, 18);
        winner.currentStavSetter();
    }//GEN-LAST:event_b16of18ActionPerformed

    private void b25of30vvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25of30vvActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b25of30vv, "b25of30vv", 5, player.getCurrentRate(), 25, 26, 27, 28, 29, 30);
        winner.currentStavSetter();
    }//GEN-LAST:event_b25of30vvActionPerformed

    private void b1of6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1of6ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b1of6, "b1of6", 5, player.getCurrentRate(), 1, 2, 3, 4, 5, 6);
        winner.currentStavSetter();
    }//GEN-LAST:event_b1of6ActionPerformed

    private void b1of3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1of3ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b1of3, "b1of3", 11, player.getCurrentRate(), 1, 2, 3);
        winner.currentStavSetter();
    }//GEN-LAST:event_b1of3ActionPerformed

    private void b13of18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13of18ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b13of18, "b13of18", 5, player.getCurrentRate(), 13, 14, 15, 16, 17, 18);
        winner.currentStavSetter();
    }//GEN-LAST:event_b13of18ActionPerformed

    private void b4of9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4of9ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b4of9, "b4of9", 5, player.getCurrentRate(), 4, 5, 6, 7, 8, 9);
        winner.currentStavSetter();
    }//GEN-LAST:event_b4of9ActionPerformed

    private void b0of3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0of3ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b0of3, "b0of3", 8, player.getCurrentRate(), 0, 1, 2, 3);
        winner.currentStavSetter();
    }//GEN-LAST:event_b0of3ActionPerformed

    private void bg3to6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg3to6ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg3to6, "b3to6", 17, player.getCurrentRate(), 3, 6);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg3to6ActionPerformed

    private void bg6to9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg6to9ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg6to9, "bg6to9", 17, player.getCurrentRate(), 6, 9);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg6to9ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b9, "b9", 35, player.getCurrentRate(), 9);
        winner.currentStavSetter();
    }//GEN-LAST:event_b9ActionPerformed

    private void bg9to12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg9to12ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg9to12, "bg9to12", 17, player.getCurrentRate(), 9, 12);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg9to12ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b12, "b12", 35, player.getCurrentRate(), 12);
        winner.currentStavSetter();
    }//GEN-LAST:event_b12ActionPerformed

    private void bg12to15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg12to15ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg12to15, "bg12to15", 17, player.getCurrentRate(), 12, 15);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg12to15ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b15, "b15", 35, player.getCurrentRate(), 15);
        winner.currentStavSetter();
    }//GEN-LAST:event_b15ActionPerformed

    private void bg15to18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg15to18ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg15to18, "bg15to18", 17, player.getCurrentRate(), 15, 18);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg15to18ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b18, "b18", 35, player.getCurrentRate(), 18);
        winner.currentStavSetter();
    }//GEN-LAST:event_b18ActionPerformed

    private void bg18to21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg18to21ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg18to21, "bg18to21", 17, player.getCurrentRate(), 18, 21);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg18to21ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b21, "b21", 35, player.getCurrentRate(), 21);
        winner.currentStavSetter();
    }//GEN-LAST:event_b21ActionPerformed

    private void bg21to24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg21to24ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg21to24, "bg21to24", 17, player.getCurrentRate(), 21, 24);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg21to24ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b24, "b24", 35, player.getCurrentRate(), 24);
        winner.currentStavSetter();
    }//GEN-LAST:event_b24ActionPerformed

    private void bg24to27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg24to27ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg24to27, "bg24to27", 17, player.getCurrentRate(), 24, 27);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg24to27ActionPerformed

    private void b27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b27ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b27, "b27", 35, player.getCurrentRate(), 27);
        winner.currentStavSetter();
    }//GEN-LAST:event_b27ActionPerformed

    private void bg27to30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg27to30ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg27to30, "bg27to30", 17, player.getCurrentRate(), 27, 30);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg27to30ActionPerformed

    private void b30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b30ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b30, "b30", 35, player.getCurrentRate(), 30);
        winner.currentStavSetter();
    }//GEN-LAST:event_b30ActionPerformed

    private void bg30to33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg30to33ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg30to33, "b30to33", 17, player.getCurrentRate(), 30, 33);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg30to33ActionPerformed

    private void b33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b33ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b33, "b33", 35, player.getCurrentRate(), 33);
        winner.currentStavSetter();
    }//GEN-LAST:event_b33ActionPerformed

    private void bg33to36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bg33to36ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(bg33to36, "bg33to36", 17, player.getCurrentRate(), 33, 36);
        winner.currentStavSetter();
    }//GEN-LAST:event_bg33to36ActionPerformed

    private void b36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b36ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b36, "b36", 35, player.getCurrentRate(), 36);
        winner.currentStavSetter();
    }//GEN-LAST:event_b36ActionPerformed

    private void b3rd12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3rd12ActionPerformed
        chipMngr.addChipInArrayAndPlusCounter(b3rd12, "b3rd12", 2, player.getCurrentRate(), 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36);
        winner.currentStavSetter();
    }//GEN-LAST:event_b3rd12ActionPerformed

    private void setChipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setChipsActionPerformed
        //Создание окна выбора размера ставки
        setChipsFrame.setVisible(true);

        //Блокировка главного окна на время выбора фишки
        framePackage.MainFrame.this.setEnabled(false);
    }//GEN-LAST:event_setChipsActionPerformed

    private void bPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlayerActionPerformed
        //Создание окна настроек Игрока, при пустых полях ставок
        //Передача mainFrame в параметр окна Игрока
        if (chipMngr.isEmptyArray()) {
            new PlayerJFrame(framePackage.MainFrame.this).setVisible(true);
            //Блокировка окна на время выбора фишки
            framePackage.MainFrame.this.setEnabled(false);
        } else {
            notifLabel.setText("<html><font color='#9B1C00'>Для изменения профиля<p>очистите все поля</font></html>");
        }
    }//GEN-LAST:event_bPlayerActionPerformed

    private void bRollBallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRollBallActionPerformed
        //Кнопка запуска шара //Шар запускается при наличии ставки на столе
        if (!chipMngr.isEmptyArray()) {
            effectPlayer.runRoulettRun();
            notifLabel.setText(null);
            winner.rollTheBall();                                               //Рандом значения шара

            //Новый поток с анимацией движения шара
            RouletteRun rRun = new RouletteRun(winner.getBall(), bRollBall);
            rRun.getLabelArr(labOut00, labOut1, labOut13, labOut36, labOut24, labOut3, labOut15, labOut34, labOut22, labOut5, labOut17, labOut32, labOut20, labOut7, labOut11, labOut30, labOut26, labOut9, labOut28, labOut0, labOut2, labOut14, labOut35, labOut23, labOut4, labOut16, labOut33, labOut21, labOut6, labOut18, labOut31, labOut19, labOut8, labOut12, labOut29, labOut25, labOut10, labOut27);
            rRun.start();

            //
            //Новый поток,запускаемый по таймеру. Таймер должен быть больше времени анимации шара
            //В потоке основные расчеты игры
            RollBallThread rbt = new RollBallThread(MainFrame.this, rRun);
            rbt.start();
        } else {
            notifLabel.setText("<html><font color='#9B1C00'>Сделайте ставку");
        }
    }//GEN-LAST:event_bRollBallActionPerformed

    private void clearAllFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllFieldActionPerformed
        winner.clearStavSetter();                                               //Очистка поля "текущая ставка" и возврат значений "бюджета"
        chipMngr.clearAllFields();                                              //Очистка всех полей ставок
        notifLabel.setText(null);

    }//GEN-LAST:event_clearAllFieldActionPerformed

    private void bSaveProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveProfileActionPerformed
        if (chipMngr.isEmptyArray()) {
            try {
                ObjectOutputStream saveStream = new ObjectOutputStream(new FileOutputStream("gamerProfile.out"));
                saveStream.writeObject(player);
                saveStream.close();
                notifLabel.setText("Профиль сохранён");
            } catch (IOException e) {
                notifLabel.setText("Ошибка сохранения");
                System.out.println(e);
            }
        } else {
            notifLabel.setText("<html><font color='#9B1C00'>Для сохранения профиля<p>очистите все поля</font></html>");
        }
    }//GEN-LAST:event_bSaveProfileActionPerformed

    private void bLoadProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoadProfileActionPerformed
        if (chipMngr.isEmptyArray()) {
            try {
                ObjectInputStream loadStream = new ObjectInputStream(new FileInputStream("gamerProfile.out"));
                player = (Player) loadStream.readObject();
                loadStream.close();
                player.playerSetLabelText(lPlayerName, lPlayerButget, bPlayer);
                notifLabel.setText("Профиль загружен");

            } catch (IOException e) {
                notifLabel.setText("Ошибка Загрузки");
                System.out.println(e);
            } catch (ClassNotFoundException e) {
                notifLabel.setText("Ошибка Класса");
                System.out.println(e);
            }
        } else {
            notifLabel.setText("<html><font color='#9B1C00'>Для загрузки профиля<p>очистите все поля</font></html>");
        }
    }//GEN-LAST:event_bLoadProfileActionPerformed

    private void notifLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notifLabelMouseClicked
        notifLabel.setText(null);
    }//GEN-LAST:event_notifLabelMouseClicked

    private void bSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSettingsActionPerformed
        framePackage.MainFrame.this.settingsFrame.setVisible(true);
        framePackage.MainFrame.this.setEnabled(false);
    }//GEN-LAST:event_bSettingsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Фоновая музыка при открытии главного окна
        soundsPlayer.runFountMusic();
    }//GEN-LAST:event_formWindowOpened
// </editor-fold>

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);

            }
        });

    }
// <editor-fold defaultstate="collapsed" desc="Button declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b00;
    private javax.swing.JButton b0of3;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b10of12;
    private javax.swing.JButton b10of15;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b13of15;
    private javax.swing.JButton b13of18;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b16of18;
    private javax.swing.JButton b16of21;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b19of21v;
    private javax.swing.JButton b19of24vv;
    private javax.swing.JButton b19of36;
    private javax.swing.JButton b1of18;
    private javax.swing.JButton b1of3;
    private javax.swing.JButton b1of6;
    private javax.swing.JButton b1st12;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b22of24v;
    private javax.swing.JButton b22of27vv;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b25of27v;
    private javax.swing.JButton b25of30vv;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b28of30v;
    private javax.swing.JButton b28of33vv;
    private javax.swing.JButton b29;
    private javax.swing.JButton b2nd12;
    private javax.swing.JButton b2to1_1_34;
    private javax.swing.JButton b2to1_2_35;
    private javax.swing.JButton b2to1_3_36;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b31;
    private javax.swing.JButton b31of33v;
    private javax.swing.JButton b31of36vv;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b34of36v;
    private javax.swing.JButton b35;
    private javax.swing.JButton b36;
    private javax.swing.JButton b3rd12;
    private javax.swing.JButton b4;
    private javax.swing.JButton b4of6;
    private javax.swing.JButton b4of9;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b7of12;
    private javax.swing.JButton b7of9;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bLoadProfile;
    public javax.swing.JButton bPlayer;
    private javax.swing.JButton bRollBall;
    private javax.swing.JButton bSaveProfile;
    private javax.swing.JButton bSettings;
    private javax.swing.JButton b_black;
    private javax.swing.JButton b_even;
    private javax.swing.JButton b_odd;
    private javax.swing.JButton b_red;
    private javax.swing.JButton bc10_11_13_14;
    private javax.swing.JButton bc11_12_14_15;
    private javax.swing.JButton bc13_14_16_17;
    private javax.swing.JButton bc14_15_17_18;
    private javax.swing.JButton bc16_17_19_20;
    private javax.swing.JButton bc17_18_20_21;
    private javax.swing.JButton bc19_20_22_23;
    private javax.swing.JButton bc1_2_4_5;
    private javax.swing.JButton bc20_21_23_24;
    private javax.swing.JButton bc22_23_25_26;
    private javax.swing.JButton bc23_24_26_27;
    private javax.swing.JButton bc25_26_28_29;
    private javax.swing.JButton bc26_27_29_30;
    private javax.swing.JButton bc28_29_31_32;
    private javax.swing.JButton bc29_30_32_33;
    private javax.swing.JButton bc2_3_5_6;
    private javax.swing.JButton bc31_32_34_35;
    private javax.swing.JButton bc32_33_35_36;
    private javax.swing.JButton bc4_5_7_8;
    private javax.swing.JButton bc5_6_8_9;
    private javax.swing.JButton bc7_8_10_11;
    private javax.swing.JButton bc8_9_11_12;
    private javax.swing.JButton bg10to13;
    private javax.swing.JButton bg11to14;
    private javax.swing.JButton bg12to15;
    private javax.swing.JButton bg13to16;
    private javax.swing.JButton bg14to17;
    private javax.swing.JButton bg15to18;
    private javax.swing.JButton bg16to19;
    private javax.swing.JButton bg17to20;
    private javax.swing.JButton bg18to21;
    private javax.swing.JButton bg19to22;
    private javax.swing.JButton bg1to4;
    private javax.swing.JButton bg20to23;
    private javax.swing.JButton bg21to24;
    private javax.swing.JButton bg22to25;
    private javax.swing.JButton bg23to26;
    private javax.swing.JButton bg24to27;
    private javax.swing.JButton bg25to28;
    private javax.swing.JButton bg26to29;
    private javax.swing.JButton bg27to30;
    private javax.swing.JButton bg28to31;
    private javax.swing.JButton bg29to32;
    private javax.swing.JButton bg2to5;
    private javax.swing.JButton bg30to33;
    private javax.swing.JButton bg31to34;
    private javax.swing.JButton bg32to35;
    private javax.swing.JButton bg33to36;
    private javax.swing.JButton bg3to6;
    private javax.swing.JButton bg4to7;
    private javax.swing.JButton bg5to8;
    private javax.swing.JButton bg6to9;
    private javax.swing.JButton bg7to10;
    private javax.swing.JButton bg8to11;
    private javax.swing.JButton bg9to12;
    private javax.swing.JButton bv10to11;
    private javax.swing.JButton bv11to12;
    private javax.swing.JButton bv13to14;
    private javax.swing.JButton bv14to15;
    private javax.swing.JButton bv16to17;
    private javax.swing.JButton bv17to18;
    private javax.swing.JButton bv19to20;
    private javax.swing.JButton bv1to2;
    private javax.swing.JButton bv20to21;
    private javax.swing.JButton bv22to23;
    private javax.swing.JButton bv23to24;
    private javax.swing.JButton bv25to26;
    private javax.swing.JButton bv26to27;
    private javax.swing.JButton bv28to29;
    private javax.swing.JButton bv29to30;
    private javax.swing.JButton bv2to3;
    private javax.swing.JButton bv31to32;
    private javax.swing.JButton bv32to33;
    private javax.swing.JButton bv34to35;
    private javax.swing.JButton bv35to36;
    private javax.swing.JButton bv4to5;
    private javax.swing.JButton bv5to6;
    private javax.swing.JButton bv7to8;
    private javax.swing.JButton bv8to9;
    private javax.swing.JButton clearAllField;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lPlayerButget;
    public javax.swing.JLabel lPlayerCurrentStav;
    public javax.swing.JLabel lPlayerName;
    private javax.swing.JLabel labOut0;
    private javax.swing.JLabel labOut00;
    private javax.swing.JLabel labOut1;
    private javax.swing.JLabel labOut10;
    private javax.swing.JLabel labOut11;
    private javax.swing.JLabel labOut12;
    private javax.swing.JLabel labOut13;
    private javax.swing.JLabel labOut14;
    private javax.swing.JLabel labOut15;
    private javax.swing.JLabel labOut16;
    private javax.swing.JLabel labOut17;
    private javax.swing.JLabel labOut18;
    private javax.swing.JLabel labOut19;
    private javax.swing.JLabel labOut2;
    private javax.swing.JLabel labOut20;
    private javax.swing.JLabel labOut21;
    private javax.swing.JLabel labOut22;
    private javax.swing.JLabel labOut23;
    private javax.swing.JLabel labOut24;
    private javax.swing.JLabel labOut25;
    private javax.swing.JLabel labOut26;
    private javax.swing.JLabel labOut27;
    private javax.swing.JLabel labOut28;
    private javax.swing.JLabel labOut29;
    private javax.swing.JLabel labOut3;
    private javax.swing.JLabel labOut30;
    private javax.swing.JLabel labOut31;
    private javax.swing.JLabel labOut32;
    private javax.swing.JLabel labOut33;
    private javax.swing.JLabel labOut34;
    private javax.swing.JLabel labOut35;
    private javax.swing.JLabel labOut36;
    private javax.swing.JLabel labOut4;
    private javax.swing.JLabel labOut5;
    private javax.swing.JLabel labOut6;
    private javax.swing.JLabel labOut7;
    private javax.swing.JLabel labOut8;
    private javax.swing.JLabel labOut9;
    private javax.swing.JLabel mainFountLabel;
    private javax.swing.JPanel maskPanel;
    public javax.swing.JLabel notifLabel;
    public javax.swing.JPanel roulettePanel;
    public javax.swing.JButton setChips;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
