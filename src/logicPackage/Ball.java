package logicPackage;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Ball {

    String colorBall;                                                           //Цвет шара
    int numberBall;                                                             //Номер шара
    boolean chetnostBall;                                                       //Чётность номера шара

    Random random = new Random();

    ArrayList<Integer> redArray = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36));
    ArrayList<Integer> blackArray = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35));

    //Метод задающий свойства шара
    public void rollTheBall() {
        //Рандом номера шара
        //37й номер = 00
        numberBall = random.nextInt(38);

        //Определение цвета шара в зависимости от номера
        colorBall = definitionCzveta(numberBall);

        //Определение четности шара
        chetnostBall = definitionChetnosti(numberBall);
    }

//Определение цвета шара в зависимости от номера
    public String definitionCzveta(int number) {
        String result;
        if (redArray.contains(numberBall)) {
            result = "red";
        } else if (blackArray.contains(numberBall)) {
            result = "black";
        } else {
            result = "czveta net";
        }
        return result;
    }

    //Определение четности шара
    public boolean definitionChetnosti(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void showBall() {
        System.out.println("Номер шара " + numberBall);
        System.out.println("Цвет шара " + colorBall);
        System.out.println("Чётность " + chetnostBall);
        System.out.println(" ");
    }
}
