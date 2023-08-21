/*
●	Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).
●	Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.

*/
package com.lesson04.fibonschi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter number");
        Scanner scanner = new Scanner(System.in);
        int printedNumber = scanner.nextInt();
        int prev = 1;
        int act = 1;
        int temp = 0;

        for (int i = 1; i <= printedNumber; i++) {
            if(i == 2) act = 1;
            System.out.println(act);
            temp = prev + act;
            prev = act;
            act = temp;
        }

    }

}
