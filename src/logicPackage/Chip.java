package logicPackage;

public class Chip extends Ball {

    String nameChip;                                                            //Имя фишки
    public int counterChip = 1;                                                 //Счётчик колличества фишек в стопке ставки
    int coefficientChip;                                                        //Коофицент выигрыша
    
    Chip(String nameChip,int numberChip, int coefficientChip) {
        
        this.nameChip = nameChip;
        this.colorBall = definitionCzveta(numberChip);
        this.numberBall = numberChip;
        this.coefficientChip = coefficientChip;
        this.chetnostBall = definitionChetnosti(numberChip);
        
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
