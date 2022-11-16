package logicPackage;

import java.util.ArrayList;
import javax.swing.JButton;

public class Chip {

    String nameChip;                                                            //Имя фишки
    public int counterChip = 1;                                                 //Счётчик колличества фишек в стопке ставки
    int coefficientChip;                                                        //Коофицент выигрыша
    public int currentRate;                                                     //Текущий размер ставки
    ArrayList<Integer> arraysChipNumbers = new ArrayList<>();                   //Хранение значений ставки на кнопке
    JButton button;                                                             //Jbutton для последующего изменения его иконки и текста

    Chip(JButton button,String nameChip, int coefficientChip, int currentRate, int... numberChip) {
        this.button=button;
        this.nameChip = nameChip;
        this.coefficientChip = coefficientChip;
        this.currentRate = currentRate;
        for (int i : numberChip) {
            this.arraysChipNumbers.add(Integer.valueOf(i));
        }
    }

    //Перезапись equals для избежания повторного добавления фишки к уже имеющейся
    //Сравнение происходит по имени Фишки
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Chip) {
            Chip ch = (Chip) obj;
            String elementName = this.nameChip;
            String targetName = ch.nameChip;
            if (elementName.equals(targetName)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
