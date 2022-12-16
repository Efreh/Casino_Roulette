package logicPackage;

import java.util.*;
import javax.swing.JLabel;
import framePackage.*;

public class WinLogic {

    public WinLogic(MainFrame mf) {
        this.mf = mf;
    }
    MainFrame mf;
    IconVariables iconPath = new IconVariables();

// <editor-fold desc="БЛОК ЗАПУСКА ШАРА">
    int numberBall;                                                             //Номер шара

    public int getBall() {
        return numberBall;
    }
    Random random = new Random();                                               //Рандом шара

    public void rollTheBall() {                                                 //Рандом номера шара //37й номер = 00
        numberBall = random.nextInt(38);
    }
    
// </editor-fold>   

    public void logikaSravneniaStavok(ChipManager chipManager, Player player, JLabel notifLabel) {
        ArrayList<ArrayList> bigList = chipManager.chipsArraysArray;
        int allWinCount = 0;
        int allLuseCount = 0;
        for (ArrayList a : bigList) {
            for (Object c : a) {
                Chip chip = (Chip) c;
                if (chip.arraysChipNumbers.contains(numberBall)) {

                    player.setBudget(player.getBudget() - chip.currentRate * chip.counterChip);

                    player.setWinAndLuseSize(chip.coefficientChip * chip.currentRate * chip.counterChip);
                    player.setBudget(player.getBudget() + player.getWinAndLuseSize());
                    allWinCount += player.getWinAndLuseSize();
                } else {
                    player.setWinAndLuseSize(chip.currentRate * chip.counterChip);
                    player.setBudget(player.getBudget() - player.getWinAndLuseSize());
                    allLuseCount += player.getWinAndLuseSize();
                }
            }
        }
        if (allWinCount > 0 && allLuseCount == 0) {
            notifLabel.setText("Вы выиграли: " + Integer.toString(allWinCount));

        } else if (allWinCount == 0 && allLuseCount > 0) {
            notifLabel.setText("Вы проиграли: " + Integer.toString(allLuseCount));

        } else if (allWinCount > 0 && allLuseCount > 0) {
            notifLabel.setText("<html>Вы выиграли: " + Integer.toString(allWinCount) + "<br>" + "Проиграли: " + Integer.toString(allLuseCount));
        }
    }

    //Блокировка кнопок выбора размера ставок,при недостаточном бюджете для онной
    public void gameStatus() {
        if (mf.player.getBudget() < 100) {
            if (mf.player.getCurrentRate() < 100 && mf.player.getCurrentRate() > 50) {
                mf.chipMngr.newChipArrayInArray();
                mf.chipMngr.setIconCurrentChipArray(iconPath.greenChipsIcon30x30);
                mf.player.setCurrentRate(50);
                mf.chipMngr.stavIconMainFrameChoiser(mf.setChips);
            }
            mf.setChipsFrame.bOrangeChips.setEnabled(false);
        }
        if (mf.player.getBudget() < 50) {
            if (mf.player.getCurrentRate() < 50 && mf.player.getCurrentRate() > 25) {
                mf.chipMngr.newChipArrayInArray();
                mf.chipMngr.setIconCurrentChipArray(iconPath.blueChipsIcon30x30);
                mf.player.setCurrentRate(25);
                mf.chipMngr.stavIconMainFrameChoiser(mf.setChips);
            }
            mf.setChipsFrame.bGreenChips.setEnabled(false);
        }
        if (mf.player.getBudget() < 25) {
            if (mf.player.getCurrentRate() < 25 && mf.player.getCurrentRate() > 10) {
                mf.chipMngr.newChipArrayInArray();
                mf.chipMngr.setIconCurrentChipArray(iconPath.redChipsIcon30x30);
                mf.player.setCurrentRate(10);
                mf.chipMngr.stavIconMainFrameChoiser(mf.setChips);
            }
            mf.setChipsFrame.bBlueChips.setEnabled(false);
        }
        if (mf.player.getBudget() < 10) {
            if (mf.player.getCurrentRate() < 10) {
                mf.chipMngr.newChipArrayInArray();
                mf.player.setCurrentRate(10);
                mf.chipMngr.stavIconMainFrameChoiser(mf.setChips);
            }
            mf.setChips.setEnabled(false);
        }

        //Разблокировка кнопок выбора ставок при увеличении бюджета
        if (mf.player.getBudget() >= 100) {
            mf.setChipsFrame.bBlueChips.setEnabled(true);
            mf.setChipsFrame.bGreenChips.setEnabled(true);
            mf.setChipsFrame.bOrangeChips.setEnabled(true);
            mf.setChipsFrame.bRedChips.setEnabled(true);

        }
        if (mf.player.getBudget() >= 50) {
            mf.setChipsFrame.bBlueChips.setEnabled(true);
            mf.setChipsFrame.bGreenChips.setEnabled(true);
            mf.setChipsFrame.bRedChips.setEnabled(true);
        }
        if (mf.player.getBudget() >= 25) {
            mf.setChipsFrame.bBlueChips.setEnabled(true);
            mf.setChipsFrame.bRedChips.setEnabled(true);
        }
        if (mf.player.getBudget() >= 10) {
            mf.setChips.setEnabled(true);
        }
    }

    public void luseStatus() {
        //Проверка на поражение
        if (mf.player.getBudget() < 10) {
            new EndGameFrame(mf).setVisible(true);
            mf.setEnabled(false);
        }
    }

    //Метод изменения значения величины текущей общей ставки
    public void currentStavSetter() {
        if (mf.player.getBudget() >= mf.player.getCurrentRate()) {
            mf.player.setAllStav(mf.player.getAllStav() + mf.player.getCurrentRate());
            mf.player.setBudget(mf.player.getBudget() - mf.player.getCurrentRate());
            gameStatus();
            mf.lPlayerCurrentStav.setText("Ставка: " + Integer.toString(mf.player.getAllStav()));
            mf.lPlayerButget.setText("Бюджет: " + Integer.toString(mf.player.getBudget()));
        }
    }

    //Очистка поля общей величины ставки
    public void clearStavSetter() {
        mf.player.setBudget(mf.player.getBudget() + mf.player.getAllStav());
        mf.player.setAllStav(0);
        gameStatus();
        mf.lPlayerCurrentStav.setText("Ставка: " + Integer.toString(mf.player.getAllStav()));
        mf.lPlayerButget.setText("Бюджет: " + Integer.toString(mf.player.getBudget()));
    }
}
