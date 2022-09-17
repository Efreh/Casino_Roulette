package mainPackage;
//Окно выбора номинала ставок
//В конструктор принимает объект менеджера полей из главного фрейма

public class SetChips extends javax.swing.JFrame {

    FieldManager f;                                                             //Локальный объект менеджера полей

    //Стандартный конструктор для main метода этого окна
    public SetChips() {
        initComponents();
    }

    //Конструктор для кнопки из главного окна для передачи данных из объекта FieldManager (менеджер полей)
    public SetChips(FieldManager f) {
        initComponents();
        this.f = f;
    }
    
    IconVariables iconPath = new IconVariables();                               //Хранилище путей иконок

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        FountPanel = new javax.swing.JPanel();
        bRedChips = new javax.swing.JButton();
        bBlueChips = new javax.swing.JButton();
        bGreenChips = new javax.swing.JButton();
        bOrangeChips = new javax.swing.JButton();

        setTitle("Set Chip");
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 126));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        FountPanel.setBackground(new java.awt.Color(0, 102, 0));
        FountPanel.setPreferredSize(new java.awt.Dimension(480, 126));

        bRedChips.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bRedChips.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/redChipsChoiseWindow.png"))); // NOI18N
        bRedChips.setText("5$");
        bRedChips.setToolTipText("");
        bRedChips.setBorder(null);
        bRedChips.setBorderPainted(false);
        bRedChips.setContentAreaFilled(false);
        bRedChips.setFocusable(false);
        bRedChips.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bRedChips.setMaximumSize(new java.awt.Dimension(30, 30));
        bRedChips.setMinimumSize(new java.awt.Dimension(30, 30));
        bRedChips.setName(""); // NOI18N
        bRedChips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRedChipsActionPerformed(evt);
            }
        });

        bBlueChips.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bBlueChips.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/blueChipsChoiseWindow.png"))); // NOI18N
        bBlueChips.setText("10$");
        bBlueChips.setToolTipText("");
        bBlueChips.setBorder(null);
        bBlueChips.setBorderPainted(false);
        bBlueChips.setContentAreaFilled(false);
        bBlueChips.setFocusable(false);
        bBlueChips.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bBlueChips.setMaximumSize(new java.awt.Dimension(30, 30));
        bBlueChips.setMinimumSize(new java.awt.Dimension(30, 30));
        bBlueChips.setName(""); // NOI18N
        bBlueChips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBlueChipsActionPerformed(evt);
            }
        });

        bGreenChips.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bGreenChips.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/greenChipsChoiseWindow.png"))); // NOI18N
        bGreenChips.setText("25$");
        bGreenChips.setToolTipText("");
        bGreenChips.setBorder(null);
        bGreenChips.setBorderPainted(false);
        bGreenChips.setContentAreaFilled(false);
        bGreenChips.setFocusable(false);
        bGreenChips.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bGreenChips.setMaximumSize(new java.awt.Dimension(30, 30));
        bGreenChips.setMinimumSize(new java.awt.Dimension(30, 30));
        bGreenChips.setName(""); // NOI18N
        bGreenChips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGreenChipsActionPerformed(evt);
            }
        });

        bOrangeChips.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bOrangeChips.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourse/orangeChipsChoiseWindow.png"))); // NOI18N
        bOrangeChips.setText("100$");
        bOrangeChips.setToolTipText("");
        bOrangeChips.setBorder(null);
        bOrangeChips.setBorderPainted(false);
        bOrangeChips.setContentAreaFilled(false);
        bOrangeChips.setFocusable(false);
        bOrangeChips.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bOrangeChips.setMaximumSize(new java.awt.Dimension(30, 30));
        bOrangeChips.setMinimumSize(new java.awt.Dimension(30, 30));
        bOrangeChips.setName(""); // NOI18N
        bOrangeChips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOrangeChipsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FountPanelLayout = new javax.swing.GroupLayout(FountPanel);
        FountPanel.setLayout(FountPanelLayout);
        FountPanelLayout.setHorizontalGroup(
            FountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FountPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(bRedChips, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bBlueChips, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bGreenChips, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bOrangeChips, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FountPanelLayout.setVerticalGroup(
            FountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bOrangeChips, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGreenChips, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBlueChips, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRedChips, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(FountPanel, gridBagConstraints);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bRedChipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRedChipsActionPerformed
        f.newField();                                                           //Новое поле
        f.setIconCurrentField(iconPath.redChipsIcon30x30);                      //Выбор иконки для текущего поля
        dispose();                                                              //Закрытие окна с высвобождение м ресурсов
    }//GEN-LAST:event_bRedChipsActionPerformed

    private void bGreenChipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGreenChipsActionPerformed
        f.newField();                                                           //Новое поле
        f.setIconCurrentField(iconPath.greenChipsIcon30x30);                    //Выбор иконки для текущего поля
        dispose();                                                              //Закрытие окна с высвобождение м ресурсов
    }//GEN-LAST:event_bGreenChipsActionPerformed

    private void bOrangeChipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOrangeChipsActionPerformed
        f.newField();                                                           //Новое поле
        f.setIconCurrentField(iconPath.orangeChipsIcon30x30);                   //Выбор иконки для текущего поля
        dispose();                                                              //Закрытие окна с высвобождение м ресурсов
    }//GEN-LAST:event_bOrangeChipsActionPerformed

    private void bBlueChipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBlueChipsActionPerformed
        f.newField();                                                           //Новое поле
        f.setIconCurrentField(iconPath.blueChipsIcon30x30);                     //Выбор иконки для текущего поля
        dispose();                                                              //Закрытие окна с высвобождение м ресурсов
    }//GEN-LAST:event_bBlueChipsActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetChips().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FountPanel;
    private javax.swing.JButton bBlueChips;
    private javax.swing.JButton bGreenChips;
    private javax.swing.JButton bOrangeChips;
    private javax.swing.JButton bRedChips;
    // End of variables declaration//GEN-END:variables
}
