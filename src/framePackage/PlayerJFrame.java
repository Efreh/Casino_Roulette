package framePackage;
//Окно смены параметров Игрока

import logicPackage.Player;

public class PlayerJFrame extends javax.swing.JFrame {

    Player p;
    MainFrame mf;

    //Стандартный конструктор для main метода этого окна
    public PlayerJFrame() {
        initComponents();
    }

    //Конструктор для передачи данных из объекта класса Player
    public PlayerJFrame(MainFrame mf, Player p) {
        initComponents();
        this.mf = mf;
        this.p = p;
        tfName.setText(p.name);
        tfBetSize.setText(Integer.toString(p.budget));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        bSave = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        tfBetSize = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        fountLabel = new javax.swing.JLabel();

        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(450, 330));
        setMinimumSize(new java.awt.Dimension(450, 330));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(450, 330));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 330));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 330));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 330));

        bSave.setBackground(new java.awt.Color(51, 153, 0));
        bSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/saveIcon.png"))); // NOI18N
        bSave.setText("Сохранить");
        bSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSave.setFocusable(false);
        bSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bSave.setIconTextGap(20);
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        errorLabel.setBackground(new java.awt.Color(51, 153, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setText("<html>Размер бюджета игры: <p>от 5 до 5000</html>");
        errorLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        errorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        errorLabel.setOpaque(true);

        tfBetSize.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(tfBetSize, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBetSize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        fountLabel.setBackground(new java.awt.Color(51, 153, 0));
        fountLabel.setForeground(new java.awt.Color(51, 153, 0));
        fountLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/playerFount.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(fountLabel, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        p.name = tfName.getText();
        try {
            int butget = Integer.parseInt(tfBetSize.getText());
            if (butget >= 5 && butget <= 5000) {
                p.budget = butget;
            } else {
                throw new NumberFormatException();
            }
            mf.setEnabled(true);
            dispose();
        } catch (NumberFormatException e) {
            errorLabel.setText("<html>Введи число!<p>От 5 до 5000</html>");
        }
    }//GEN-LAST:event_bSaveActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSave;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel fountLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfBetSize;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
