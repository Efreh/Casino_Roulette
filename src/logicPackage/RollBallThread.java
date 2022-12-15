package logicPackage;

import framePackage.MainFrame;

public class RollBallThread extends Thread {

    MainFrame mf = new MainFrame();

    public RollBallThread(MainFrame mf) {
        this.mf = mf;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(15000);                                                        //Ожидание завершения анимации шара
        } catch (InterruptedException e) {
        }
        mf.winner.showBall(mf.bollLabel);                                               //Индикация шара                                       
        mf.winner.clearStavSetter();                                                    //Очистка поля "текущая ставка" и возврат значений "бюджета" для последующего расчета выигрыша
        mf.winner.logikaSravneniaStavok(mf.chipMngr, mf.player, mf.notifLabel);         //Логика сравнения ставок и выигрыша/проигрыша
        mf.winner.gameStatus();                                                         //Проверка на возможность выбора размера ставки в зависимости от размера бюджета
        mf.winner.luseStatus();                                                         //Проверка на поражение путем проигрыша бюджета
        mf.player.playerSetLabelText(mf.lPlayerName, mf.lPlayerButget, mf.bPlayer);     //Установка новых значений бюджета
        mf.chipMngr.clearAllFields();
    }
}
