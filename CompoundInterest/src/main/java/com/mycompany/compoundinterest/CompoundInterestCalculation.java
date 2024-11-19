package com.mycompany.compoundinterest;

public class CompoundInterestCalculation {
    public String calculateCompoundInterest(String expression) {
        int arraySize = 0;
        double number = 0;
        arraySize = expression.toCharArray().length;
        char[] charArray = new char[arraySize];
        charArray = expression.toCharArray();
        for (char runner : charArray) {
            System.out.println(runner);
        }
        //нужно сделать проверку на наличие в строке ввода нецелых значений
        for (int i = 0; i < expression.indexOf('%'); i++) {
                number = charArray[i] * Math.pow(10, expression.indexOf('%') - i);
        }
        String result = new String();
        return result;
    }
    
    private char[] editString(char[] charArray) {
        for (int i; i < char)
        return charArray;
    }
}
