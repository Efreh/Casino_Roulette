package mainPackage;

public class Roulette extends javax.swing.JFrame {

    int [] buttonCounter = new int [23];
    int stav = 0;

    public Roulette() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        maskPanel = new javax.swing.JPanel();
        _00_Button = new javax.swing.JButton();
        _0_Button = new javax.swing.JButton();
        _1_Button = new javax.swing.JButton();
        _2_Button = new javax.swing.JButton();
        _3_Button = new javax.swing.JButton();
        _4_Button = new javax.swing.JButton();
        _5_Button = new javax.swing.JButton();
        _6_Button = new javax.swing.JButton();
        _7_Button = new javax.swing.JButton();
        _8_Button = new javax.swing.JButton();
        _9_Button = new javax.swing.JButton();
        _10_Button = new javax.swing.JButton();
        _11_Button = new javax.swing.JButton();
        _12_Button = new javax.swing.JButton();
        _13_Button = new javax.swing.JButton();
        _14_Button = new javax.swing.JButton();
        _15_Button = new javax.swing.JButton();
        _16_Button = new javax.swing.JButton();
        _17_Button = new javax.swing.JButton();
        _18_Button = new javax.swing.JButton();
        _19_Button = new javax.swing.JButton();
        _20_Button = new javax.swing.JButton();
        _21_Button = new javax.swing.JButton();
        _22_Button = new javax.swing.JButton();
        _23_Button = new javax.swing.JButton();
        _24_Button = new javax.swing.JButton();
        _25_Button = new javax.swing.JButton();
        _26_Button = new javax.swing.JButton();
        _27_Button = new javax.swing.JButton();
        _28_Button = new javax.swing.JButton();
        _29_Button = new javax.swing.JButton();
        _30_Button = new javax.swing.JButton();
        _31_Button = new javax.swing.JButton();
        _32_Button = new javax.swing.JButton();
        _33_Button = new javax.swing.JButton();
        _34_Button = new javax.swing.JButton();
        _35_Button = new javax.swing.JButton();
        _36_Button = new javax.swing.JButton();
        _3_6_Button = new javax.swing.JButton();
        _6_9_Button = new javax.swing.JButton();
        _9_12_Button = new javax.swing.JButton();
        _12_15_Button = new javax.swing.JButton();
        _15_18_Button = new javax.swing.JButton();
        _18_21_Button = new javax.swing.JButton();
        _21_24_Button = new javax.swing.JButton();
        _24_27_Button = new javax.swing.JButton();
        _27_30_Button = new javax.swing.JButton();
        _30_33_Button = new javax.swing.JButton();
        _33_36_Button = new javax.swing.JButton();
        _2_5_Button = new javax.swing.JButton();
        _5_8_Button = new javax.swing.JButton();
        _8_11_Button = new javax.swing.JButton();
        _11_14_Button = new javax.swing.JButton();
        _14_17_Button = new javax.swing.JButton();
        _17_20_Button = new javax.swing.JButton();
        _20_23_Button = new javax.swing.JButton();
        _23_26_Button = new javax.swing.JButton();
        _26_29_Button = new javax.swing.JButton();
        _29_32_Button = new javax.swing.JButton();
        _32_35_Button = new javax.swing.JButton();
        _1_4_Button = new javax.swing.JButton();
        _4_7_Button = new javax.swing.JButton();
        _7_10_Button = new javax.swing.JButton();
        _10_13_Button = new javax.swing.JButton();
        _13_16_Button = new javax.swing.JButton();
        _16_19_Button = new javax.swing.JButton();
        _19_22_Button = new javax.swing.JButton();
        _22_25_Button = new javax.swing.JButton();
        _25_28_Button = new javax.swing.JButton();
        _28_31_Button = new javax.swing.JButton();
        _31_34_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        _1_2_Button = new javax.swing.JButton();
        _4_5_Button = new javax.swing.JButton();
        _7_8_Button = new javax.swing.JButton();
        _10_11_Button = new javax.swing.JButton();
        _13_14_Button = new javax.swing.JButton();
        _16_17_Button = new javax.swing.JButton();
        _19_20_Button = new javax.swing.JButton();
        _22_23_Button = new javax.swing.JButton();
        _25_26_Button = new javax.swing.JButton();
        _28_29_Button = new javax.swing.JButton();
        _31_32_Button = new javax.swing.JButton();
        _34_35_Button = new javax.swing.JButton();
        _1_2_4_5_Button = new javax.swing.JButton();
        _4_5_7_8_Button = new javax.swing.JButton();
        _7_8_10_11_Button = new javax.swing.JButton();
        _10_11_13_14_Button = new javax.swing.JButton();
        _13_14_16_17_Button = new javax.swing.JButton();
        _16_17_19_20_Button = new javax.swing.JButton();
        _19_20_22_23_Button = new javax.swing.JButton();
        _22_23_25_26_Button = new javax.swing.JButton();
        _25_26_28_29_Button = new javax.swing.JButton();
        _28_29_31_32_Button = new javax.swing.JButton();
        _31_32_34_35_Button = new javax.swing.JButton();
        _2_3_Button = new javax.swing.JButton();
        _5_6_Button = new javax.swing.JButton();
        _8_9_Button = new javax.swing.JButton();
        _11_12_Button = new javax.swing.JButton();
        _14_15_Button = new javax.swing.JButton();
        _17_18_Button = new javax.swing.JButton();
        _20_21_Button = new javax.swing.JButton();
        _23_24_Button = new javax.swing.JButton();
        _26_27_Button = new javax.swing.JButton();
        _29_30_Button = new javax.swing.JButton();
        _32_33_Button = new javax.swing.JButton();
        _35_36_Button = new javax.swing.JButton();
        _2_3_5_6_Button = new javax.swing.JButton();
        _5_6_8_9_Button = new javax.swing.JButton();
        _8_9_11_12_Button = new javax.swing.JButton();
        _11_12_14_15_Button = new javax.swing.JButton();
        _14_15_17_18_Button = new javax.swing.JButton();
        _17_18_20_21_Button = new javax.swing.JButton();
        _20_21_23_24_Button = new javax.swing.JButton();
        _23_24_26_27_Button = new javax.swing.JButton();
        _26_27_29_30_Button = new javax.swing.JButton();
        _29_30_32_33_Button = new javax.swing.JButton();
        _32_33_35_36_Button = new javax.swing.JButton();
        mainFountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casino Roulette");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        maskPanel.setOpaque(false);
        maskPanel.setLayout(null);

        _00_Button.setToolTipText("");
        _00_Button.setBorder(null);
        _00_Button.setBorderPainted(false);
        _00_Button.setContentAreaFilled(false);
        _00_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _00_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _00_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _00_Button.setName(""); // NOI18N
        _00_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _00_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_00_Button);
        _00_Button.setBounds(505, 165, 30, 30);

        _0_Button.setToolTipText("");
        _0_Button.setBorder(null);
        _0_Button.setBorderPainted(false);
        _0_Button.setContentAreaFilled(false);
        _0_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _0_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _0_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _0_Button.setName(""); // NOI18N
        _0_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _0_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_0_Button);
        _0_Button.setBounds(505, 260, 30, 30);

        _1_Button.setToolTipText("");
        _1_Button.setBorder(null);
        _1_Button.setBorderPainted(false);
        _1_Button.setContentAreaFilled(false);
        _1_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _1_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _1_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _1_Button.setName(""); // NOI18N
        _1_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_1_Button);
        _1_Button.setBounds(544, 277, 30, 30);

        _2_Button.setToolTipText("");
        _2_Button.setBorder(null);
        _2_Button.setBorderPainted(false);
        _2_Button.setContentAreaFilled(false);
        _2_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _2_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _2_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _2_Button.setName(""); // NOI18N
        _2_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_2_Button);
        _2_Button.setBounds(544, 212, 30, 30);

        _3_Button.setToolTipText("");
        _3_Button.setBorder(null);
        _3_Button.setBorderPainted(false);
        _3_Button.setContentAreaFilled(false);
        _3_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _3_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _3_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _3_Button.setName(""); // NOI18N
        _3_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_3_Button);
        _3_Button.setBounds(543, 146, 30, 30);

        _4_Button.setToolTipText("");
        _4_Button.setBorder(null);
        _4_Button.setBorderPainted(false);
        _4_Button.setContentAreaFilled(false);
        _4_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _4_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _4_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _4_Button.setName(""); // NOI18N
        _4_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_4_Button);
        _4_Button.setBounds(586, 277, 30, 30);

        _5_Button.setToolTipText("");
        _5_Button.setBorder(null);
        _5_Button.setBorderPainted(false);
        _5_Button.setContentAreaFilled(false);
        _5_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _5_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _5_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _5_Button.setName(""); // NOI18N
        _5_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_5_Button);
        _5_Button.setBounds(586, 212, 30, 30);

        _6_Button.setToolTipText("");
        _6_Button.setBorder(null);
        _6_Button.setBorderPainted(false);
        _6_Button.setContentAreaFilled(false);
        _6_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _6_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _6_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _6_Button.setName(""); // NOI18N
        _6_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_6_Button);
        _6_Button.setBounds(586, 146, 30, 30);

        _7_Button.setToolTipText("");
        _7_Button.setBorder(null);
        _7_Button.setBorderPainted(false);
        _7_Button.setContentAreaFilled(false);
        _7_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _7_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _7_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _7_Button.setName(""); // NOI18N
        _7_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_7_Button);
        _7_Button.setBounds(628, 277, 30, 30);

        _8_Button.setToolTipText("");
        _8_Button.setBorder(null);
        _8_Button.setBorderPainted(false);
        _8_Button.setContentAreaFilled(false);
        _8_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _8_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _8_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _8_Button.setName(""); // NOI18N
        _8_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_8_Button);
        _8_Button.setBounds(628, 212, 30, 30);

        _9_Button.setToolTipText("");
        _9_Button.setBorder(null);
        _9_Button.setBorderPainted(false);
        _9_Button.setContentAreaFilled(false);
        _9_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _9_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _9_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _9_Button.setName(""); // NOI18N
        _9_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_9_Button);
        _9_Button.setBounds(628, 146, 30, 30);

        _10_Button.setToolTipText("");
        _10_Button.setBorder(null);
        _10_Button.setBorderPainted(false);
        _10_Button.setContentAreaFilled(false);
        _10_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _10_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _10_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _10_Button.setName(""); // NOI18N
        _10_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _10_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_10_Button);
        _10_Button.setBounds(671, 277, 30, 30);

        _11_Button.setToolTipText("");
        _11_Button.setBorder(null);
        _11_Button.setBorderPainted(false);
        _11_Button.setContentAreaFilled(false);
        _11_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _11_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _11_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _11_Button.setName(""); // NOI18N
        _11_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _11_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_11_Button);
        _11_Button.setBounds(671, 212, 30, 30);

        _12_Button.setToolTipText("");
        _12_Button.setBorder(null);
        _12_Button.setBorderPainted(false);
        _12_Button.setContentAreaFilled(false);
        _12_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _12_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _12_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _12_Button.setName(""); // NOI18N
        _12_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _12_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_12_Button);
        _12_Button.setBounds(671, 146, 30, 30);

        _13_Button.setToolTipText("");
        _13_Button.setBorder(null);
        _13_Button.setBorderPainted(false);
        _13_Button.setContentAreaFilled(false);
        _13_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _13_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _13_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _13_Button.setName(""); // NOI18N
        _13_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _13_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_13_Button);
        _13_Button.setBounds(713, 277, 30, 30);

        _14_Button.setToolTipText("");
        _14_Button.setBorder(null);
        _14_Button.setBorderPainted(false);
        _14_Button.setContentAreaFilled(false);
        _14_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _14_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _14_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _14_Button.setName(""); // NOI18N
        _14_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _14_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_14_Button);
        _14_Button.setBounds(713, 212, 30, 30);

        _15_Button.setToolTipText("");
        _15_Button.setBorder(null);
        _15_Button.setBorderPainted(false);
        _15_Button.setContentAreaFilled(false);
        _15_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _15_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _15_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _15_Button.setName(""); // NOI18N
        _15_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _15_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_15_Button);
        _15_Button.setBounds(713, 146, 30, 30);

        _16_Button.setToolTipText("");
        _16_Button.setBorder(null);
        _16_Button.setBorderPainted(false);
        _16_Button.setContentAreaFilled(false);
        _16_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _16_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _16_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _16_Button.setName(""); // NOI18N
        _16_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _16_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_16_Button);
        _16_Button.setBounds(755, 277, 30, 30);

        _17_Button.setToolTipText("");
        _17_Button.setBorder(null);
        _17_Button.setBorderPainted(false);
        _17_Button.setContentAreaFilled(false);
        _17_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _17_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _17_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _17_Button.setName(""); // NOI18N
        _17_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _17_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_17_Button);
        _17_Button.setBounds(755, 212, 30, 30);

        _18_Button.setToolTipText("");
        _18_Button.setBorder(null);
        _18_Button.setBorderPainted(false);
        _18_Button.setContentAreaFilled(false);
        _18_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _18_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _18_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _18_Button.setName(""); // NOI18N
        _18_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _18_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_18_Button);
        _18_Button.setBounds(756, 146, 30, 30);

        _19_Button.setToolTipText("");
        _19_Button.setBorder(null);
        _19_Button.setBorderPainted(false);
        _19_Button.setContentAreaFilled(false);
        _19_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _19_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _19_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _19_Button.setName(""); // NOI18N
        _19_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _19_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_19_Button);
        _19_Button.setBounds(798, 277, 30, 30);

        _20_Button.setToolTipText("");
        _20_Button.setBorder(null);
        _20_Button.setBorderPainted(false);
        _20_Button.setContentAreaFilled(false);
        _20_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _20_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _20_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _20_Button.setName(""); // NOI18N
        _20_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _20_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_20_Button);
        _20_Button.setBounds(798, 212, 30, 30);

        _21_Button.setToolTipText("");
        _21_Button.setBorder(null);
        _21_Button.setBorderPainted(false);
        _21_Button.setContentAreaFilled(false);
        _21_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _21_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _21_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _21_Button.setName(""); // NOI18N
        _21_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _21_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_21_Button);
        _21_Button.setBounds(798, 146, 30, 30);

        _22_Button.setToolTipText("");
        _22_Button.setBorder(null);
        _22_Button.setBorderPainted(false);
        _22_Button.setContentAreaFilled(false);
        _22_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _22_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _22_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _22_Button.setName(""); // NOI18N
        _22_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _22_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_22_Button);
        _22_Button.setBounds(840, 277, 30, 30);

        _23_Button.setToolTipText("");
        _23_Button.setBorder(null);
        _23_Button.setBorderPainted(false);
        _23_Button.setContentAreaFilled(false);
        _23_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _23_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _23_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _23_Button.setName(""); // NOI18N
        _23_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _23_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_23_Button);
        _23_Button.setBounds(840, 212, 30, 30);

        _24_Button.setToolTipText("");
        _24_Button.setBorder(null);
        _24_Button.setBorderPainted(false);
        _24_Button.setContentAreaFilled(false);
        _24_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _24_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _24_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _24_Button.setName(""); // NOI18N
        _24_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _24_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_24_Button);
        _24_Button.setBounds(841, 146, 30, 30);

        _25_Button.setToolTipText("");
        _25_Button.setBorder(null);
        _25_Button.setBorderPainted(false);
        _25_Button.setContentAreaFilled(false);
        _25_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _25_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _25_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _25_Button.setName(""); // NOI18N
        _25_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _25_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_25_Button);
        _25_Button.setBounds(883, 277, 30, 30);

        _26_Button.setToolTipText("");
        _26_Button.setBorder(null);
        _26_Button.setBorderPainted(false);
        _26_Button.setContentAreaFilled(false);
        _26_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _26_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _26_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _26_Button.setName(""); // NOI18N
        _26_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _26_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_26_Button);
        _26_Button.setBounds(883, 212, 30, 30);

        _27_Button.setToolTipText("");
        _27_Button.setBorder(null);
        _27_Button.setBorderPainted(false);
        _27_Button.setContentAreaFilled(false);
        _27_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _27_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _27_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _27_Button.setName(""); // NOI18N
        _27_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _27_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_27_Button);
        _27_Button.setBounds(883, 146, 30, 30);

        _28_Button.setToolTipText("");
        _28_Button.setBorder(null);
        _28_Button.setBorderPainted(false);
        _28_Button.setContentAreaFilled(false);
        _28_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _28_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _28_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _28_Button.setName(""); // NOI18N
        _28_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _28_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_28_Button);
        _28_Button.setBounds(925, 277, 30, 30);

        _29_Button.setToolTipText("");
        _29_Button.setBorder(null);
        _29_Button.setBorderPainted(false);
        _29_Button.setContentAreaFilled(false);
        _29_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _29_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _29_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _29_Button.setName(""); // NOI18N
        _29_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _29_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_29_Button);
        _29_Button.setBounds(925, 212, 30, 30);

        _30_Button.setToolTipText("");
        _30_Button.setBorder(null);
        _30_Button.setBorderPainted(false);
        _30_Button.setContentAreaFilled(false);
        _30_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _30_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _30_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _30_Button.setName(""); // NOI18N
        _30_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _30_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_30_Button);
        _30_Button.setBounds(925, 146, 30, 30);

        _31_Button.setToolTipText("");
        _31_Button.setBorder(null);
        _31_Button.setBorderPainted(false);
        _31_Button.setContentAreaFilled(false);
        _31_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _31_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _31_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _31_Button.setName(""); // NOI18N
        _31_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _31_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_31_Button);
        _31_Button.setBounds(967, 277, 30, 30);

        _32_Button.setToolTipText("");
        _32_Button.setBorder(null);
        _32_Button.setBorderPainted(false);
        _32_Button.setContentAreaFilled(false);
        _32_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _32_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _32_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _32_Button.setName(""); // NOI18N
        _32_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _32_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_32_Button);
        _32_Button.setBounds(967, 212, 30, 30);

        _33_Button.setToolTipText("");
        _33_Button.setBorder(null);
        _33_Button.setBorderPainted(false);
        _33_Button.setContentAreaFilled(false);
        _33_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _33_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _33_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _33_Button.setName(""); // NOI18N
        _33_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _33_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_33_Button);
        _33_Button.setBounds(968, 146, 30, 30);

        _34_Button.setToolTipText("");
        _34_Button.setBorder(null);
        _34_Button.setBorderPainted(false);
        _34_Button.setContentAreaFilled(false);
        _34_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _34_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _34_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _34_Button.setName(""); // NOI18N
        _34_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _34_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_34_Button);
        _34_Button.setBounds(1010, 277, 30, 30);

        _35_Button.setToolTipText("");
        _35_Button.setBorder(null);
        _35_Button.setBorderPainted(false);
        _35_Button.setContentAreaFilled(false);
        _35_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _35_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _35_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _35_Button.setName(""); // NOI18N
        _35_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _35_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_35_Button);
        _35_Button.setBounds(1010, 212, 30, 30);

        _36_Button.setToolTipText("");
        _36_Button.setBorder(null);
        _36_Button.setBorderPainted(false);
        _36_Button.setContentAreaFilled(false);
        _36_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _36_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _36_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _36_Button.setName(""); // NOI18N
        _36_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _36_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_36_Button);
        _36_Button.setBounds(1010, 146, 30, 30);

        _3_6_Button.setToolTipText("");
        _3_6_Button.setBorder(null);
        _3_6_Button.setBorderPainted(false);
        _3_6_Button.setContentAreaFilled(false);
        _3_6_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _3_6_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _3_6_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _3_6_Button.setName(""); // NOI18N
        _3_6_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_6_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_3_6_Button);
        _3_6_Button.setBounds(565, 146, 30, 30);

        _6_9_Button.setToolTipText("");
        _6_9_Button.setBorder(null);
        _6_9_Button.setBorderPainted(false);
        _6_9_Button.setContentAreaFilled(false);
        _6_9_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _6_9_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _6_9_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _6_9_Button.setName(""); // NOI18N
        _6_9_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_9_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_6_9_Button);
        _6_9_Button.setBounds(606, 146, 30, 30);

        _9_12_Button.setToolTipText("");
        _9_12_Button.setBorder(null);
        _9_12_Button.setBorderPainted(false);
        _9_12_Button.setContentAreaFilled(false);
        _9_12_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _9_12_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _9_12_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _9_12_Button.setName(""); // NOI18N
        _9_12_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_12_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_9_12_Button);
        _9_12_Button.setBounds(651, 146, 30, 30);

        _12_15_Button.setToolTipText("");
        _12_15_Button.setBorder(null);
        _12_15_Button.setBorderPainted(false);
        _12_15_Button.setContentAreaFilled(false);
        _12_15_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _12_15_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _12_15_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _12_15_Button.setName(""); // NOI18N
        _12_15_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _12_15_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_12_15_Button);
        _12_15_Button.setBounds(693, 146, 30, 30);

        _15_18_Button.setToolTipText("");
        _15_18_Button.setBorder(null);
        _15_18_Button.setBorderPainted(false);
        _15_18_Button.setContentAreaFilled(false);
        _15_18_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _15_18_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _15_18_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _15_18_Button.setName(""); // NOI18N
        _15_18_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _15_18_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_15_18_Button);
        _15_18_Button.setBounds(735, 146, 30, 30);

        _18_21_Button.setToolTipText("");
        _18_21_Button.setBorder(null);
        _18_21_Button.setBorderPainted(false);
        _18_21_Button.setContentAreaFilled(false);
        _18_21_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _18_21_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _18_21_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _18_21_Button.setName(""); // NOI18N
        _18_21_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _18_21_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_18_21_Button);
        _18_21_Button.setBounds(778, 146, 30, 30);

        _21_24_Button.setToolTipText("");
        _21_24_Button.setBorder(null);
        _21_24_Button.setBorderPainted(false);
        _21_24_Button.setContentAreaFilled(false);
        _21_24_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _21_24_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _21_24_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _21_24_Button.setName(""); // NOI18N
        _21_24_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _21_24_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_21_24_Button);
        _21_24_Button.setBounds(820, 146, 30, 30);

        _24_27_Button.setToolTipText("");
        _24_27_Button.setBorder(null);
        _24_27_Button.setBorderPainted(false);
        _24_27_Button.setContentAreaFilled(false);
        _24_27_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _24_27_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _24_27_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _24_27_Button.setName(""); // NOI18N
        _24_27_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _24_27_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_24_27_Button);
        _24_27_Button.setBounds(863, 146, 30, 30);

        _27_30_Button.setToolTipText("");
        _27_30_Button.setBorder(null);
        _27_30_Button.setBorderPainted(false);
        _27_30_Button.setContentAreaFilled(false);
        _27_30_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _27_30_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _27_30_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _27_30_Button.setName(""); // NOI18N
        _27_30_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _27_30_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_27_30_Button);
        _27_30_Button.setBounds(905, 146, 30, 30);

        _30_33_Button.setToolTipText("");
        _30_33_Button.setBorder(null);
        _30_33_Button.setBorderPainted(false);
        _30_33_Button.setContentAreaFilled(false);
        _30_33_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _30_33_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _30_33_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _30_33_Button.setName(""); // NOI18N
        _30_33_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _30_33_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_30_33_Button);
        _30_33_Button.setBounds(948, 146, 30, 30);

        _33_36_Button.setToolTipText("");
        _33_36_Button.setBorder(null);
        _33_36_Button.setBorderPainted(false);
        _33_36_Button.setContentAreaFilled(false);
        _33_36_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _33_36_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _33_36_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _33_36_Button.setName(""); // NOI18N
        _33_36_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _33_36_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_33_36_Button);
        _33_36_Button.setBounds(990, 146, 30, 30);

        _2_5_Button.setToolTipText("");
        _2_5_Button.setBorder(null);
        _2_5_Button.setBorderPainted(false);
        _2_5_Button.setContentAreaFilled(false);
        _2_5_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _2_5_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _2_5_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _2_5_Button.setName(""); // NOI18N
        _2_5_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_5_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_2_5_Button);
        _2_5_Button.setBounds(566, 212, 30, 30);

        _5_8_Button.setToolTipText("");
        _5_8_Button.setBorder(null);
        _5_8_Button.setBorderPainted(false);
        _5_8_Button.setContentAreaFilled(false);
        _5_8_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _5_8_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _5_8_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _5_8_Button.setName(""); // NOI18N
        _5_8_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_8_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_5_8_Button);
        _5_8_Button.setBounds(608, 212, 30, 30);

        _8_11_Button.setToolTipText("");
        _8_11_Button.setBorder(null);
        _8_11_Button.setBorderPainted(false);
        _8_11_Button.setContentAreaFilled(false);
        _8_11_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _8_11_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _8_11_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _8_11_Button.setName(""); // NOI18N
        _8_11_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_11_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_8_11_Button);
        _8_11_Button.setBounds(651, 212, 30, 30);

        _11_14_Button.setToolTipText("");
        _11_14_Button.setBorder(null);
        _11_14_Button.setBorderPainted(false);
        _11_14_Button.setContentAreaFilled(false);
        _11_14_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _11_14_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _11_14_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _11_14_Button.setName(""); // NOI18N
        _11_14_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _11_14_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_11_14_Button);
        _11_14_Button.setBounds(693, 212, 30, 30);

        _14_17_Button.setToolTipText("");
        _14_17_Button.setBorder(null);
        _14_17_Button.setBorderPainted(false);
        _14_17_Button.setContentAreaFilled(false);
        _14_17_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _14_17_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _14_17_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _14_17_Button.setName(""); // NOI18N
        _14_17_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _14_17_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_14_17_Button);
        _14_17_Button.setBounds(735, 212, 30, 30);

        _17_20_Button.setToolTipText("");
        _17_20_Button.setBorder(null);
        _17_20_Button.setBorderPainted(false);
        _17_20_Button.setContentAreaFilled(false);
        _17_20_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _17_20_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _17_20_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _17_20_Button.setName(""); // NOI18N
        _17_20_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _17_20_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_17_20_Button);
        _17_20_Button.setBounds(777, 212, 30, 30);

        _20_23_Button.setToolTipText("");
        _20_23_Button.setBorder(null);
        _20_23_Button.setBorderPainted(false);
        _20_23_Button.setContentAreaFilled(false);
        _20_23_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _20_23_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _20_23_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _20_23_Button.setName(""); // NOI18N
        _20_23_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _20_23_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_20_23_Button);
        _20_23_Button.setBounds(820, 212, 30, 30);

        _23_26_Button.setToolTipText("");
        _23_26_Button.setBorder(null);
        _23_26_Button.setBorderPainted(false);
        _23_26_Button.setContentAreaFilled(false);
        _23_26_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _23_26_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _23_26_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _23_26_Button.setName(""); // NOI18N
        _23_26_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _23_26_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_23_26_Button);
        _23_26_Button.setBounds(862, 212, 30, 30);

        _26_29_Button.setToolTipText("");
        _26_29_Button.setBorder(null);
        _26_29_Button.setBorderPainted(false);
        _26_29_Button.setContentAreaFilled(false);
        _26_29_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _26_29_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _26_29_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _26_29_Button.setName(""); // NOI18N
        _26_29_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _26_29_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_26_29_Button);
        _26_29_Button.setBounds(905, 212, 30, 30);

        _29_32_Button.setToolTipText("");
        _29_32_Button.setBorder(null);
        _29_32_Button.setBorderPainted(false);
        _29_32_Button.setContentAreaFilled(false);
        _29_32_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _29_32_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _29_32_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _29_32_Button.setName(""); // NOI18N
        _29_32_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _29_32_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_29_32_Button);
        _29_32_Button.setBounds(947, 212, 30, 30);

        _32_35_Button.setToolTipText("");
        _32_35_Button.setBorder(null);
        _32_35_Button.setBorderPainted(false);
        _32_35_Button.setContentAreaFilled(false);
        _32_35_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _32_35_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _32_35_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _32_35_Button.setName(""); // NOI18N
        _32_35_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _32_35_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_32_35_Button);
        _32_35_Button.setBounds(990, 212, 30, 30);

        _1_4_Button.setToolTipText("");
        _1_4_Button.setBorder(null);
        _1_4_Button.setBorderPainted(false);
        _1_4_Button.setContentAreaFilled(false);
        _1_4_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _1_4_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _1_4_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _1_4_Button.setName(""); // NOI18N
        _1_4_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_4_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_1_4_Button);
        _1_4_Button.setBounds(566, 277, 30, 30);

        _4_7_Button.setToolTipText("");
        _4_7_Button.setBorder(null);
        _4_7_Button.setBorderPainted(false);
        _4_7_Button.setContentAreaFilled(false);
        _4_7_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _4_7_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _4_7_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _4_7_Button.setName(""); // NOI18N
        _4_7_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_7_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_4_7_Button);
        _4_7_Button.setBounds(608, 277, 30, 30);

        _7_10_Button.setToolTipText("");
        _7_10_Button.setBorder(null);
        _7_10_Button.setBorderPainted(false);
        _7_10_Button.setContentAreaFilled(false);
        _7_10_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _7_10_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _7_10_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _7_10_Button.setName(""); // NOI18N
        _7_10_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_10_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_7_10_Button);
        _7_10_Button.setBounds(651, 277, 30, 30);

        _10_13_Button.setToolTipText("");
        _10_13_Button.setBorder(null);
        _10_13_Button.setBorderPainted(false);
        _10_13_Button.setContentAreaFilled(false);
        _10_13_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _10_13_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _10_13_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _10_13_Button.setName(""); // NOI18N
        _10_13_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _10_13_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_10_13_Button);
        _10_13_Button.setBounds(693, 277, 30, 30);

        _13_16_Button.setToolTipText("");
        _13_16_Button.setBorder(null);
        _13_16_Button.setBorderPainted(false);
        _13_16_Button.setContentAreaFilled(false);
        _13_16_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _13_16_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _13_16_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _13_16_Button.setName(""); // NOI18N
        _13_16_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _13_16_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_13_16_Button);
        _13_16_Button.setBounds(735, 277, 30, 30);

        _16_19_Button.setToolTipText("");
        _16_19_Button.setBorder(null);
        _16_19_Button.setBorderPainted(false);
        _16_19_Button.setContentAreaFilled(false);
        _16_19_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _16_19_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _16_19_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _16_19_Button.setName(""); // NOI18N
        _16_19_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _16_19_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_16_19_Button);
        _16_19_Button.setBounds(777, 277, 30, 30);

        _19_22_Button.setToolTipText("");
        _19_22_Button.setBorder(null);
        _19_22_Button.setBorderPainted(false);
        _19_22_Button.setContentAreaFilled(false);
        _19_22_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _19_22_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _19_22_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _19_22_Button.setName(""); // NOI18N
        _19_22_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _19_22_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_19_22_Button);
        _19_22_Button.setBounds(820, 277, 30, 30);

        _22_25_Button.setToolTipText("");
        _22_25_Button.setBorder(null);
        _22_25_Button.setBorderPainted(false);
        _22_25_Button.setContentAreaFilled(false);
        _22_25_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _22_25_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _22_25_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _22_25_Button.setName(""); // NOI18N
        _22_25_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _22_25_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_22_25_Button);
        _22_25_Button.setBounds(862, 277, 30, 30);

        _25_28_Button.setToolTipText("");
        _25_28_Button.setBorder(null);
        _25_28_Button.setBorderPainted(false);
        _25_28_Button.setContentAreaFilled(false);
        _25_28_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _25_28_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _25_28_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _25_28_Button.setName(""); // NOI18N
        _25_28_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _25_28_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_25_28_Button);
        _25_28_Button.setBounds(905, 277, 30, 30);

        _28_31_Button.setToolTipText("");
        _28_31_Button.setBorder(null);
        _28_31_Button.setBorderPainted(false);
        _28_31_Button.setContentAreaFilled(false);
        _28_31_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _28_31_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _28_31_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _28_31_Button.setName(""); // NOI18N
        _28_31_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _28_31_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_28_31_Button);
        _28_31_Button.setBounds(947, 277, 30, 30);

        _31_34_Button.setToolTipText("");
        _31_34_Button.setBorder(null);
        _31_34_Button.setBorderPainted(false);
        _31_34_Button.setContentAreaFilled(false);
        _31_34_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _31_34_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _31_34_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _31_34_Button.setName(""); // NOI18N
        _31_34_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _31_34_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_31_34_Button);
        _31_34_Button.setBounds(990, 277, 30, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Ставка: ");
        maskPanel.add(jLabel1);
        jLabel1.setBounds(660, 50, 160, 30);

        _1_2_Button.setToolTipText("");
        _1_2_Button.setBorder(null);
        _1_2_Button.setBorderPainted(false);
        _1_2_Button.setContentAreaFilled(false);
        _1_2_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _1_2_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _1_2_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _1_2_Button.setName(""); // NOI18N
        _1_2_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_2_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_1_2_Button);
        _1_2_Button.setBounds(543, 246, 30, 30);

        _4_5_Button.setToolTipText("");
        _4_5_Button.setBorder(null);
        _4_5_Button.setBorderPainted(false);
        _4_5_Button.setContentAreaFilled(false);
        _4_5_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _4_5_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _4_5_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _4_5_Button.setName(""); // NOI18N
        _4_5_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_5_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_4_5_Button);
        _4_5_Button.setBounds(586, 246, 30, 30);

        _7_8_Button.setToolTipText("");
        _7_8_Button.setBorder(null);
        _7_8_Button.setBorderPainted(false);
        _7_8_Button.setContentAreaFilled(false);
        _7_8_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _7_8_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _7_8_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _7_8_Button.setName(""); // NOI18N
        _7_8_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_8_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_7_8_Button);
        _7_8_Button.setBounds(629, 246, 30, 30);

        _10_11_Button.setToolTipText("");
        _10_11_Button.setBorder(null);
        _10_11_Button.setBorderPainted(false);
        _10_11_Button.setContentAreaFilled(false);
        _10_11_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _10_11_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _10_11_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _10_11_Button.setName(""); // NOI18N
        _10_11_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _10_11_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_10_11_Button);
        _10_11_Button.setBounds(671, 246, 30, 30);

        _13_14_Button.setToolTipText("");
        _13_14_Button.setBorder(null);
        _13_14_Button.setBorderPainted(false);
        _13_14_Button.setContentAreaFilled(false);
        _13_14_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _13_14_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _13_14_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _13_14_Button.setName(""); // NOI18N
        _13_14_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _13_14_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_13_14_Button);
        _13_14_Button.setBounds(713, 246, 30, 30);

        _16_17_Button.setToolTipText("");
        _16_17_Button.setBorder(null);
        _16_17_Button.setBorderPainted(false);
        _16_17_Button.setContentAreaFilled(false);
        _16_17_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _16_17_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _16_17_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _16_17_Button.setName(""); // NOI18N
        _16_17_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _16_17_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_16_17_Button);
        _16_17_Button.setBounds(755, 246, 30, 30);

        _19_20_Button.setToolTipText("");
        _19_20_Button.setBorder(null);
        _19_20_Button.setBorderPainted(false);
        _19_20_Button.setContentAreaFilled(false);
        _19_20_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _19_20_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _19_20_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _19_20_Button.setName(""); // NOI18N
        _19_20_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _19_20_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_19_20_Button);
        _19_20_Button.setBounds(798, 246, 30, 30);

        _22_23_Button.setToolTipText("");
        _22_23_Button.setBorder(null);
        _22_23_Button.setBorderPainted(false);
        _22_23_Button.setContentAreaFilled(false);
        _22_23_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _22_23_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _22_23_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _22_23_Button.setName(""); // NOI18N
        _22_23_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _22_23_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_22_23_Button);
        _22_23_Button.setBounds(841, 246, 30, 30);

        _25_26_Button.setToolTipText("");
        _25_26_Button.setBorder(null);
        _25_26_Button.setBorderPainted(false);
        _25_26_Button.setContentAreaFilled(false);
        _25_26_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _25_26_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _25_26_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _25_26_Button.setName(""); // NOI18N
        _25_26_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _25_26_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_25_26_Button);
        _25_26_Button.setBounds(883, 246, 30, 30);

        _28_29_Button.setToolTipText("");
        _28_29_Button.setBorder(null);
        _28_29_Button.setBorderPainted(false);
        _28_29_Button.setContentAreaFilled(false);
        _28_29_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _28_29_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _28_29_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _28_29_Button.setName(""); // NOI18N
        _28_29_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _28_29_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_28_29_Button);
        _28_29_Button.setBounds(925, 246, 30, 30);

        _31_32_Button.setToolTipText("");
        _31_32_Button.setBorder(null);
        _31_32_Button.setBorderPainted(false);
        _31_32_Button.setContentAreaFilled(false);
        _31_32_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _31_32_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _31_32_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _31_32_Button.setName(""); // NOI18N
        _31_32_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _31_32_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_31_32_Button);
        _31_32_Button.setBounds(967, 246, 30, 30);

        _34_35_Button.setToolTipText("");
        _34_35_Button.setBorder(null);
        _34_35_Button.setBorderPainted(false);
        _34_35_Button.setContentAreaFilled(false);
        _34_35_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _34_35_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _34_35_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _34_35_Button.setName(""); // NOI18N
        _34_35_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _34_35_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_34_35_Button);
        _34_35_Button.setBounds(1010, 246, 30, 30);

        _1_2_4_5_Button.setToolTipText("");
        _1_2_4_5_Button.setBorder(null);
        _1_2_4_5_Button.setBorderPainted(false);
        _1_2_4_5_Button.setContentAreaFilled(false);
        _1_2_4_5_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _1_2_4_5_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _1_2_4_5_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _1_2_4_5_Button.setName(""); // NOI18N
        _1_2_4_5_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _1_2_4_5_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_1_2_4_5_Button);
        _1_2_4_5_Button.setBounds(565, 246, 30, 30);

        _4_5_7_8_Button.setToolTipText("");
        _4_5_7_8_Button.setBorder(null);
        _4_5_7_8_Button.setBorderPainted(false);
        _4_5_7_8_Button.setContentAreaFilled(false);
        _4_5_7_8_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _4_5_7_8_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _4_5_7_8_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _4_5_7_8_Button.setName(""); // NOI18N
        _4_5_7_8_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _4_5_7_8_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_4_5_7_8_Button);
        _4_5_7_8_Button.setBounds(607, 246, 30, 30);

        _7_8_10_11_Button.setToolTipText("");
        _7_8_10_11_Button.setBorder(null);
        _7_8_10_11_Button.setBorderPainted(false);
        _7_8_10_11_Button.setContentAreaFilled(false);
        _7_8_10_11_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _7_8_10_11_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _7_8_10_11_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _7_8_10_11_Button.setName(""); // NOI18N
        _7_8_10_11_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _7_8_10_11_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_7_8_10_11_Button);
        _7_8_10_11_Button.setBounds(650, 246, 30, 30);

        _10_11_13_14_Button.setToolTipText("");
        _10_11_13_14_Button.setBorder(null);
        _10_11_13_14_Button.setBorderPainted(false);
        _10_11_13_14_Button.setContentAreaFilled(false);
        _10_11_13_14_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _10_11_13_14_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _10_11_13_14_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _10_11_13_14_Button.setName(""); // NOI18N
        _10_11_13_14_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _10_11_13_14_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_10_11_13_14_Button);
        _10_11_13_14_Button.setBounds(692, 246, 30, 30);

        _13_14_16_17_Button.setToolTipText("");
        _13_14_16_17_Button.setBorder(null);
        _13_14_16_17_Button.setBorderPainted(false);
        _13_14_16_17_Button.setContentAreaFilled(false);
        _13_14_16_17_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _13_14_16_17_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _13_14_16_17_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _13_14_16_17_Button.setName(""); // NOI18N
        _13_14_16_17_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _13_14_16_17_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_13_14_16_17_Button);
        _13_14_16_17_Button.setBounds(734, 246, 30, 30);

        _16_17_19_20_Button.setToolTipText("");
        _16_17_19_20_Button.setBorder(null);
        _16_17_19_20_Button.setBorderPainted(false);
        _16_17_19_20_Button.setContentAreaFilled(false);
        _16_17_19_20_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _16_17_19_20_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _16_17_19_20_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _16_17_19_20_Button.setName(""); // NOI18N
        _16_17_19_20_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _16_17_19_20_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_16_17_19_20_Button);
        _16_17_19_20_Button.setBounds(776, 246, 30, 30);

        _19_20_22_23_Button.setToolTipText("");
        _19_20_22_23_Button.setBorder(null);
        _19_20_22_23_Button.setBorderPainted(false);
        _19_20_22_23_Button.setContentAreaFilled(false);
        _19_20_22_23_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _19_20_22_23_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _19_20_22_23_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _19_20_22_23_Button.setName(""); // NOI18N
        _19_20_22_23_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _19_20_22_23_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_19_20_22_23_Button);
        _19_20_22_23_Button.setBounds(819, 246, 30, 30);

        _22_23_25_26_Button.setToolTipText("");
        _22_23_25_26_Button.setBorder(null);
        _22_23_25_26_Button.setBorderPainted(false);
        _22_23_25_26_Button.setContentAreaFilled(false);
        _22_23_25_26_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _22_23_25_26_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _22_23_25_26_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _22_23_25_26_Button.setName(""); // NOI18N
        _22_23_25_26_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _22_23_25_26_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_22_23_25_26_Button);
        _22_23_25_26_Button.setBounds(862, 246, 30, 30);

        _25_26_28_29_Button.setToolTipText("");
        _25_26_28_29_Button.setBorder(null);
        _25_26_28_29_Button.setBorderPainted(false);
        _25_26_28_29_Button.setContentAreaFilled(false);
        _25_26_28_29_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _25_26_28_29_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _25_26_28_29_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _25_26_28_29_Button.setName(""); // NOI18N
        _25_26_28_29_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _25_26_28_29_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_25_26_28_29_Button);
        _25_26_28_29_Button.setBounds(904, 246, 30, 30);

        _28_29_31_32_Button.setToolTipText("");
        _28_29_31_32_Button.setBorder(null);
        _28_29_31_32_Button.setBorderPainted(false);
        _28_29_31_32_Button.setContentAreaFilled(false);
        _28_29_31_32_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _28_29_31_32_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _28_29_31_32_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _28_29_31_32_Button.setName(""); // NOI18N
        _28_29_31_32_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _28_29_31_32_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_28_29_31_32_Button);
        _28_29_31_32_Button.setBounds(946, 246, 30, 30);

        _31_32_34_35_Button.setToolTipText("");
        _31_32_34_35_Button.setBorder(null);
        _31_32_34_35_Button.setBorderPainted(false);
        _31_32_34_35_Button.setContentAreaFilled(false);
        _31_32_34_35_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _31_32_34_35_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _31_32_34_35_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _31_32_34_35_Button.setName(""); // NOI18N
        _31_32_34_35_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _31_32_34_35_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_31_32_34_35_Button);
        _31_32_34_35_Button.setBounds(988, 246, 30, 30);

        _2_3_Button.setToolTipText("");
        _2_3_Button.setBorder(null);
        _2_3_Button.setBorderPainted(false);
        _2_3_Button.setContentAreaFilled(false);
        _2_3_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _2_3_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _2_3_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _2_3_Button.setName(""); // NOI18N
        _2_3_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_3_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_2_3_Button);
        _2_3_Button.setBounds(543, 180, 30, 30);

        _5_6_Button.setToolTipText("");
        _5_6_Button.setBorder(null);
        _5_6_Button.setBorderPainted(false);
        _5_6_Button.setContentAreaFilled(false);
        _5_6_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _5_6_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _5_6_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _5_6_Button.setName(""); // NOI18N
        _5_6_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_6_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_5_6_Button);
        _5_6_Button.setBounds(586, 180, 30, 30);

        _8_9_Button.setToolTipText("");
        _8_9_Button.setBorder(null);
        _8_9_Button.setBorderPainted(false);
        _8_9_Button.setContentAreaFilled(false);
        _8_9_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _8_9_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _8_9_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _8_9_Button.setName(""); // NOI18N
        _8_9_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_9_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_8_9_Button);
        _8_9_Button.setBounds(629, 180, 30, 30);

        _11_12_Button.setToolTipText("");
        _11_12_Button.setBorder(null);
        _11_12_Button.setBorderPainted(false);
        _11_12_Button.setContentAreaFilled(false);
        _11_12_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _11_12_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _11_12_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _11_12_Button.setName(""); // NOI18N
        _11_12_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _11_12_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_11_12_Button);
        _11_12_Button.setBounds(671, 180, 30, 30);

        _14_15_Button.setToolTipText("");
        _14_15_Button.setBorder(null);
        _14_15_Button.setBorderPainted(false);
        _14_15_Button.setContentAreaFilled(false);
        _14_15_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _14_15_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _14_15_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _14_15_Button.setName(""); // NOI18N
        _14_15_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _14_15_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_14_15_Button);
        _14_15_Button.setBounds(713, 180, 30, 30);

        _17_18_Button.setToolTipText("");
        _17_18_Button.setBorder(null);
        _17_18_Button.setBorderPainted(false);
        _17_18_Button.setContentAreaFilled(false);
        _17_18_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _17_18_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _17_18_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _17_18_Button.setName(""); // NOI18N
        _17_18_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _17_18_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_17_18_Button);
        _17_18_Button.setBounds(755, 180, 30, 30);

        _20_21_Button.setToolTipText("");
        _20_21_Button.setBorder(null);
        _20_21_Button.setBorderPainted(false);
        _20_21_Button.setContentAreaFilled(false);
        _20_21_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _20_21_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _20_21_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _20_21_Button.setName(""); // NOI18N
        _20_21_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _20_21_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_20_21_Button);
        _20_21_Button.setBounds(798, 180, 30, 30);

        _23_24_Button.setToolTipText("");
        _23_24_Button.setBorder(null);
        _23_24_Button.setBorderPainted(false);
        _23_24_Button.setContentAreaFilled(false);
        _23_24_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _23_24_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _23_24_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _23_24_Button.setName(""); // NOI18N
        _23_24_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _23_24_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_23_24_Button);
        _23_24_Button.setBounds(841, 180, 30, 30);

        _26_27_Button.setToolTipText("");
        _26_27_Button.setBorder(null);
        _26_27_Button.setBorderPainted(false);
        _26_27_Button.setContentAreaFilled(false);
        _26_27_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _26_27_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _26_27_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _26_27_Button.setName(""); // NOI18N
        _26_27_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _26_27_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_26_27_Button);
        _26_27_Button.setBounds(883, 180, 30, 30);

        _29_30_Button.setToolTipText("");
        _29_30_Button.setBorder(null);
        _29_30_Button.setBorderPainted(false);
        _29_30_Button.setContentAreaFilled(false);
        _29_30_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _29_30_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _29_30_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _29_30_Button.setName(""); // NOI18N
        _29_30_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _29_30_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_29_30_Button);
        _29_30_Button.setBounds(925, 180, 30, 30);

        _32_33_Button.setToolTipText("");
        _32_33_Button.setBorder(null);
        _32_33_Button.setBorderPainted(false);
        _32_33_Button.setContentAreaFilled(false);
        _32_33_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _32_33_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _32_33_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _32_33_Button.setName(""); // NOI18N
        _32_33_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _32_33_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_32_33_Button);
        _32_33_Button.setBounds(967, 180, 30, 30);

        _35_36_Button.setToolTipText("");
        _35_36_Button.setBorder(null);
        _35_36_Button.setBorderPainted(false);
        _35_36_Button.setContentAreaFilled(false);
        _35_36_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _35_36_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _35_36_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _35_36_Button.setName(""); // NOI18N
        _35_36_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _35_36_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_35_36_Button);
        _35_36_Button.setBounds(1010, 180, 30, 30);

        _2_3_5_6_Button.setToolTipText("");
        _2_3_5_6_Button.setBorder(null);
        _2_3_5_6_Button.setBorderPainted(false);
        _2_3_5_6_Button.setContentAreaFilled(false);
        _2_3_5_6_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _2_3_5_6_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _2_3_5_6_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _2_3_5_6_Button.setName(""); // NOI18N
        _2_3_5_6_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _2_3_5_6_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_2_3_5_6_Button);
        _2_3_5_6_Button.setBounds(565, 180, 30, 30);

        _5_6_8_9_Button.setToolTipText("");
        _5_6_8_9_Button.setBorder(null);
        _5_6_8_9_Button.setBorderPainted(false);
        _5_6_8_9_Button.setContentAreaFilled(false);
        _5_6_8_9_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _5_6_8_9_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _5_6_8_9_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _5_6_8_9_Button.setName(""); // NOI18N
        _5_6_8_9_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _5_6_8_9_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_5_6_8_9_Button);
        _5_6_8_9_Button.setBounds(607, 180, 30, 30);

        _8_9_11_12_Button.setToolTipText("");
        _8_9_11_12_Button.setBorder(null);
        _8_9_11_12_Button.setBorderPainted(false);
        _8_9_11_12_Button.setContentAreaFilled(false);
        _8_9_11_12_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _8_9_11_12_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _8_9_11_12_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _8_9_11_12_Button.setName(""); // NOI18N
        _8_9_11_12_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _8_9_11_12_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_8_9_11_12_Button);
        _8_9_11_12_Button.setBounds(650, 180, 30, 30);

        _11_12_14_15_Button.setToolTipText("");
        _11_12_14_15_Button.setBorder(null);
        _11_12_14_15_Button.setBorderPainted(false);
        _11_12_14_15_Button.setContentAreaFilled(false);
        _11_12_14_15_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _11_12_14_15_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _11_12_14_15_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _11_12_14_15_Button.setName(""); // NOI18N
        _11_12_14_15_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _11_12_14_15_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_11_12_14_15_Button);
        _11_12_14_15_Button.setBounds(692, 180, 30, 30);

        _14_15_17_18_Button.setToolTipText("");
        _14_15_17_18_Button.setBorder(null);
        _14_15_17_18_Button.setBorderPainted(false);
        _14_15_17_18_Button.setContentAreaFilled(false);
        _14_15_17_18_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _14_15_17_18_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _14_15_17_18_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _14_15_17_18_Button.setName(""); // NOI18N
        _14_15_17_18_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _14_15_17_18_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_14_15_17_18_Button);
        _14_15_17_18_Button.setBounds(734, 180, 30, 30);

        _17_18_20_21_Button.setToolTipText("");
        _17_18_20_21_Button.setBorder(null);
        _17_18_20_21_Button.setBorderPainted(false);
        _17_18_20_21_Button.setContentAreaFilled(false);
        _17_18_20_21_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _17_18_20_21_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _17_18_20_21_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _17_18_20_21_Button.setName(""); // NOI18N
        _17_18_20_21_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _17_18_20_21_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_17_18_20_21_Button);
        _17_18_20_21_Button.setBounds(776, 180, 30, 30);

        _20_21_23_24_Button.setToolTipText("");
        _20_21_23_24_Button.setBorder(null);
        _20_21_23_24_Button.setBorderPainted(false);
        _20_21_23_24_Button.setContentAreaFilled(false);
        _20_21_23_24_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _20_21_23_24_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _20_21_23_24_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _20_21_23_24_Button.setName(""); // NOI18N
        _20_21_23_24_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _20_21_23_24_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_20_21_23_24_Button);
        _20_21_23_24_Button.setBounds(819, 180, 30, 30);

        _23_24_26_27_Button.setToolTipText("");
        _23_24_26_27_Button.setBorder(null);
        _23_24_26_27_Button.setBorderPainted(false);
        _23_24_26_27_Button.setContentAreaFilled(false);
        _23_24_26_27_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _23_24_26_27_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _23_24_26_27_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _23_24_26_27_Button.setName(""); // NOI18N
        _23_24_26_27_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _23_24_26_27_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_23_24_26_27_Button);
        _23_24_26_27_Button.setBounds(862, 180, 30, 30);

        _26_27_29_30_Button.setToolTipText("");
        _26_27_29_30_Button.setBorder(null);
        _26_27_29_30_Button.setBorderPainted(false);
        _26_27_29_30_Button.setContentAreaFilled(false);
        _26_27_29_30_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _26_27_29_30_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _26_27_29_30_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _26_27_29_30_Button.setName(""); // NOI18N
        _26_27_29_30_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _26_27_29_30_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_26_27_29_30_Button);
        _26_27_29_30_Button.setBounds(904, 180, 30, 30);

        _29_30_32_33_Button.setToolTipText("");
        _29_30_32_33_Button.setBorder(null);
        _29_30_32_33_Button.setBorderPainted(false);
        _29_30_32_33_Button.setContentAreaFilled(false);
        _29_30_32_33_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _29_30_32_33_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _29_30_32_33_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _29_30_32_33_Button.setName(""); // NOI18N
        _29_30_32_33_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _29_30_32_33_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_29_30_32_33_Button);
        _29_30_32_33_Button.setBounds(946, 180, 30, 30);

        _32_33_35_36_Button.setToolTipText("");
        _32_33_35_36_Button.setBorder(null);
        _32_33_35_36_Button.setBorderPainted(false);
        _32_33_35_36_Button.setContentAreaFilled(false);
        _32_33_35_36_Button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _32_33_35_36_Button.setMaximumSize(new java.awt.Dimension(30, 30));
        _32_33_35_36_Button.setMinimumSize(new java.awt.Dimension(30, 30));
        _32_33_35_36_Button.setName(""); // NOI18N
        _32_33_35_36_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _32_33_35_36_ButtonActionPerformed(evt);
            }
        });
        maskPanel.add(_32_33_35_36_Button);
        _32_33_35_36_Button.setBounds(988, 180, 30, 30);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(maskPanel, gridBagConstraints);

        mainFountLabel.setBackground(new java.awt.Color(51, 102, 0));
        mainFountLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/field.png"))); // NOI18N
        mainFountLabel.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(mainFountLabel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _3_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_ButtonActionPerformed
        _3_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _3_Button.setText(Integer.toString(buttonCounter[0]));
        buttonCounter[0]++;
        stav+=100;
        jLabel1.setText("Ставка: "+stav);
    }//GEN-LAST:event__3_ButtonActionPerformed

    private void _6_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_ButtonActionPerformed
        _6_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _6_Button.setText(Integer.toString(buttonCounter[1]));
        buttonCounter[1]++;
    }//GEN-LAST:event__6_ButtonActionPerformed

    private void _3_6_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_6_ButtonActionPerformed
        _3_6_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _3_6_Button.setText(Integer.toString(buttonCounter[2]));
        buttonCounter[2]++;    }//GEN-LAST:event__3_6_ButtonActionPerformed

    private void _6_9_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_9_ButtonActionPerformed
        _6_9_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _6_9_Button.setText(Integer.toString(buttonCounter[3]));
        buttonCounter[3]++;    }//GEN-LAST:event__6_9_ButtonActionPerformed

    private void _9_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_ButtonActionPerformed
        _9_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _9_Button.setText(Integer.toString(buttonCounter[4]));
        buttonCounter[4]++;    }//GEN-LAST:event__9_ButtonActionPerformed

    private void _9_12_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_12_ButtonActionPerformed
        _9_12_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _9_12_Button.setText(Integer.toString(buttonCounter[5]));
        buttonCounter[5]++;    }//GEN-LAST:event__9_12_ButtonActionPerformed

    private void _12_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__12_ButtonActionPerformed
        _12_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _12_Button.setText(Integer.toString(buttonCounter[6]));
        buttonCounter[6]++;    }//GEN-LAST:event__12_ButtonActionPerformed

    private void _12_15_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__12_15_ButtonActionPerformed
        _12_15_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _12_15_Button.setText(Integer.toString(buttonCounter[7]));
        buttonCounter[7]++;    }//GEN-LAST:event__12_15_ButtonActionPerformed

    private void _15_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__15_ButtonActionPerformed
        _15_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _15_Button.setText(Integer.toString(buttonCounter[8]));
        buttonCounter[8]++;    }//GEN-LAST:event__15_ButtonActionPerformed

    private void _15_18_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__15_18_ButtonActionPerformed
        _15_18_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _15_18_Button.setText(Integer.toString(buttonCounter[9]));
        buttonCounter[9]++;    }//GEN-LAST:event__15_18_ButtonActionPerformed

    private void _18_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__18_ButtonActionPerformed
        _18_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _18_Button.setText(Integer.toString(buttonCounter[10]));
        buttonCounter[10]++;    }//GEN-LAST:event__18_ButtonActionPerformed

    private void _18_21_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__18_21_ButtonActionPerformed
        _18_21_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _18_21_Button.setText(Integer.toString(buttonCounter[11]));
        buttonCounter[11]++;    }//GEN-LAST:event__18_21_ButtonActionPerformed

    private void _21_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__21_ButtonActionPerformed
        _21_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _21_Button.setText(Integer.toString(buttonCounter[12]));
        buttonCounter[12]++;    }//GEN-LAST:event__21_ButtonActionPerformed

    private void _21_24_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__21_24_ButtonActionPerformed
        _21_24_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _21_24_Button.setText(Integer.toString(buttonCounter[13]));
        buttonCounter[13]++;    }//GEN-LAST:event__21_24_ButtonActionPerformed

    private void _24_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__24_ButtonActionPerformed
        _24_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _24_Button.setText(Integer.toString(buttonCounter[14]));
        buttonCounter[14]++;    }//GEN-LAST:event__24_ButtonActionPerformed

    private void _24_27_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__24_27_ButtonActionPerformed
        _24_27_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _24_27_Button.setText(Integer.toString(buttonCounter[15]));
        buttonCounter[15]++;    }//GEN-LAST:event__24_27_ButtonActionPerformed

    private void _27_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__27_ButtonActionPerformed
        _27_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _27_Button.setText(Integer.toString(buttonCounter[16]));
        buttonCounter[16]++;    }//GEN-LAST:event__27_ButtonActionPerformed

    private void _27_30_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__27_30_ButtonActionPerformed
        _27_30_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _27_30_Button.setText(Integer.toString(buttonCounter[17]));
        buttonCounter[17]++;    }//GEN-LAST:event__27_30_ButtonActionPerformed

    private void _30_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__30_ButtonActionPerformed
        _30_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _30_Button.setText(Integer.toString(buttonCounter[18]));
        buttonCounter[18]++;    }//GEN-LAST:event__30_ButtonActionPerformed

    private void _30_33_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__30_33_ButtonActionPerformed
        _30_33_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _30_33_Button.setText(Integer.toString(buttonCounter[19]));
        buttonCounter[19]++;    }//GEN-LAST:event__30_33_ButtonActionPerformed

    private void _33_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__33_ButtonActionPerformed
        _33_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _33_Button.setText(Integer.toString(buttonCounter[20]));
        buttonCounter[20]++;    }//GEN-LAST:event__33_ButtonActionPerformed

    private void _33_36_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__33_36_ButtonActionPerformed
        _33_36_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _33_36_Button.setText(Integer.toString(buttonCounter[21]));
        buttonCounter[21]++;    }//GEN-LAST:event__33_36_ButtonActionPerformed

    private void _36_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__36_ButtonActionPerformed
        _36_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _36_Button.setText(Integer.toString(buttonCounter[22]));
        buttonCounter[22]++;    }//GEN-LAST:event__36_ButtonActionPerformed

    private void _2_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__2_ButtonActionPerformed

    private void _2_5_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_5_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__2_5_ButtonActionPerformed

    private void _5_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__5_ButtonActionPerformed

    private void _5_8_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_8_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__5_8_ButtonActionPerformed

    private void _8_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__8_ButtonActionPerformed

    private void _8_11_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_11_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__8_11_ButtonActionPerformed

    private void _11_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__11_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__11_ButtonActionPerformed

    private void _11_14_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__11_14_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__11_14_ButtonActionPerformed

    private void _14_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__14_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__14_ButtonActionPerformed

    private void _14_17_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__14_17_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__14_17_ButtonActionPerformed

    private void _17_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__17_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__17_ButtonActionPerformed

    private void _17_20_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__17_20_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__17_20_ButtonActionPerformed

    private void _20_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__20_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__20_ButtonActionPerformed

    private void _20_23_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__20_23_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__20_23_ButtonActionPerformed

    private void _23_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__23_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__23_ButtonActionPerformed

    private void _23_26_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__23_26_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__23_26_ButtonActionPerformed

    private void _26_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__26_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__26_ButtonActionPerformed

    private void _26_29_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__26_29_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__26_29_ButtonActionPerformed

    private void _29_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__29_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__29_ButtonActionPerformed

    private void _29_32_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__29_32_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__29_32_ButtonActionPerformed

    private void _32_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__32_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__32_ButtonActionPerformed

    private void _32_35_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__32_35_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__32_35_ButtonActionPerformed

    private void _35_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__35_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__35_ButtonActionPerformed

    private void _1_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__1_ButtonActionPerformed

    private void _1_4_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_4_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__1_4_ButtonActionPerformed

    private void _4_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__4_ButtonActionPerformed

    private void _4_7_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_7_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__4_7_ButtonActionPerformed

    private void _7_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__7_ButtonActionPerformed

    private void _7_10_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_10_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__7_10_ButtonActionPerformed

    private void _10_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__10_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__10_ButtonActionPerformed

    private void _10_13_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__10_13_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__10_13_ButtonActionPerformed

    private void _13_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__13_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__13_ButtonActionPerformed

    private void _13_16_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__13_16_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__13_16_ButtonActionPerformed

    private void _16_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__16_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__16_ButtonActionPerformed

    private void _16_19_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__16_19_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__16_19_ButtonActionPerformed

    private void _19_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__19_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__19_ButtonActionPerformed

    private void _19_22_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__19_22_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__19_22_ButtonActionPerformed

    private void _22_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__22_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__22_ButtonActionPerformed

    private void _22_25_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__22_25_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__22_25_ButtonActionPerformed

    private void _25_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__25_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__25_ButtonActionPerformed

    private void _25_28_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__25_28_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__25_28_ButtonActionPerformed

    private void _28_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__28_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__28_ButtonActionPerformed

    private void _28_31_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__28_31_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__28_31_ButtonActionPerformed

    private void _31_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__31_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__31_ButtonActionPerformed

    private void _31_34_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__31_34_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__31_34_ButtonActionPerformed

    private void _34_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__34_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__34_ButtonActionPerformed

    private void _00_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__00_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__00_ButtonActionPerformed

    private void _0_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__0_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__0_ButtonActionPerformed

    private void _1_2_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_2_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__1_2_ButtonActionPerformed

    private void _1_2_4_5_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__1_2_4_5_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__1_2_4_5_ButtonActionPerformed

    private void _4_5_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_5_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__4_5_ButtonActionPerformed

    private void _4_5_7_8_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__4_5_7_8_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__4_5_7_8_ButtonActionPerformed

    private void _7_8_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_8_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__7_8_ButtonActionPerformed

    private void _7_8_10_11_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__7_8_10_11_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__7_8_10_11_ButtonActionPerformed

    private void _10_11_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__10_11_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__10_11_ButtonActionPerformed

    private void _10_11_13_14_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__10_11_13_14_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__10_11_13_14_ButtonActionPerformed

    private void _13_14_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__13_14_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__13_14_ButtonActionPerformed

    private void _16_17_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__16_17_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__16_17_ButtonActionPerformed

    private void _19_20_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__19_20_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__19_20_ButtonActionPerformed

    private void _22_23_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__22_23_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__22_23_ButtonActionPerformed

    private void _25_26_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__25_26_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__25_26_ButtonActionPerformed

    private void _28_29_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__28_29_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__28_29_ButtonActionPerformed

    private void _31_32_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__31_32_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__31_32_ButtonActionPerformed

    private void _34_35_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__34_35_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__34_35_ButtonActionPerformed

    private void _13_14_16_17_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__13_14_16_17_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__13_14_16_17_ButtonActionPerformed

    private void _16_17_19_20_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__16_17_19_20_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__16_17_19_20_ButtonActionPerformed

    private void _19_20_22_23_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__19_20_22_23_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__19_20_22_23_ButtonActionPerformed

    private void _22_23_25_26_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__22_23_25_26_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__22_23_25_26_ButtonActionPerformed

    private void _25_26_28_29_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__25_26_28_29_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__25_26_28_29_ButtonActionPerformed

    private void _28_29_31_32_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__28_29_31_32_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__28_29_31_32_ButtonActionPerformed

    private void _31_32_34_35_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__31_32_34_35_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__31_32_34_35_ButtonActionPerformed

    private void _2_3_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_3_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__2_3_ButtonActionPerformed

    private void _5_6_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_6_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__5_6_ButtonActionPerformed

    private void _8_9_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_9_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__8_9_ButtonActionPerformed

    private void _11_12_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__11_12_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__11_12_ButtonActionPerformed

    private void _14_15_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__14_15_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__14_15_ButtonActionPerformed

    private void _17_18_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__17_18_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__17_18_ButtonActionPerformed

    private void _20_21_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__20_21_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__20_21_ButtonActionPerformed

    private void _23_24_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__23_24_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__23_24_ButtonActionPerformed

    private void _26_27_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__26_27_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__26_27_ButtonActionPerformed

    private void _29_30_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__29_30_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__29_30_ButtonActionPerformed

    private void _32_33_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__32_33_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__32_33_ButtonActionPerformed

    private void _35_36_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__35_36_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__35_36_ButtonActionPerformed

    private void _2_3_5_6_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__2_3_5_6_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__2_3_5_6_ButtonActionPerformed

    private void _5_6_8_9_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__5_6_8_9_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__5_6_8_9_ButtonActionPerformed

    private void _8_9_11_12_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__8_9_11_12_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__8_9_11_12_ButtonActionPerformed

    private void _11_12_14_15_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__11_12_14_15_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__11_12_14_15_ButtonActionPerformed

    private void _14_15_17_18_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__14_15_17_18_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__14_15_17_18_ButtonActionPerformed

    private void _17_18_20_21_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__17_18_20_21_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__17_18_20_21_ButtonActionPerformed

    private void _20_21_23_24_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__20_21_23_24_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__20_21_23_24_ButtonActionPerformed

    private void _23_24_26_27_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__23_24_26_27_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__23_24_26_27_ButtonActionPerformed

    private void _26_27_29_30_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__26_27_29_30_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__26_27_29_30_ButtonActionPerformed

    private void _29_30_32_33_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__29_30_32_33_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__29_30_32_33_ButtonActionPerformed

    private void _32_33_35_36_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__32_33_35_36_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__32_33_35_36_ButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Roulette().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _00_Button;
    private javax.swing.JButton _0_Button;
    private javax.swing.JButton _10_11_13_14_Button;
    private javax.swing.JButton _10_11_Button;
    private javax.swing.JButton _10_13_Button;
    private javax.swing.JButton _10_Button;
    private javax.swing.JButton _11_12_14_15_Button;
    private javax.swing.JButton _11_12_Button;
    private javax.swing.JButton _11_14_Button;
    private javax.swing.JButton _11_Button;
    private javax.swing.JButton _12_15_Button;
    private javax.swing.JButton _12_Button;
    private javax.swing.JButton _13_14_16_17_Button;
    private javax.swing.JButton _13_14_Button;
    private javax.swing.JButton _13_16_Button;
    private javax.swing.JButton _13_Button;
    private javax.swing.JButton _14_15_17_18_Button;
    private javax.swing.JButton _14_15_Button;
    private javax.swing.JButton _14_17_Button;
    private javax.swing.JButton _14_Button;
    private javax.swing.JButton _15_18_Button;
    private javax.swing.JButton _15_Button;
    private javax.swing.JButton _16_17_19_20_Button;
    private javax.swing.JButton _16_17_Button;
    private javax.swing.JButton _16_19_Button;
    private javax.swing.JButton _16_Button;
    private javax.swing.JButton _17_18_20_21_Button;
    private javax.swing.JButton _17_18_Button;
    private javax.swing.JButton _17_20_Button;
    private javax.swing.JButton _17_Button;
    private javax.swing.JButton _18_21_Button;
    private javax.swing.JButton _18_Button;
    private javax.swing.JButton _19_20_22_23_Button;
    private javax.swing.JButton _19_20_Button;
    private javax.swing.JButton _19_22_Button;
    private javax.swing.JButton _19_Button;
    private javax.swing.JButton _1_2_4_5_Button;
    private javax.swing.JButton _1_2_Button;
    private javax.swing.JButton _1_4_Button;
    private javax.swing.JButton _1_Button;
    private javax.swing.JButton _20_21_23_24_Button;
    private javax.swing.JButton _20_21_Button;
    private javax.swing.JButton _20_23_Button;
    private javax.swing.JButton _20_Button;
    private javax.swing.JButton _21_24_Button;
    private javax.swing.JButton _21_Button;
    private javax.swing.JButton _22_23_25_26_Button;
    private javax.swing.JButton _22_23_Button;
    private javax.swing.JButton _22_25_Button;
    private javax.swing.JButton _22_Button;
    private javax.swing.JButton _23_24_26_27_Button;
    private javax.swing.JButton _23_24_Button;
    private javax.swing.JButton _23_26_Button;
    private javax.swing.JButton _23_Button;
    private javax.swing.JButton _24_27_Button;
    private javax.swing.JButton _24_Button;
    private javax.swing.JButton _25_26_28_29_Button;
    private javax.swing.JButton _25_26_Button;
    private javax.swing.JButton _25_28_Button;
    private javax.swing.JButton _25_Button;
    private javax.swing.JButton _26_27_29_30_Button;
    private javax.swing.JButton _26_27_Button;
    private javax.swing.JButton _26_29_Button;
    private javax.swing.JButton _26_Button;
    private javax.swing.JButton _27_30_Button;
    private javax.swing.JButton _27_Button;
    private javax.swing.JButton _28_29_31_32_Button;
    private javax.swing.JButton _28_29_Button;
    private javax.swing.JButton _28_31_Button;
    private javax.swing.JButton _28_Button;
    private javax.swing.JButton _29_30_32_33_Button;
    private javax.swing.JButton _29_30_Button;
    private javax.swing.JButton _29_32_Button;
    private javax.swing.JButton _29_Button;
    private javax.swing.JButton _2_3_5_6_Button;
    private javax.swing.JButton _2_3_Button;
    private javax.swing.JButton _2_5_Button;
    private javax.swing.JButton _2_Button;
    private javax.swing.JButton _30_33_Button;
    private javax.swing.JButton _30_Button;
    private javax.swing.JButton _31_32_34_35_Button;
    private javax.swing.JButton _31_32_Button;
    private javax.swing.JButton _31_34_Button;
    private javax.swing.JButton _31_Button;
    private javax.swing.JButton _32_33_35_36_Button;
    private javax.swing.JButton _32_33_Button;
    private javax.swing.JButton _32_35_Button;
    private javax.swing.JButton _32_Button;
    private javax.swing.JButton _33_36_Button;
    private javax.swing.JButton _33_Button;
    private javax.swing.JButton _34_35_Button;
    private javax.swing.JButton _34_Button;
    private javax.swing.JButton _35_36_Button;
    private javax.swing.JButton _35_Button;
    private javax.swing.JButton _36_Button;
    private javax.swing.JButton _3_6_Button;
    private javax.swing.JButton _3_Button;
    private javax.swing.JButton _4_5_7_8_Button;
    private javax.swing.JButton _4_5_Button;
    private javax.swing.JButton _4_7_Button;
    private javax.swing.JButton _4_Button;
    private javax.swing.JButton _5_6_8_9_Button;
    private javax.swing.JButton _5_6_Button;
    private javax.swing.JButton _5_8_Button;
    private javax.swing.JButton _5_Button;
    private javax.swing.JButton _6_9_Button;
    private javax.swing.JButton _6_Button;
    private javax.swing.JButton _7_10_Button;
    private javax.swing.JButton _7_8_10_11_Button;
    private javax.swing.JButton _7_8_Button;
    private javax.swing.JButton _7_Button;
    private javax.swing.JButton _8_11_Button;
    private javax.swing.JButton _8_9_11_12_Button;
    private javax.swing.JButton _8_9_Button;
    private javax.swing.JButton _8_Button;
    private javax.swing.JButton _9_12_Button;
    private javax.swing.JButton _9_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mainFountLabel;
    private javax.swing.JPanel maskPanel;
    // End of variables declaration//GEN-END:variables
}
