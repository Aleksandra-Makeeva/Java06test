package hw.hw6.hw6_part1;

public class HW6_part1_task7 {

    /*
     * --------------------------------------------------------------------------------------
     * Задача №7
     * --------------------------------------------------------------------------------------
     * Дан массив:
     * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     * необходимо вывести количество элементов в массиве.
     */

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }
        System.out.println(count);

        count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i].length;

        }
        System.out.println(count);

    }
}
