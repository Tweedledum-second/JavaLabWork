package com.mycompany.compoundinterest;

import java.math.*;

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
        int pointIndex = -1;
        BigDecimal number = new BigDecimal(0);
        
        searchForChar(charArray, '.', 0);
        searchForChar(charArray, '%', 0);
        
        return charArray;
    }
    
    private BigDecimal calculateNumber(BigDecimal number,char[] digit, int currentIndex, int pointIndex) {
        for (int i = 0; i <= currentIndex ; i++) {
            if(i != pointIndex) {
                number.add(new BigDecimal(digit[i] * Math.pow(10, pointIndex - i))); //получение заданного числа
            }
        }
        return number;
    }
    
    
    private int searchForChar(char[] charArray, char ch, int beginIndex) {
        int chIndex = 0;
        for (chIndex = beginIndex; charArray[chIndex] != ch; chIndex++) {
            if (chIndex == charArray.length - 1){
                chIndex = -1;
            }
        }
        return chIndex;
    }
}
