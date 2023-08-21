/*
1 Quick Sort В начале выбирается “опорный” элемент массива. Это может быть любое число, но от выбора этого элемента сильно зависит эффективность алгоритма. Если нам известна медиана, то лучше выбирать элемент, который как можно ближе к медиане. В нашей реализации алгоритма, мы будем брать самый левый элемент, который в результате займет свое место.
Элементы в массиве делятся на две части: слева те кто меньше опорного элемента, справа те кто больше. Таким образом опорный элемент занимает свое место и больше никуда не двигается.
Для левого и правого массива действия повторяются рекурсивно.
 */
package com.lesson5.quicksort;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1, 100);
        }
        System.out.println("Array length: " + array.length);
        System.out.print("Unsorted array: ");
        printArray(array);
        qSort(array, 0, array.length - 1);
        System.out.print("Sorted array: ");
        printArray(array);


    }

    private static void qSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivotIndex = partitioning(array, start, end);
        qSort(array, start, pivotIndex - 1);
        qSort(array, pivotIndex + 1, end);

    }

    private static int partitioning(int[] array, int start, int end) {
        Random rnd = new Random();
        int pivotIndex = rnd.nextInt(start, end + 1);
        int pivot = array[pivotIndex];
        int low = start;
        int high = end;

        while (low < high) {
            if (array[low] < pivot) {
                low++;
                continue;
            }
            if (array[high] > pivot) {
                high--;
                continue;
            }

            swap(array, low, high);
            if (array[low] == array[high]) {
                low++;
            }
        }
        return low;

    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
