package mainPackage;

import javax.swing.JButton;
import java.util.*;

public class FieldButtonStav {

    private String buttonIcon;
    public void setButtonIcon(String icon) {
        buttonIcon = icon;
    }

    private HashMap<JButton, Integer> buttonCounter = new HashMap<>();

    void setBtNIcon_setBtNCounter(JButton b) {
        if (buttonIcon != null) {
            b.setIcon(new javax.swing.ImageIcon(getClass().getResource(buttonIcon)));
            if (!buttonCounter.containsKey(b)) {
                buttonCounter.put(b, 0);
            }
            if (buttonCounter.containsKey(b)) {
                int i = buttonCounter.get(b);
                i++;
                buttonCounter.put(b, i);
                b.setText(buttonCounter.get(b).toString());
            }
        }
    }

    void clearField() {
        ArrayList<JButton> arrBut = new ArrayList<>(buttonCounter.keySet());
        for (int i = 0; i < arrBut.size(); i++) {
            arrBut.get(i).setIcon(null);
            arrBut.get(i).setText(null);
        }
    }
}
