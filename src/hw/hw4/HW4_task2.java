package hw.hw4;

import static java.lang.Math.pow;

public class HW4_task2 {

    /*
     * --------------------------------------------------------------------------------------
     * Задача №2
     * --------------------------------------------------------------------------------------
     * Необходимо вывести все положительные степени числа 5 которые меньше 10000,
     * вывести результат возведения в степень.
     */

    public static void main(String[] args) {

        for (int i = 0; pow(5, i) < 10000; i++ ) {
                System.out.println(i);

                System.out.println(pow(5, i));
        }

        int i = 0;

        while(pow(5, i) < 10000){
            System.out.println(i);
            System.out.println(pow(5, i));
            i++;

        }

        i = 0;
        double powNumber = pow(5, i);
            while(powNumber < 10000){
                System.out.println(i);
                System.out.println(powNumber);
                i++;
                powNumber = pow(5, i);
            }
    }
}
