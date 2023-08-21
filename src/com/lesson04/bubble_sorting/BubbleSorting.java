/*
●	74. Сортировка обменами. Дана последовательность чисел а 1 , а 2 , ..., а n . Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа аi  и a i+1 . Если а i  больше а i+1 , то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом количество перестановок.
 */

package com.lesson04.bubble_sorting;

import java.util.Random;

public class BubbleSorting {
    private static int counter = 0;

    public static void main(String[] args) {

        Random rnd = new Random();
        int[] randomArray = new int[rnd.nextInt(10, 100)];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rnd.nextInt(100);
        }
        System.out.println("Array length: " + randomArray.length);
        System.out.println("Predicted worst sort count n^2 : " + randomArray.length * randomArray.length);
        System.out.print("Unsorted array : ");
        printArray(randomArray);
        sort(randomArray);
        System.out.print("Sorted array : ");
        printArray(randomArray);
        System.out.println("Sort attempts: " + counter);

    }


    private static void sort(int[] array) {
        int tempCounter = 1;
        while (tempCounter != 0) {
            tempCounter = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    counter++;
                    tempCounter++;
                }
            }
        }
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
