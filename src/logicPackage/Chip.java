package logicPackage;

public class Chip {

    String nameChip;                                                            //Имя фишки
    public int counterChip = 1;                                                 //Счётчик колличества фишек в стопке ставки
    int coefficientChip;                                                        //Коофицент выигрыша
    int numberBall = 300;
    int[] numberChip;                                                           //Массив ставки на множество чисел
    public int currentRate;                                                     //Текущий размер ставки

    Chip(String nameChip, int coefficientChip, int currentRate, int numberChip) {

        this.nameChip = nameChip;
        this.numberBall = numberChip;
        this.coefficientChip = coefficientChip;
        this.currentRate = currentRate;

    }

    Chip(String nameChip, int coefficientChip, int currentRate, int... numberChip) {
        this.nameChip = nameChip;
        this.coefficientChip = coefficientChip;
        this.numberChip = numberChip;
        this.currentRate = currentRate;
    }

    //Перезапись equals для избежания повторного добавления фишки к уже имеющейся
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Chip) {
            Chip ch = (Chip) obj;
            String elementName = this.nameChip;
            String targetName = ch.nameChip;
            if (elementName.equals(targetName)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
