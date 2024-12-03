package com.mycompany.compoundinterest;

import java.math.*;
import java.util.Arrays;

public class CompoundInterestCalculation {
    public String calculateCompoundInterest(String expression) {
        char[] charArray;
        int percentIndex;
        int commaIndex;
        int equalIndex;
        int periods;
        BigDecimal number = new BigDecimal(0);
        
        //вывод массива символов, полученного из строки
        charArray = expression.toCharArray();
        for (char runner : charArray) {
            System.out.println(runner);
        }
        
        percentIndex = searchForChar(charArray, '%', 0, charArray.length);
        /**/System.out.println("percentIndex = " + percentIndex);// убрать надо
        commaIndex = searchForChar(charArray, ',', 0, charArray.length);
        /**/System.out.println("commaIndex = " + commaIndex);// убрать надо
        equalIndex = searchForChar(charArray, '=', 0, charArray.length);
        /**/System.out.println("equalIndex = " + equalIndex);// убрать надо
        
        
        //вычисляются, но не верно
        System.out.println("before calculation" + number.floatValue());
        number = calculateNumber(charArray, 0, percentIndex); // = 0
        System.out.println("number " + number.floatValue());
        final BigDecimal percent = calculateNumber(charArray, ++percentIndex, commaIndex).divide(new BigDecimal(100)); // = 0
        System.out.println("percent " + percent.floatValue());
        periods = calculateNumber(charArray, commaIndex + 1);
        
        for (int i = 0; i < periods; i++) {
            number = number.multiply(percent);
            System.out.println("percent");
        }
        
        //возвращает результат
        return number.toString();
    }
    
    //должно быть редактирование строки ввода такое, чтобы при нажатии на 
    //Enter в строке ввода после = появлялся ответ
    
    //Сборка числа для последующего вычисления процента
    private BigDecimal calculateNumber(char[] digit, int beginIndex, int endIndex) {
        BigDecimal number = new BigDecimal(0);
        int pointIndex = searchForChar(digit, '.',  beginIndex, endIndex);
        
        for (int i = beginIndex; i < endIndex ; i++) {
            if(i != pointIndex && pointIndex != -1) {
                number = number.add(new BigDecimal(Character.getNumericValue(digit[i]) * Math.pow(10, pointIndex - i - 1))); //получение заданного числа
                System.out.println("calculating for " + i + " = " + number.floatValue());
            }
            if (pointIndex == -1) {
                number = number.add(new BigDecimal(Character.getNumericValue(digit[i]) * Math.pow(10, endIndex - i - 1)));
            }
            System.out.println("number");
        }
        return number;
    }
    
    private int calculateNumber(char[] digit, int currentIndex) {
        int periodsNumber = 0;
        int endIndex = searchForChar(digit, '=', currentIndex, digit.length);
        
        for (int i = currentIndex; i < endIndex ; i++) {
            periodsNumber += Character.getNumericValue(digit[i]) * Math.pow(10, endIndex - i - 1);
            System.out.println("period " + periodsNumber + " | " + i);
        }
        
        return periodsNumber;
    }
    
    //Поиск символа в массиве
    private int searchForChar(char[] charArray, char ch, int beginIndex, int endIndex) {
        int chIndex = 0;
        for (chIndex = beginIndex; charArray[chIndex] != ch && chIndex < endIndex; chIndex++) {
            System.out.println("search");
            if (chIndex == endIndex - 1){
                chIndex = -1;//если символа в указаннй части массива нет, то устанавливается нулевое значение
                break;
            }
        }
        return chIndex;
    }
}
