package logicPackage;

public class Chip extends Ball {

    String nameChip;                                                            //Имя фишки
    public int counterChip = 1;                                                 //Счётчик колличества фишек в стопке ставки
    int coefficientChip;                                                        //Коофицент выигрыша
    int[] numberChip;                                                          //Массив ставки на множество чисел

    Chip(String nameChip, int coefficientChip, int numberChip) {

        this.nameChip = nameChip;
        this.colorBall = definitionCzveta(numberChip);
        this.numberBall = numberChip;
        this.coefficientChip = coefficientChip;
        this.chetnostBall = definitionChetnosti(numberChip);

    }

    Chip(String nameChip, int coefficientChip, int... numberChip) {
        this.nameChip = nameChip;
        this.coefficientChip = coefficientChip;
        this.numberChip = numberChip;
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
