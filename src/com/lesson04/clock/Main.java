/*
●	Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 */

package com.lesson04.clock;

public class Main {
    public static void main(String[] args) {
        int hours = 24;
        int minutes = 60;
        int count = 0;
        for (int i = 0; i <= hours; i++) {
            int h1 = i / 10;
            int h2 = i % 10;
            for (int j = 0; j < minutes; j++) {
                int m1 = j / 10;
                int m2 = j % 10;
                if (h1 == m2 && h2 == m1) {
                    System.out.println("" + h1 + h2 + " : " + m1 + m2);
                    count++;
                }
            }

        }
        System.out.println("Number of lucky times: " + count);

    }
}
