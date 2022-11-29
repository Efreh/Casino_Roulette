package framePackage;
//Окно смены параметров Игрока

import logicPackage.Player;

public class PlayerJFrame extends javax.swing.JFrame {

    MainFrame mf;

    //Стандартный конструктор для main метода этого окна
    public PlayerJFrame() {
        initComponents();
    }

    //Конструктор для передачи данных из объекта класса Player
    public PlayerJFrame(MainFrame mf) {
        initComponents();
        this.mf = mf;
        tfName.setText(mf.player.getName());
        tfBetSize.setText(Integer.toString(mf.player.getBudget()));
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
        nameLabel = new javax.swing.JLabel();
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
        jPanel1.setLayout(null);

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
        jPanel1.add(bSave);
        bSave.setBounds(144, 233, 160, 60);

        errorLabel.setBackground(new java.awt.Color(51, 153, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setText("<html>Размер бюджета игры: <p>от 5 до 5000</html>");
        errorLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        errorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        errorLabel.setOpaque(true);
        jPanel1.add(errorLabel);
        errorLabel.setBounds(270, 20, 160, 60);

        tfBetSize.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBetSize.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tfBetSize);
        tfBetSize.setBounds(270, 80, 160, 60);

        tfName.setBackground(new java.awt.Color(250, 250, 250));
        tfName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tfName);
        tfName.setBounds(20, 80, 160, 60);

        nameLabel.setBackground(new java.awt.Color(51, 153, 0));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Ведите имя игрока");
        nameLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nameLabel.setOpaque(true);
        jPanel1.add(nameLabel);
        nameLabel.setBounds(20, 20, 160, 60);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        fountLabel.setBackground(new java.awt.Color(51, 153, 0));
        fountLabel.setForeground(new java.awt.Color(51, 153, 0));
        fountLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/playerFount.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(fountLabel, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        mf.player.setName(tfName.getText());
        try {
            int butget = Integer.parseInt(tfBetSize.getText());
            if (butget >= 10 && butget <= 5000) {
                mf.player.setBudget(butget);
                mf.winner.gameStatus();
                mf.notif.playerSetLabelText(mf.lPlayerName, mf.lPlayerButget);
            } else {
                throw new NumberFormatException();
            }
            mf.setEnabled(true);
            dispose();
        } catch (NumberFormatException e) {
            errorLabel.setText("<html>Введи число!<p>От 10 до 5000</html>");
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
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField tfBetSize;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
