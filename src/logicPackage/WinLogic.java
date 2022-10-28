package logicPackage;

import java.util.*;

public class WinLogic {

    public void logikaSravneniaStavok(Ball ball, ChipManager chipManager, Player player) {
        ArrayList<ArrayList> bigList = chipManager.chipsArraysArray;
        for (ArrayList a : bigList) {
            for (Object c : a) {
                Chip chip = (Chip) c;
                if (chip.numberChip == null) {
                    if (ball.numberBall == chip.numberBall) {
                        player.budget += chip.coefficientChip * chip.currentRate * chip.counterChip;
                    } else {
                        player.budget -= chip.currentRate * chip.counterChip;
                    }
                }
                if (chip.numberBall == 300 && chip.numberChip != null) {
                    ArrayList<Integer> list = new ArrayList<>();
                    for (int i : chip.numberChip) {
                        list.add(Integer.valueOf(i));
                    }
                    if (list.contains(ball.numberBall)) {
                        player.budget += chip.coefficientChip * chip.currentRate * chip.counterChip;
                    } else {
                        player.budget -= chip.currentRate * chip.counterChip;
                    }
                }
            }
        }
    }
}
