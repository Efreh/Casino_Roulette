package logicPackage;

import java.util.*;

public class Ball {
    int numberBall;                                                             //Номер шара

    Random random = new Random();

    public void rollTheBall() {
        //Рандом номера шара
        //37й номер = 00
        numberBall = random.nextInt(38);
    }

    public void showBall() {
        System.out.println("Номер шара " + numberBall);
        System.out.println(" ");
    }
}
