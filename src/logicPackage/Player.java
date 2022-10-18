package logicPackage;

import javax.swing.JLabel;

public class Player {

    public String name = "Игрок";
    public int budget = 1000;

    public void startSetLabelText(JLabel lname, JLabel lBetSize) {
        lname.setText(name);
        lBetSize.setText(Integer.toString(budget));
    }
}
