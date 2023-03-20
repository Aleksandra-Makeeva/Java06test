package hw.hw6.hw6_part2;

import java.util.Arrays;

public class HW6_part2_task4 {

    /*
     * --------------------------------------------------------------------------------------
     * Экстра задача
     * --------------------------------------------------------------------------------------
     * Дан массив:
     * String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
     * необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
     */

    public static void main(String[] args) {

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].indexOf("е") == -1) {
                    count++;
                }
            }
        }
        System.out.println(count);

        // 2

        count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}




