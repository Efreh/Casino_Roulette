package logicPackage;

import java.util.ArrayList;

public class Chip {

    String nameChip;                                                            //Имя фишки
    public int counterChip = 1;                                                 //Счётчик колличества фишек в стопке ставки
    int coefficientChip;                                                        //Коофицент выигрыша
    public int currentRate;                                                     //Текущий размер ставки
    ArrayList<Integer> arraysChipNumbers = new ArrayList<>();

    Chip(String nameChip, int coefficientChip, int currentRate, int... numberChip) {
        this.nameChip = nameChip;
        this.coefficientChip = coefficientChip;
        this.currentRate = currentRate;
        for (int i : numberChip) {
            this.arraysChipNumbers.add(Integer.valueOf(i));
        }
    }

    //Перезапись equals для избежания повторного добавления фишки к уже имеющейся
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
