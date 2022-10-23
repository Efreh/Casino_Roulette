package graphicLogic;
// Менеджер мультиставок

import java.util.*;
import javax.swing.JButton;

public class FieldManager {

    public FieldManager() {
        fieldsArr.add(new SingularFieldClass());
        currentField = fieldsArr.get(fieldsArr.size() - 1);
        currentField.setButtonIcon(iconPath.blueChipsIcon30x30);
    }
    IconVariables iconPath = new IconVariables();                               //Хранилище путей иконок

    public SingularFieldClass currentField;                                               //Текущее поле

    public ArrayList<SingularFieldClass> fieldsArr = new ArrayList();                     //Список созданных полей ставок

    //Новое поле при выборе вида ставки
    public void newField() {
        fieldsArr.add(new SingularFieldClass());
        currentField = fieldsArr.get(fieldsArr.size() - 1);
    }

    //Установка иконки для текущего номинала ставки
    public void setIconCurrentField(String s) {
        currentField.setButtonIcon(s);
    }

    //Очистка всех полей и листа полей
    public void clearAllField() {
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
        setIconCurrentField(iconPath.blueChipsIcon30x30);
    }
    
    //Метод выбора иконки окна выбора ставок
    public void stavIconMainFrameChoiser(JButton b){
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
