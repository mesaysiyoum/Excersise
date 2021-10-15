
package com.m.s.myexcersise;


public class ArrayExercise {
    public static void main(String[] args) {
        
        jaggedArray();
    }
    
     public static void jaggedArray() {
        String[][] strArray = {{"This", "is"}, {"a", "test", "of", "jagged arrays"}};

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                System.out.print(strArray[i][j] + " ");
            }
            System.out.println();  
        }
}
}