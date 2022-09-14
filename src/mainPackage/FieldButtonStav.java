package mainPackage;

import javax.swing.JButton;
import java.util.*;

public class FieldButtonStav {

    private String buttonIcon;

    public void setButtonIcon(String icon) {
        buttonIcon = icon;
    }

    public String getButtonIcon() {
        return buttonIcon;
    }

    private HashMap<JButton, Integer> buttonCounter = new HashMap<>();

    public HashMap getButtonCounter() {
        return buttonCounter;
    }

    public void setButtonCounter(HashMap h) {
        buttonCounter = h;
    }
}
