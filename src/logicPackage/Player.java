package logicPackage;

import javax.swing.JLabel;

public class Player {

    public String name = "Игрок";
    public int budget = 1000;
    private int currentRate = 10;
    private int allStav=0;

    public int getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(int i) {
        currentRate = i;
    }

    public void playerSetLabelText(JLabel lname, JLabel lBetSize) {
        lname.setText(name);
        lBetSize.setText("Бюджет: "+Integer.toString(budget));
    }
    public void setAllStavLabel(JLabel lable){
        allStav+=currentRate;
        lable.setText("Ставка: "+Integer.toString(allStav));
    }
    public void clearAllStavLabel(JLabel lable){
        allStav=0;
        lable.setText("Ставка");
    }
}
