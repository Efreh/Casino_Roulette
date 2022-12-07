package logicPackage;

import java.util.ArrayList;
import javax.swing.*;

public class ChipManager {

    public ChipManager(Player player) {                                         //Стартовый конструктор с начальными массивами
        chipsArraysArray = new ArrayList<>();
        newChipArrayInArray();
        currentChipIcon = iconPath.blueChipsIcon30x30;                          //Вид иконки фишки при запуске игры
        this.player = player;
    }

    Player player;
    public ArrayList<ArrayList> chipsArraysArray = new ArrayList<>();           //Массив массивов полей ставок
    public ArrayList<Chip> currentChipArray;                                    //Текуший массив фишек-ставок

    String currentChipIcon;                                                     //Путь к текущей иконке

    IconVariables iconPath = new IconVariables();                               //Хранилище путей иконок

    //Добавление новой ставки в текущий массив и ++ к стопке ставки(counterChip),если такая ставка уже есть
    //Изменение иконки фишки и текстовое отображение счетчика нажатий на кнопку фишки
    public void addChipInArrayAndPlusCounter(JButton button, String nameChip, int coefficientChip, int currentRate, int... numberChip) {
        Chip sampleChip = new Chip(button, nameChip, coefficientChip, currentRate, numberChip);
        if (player.getBudget() >= currentRate) {
            if (currentChipArray.contains(sampleChip)) {
                for (int i = 0; i < currentChipArray.size(); i++) {
                    if (currentChipArray.get(i).equals(sampleChip)) {
                        currentChipArray.get(i).counterChip++;
                        button.setText(Integer.toString(currentChipArray.get(i).counterChip));
                    }
                }
            } else {
                currentChipArray.add(new Chip(button, nameChip, coefficientChip, currentRate, numberChip));
                button.setIcon(new javax.swing.ImageIcon(getClass().getResource(currentChipIcon)));
                button.setText("1");
            }
        }
    }

    //Метод установки иконки к номиналу текущей ставки
    public void setIconCurrentChipArray(String s) {
        currentChipIcon = s;
    }

    //Установка иконки отображения текущего размера ставки на главном фрейме
    public void stavIconMainFrameChoiser(JButton b) {
        if (currentChipIcon.equals(iconPath.redChipsIcon30x30)) {
            b.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath.redChipsIcon50x50)));
            b.setText("<html>Выбор ставки<p>Ставка: 10$</html>");
        }
        if (currentChipIcon.equals(iconPath.blueChipsIcon30x30)) {
            b.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath.blueChipsIcon50x50)));
            b.setText("<html>Выбор ставки<p>Ставка: 25$</html>");
        }
        if (currentChipIcon.equals(iconPath.greenChipsIcon30x30)) {
            b.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath.greenChipsIcon50x50)));
            b.setText("<html>Выбор ставки<p>Ставка: 50$</html>");
        }
        if (currentChipIcon.equals(iconPath.orangeChipsIcon30x30)) {
            b.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconPath.orangeChipsIcon50x50)));
            b.setText("<html>Выбор ставки<p>Ставка: 100$</html>");
        }
    }

    //Создание единичного массива полей ставок и добавление его к массиву массивов
    public void newChipArrayInArray() {
        chipsArraysArray.add(new ArrayList<Chip>());                            //Новый массив фишек в МассивеМассивов
        currentChipArray = chipsArraysArray.get(chipsArraysArray.size() - 1);   //Назначеное текущего Массива последним добавленным к МассивуМассивов
    }

    //Очистка поля ставок
    //Очистка всех иконок и текста с кнопок фишек,создание нового массива
    public void clearAllFields() {
        if (chipsArraysArray != null) {
            for (ArrayList outerList : chipsArraysArray) {
                for (Object chip : outerList) {
                    Chip ch = (Chip) chip;
                    ch.button.setText(null);
                    ch.button.setIcon(null);
                }
            }
            chipsArraysArray = new ArrayList<>();
            newChipArrayInArray();
        }
    }

    //Метод проверки на пустоту всех массивов
    public boolean isEmptyArray() {
        ArrayList<String> booleanArray = new ArrayList<String>();
        for (ArrayList outerList : chipsArraysArray) {
            if (outerList.isEmpty()) {
                booleanArray.add("empty");
            } else if (!outerList.isEmpty()) {
                booleanArray.add("notEmpty");
            }
        }
        if (booleanArray.contains("notEmpty")) {
            return false;
        } else {
            return true;
        }
    }
}
