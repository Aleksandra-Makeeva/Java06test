package hw.hw6.hw6_part1;

public class HW6_part1_task2 {

    /*
     * --------------------------------------------------------------------------------------
     * Задача №2
     * --------------------------------------------------------------------------------------
     * Дан массив:
     * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
     * необходимо вывести максимальное значение массива.
     */

    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);

    }

}
