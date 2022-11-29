package logicPackage;

import java.util.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import framePackage.SetChips;
import javax.swing.JOptionPane;
import framePackage.*;

public class WinLogic {

    public WinLogic(MainFrame mf) {
        this.mf = mf;
    }
    MainFrame mf;
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
    public void gameStatus() {
        if (mf.player.getBudget() < 100) {
            mf.chipMngr.newChipArrayInArray();
            if (mf.player.getCurrentRate() == 100) {
                mf.chipMngr.setIconCurrentChipArray(iconPath.greenChipsIcon30x30);
                mf.player.setCurrentRate(50);
                mf.chipMngr.stavIconMainFrameChoiser(mf.setChips);
            }
            mf.setChipsFrame.bOrangeChips.setEnabled(false);
        }
        if (mf.player.getBudget() < 50) {
            mf.chipMngr.newChipArrayInArray();
            if (mf.player.getCurrentRate() == 50) {
                mf.chipMngr.setIconCurrentChipArray(iconPath.blueChipsIcon30x30);
                mf.player.setCurrentRate(25);
                mf.chipMngr.stavIconMainFrameChoiser(mf.setChips);
            }
            mf.setChipsFrame.bGreenChips.setEnabled(false);
        }
        if (mf.player.getBudget() < 25) {
            mf.chipMngr.newChipArrayInArray();
            if (mf.player.getCurrentRate() == 25) {
                mf.chipMngr.setIconCurrentChipArray(iconPath.redChipsIcon30x30);
                mf.player.setCurrentRate(10);
                mf.chipMngr.stavIconMainFrameChoiser(mf.setChips);
            }
            mf.setChipsFrame.bBlueChips.setEnabled(false);
        }

        //Разблокировка кнопок выбора ставок при увеличении бюджета
        if (mf.player.getBudget() >= 100) {
            mf.setChipsFrame.bBlueChips.setEnabled(true);
            mf.setChipsFrame.bGreenChips.setEnabled(true);
            mf.setChipsFrame.bOrangeChips.setEnabled(true);
        }
        if (mf.player.getBudget() >= 50) {
            mf.setChipsFrame.bBlueChips.setEnabled(true);
            mf.setChipsFrame.bGreenChips.setEnabled(true);
        }
        if (mf.player.getBudget() >= 25) {
            mf.setChipsFrame.bBlueChips.setEnabled(true);
        }
    }

    public void luseStatus() {
        //Проверка на поражение
        if (mf.player.getBudget() < 10) {
            new EndGameFrame(mf).setVisible(true);
            mf.setEnabled(false);
        }
    }
}
