package logicPackage;

public class Chip {

    String nameChip;
    String colorChip;
    int coefficientChip;
    int numberChip;
    int counterChip =1;
    boolean chetnostChip;

    Chip(String nameChip, String colorChip,int numberChip,int coefficientChip,boolean chetnostChip) {
        this.nameChip = nameChip;
        this.numberChip = numberChip;
        this.colorChip = colorChip;
        this.coefficientChip = coefficientChip;
        this.chetnostChip = chetnostChip;
    }

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
