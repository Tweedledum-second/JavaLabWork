package com.mycompany.bubblesort;

public class Array {
    private int[]  array;
    
    public Array(int size) {
        this.generateArray(size); //constructor using array generation method
    }
    
    public int[] generateArray(int size) { //creating and filling an random array
        this.array = new int[size];
        
        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * Math.random()*10000);
        }
        
        return array;
    }
    
    public void bubbleSort() { 
        int length = this.array.length;
        
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (this.array[j] > this.array[j+1]) {
                    int temp = this.array[j];
                    this.array[j] = this.array[j+1];
                    this.array[j+1] = temp;
                }
            }
        }
    }
    
    public void printArray() { //array print
        int length = this.array.length;
        
        for (int i = 0; i < length; i++) {
            System.out.print(this.array[i] + " ");
            
            if ((i+1)%10 == 0) {
                System.out.println(" ");
            }
        }
    }
}
