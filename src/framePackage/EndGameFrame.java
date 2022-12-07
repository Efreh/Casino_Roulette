//Окно проигрыша
package framePackage;

public class EndGameFrame extends javax.swing.JFrame {

    //Локальный адресс Главного окна
    MainFrame mf;

    public EndGameFrame() {
        initComponents();
    }

    //Конструктор для получения данных с главного окна
    public EndGameFrame(MainFrame mf) {
        initComponents();
        this.mf = mf;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        labelLuse = new javax.swing.JLabel();
        bNewGame = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        fountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(330, 150));
        setMinimumSize(new java.awt.Dimension(330, 150));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        mainPanel.setBackground(new java.awt.Color(51, 153, 0));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainPanel.setMaximumSize(new java.awt.Dimension(330, 150));
        mainPanel.setMinimumSize(new java.awt.Dimension(330, 150));
        mainPanel.setOpaque(false);
        mainPanel.setPreferredSize(new java.awt.Dimension(330, 150));

        labelLuse.setBackground(new java.awt.Color(51, 153, 0));
        labelLuse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLuse.setForeground(new java.awt.Color(155, 28, 0));
        labelLuse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLuse.setText("Вы проиграли !");
        labelLuse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labelLuse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelLuse.setOpaque(true);

        bNewGame.setBackground(new java.awt.Color(51, 153, 0));
        bNewGame.setText("Новая игра");
        bNewGame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewGameActionPerformed(evt);
            }
        });

        bExit.setBackground(new java.awt.Color(51, 153, 0));
        bExit.setText("<html>Закрыть<p>игру</html>");
        bExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(labelLuse, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLuse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bNewGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(mainPanel, gridBagConstraints);

        fountLabel.setBackground(new java.awt.Color(255, 255, 255));
        fountLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/endGameFount.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(fountLabel, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);                                                         //Выход из игры
    }//GEN-LAST:event_bExitActionPerformed

    private void bNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewGameActionPerformed
        new PlayerJFrame(mf).setVisible(true);                                  //Запуск новой игры из окна профиля игрока
        dispose();
    }//GEN-LAST:event_bNewGameActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EndGameFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bExit;
    private javax.swing.JButton bNewGame;
    private javax.swing.JLabel fountLabel;
    private javax.swing.JLabel labelLuse;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
