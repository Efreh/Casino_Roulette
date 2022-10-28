package logicPackage;

import javax.swing.JLabel;

public class Player {

    public String name = "Игрок";
    public int budget = 1000;
    private int currentRate = 10;

    public int getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(int i) {
        currentRate = i;
    }

    public void startSetLabelText(JLabel lname, JLabel lBetSize) {
        lname.setText(name);
        lBetSize.setText(Integer.toString(budget));
    }
    public void setBudgetLabel(JLabel lBetSize) {
        lBetSize.setText(Integer.toString(budget));
    }
}
