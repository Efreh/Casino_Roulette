package mainPackage;

import javax.swing.JLabel;

public class Player {

    String name = "Игрок";
    int budget = 1000;

    void startSetLabelText(JLabel lname, JLabel lBetSize) {
        lname.setText(name);
        lBetSize.setText(Integer.toString(budget));
    }
}
