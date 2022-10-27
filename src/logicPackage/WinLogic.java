package logicPackage;

import java.util.ArrayList;

public class WinLogic {

    public void logikaSravneniaStavok(Ball ball, ChipManager chipManager, Player player) {
        ArrayList<ArrayList> bigList = chipManager.chipsArraysArray;
        for (ArrayList a : bigList) {
            for (Object c : a) {
                Chip chip = (Chip) c;
                if (ball.numberBall == chip.numberBall) {
                    player.budget+= chip.coefficientChip*chip.currentRate*chip.counterChip;
                }
                for(int i = 0;i<chip.numberChip.length;i++){
                    if(ball.numberBall==chip.numberChip[i]){
                        player.budget+= chip.coefficientChip*chip.currentRate*chip.counterChip;
                    }
                }
            }
        }
    }
}
