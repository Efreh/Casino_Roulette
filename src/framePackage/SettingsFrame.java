package framePackage;

import animationsSounds.SoundsPlayer;

public class SettingsFrame extends javax.swing.JFrame {

    MainFrame mf;
    SoundsPlayer sp;

    public SettingsFrame() {
        initComponents();
    }

    public SettingsFrame(MainFrame mf) {
        initComponents();
        this.mf = mf;
    }

    public void getMusicObject(SoundsPlayer sp) {
        this.sp = sp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        musicSlider = new javax.swing.JSlider();
        effectSlider = new javax.swing.JSlider();
        musicLabel = new javax.swing.JLabel();
        effectLabel = new javax.swing.JLabel();
        bClose_Save = new javax.swing.JButton();
        fountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        musicSlider.setBackground(new java.awt.Color(51, 153, 0));
        musicSlider.setForeground(new java.awt.Color(51, 153, 0));
        musicSlider.setValue(70);
        musicSlider.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        effectSlider.setBackground(new java.awt.Color(51, 153, 0));
        effectSlider.setForeground(new java.awt.Color(51, 153, 0));
        effectSlider.setValue(70);
        effectSlider.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        musicLabel.setBackground(new java.awt.Color(51, 153, 0));
        musicLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        musicLabel.setText("Громкость музыки");
        musicLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        musicLabel.setOpaque(true);

        effectLabel.setBackground(new java.awt.Color(51, 153, 0));
        effectLabel.setText("Громкость эффектов");
        effectLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        effectLabel.setOpaque(true);

        bClose_Save.setBackground(new java.awt.Color(51, 153, 0));
        bClose_Save.setText("Закрыть");
        bClose_Save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bClose_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClose_SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(musicSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(effectSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(musicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(effectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(bClose_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(musicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(effectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(musicSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(effectSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(bClose_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 400.0;
        gridBagConstraints.weighty = 300.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        fountLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/playerFount.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 400.0;
        gridBagConstraints.weighty = 300.0;
        getContentPane().add(fountLabel, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bClose_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClose_SaveActionPerformed
        sp.setFountMusicVolume(musicSlider.getValue());
        animationsSounds.SoundsPlayer.setEffectMusicVolume(effectSlider.getValue());
        
        mf.setEnabled(true);
        hide();
    }//GEN-LAST:event_bClose_SaveActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose_Save;
    private javax.swing.JLabel effectLabel;
    private javax.swing.JSlider effectSlider;
    private javax.swing.JLabel fountLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel musicLabel;
    private javax.swing.JSlider musicSlider;
    // End of variables declaration//GEN-END:variables
}
