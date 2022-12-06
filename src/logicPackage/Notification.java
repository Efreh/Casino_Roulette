package logicPackage;

import javax.swing.JLabel;
import javax.swing.JButton;

public class Notification {

    Player player;

    public Notification(Player player) {
        this.player = player;
    }
    
    //Установка имени и размера бюджета игры
    public void playerSetLabelText(JLabel nameL, JLabel BetSizeL,JButton button){
        nameL.setText(player.getName());
        BetSizeL.setText("Бюджет: "+Integer.toString(player.getBudget()));
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource(player.getProfileIcon())));
    }
    
}
