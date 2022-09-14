package mainPackage;

import java.util.*;
import javax.swing.JButton;

public class FieldManager {

    FieldButtonStav currentField;

    ArrayList<FieldButtonStav> fieldsArr = new ArrayList();

    void newField() {
        fieldsArr.add(new FieldButtonStav());
        currentField = fieldsArr.get(fieldsArr.size() - 1);
    }

    void setIconCurrentField(String s) {
        currentField.setButtonIcon(s);
    }

    void setBtNIcon_setBtNCounter(JButton b) {
        if (currentField != null) {
            HashMap<JButton, Integer> newButtonCounter = currentField.getButtonCounter();
            String newButtonIcon = currentField.getButtonIcon();

            if (newButtonIcon != null) {
                b.setIcon(new javax.swing.ImageIcon(getClass().getResource(newButtonIcon)));
                if (!newButtonCounter.containsKey(b)) {
                    newButtonCounter.put(b, 0);
                }
                if (newButtonCounter.containsKey(b)) {
                    int i = newButtonCounter.get(b);
                    i++;
                    newButtonCounter.put(b, i);
                    b.setText(newButtonCounter.get(b).toString());
                }
            }
            currentField.setButtonCounter(newButtonCounter);
            currentField.setButtonIcon(newButtonIcon);
        }
    }

    void clearCurrentField() {
        if (currentField != null) {
            ArrayList<JButton> arrBut = new ArrayList<>(currentField.getButtonCounter().keySet());
            for (int i = 0; i < arrBut.size(); i++) {
                arrBut.get(i).setIcon(null);
                arrBut.get(i).setText(null);
            }
            currentField = null;
        }
    }

    void clearAllField() {
        if (currentField != null) {
            ArrayList<JButton> arrBut = new ArrayList<>();
            for (int i = 0; i < fieldsArr.size(); i++) {
                arrBut.addAll(fieldsArr.get(i).getButtonCounter().keySet());
            }
            for (int i = 0; i < arrBut.size(); i++) {
                arrBut.get(i).setIcon(null);
                arrBut.get(i).setText(null);
            }
            fieldsArr = null;
        }
    }
}
