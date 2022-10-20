package logicPackage;

import java.util.ArrayList;

public class ChipManager {

    public ArrayList<Chip> chipsArray = new ArrayList<>();                      //Единичный массив полей ставок
    public ArrayList<ArrayList> chipsArraysArray = new ArrayList<>();           //Массив массивов полей ставок

    //Добавление новой ставки в текущий массив и ++ к стопке ставки(counterChip),если такая ставка уже есть
    public void addChipInArrayAndPlusCounter(String nameChip,int numberChip, int coefficientChip) {
        if (chipsArray.contains(new Chip(nameChip, numberChip, coefficientChip))) {
            for (int i = 0; i < chipsArray.size(); i++) {
                if (chipsArray.get(i).equals(new Chip(nameChip, numberChip, coefficientChip))) {
                    chipsArray.get(i).counterChip++;
                }
            }
        } else {
            chipsArray.add(new Chip(nameChip, numberChip, coefficientChip));
        }

    }

    public void newSingularChipField(){

    }
    
    public String toString() {
        String result = new String();
        for (Chip ch :chipsArray){
            result+="["+ch.nameChip+"]";
        }
        
        return result;
    }
}
