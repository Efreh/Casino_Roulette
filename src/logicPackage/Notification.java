package logicPackage;

import javax.swing.JLabel;

public class Notification {

    Player player;

    public Notification(Player player) {
        this.player = player;
    }

    //Метод изменения значения величины текущей общей ставки
    public void setAllStavLabel(JLabel StavLabel) {
        player.setAllStav(player.getAllStav() + player.getCurrentRate());
        
        StavLabel.setText("Ставка: " + Integer.toString(player.getAllStav()));
    }

    //Очистка поля величины общей ставки
    public void clearAllStavLabel(JLabel StavLabel) {
        player.setAllStav(0);
        StavLabel.setText("Ставка");
    }
    
    //Установка имени и размера бюджета игры
    public void playerSetLabelText(JLabel nameL, JLabel BetSizeL){
        nameL.setText(player.getName());
        BetSizeL.setText("Бюджет: "+Integer.toString(player.getBudget()));
    }
    
}
