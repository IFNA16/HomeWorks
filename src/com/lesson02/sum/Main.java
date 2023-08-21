/*2. В переменной n хранится натуральное двузначное число. Создайте программу,
вычисляющую и выводящую на экран сумму цифр числа n (n – вводит
пользователь).

*/
package com.lesson02.sum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int residue = number;
        int sum = 0;
        while(number >= 9) {
            residue = number % 10;
            sum += residue;
            number /= 10;
        }
        sum +=number;
        System.out.println("Sum is: " + sum);
    }
}
