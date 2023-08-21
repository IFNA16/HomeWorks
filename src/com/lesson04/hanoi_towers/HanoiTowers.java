package com.lesson04.hanoi_towers;

public class HanoiTowers {

    private static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        hanoi(n, 1, 2);
        System.out.println(count);

    }

    private static void hanoi(int n, int from, int to) {
        if (n == 1) {
            System.out.println("Move disk 1 from pin " + from + " to " + to);
            count++;
        } else {
            int temp = 6 - from - to;
            hanoi(n - 1, from, temp);
            System.out.println("Move disk " + n + " from pin " + from + " to " + to);
            count++;
            hanoi(n - 1, temp, to);
        }
    }


}
