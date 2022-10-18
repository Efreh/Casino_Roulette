package logicPackage;

import logicPackage.Chip;
import java.util.ArrayList;

public class ChipContainer {

    public ArrayList<Chip> chipsArray = new ArrayList<>();

    public void addChipInArrayAndPlusCounter(String nameChip, String colorChip, int numberChip, int coefficientChip, boolean chetnostChip) {

        if (chipsArray.contains(new Chip(nameChip, colorChip, numberChip, coefficientChip, chetnostChip))) {
            for (int i = 0; i < chipsArray.size(); i++) {
                if (chipsArray.get(i).equals(new Chip(nameChip, colorChip, numberChip, coefficientChip, chetnostChip))) {
                    chipsArray.get(i).counterChip++;
                }
            }
        } else {
            chipsArray.add(new Chip(nameChip, colorChip, numberChip, coefficientChip, chetnostChip));
        }

    }
}
