/*1. Игра “угадай число”. Пользователь вводит число от 1 до 10. Программа сама
выбирает число и выводит угадал пользователь или нет(почитать про генерацию
псевдослучайных чисел в java)
*/
package com.lesson02.rng;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        int guessNumber = rnd.nextInt(1, 11);
        System.out.println("Please enter number from 1 to 10");
        //System.out.println(guessNumber);
        Scanner scanner = new Scanner(System.in);
        int printedNumber = scanner.nextInt();

        if (printedNumber == guessNumber) {
            System.out.println("You WIN! number was: " + guessNumber);
        } else {
            System.out.println("You LOSE! number was: " + guessNumber);
        }

    }


}
