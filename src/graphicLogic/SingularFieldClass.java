package graphicLogic;
// Класс еденичного поля ставок 

import javax.swing.JButton;
import java.util.*;

public class SingularFieldClass {

    private String buttonIcon;                                                  //Хранит адресс к текущей иконке
    public void setButtonIcon(String icon) {buttonIcon = icon;}
    public String getButtonIcon() {return buttonIcon;}

    private HashMap<JButton, Integer> buttonCounter = new HashMap<>();          //Мапа со счетчиком колличества фишек
    public HashMap getButtonCounter() {return buttonCounter;}
    public void setButtonCounter(HashMap h) {buttonCounter = h;}

    //Установка иконки на каждую кнопку и счетчик нажатий на кнопку
    public void setBtNIcon_setBtNCounter(JButton b) {
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
    
    //Очистка текущего поля ставок
    public void clearCurrentField() {
        if (buttonCounter != null) {
            ArrayList<JButton> arrBut = new ArrayList<>(buttonCounter.keySet());
            for (int i = 0; i < arrBut.size(); i++) {
                arrBut.get(i).setIcon(null);
                arrBut.get(i).setText(null);
            }
        }
        buttonCounter = new HashMap();
    }
}
