package com.novakivska.app.utils.convertors;

public class PrimitiveConvertor {

    public void floatToChar(float floatVariable) {
        char floatCharValue = (char) floatVariable;
        System.out.println("Input float value is " + floatVariable + ". Output char value is " + floatCharValue);

    }

    public void intToChar(int intVariable){
        char intCharValue = (char) intVariable;
        System.out.println("Input int value is " + intVariable + ". Output char value is " + intCharValue);

    }

    public void charToInt(char charVariable){
        int charIntValue = (int) charVariable;
        System.out.println("Input char value is " + charVariable + ". Output int value is " + charIntValue);
    }

}
