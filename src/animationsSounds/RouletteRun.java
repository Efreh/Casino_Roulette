package animationsSounds;

import javax.swing.JLabel;
import logicPackage.IconVariables;
import framePackage.MainFrame;

public class RouletteRun extends Thread {

    public RouletteRun() {
    }

    public RouletteRun(int ballNumber, MainFrame mf) {
        this.numberBall = Integer.toString(ballNumber);
        this.mf = mf;
    }

    IconVariables iconVar = new IconVariables();
    JLabel[] labArr;
    String numberBall;
    long slowCoef = 0L;
    MainFrame mf;

    @Override
    public void run() {
        mf.setEnabled(false);
        //Очистка иконок у массива
        for (JLabel lab : labArr) {
            lab.setIcon(null);
        }

        //Первый цикл для движения шара 2 раза по тарелке
        for (int i = 0; i < 2; i++) {
            for (JLabel lab : labArr) {
                lab.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconVar.ballIcon)));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
                lab.setIcon(null);
            }
        }

        // Второй цикл для перемешения шара до выпавшего значения на тарелке
        for (JLabel lab : labArr) {
            if (!lab.getName().equals(numberBall)) {
                slowCoef += 10;
                lab.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconVar.ballIcon)));
                try {
                    Thread.sleep(50 + slowCoef);
                } catch (InterruptedException e) {
                }
                lab.setIcon(null);
            } else {
                lab.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconVar.ballIcon)));
                break;
            }
        }
        mf.setEnabled(true);

    }

    public void getLabelArr(JLabel... labArr) {
        this.labArr = labArr;
    }
}
