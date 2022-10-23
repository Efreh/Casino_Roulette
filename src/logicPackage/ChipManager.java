package logicPackage;

import java.util.ArrayList;

public class ChipManager {

    public ChipManager() {                                                      //Стартовый конструктор с начальными массивами
        newChipArray();
    }

    public ArrayList<ArrayList> chipsArraysArray = new ArrayList<>();           //Массив массивов полей ставок
    public ArrayList<Chip> currentChipArray;                                    //Текуший массив фишек-ставок

    //Добавление новой ставки в текущий массив и ++ к стопке ставки(counterChip),если такая ставка уже есть
    public void addChipInArrayAndPlusCounter(String nameChip, int coefficientChip, int numberChip) {
        if (currentChipArray.contains(new Chip(nameChip, coefficientChip, numberChip))) {
            for (int i = 0; i < currentChipArray.size(); i++) {
                if (currentChipArray.get(i).equals(new Chip(nameChip, coefficientChip, numberChip))) {
                    currentChipArray.get(i).counterChip++;
                }
            }
        } else {
            currentChipArray.add(new Chip(nameChip, coefficientChip, numberChip));
        }

    }

    //Добавление новой ставки в текущий массив и ++ к стопке ставки(counterChip),если такая ставка уже есть
    //overload method для ставок со множеством
    public void addChipInArrayAndPlusCounter(String nameChip, int coefficientChip, int... numberChip) {
        if (currentChipArray.contains(new Chip(nameChip, coefficientChip, numberChip))) {
            for (int i = 0; i < currentChipArray.size(); i++) {
                if (currentChipArray.get(i).equals(new Chip(nameChip, coefficientChip, numberChip))) {
                    currentChipArray.get(i).counterChip++;
                }
            }
        } else {
            currentChipArray.add(new Chip(nameChip, coefficientChip, numberChip));
        }

    }

    //Создание единичного массива полей ставок и добавление его к массиву массивов
    public void newChipArray() {
        chipsArraysArray.add(new ArrayList<Chip>());                            //Новый массив фишек в МассивеМассивов
        currentChipArray = chipsArraysArray.get(chipsArraysArray.size() - 1);   //Назначеное текущего Массива последним добавленным к МассивуМассивов
    }

    public void massiveViev() {
        for (ArrayList<ArrayList> a : chipsArraysArray) {
            System.out.println(a.toString());
        }
        System.out.println(" ");
    }
}
