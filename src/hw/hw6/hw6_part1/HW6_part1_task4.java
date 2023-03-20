package hw.hw6.hw6_part1;

public class HW6_part1_task4 {

    /*
     * --------------------------------------------------------------------------------------
     * Задача №4
     * --------------------------------------------------------------------------------------
     * Дан массив:
     * int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
     * необходимо вывести среднее арифметическое всех значений массива.
     */

    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        double count = 0;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count++;
        }
        System.out.println(sum/count);

        sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum/array.length);




    }
}
