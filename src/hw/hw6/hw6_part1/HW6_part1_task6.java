package hw.hw6.hw6_part1;

public class HW6_part1_task6 {

    /*
     * --------------------------------------------------------------------------------------
     * Задача №6
     * --------------------------------------------------------------------------------------
     * Дан массив:
     * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
     * необходимо вывести максимальное значение массива.
     */

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max1 < array[i][j]){
                    max1 = array[i][j];
                }
            }
        }
        System.out.println(max1);

    }
}
