package logicPackage;

import java.util.*;
import javax.swing.JLabel;

public class WinLogic {

// <editor-fold desc="БЛОК ЗАПУСКА ШАРА">
    int numberBall;                                                             //Номер шара
    Random random = new Random();                                               //Рандом шара

    public void rollTheBall() {                                                 //Рандом номера шара //37й номер = 00
        numberBall = random.nextInt(38);
    }

    public void showBall(JLabel label) {                                                    //Индикация выпавшего шара
        label.setText(Integer.toString(numberBall));
    }
// </editor-fold>   

    public void logikaSravneniaStavok(ChipManager chipManager, Player player) {
        ArrayList<ArrayList> bigList = chipManager.chipsArraysArray;
        for (ArrayList a : bigList) {
            for (Object c : a) {
                Chip chip = (Chip) c;
                if (chip.arraysChipNumbers.contains(numberBall)) {
                    player.budget += chip.coefficientChip * chip.currentRate * chip.counterChip;
                } else {
                    player.budget -= chip.currentRate * chip.counterChip;
                }
            }
        }
    }
}
