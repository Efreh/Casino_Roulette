package logicPackage;

import animations.RouletteRun;
import framePackage.MainFrame;

public class RollBallThread extends Thread {

    MainFrame mf = new MainFrame();
    RouletteRun r = new RouletteRun();

    public RollBallThread(MainFrame mf, RouletteRun r) {
        this.mf = mf;
        this.r = r;
    }

    @Override
    public void run() {
        //Вечный цикл проверяет поток Анимации на жизнь
        //Если поток помирает,запускается тело этого потока
        while (true) {
            if (!r.isAlive()) {
                mf.winner.showBall(mf.bollLabel);                                               //Индикация шара                                       
                mf.winner.clearStavSetter();                                                    //Очистка поля "текущая ставка" и возврат значений "бюджета" для последующего расчета выигрыша
                mf.winner.logikaSravneniaStavok(mf.chipMngr, mf.player, mf.notifLabel);         //Логика сравнения ставок и выигрыша/проигрыша
                mf.winner.gameStatus();                                                         //Проверка на возможность выбора размера ставки в зависимости от размера бюджета
                mf.winner.luseStatus();                                                         //Проверка на поражение путем проигрыша бюджета
                mf.player.playerSetLabelText(mf.lPlayerName, mf.lPlayerButget, mf.bPlayer);     //Установка новых значений бюджета
                mf.chipMngr.clearAllFields();
                break;
            }
        }
    }
}
