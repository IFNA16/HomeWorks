/*
●	Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.
 */

package com.lesson04.arrays;

import java.util.Random;

public class arrays1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rows = 8;
        int columns = 5;
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                array[i][j] = rnd.nextInt(10, 100);
            }
        }
        printArray(array);
    }

    private static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                int content = array[i][j];
                System.out.print(content < 10 ? "0" + content : content);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
