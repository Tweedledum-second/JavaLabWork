package com.mycompany.bubblesort;

public class MainClass {
    public static void main(String[] args) {
        Array array = new Array(10000); //creating the instance of the Array class
        array.printArray();
        
        array.bubbleSort();
        array.printArray();
    }
}
