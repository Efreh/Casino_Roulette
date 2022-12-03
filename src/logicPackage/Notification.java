package logicPackage;

import javax.swing.JLabel;

public class Notification {

    Player player;

    public Notification(Player player) {
        this.player = player;
    }
    
    //Установка имени и размера бюджета игры
    public void playerSetLabelText(JLabel nameL, JLabel BetSizeL){
        nameL.setText(player.getName());
        BetSizeL.setText("Бюджет: "+Integer.toString(player.getBudget()));
    }
    
}
