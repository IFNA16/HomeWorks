/*
●	Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
package com.lesson04.arrays;

import java.util.Random;

public class arrays2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rows = 7;
        int columns = 4;
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = rnd.nextInt(11) - 5;
            }
        }
        printArray(array);
    }

    private static void printArray(int[][] array) {
        int maxRow = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int currentNum = 1;
            for (int j = 0; j < array[0].length; j++) {
                int content = array[i][j];
                currentNum *= Math.abs(content);
                System.out.print(content);
                System.out.print(" ");
            }
            if ( currentNum > max) {
                max = currentNum;
                maxRow = i + 1;
            }
            System.out.println();
        }
        System.out.println("row: " + maxRow + " Multiplication = " + max);
    }
}
