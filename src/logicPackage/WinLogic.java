package logicPackage;

import java.util.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import framePackage.SetChips;
import javax.swing.JOptionPane;
import framePackage.*;

public class WinLogic {

    IconVariables iconPath = new IconVariables();

// <editor-fold desc="БЛОК ЗАПУСКА ШАРА">
    int numberBall;                                                             //Номер шара
    Random random = new Random();                                               //Рандом шара

    public void rollTheBall() {                                                 //Рандом номера шара //37й номер = 00
        numberBall = random.nextInt(38);
    }

    public void showBall(JLabel label) {                                        //Индикация выпавшего шара
        label.setText(Integer.toString(numberBall));
    }
// </editor-fold>   

    public void logikaSravneniaStavok(ChipManager chipManager, Player player, JLabel notifLabel) {
        ArrayList<ArrayList> bigList = chipManager.chipsArraysArray;
        for (ArrayList a : bigList) {
            for (Object c : a) {
                Chip chip = (Chip) c;
                if (chip.arraysChipNumbers.contains(numberBall)) {
                    player.setWinAndLuseSize(chip.coefficientChip * chip.currentRate * chip.counterChip);
                    player.setBudget(player.getBudget() + player.getWinAndLuseSize());
                    notifLabel.setText("Вы выиграли: " + Integer.toString(player.getWinAndLuseSize()));
                } else {
                    player.setWinAndLuseSize(chip.currentRate * chip.counterChip);
                    player.setBudget(player.getBudget() - player.getWinAndLuseSize());
                    notifLabel.setText("Вы проиграли: " + Integer.toString(player.getWinAndLuseSize()));
                }
            }
        }
    }

    //Блокировка кнопок выбора размера ставок,при недостаточном бюджете для онной
    public void gameStatus(Player p, ChipManager chipMan, JButton b, SetChips setChFrame,MainFrame mf) {
        if (p.getBudget() < 100) {
            chipMan.newChipArrayInArray();
            if (p.getCurrentRate() == 100) {
                chipMan.setIconCurrentChipArray(iconPath.greenChipsIcon30x30);
                p.setCurrentRate(50);
                chipMan.stavIconMainFrameChoiser(b);
            }
            setChFrame.bOrangeChips.setEnabled(false);
        }
        if (p.getBudget() < 50) {
            chipMan.newChipArrayInArray();
            if (p.getCurrentRate() == 50) {
                chipMan.setIconCurrentChipArray(iconPath.blueChipsIcon30x30);
                p.setCurrentRate(25);
                chipMan.stavIconMainFrameChoiser(b);
            }
            setChFrame.bGreenChips.setEnabled(false);
        }
        if (p.getBudget() < 25) {
            chipMan.newChipArrayInArray();
            if (p.getCurrentRate() == 25) {
                chipMan.setIconCurrentChipArray(iconPath.redChipsIcon30x30);
                p.setCurrentRate(10);
                chipMan.stavIconMainFrameChoiser(b);
            }
            setChFrame.bBlueChips.setEnabled(false);
        }
        //Проверка на поражение
        if (p.getBudget() < 10) {
            mf.setEnabled(false);
            new EndGameFrame().setVisible(true);
        }

        //Разблокировка кнопок выбора ставок при увеличении бюджета
        if (p.getBudget() >= 100) {
            setChFrame.bBlueChips.setEnabled(true);
            setChFrame.bGreenChips.setEnabled(true);
            setChFrame.bOrangeChips.setEnabled(true);
        }
        if (p.getBudget() >= 50) {
            setChFrame.bBlueChips.setEnabled(true);
            setChFrame.bGreenChips.setEnabled(true);
        }
        if (p.getBudget() >= 25) {
            setChFrame.bBlueChips.setEnabled(true);
        }
    }
}
