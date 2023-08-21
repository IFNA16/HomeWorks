/*
●	В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
 */

package com.lesson04.ticket;

public class Main {
    public static void main(String[] args) {
        int ticketsMax = 99999;
        int digits = 6;
        int count = 0;
        for (int i = 0; i <= ticketsMax; i++){
            int leftSum = 0;
            int rightSum = 0;
            int number = i;
            for (int j = 0; j < digits; j++){
                if (j < digits / 2){
                    rightSum += number % 10;
                } else {
                    leftSum += number % 10;
                }
                number /= 10;
            }
            if (leftSum == rightSum) {
                count++;
                //System.out.println("number :" + i + "; Left sum: " + leftSum + " Right sum: " + rightSum + " Count: " +count);
            }

        }
        System.out.println("Number of lucky tickets: " + count);

    }
}
