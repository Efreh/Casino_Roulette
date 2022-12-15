package animations;

import javax.swing.JLabel;
import logicPackage.IconVariables;

public class RouletteRun extends Thread {

    IconVariables iconVar = new IconVariables();
    JLabel[] labArr;
    String numberBall;
    long slowCoef = 0L;

    @Override
    public void run() {
        //Первый цикл для движения шара 2 раза по тарелке
        for (int i = 0; i < 2; i++) {
            for (JLabel lab : labArr) {
                lab.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconVar.ballIcon)));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                lab.setIcon(null);
            }
        }

        // Второй цикл для перемешения шара до соответсвующего значения на тарелке
        for (JLabel lab : labArr) {
            if (!lab.getName().equals(numberBall)) {
                slowCoef+=5;
                lab.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconVar.ballIcon)));
                try {
                    Thread.sleep(100+slowCoef);
                } catch (InterruptedException e) {
                }
                lab.setIcon(null);
            } else {
                lab.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconVar.ballIcon)));
                break;
            }
        }
    }

    public void getLabelArr(JLabel... labArr) {
        this.labArr = labArr;
    }

    public void setBall(int i) {
        numberBall = Integer.toString(i);
    }
}
