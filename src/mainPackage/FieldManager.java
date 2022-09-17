package mainPackage;
// Менеджер мультиставок

import java.util.*;
import javax.swing.JButton;

public class FieldManager {

    FieldManager() {
        fieldsArr.add(new FieldButtonStav());
        currentField = fieldsArr.get(fieldsArr.size() - 1);
        currentField.setButtonIcon(iconPath.blueChipsIcon30x30);
    }
    IconVariables iconPath = new IconVariables();                               //Хранилище путей иконок

    FieldButtonStav currentField;                                               //Текущее поле

    ArrayList<FieldButtonStav> fieldsArr = new ArrayList();                     //Список созданных полей ставок

    //Новое поле при выборе вида ставки
    void newField() {
        fieldsArr.add(new FieldButtonStav());
        currentField = fieldsArr.get(fieldsArr.size() - 1);
    }

    //Установка иконки для текущего номинала ставки
    void setIconCurrentField(String s) {
        currentField.setButtonIcon(s);
    }

    //Очистка всех полей и листа полей
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
        }
        fieldsArr = new ArrayList();
        newField();
    }
    void stavIconMainFrameChoiser(JButton b){
        if(currentField.getButtonIcon().equals(iconPath.redChipsIcon30x30)){
            b.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath.redChipsIcon50x50)));
        }
        if(currentField.getButtonIcon().equals(iconPath.blueChipsIcon30x30)){
            b.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath.blueChipsIcon50x50)));
        }
        if(currentField.getButtonIcon().equals(iconPath.greenChipsIcon30x30)){
            b.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath.greenChipsIcon50x50)));
        }
        if(currentField.getButtonIcon().equals(iconPath.orangeChipsIcon30x30)){
            b.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath.orangeChipsIcon50x50)));
        }
    }
}
