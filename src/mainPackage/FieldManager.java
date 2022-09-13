package mainPackage;

import java.util.*;
import javax.swing.JButton;

public class FieldManager {

    FieldButtonStav currentField;
    ArrayList<FieldButtonStav> fieldsArr = new ArrayList<>();

    void newField() {
        fieldsArr.add(new FieldButtonStav());
        currentField = fieldsArr.get(fieldsArr.size() - 1);
    }
}
