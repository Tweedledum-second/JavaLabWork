package com.mycompany.compoundinterest;

import java.math.*;

public class CompoundInterestCalculation {
    public String calculateCompoundInterest(String expression) {
        char[] charArray = new char[expression.toCharArray().length];
        int percentIndex = -1;
        int commaIndex = -1;
        int equalIndex = -1;
        BigDecimal number = new BigDecimal(0);
        
        //вывод массива символов, полученного из строки
        charArray = expression.toCharArray();
        for (char runner : charArray) {
            System.out.println(runner);
        }
        
        percentIndex = searchForChar(charArray, '%', 0);
        commaIndex = searchForChar(charArray, ',', 0);
        equalIndex = searchForChar(charArray, '=', 0);
        
        for (;;) {
            number *= ;
        }
        
        //возвращает результат
        String result = new String();
        return result;
    }
    
    //должно быть редактирование строки ввода такое, чтобы при нажатии на 
    //Enter в строке ввода после = появлялся ответ
    private char[] editString(char[] charArray) {
        int pointIndex = -1;
        BigDecimal number = new BigDecimal(0);
        
        searchForChar(charArray, '.', 0);
        searchForChar(charArray, '%', 0);
        
        return charArray;
    }
    
    //Сборка числа для последующего вычисления процента
    private BigDecimal calculateNumber(char[] digit, int currentIndex, int pointIndex) {
        BigDecimal number = new BigDecimal(0);
        
        for (int i = 0; i <= currentIndex ; i++) {
            if(i != pointIndex) {
                number.add(new BigDecimal(digit[i] * Math.pow(10, pointIndex - i))); //получение заданного числа
            }
        }
        return number;
    }
    
    private int calculatePeriods(char[] digit, int currentIndex) {
        int periodsNumber = 0;
        
        for (int i = 0; i < currentIndex; i++) {
            periodsNumber += Math.pow()
    }
    
    //Поиск символа в массиве
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
