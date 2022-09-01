package mainPackage;

public class Roulette extends javax.swing.JFrame {

    int [] buttonCounter = new int [23];

    public Roulette() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        maskPanel = new javax.swing.JPanel();
        _3_RedButton = new javax.swing.JButton();
        _3_6_Button = new javax.swing.JButton();
        _6_BlackButton = new javax.swing.JButton();
        _6_9_Button = new javax.swing.JButton();
        _9_RedButton = new javax.swing.JButton();
        _9_12_Button = new javax.swing.JButton();
        _12_RedButton = new javax.swing.JButton();
        _12_15_Button = new javax.swing.JButton();
        _15_BlackButton = new javax.swing.JButton();
        _15_18_Button = new javax.swing.JButton();
        _18_RedButton = new javax.swing.JButton();
        _18_21_Button = new javax.swing.JButton();
        _21_RedButton = new javax.swing.JButton();
        _21_24_Button = new javax.swing.JButton();
        _24_BlackButton = new javax.swing.JButton();
        _24_27_Button = new javax.swing.JButton();
        _27_RedButton = new javax.swing.JButton();
        _27_30_Button = new javax.swing.JButton();
        _30_RedButton = new javax.swing.JButton();
        _30_33_Button = new javax.swing.JButton();
        _33_BlackButton = new javax.swing.JButton();
        _33_36_Button = new javax.swing.JButton();
        _36_RedButton = new javax.swing.JButton();
        mainFountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casino Roulette");
        setMaximumSize(new java.awt.Dimension(1500, 682));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        maskPanel.setOpaque(false);

        _3_RedButton.setToolTipText("");
        _3_RedButton.setBorder(null);
        _3_RedButton.setBorderPainted(false);
        _3_RedButton.setContentAreaFilled(false);
        _3_RedButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _3_RedButton.setMaximumSize(new java.awt.Dimension(30, 30));
        _3_RedButton.setMinimumSize(new java.awt.Dimension(30, 30));
        _3_RedButton.setName(""); // NOI18N
        _3_RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _3_RedButtonActionPerformed(evt);
            }
        });

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

        _6_BlackButton.setToolTipText("");
        _6_BlackButton.setBorder(null);
        _6_BlackButton.setBorderPainted(false);
        _6_BlackButton.setContentAreaFilled(false);
        _6_BlackButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _6_BlackButton.setMaximumSize(new java.awt.Dimension(30, 30));
        _6_BlackButton.setMinimumSize(new java.awt.Dimension(30, 30));
        _6_BlackButton.setName(""); // NOI18N
        _6_BlackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _6_BlackButtonActionPerformed(evt);
            }
        });

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

        _9_RedButton.setToolTipText("");
        _9_RedButton.setBorder(null);
        _9_RedButton.setBorderPainted(false);
        _9_RedButton.setContentAreaFilled(false);
        _9_RedButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _9_RedButton.setMaximumSize(new java.awt.Dimension(30, 30));
        _9_RedButton.setMinimumSize(new java.awt.Dimension(30, 30));
        _9_RedButton.setName(""); // NOI18N
        _9_RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _9_RedButtonActionPerformed(evt);
            }
        });

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

        _12_RedButton.setToolTipText("");
        _12_RedButton.setBorder(null);
        _12_RedButton.setBorderPainted(false);
        _12_RedButton.setContentAreaFilled(false);
        _12_RedButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _12_RedButton.setMaximumSize(new java.awt.Dimension(30, 30));
        _12_RedButton.setMinimumSize(new java.awt.Dimension(30, 30));
        _12_RedButton.setName(""); // NOI18N
        _12_RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _12_RedButtonActionPerformed(evt);
            }
        });

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

        _15_BlackButton.setToolTipText("");
        _15_BlackButton.setBorder(null);
        _15_BlackButton.setBorderPainted(false);
        _15_BlackButton.setContentAreaFilled(false);
        _15_BlackButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _15_BlackButton.setMaximumSize(new java.awt.Dimension(30, 30));
        _15_BlackButton.setMinimumSize(new java.awt.Dimension(30, 30));
        _15_BlackButton.setName(""); // NOI18N
        _15_BlackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _15_BlackButtonActionPerformed(evt);
            }
        });

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

        _18_RedButton.setToolTipText("");
        _18_RedButton.setBorder(null);
        _18_RedButton.setBorderPainted(false);
        _18_RedButton.setContentAreaFilled(false);
        _18_RedButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _18_RedButton.setMaximumSize(new java.awt.Dimension(30, 30));
        _18_RedButton.setMinimumSize(new java.awt.Dimension(30, 30));
        _18_RedButton.setName(""); // NOI18N
        _18_RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _18_RedButtonActionPerformed(evt);
            }
        });

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

        _21_RedButton.setToolTipText("");
        _21_RedButton.setBorder(null);
        _21_RedButton.setBorderPainted(false);
        _21_RedButton.setContentAreaFilled(false);
        _21_RedButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _21_RedButton.setMaximumSize(new java.awt.Dimension(30, 30));
        _21_RedButton.setMinimumSize(new java.awt.Dimension(30, 30));
        _21_RedButton.setName(""); // NOI18N
        _21_RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _21_RedButtonActionPerformed(evt);
            }
        });

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

        _24_BlackButton.setToolTipText("");
        _24_BlackButton.setBorder(null);
        _24_BlackButton.setBorderPainted(false);
        _24_BlackButton.setContentAreaFilled(false);
        _24_BlackButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _24_BlackButton.setMaximumSize(new java.awt.Dimension(30, 30));
        _24_BlackButton.setMinimumSize(new java.awt.Dimension(30, 30));
        _24_BlackButton.setName(""); // NOI18N
        _24_BlackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _24_BlackButtonActionPerformed(evt);
            }
        });

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

        _27_RedButton.setToolTipText("");
        _27_RedButton.setBorder(null);
        _27_RedButton.setBorderPainted(false);
        _27_RedButton.setContentAreaFilled(false);
        _27_RedButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _27_RedButton.setMaximumSize(new java.awt.Dimension(30, 30));
        _27_RedButton.setMinimumSize(new java.awt.Dimension(30, 30));
        _27_RedButton.setName(""); // NOI18N
        _27_RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _27_RedButtonActionPerformed(evt);
            }
        });

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

        _30_RedButton.setToolTipText("");
        _30_RedButton.setBorder(null);
        _30_RedButton.setBorderPainted(false);
        _30_RedButton.setContentAreaFilled(false);
        _30_RedButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _30_RedButton.setMaximumSize(new java.awt.Dimension(30, 30));
        _30_RedButton.setMinimumSize(new java.awt.Dimension(30, 30));
        _30_RedButton.setName(""); // NOI18N
        _30_RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _30_RedButtonActionPerformed(evt);
            }
        });

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

        _33_BlackButton.setToolTipText("");
        _33_BlackButton.setBorder(null);
        _33_BlackButton.setBorderPainted(false);
        _33_BlackButton.setContentAreaFilled(false);
        _33_BlackButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _33_BlackButton.setMaximumSize(new java.awt.Dimension(30, 30));
        _33_BlackButton.setMinimumSize(new java.awt.Dimension(30, 30));
        _33_BlackButton.setName(""); // NOI18N
        _33_BlackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _33_BlackButtonActionPerformed(evt);
            }
        });

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

        _36_RedButton.setToolTipText("");
        _36_RedButton.setBorder(null);
        _36_RedButton.setBorderPainted(false);
        _36_RedButton.setContentAreaFilled(false);
        _36_RedButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        _36_RedButton.setMaximumSize(new java.awt.Dimension(30, 30));
        _36_RedButton.setMinimumSize(new java.awt.Dimension(30, 30));
        _36_RedButton.setName(""); // NOI18N
        _36_RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _36_RedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout maskPanelLayout = new javax.swing.GroupLayout(maskPanel);
        maskPanel.setLayout(maskPanelLayout);
        maskPanelLayout.setHorizontalGroup(
            maskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maskPanelLayout.createSequentialGroup()
                .addGap(687, 687, 687)
                .addComponent(_3_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_3_6_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(_6_BlackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(_6_9_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(_9_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(_9_12_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_12_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_12_15_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(_15_BlackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(_15_18_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(_18_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(_18_21_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_21_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_21_24_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(_24_BlackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(_24_27_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_27_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_27_30_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_30_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_30_33_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_33_BlackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(_33_36_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(_36_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        maskPanelLayout.setVerticalGroup(
            maskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maskPanelLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(maskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(_36_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_33_36_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_30_33_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_30_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_33_BlackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_27_30_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_27_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_24_27_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_21_24_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_21_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_24_BlackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_18_21_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_18_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_15_18_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_12_15_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_12_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_15_BlackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_9_12_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_9_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6_9_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_6_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3_RedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6_BlackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(470, Short.MAX_VALUE))
        );

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

    private void _3_RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_RedButtonActionPerformed
        _3_RedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _3_RedButton.setText(Integer.toString(buttonCounter[0]));
        buttonCounter[0]++;
    }//GEN-LAST:event__3_RedButtonActionPerformed

    private void _6_BlackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_BlackButtonActionPerformed
        _6_BlackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _6_BlackButton.setText(Integer.toString(buttonCounter[1]));
        buttonCounter[1]++;
    }//GEN-LAST:event__6_BlackButtonActionPerformed

    private void _3_6_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__3_6_ButtonActionPerformed
        _3_6_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _3_6_Button.setText(Integer.toString(buttonCounter[2]));
        buttonCounter[2]++;    }//GEN-LAST:event__3_6_ButtonActionPerformed

    private void _6_9_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__6_9_ButtonActionPerformed
        _6_9_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _6_9_Button.setText(Integer.toString(buttonCounter[3]));
        buttonCounter[3]++;    }//GEN-LAST:event__6_9_ButtonActionPerformed

    private void _9_RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_RedButtonActionPerformed
        _9_RedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _9_RedButton.setText(Integer.toString(buttonCounter[4]));
        buttonCounter[4]++;    }//GEN-LAST:event__9_RedButtonActionPerformed

    private void _9_12_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__9_12_ButtonActionPerformed
        _9_12_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _9_12_Button.setText(Integer.toString(buttonCounter[5]));
        buttonCounter[5]++;    }//GEN-LAST:event__9_12_ButtonActionPerformed

    private void _12_RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__12_RedButtonActionPerformed
        _12_RedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _12_RedButton.setText(Integer.toString(buttonCounter[6]));
        buttonCounter[6]++;    }//GEN-LAST:event__12_RedButtonActionPerformed

    private void _12_15_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__12_15_ButtonActionPerformed
        _12_15_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _12_15_Button.setText(Integer.toString(buttonCounter[7]));
        buttonCounter[7]++;    }//GEN-LAST:event__12_15_ButtonActionPerformed

    private void _15_BlackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__15_BlackButtonActionPerformed
        _15_BlackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _15_BlackButton.setText(Integer.toString(buttonCounter[8]));
        buttonCounter[8]++;    }//GEN-LAST:event__15_BlackButtonActionPerformed

    private void _15_18_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__15_18_ButtonActionPerformed
        _15_18_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _15_18_Button.setText(Integer.toString(buttonCounter[9]));
        buttonCounter[9]++;    }//GEN-LAST:event__15_18_ButtonActionPerformed

    private void _18_RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__18_RedButtonActionPerformed
        _18_RedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _18_RedButton.setText(Integer.toString(buttonCounter[10]));
        buttonCounter[10]++;    }//GEN-LAST:event__18_RedButtonActionPerformed

    private void _18_21_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__18_21_ButtonActionPerformed
        _18_21_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _18_21_Button.setText(Integer.toString(buttonCounter[11]));
        buttonCounter[11]++;    }//GEN-LAST:event__18_21_ButtonActionPerformed

    private void _21_RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__21_RedButtonActionPerformed
        _21_RedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _21_RedButton.setText(Integer.toString(buttonCounter[12]));
        buttonCounter[12]++;    }//GEN-LAST:event__21_RedButtonActionPerformed

    private void _21_24_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__21_24_ButtonActionPerformed
        _21_24_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _21_24_Button.setText(Integer.toString(buttonCounter[13]));
        buttonCounter[13]++;    }//GEN-LAST:event__21_24_ButtonActionPerformed

    private void _24_BlackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__24_BlackButtonActionPerformed
        _24_BlackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _24_BlackButton.setText(Integer.toString(buttonCounter[14]));
        buttonCounter[14]++;    }//GEN-LAST:event__24_BlackButtonActionPerformed

    private void _24_27_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__24_27_ButtonActionPerformed
        _24_27_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _24_27_Button.setText(Integer.toString(buttonCounter[15]));
        buttonCounter[15]++;    }//GEN-LAST:event__24_27_ButtonActionPerformed

    private void _27_RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__27_RedButtonActionPerformed
        _27_RedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _27_RedButton.setText(Integer.toString(buttonCounter[16]));
        buttonCounter[16]++;    }//GEN-LAST:event__27_RedButtonActionPerformed

    private void _27_30_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__27_30_ButtonActionPerformed
        _27_30_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _27_30_Button.setText(Integer.toString(buttonCounter[17]));
        buttonCounter[17]++;    }//GEN-LAST:event__27_30_ButtonActionPerformed

    private void _30_RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__30_RedButtonActionPerformed
        _30_RedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _30_RedButton.setText(Integer.toString(buttonCounter[18]));
        buttonCounter[18]++;    }//GEN-LAST:event__30_RedButtonActionPerformed

    private void _30_33_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__30_33_ButtonActionPerformed
        _30_33_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _30_33_Button.setText(Integer.toString(buttonCounter[19]));
        buttonCounter[19]++;    }//GEN-LAST:event__30_33_ButtonActionPerformed

    private void _33_BlackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__33_BlackButtonActionPerformed
        _33_BlackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _33_BlackButton.setText(Integer.toString(buttonCounter[20]));
        buttonCounter[20]++;    }//GEN-LAST:event__33_BlackButtonActionPerformed

    private void _33_36_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__33_36_ButtonActionPerformed
        _33_36_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _33_36_Button.setText(Integer.toString(buttonCounter[21]));
        buttonCounter[21]++;    }//GEN-LAST:event__33_36_ButtonActionPerformed

    private void _36_RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__36_RedButtonActionPerformed
        _36_RedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChips.png")));
        _36_RedButton.setText(Integer.toString(buttonCounter[22]));
        buttonCounter[22]++;    }//GEN-LAST:event__36_RedButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Roulette().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _12_15_Button;
    private javax.swing.JButton _12_RedButton;
    private javax.swing.JButton _15_18_Button;
    private javax.swing.JButton _15_BlackButton;
    private javax.swing.JButton _18_21_Button;
    private javax.swing.JButton _18_RedButton;
    private javax.swing.JButton _21_24_Button;
    private javax.swing.JButton _21_RedButton;
    private javax.swing.JButton _24_27_Button;
    private javax.swing.JButton _24_BlackButton;
    private javax.swing.JButton _27_30_Button;
    private javax.swing.JButton _27_RedButton;
    private javax.swing.JButton _30_33_Button;
    private javax.swing.JButton _30_RedButton;
    private javax.swing.JButton _33_36_Button;
    private javax.swing.JButton _33_BlackButton;
    private javax.swing.JButton _36_RedButton;
    private javax.swing.JButton _3_6_Button;
    private javax.swing.JButton _3_RedButton;
    private javax.swing.JButton _6_9_Button;
    private javax.swing.JButton _6_BlackButton;
    private javax.swing.JButton _9_12_Button;
    private javax.swing.JButton _9_RedButton;
    private javax.swing.JLabel mainFountLabel;
    private javax.swing.JPanel maskPanel;
    // End of variables declaration//GEN-END:variables
}
