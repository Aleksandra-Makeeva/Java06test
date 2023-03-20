package lesson;

import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {

//        int[] a = {1, 2, 3};
//        int[] arr = {1, 2, 3, 4};
//
//        int[] arr1 = new int[10];
// min
//        int[] arr = {10, 2, 3, 8, 2, 4, 6};
//        int result = arr[0];
//        for (int i = 0; i < arr.length; i++){
//            if (result > arr[i]) {
//                result = arr[i];
//            }
//        }
//        System.out.println(result);

        // sum
//        int[] arr = {10, 2, 3, 8, 2, 4, 6};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++){
//            sum += arr[i];
//        }
//        System.out.println(sum);
//
//        int count = 0;
//        for (int i = 0; i < arr.length; i++){
//            count++;
//        }
//        System.out.println(count);
// двумерный сумма
// int[][] arr = {
//                {1, 5},
//                {3, 8, 2},
//                {},
//                {6}
// };
//        int sum = 0;
//    for (int i = 0; i < arr.length; i++){
//        for (int j = 0; j < arr[i].length; j++) {
//            sum += arr[i][j];
//        }
//    }
//        System.out.println(sum);

        // двумерный макс
//        int[][] arr = {
//                {10, 5},
//                {3, 8, 2},
//                {},
//                {6}
//        };
//        int min = arr[0][0];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (min > arr[i][j]) {
//                    min = arr[i][j];
//                }
//            }
//        }
//        System.out.println(min);


//        int[] arr = new int[]{1, 2, 3, 4};
//        int[] arr2 = arr;
//        arr2[0] = 100;
//        System.out.println((Arrays.toString(arr)));
//
//        String str = "Hello";
//        String str2 = str;
//        str2 = "Hi";
//        System.out.println(str);
//
//        Integer a = 10;
//        int b = 50;
//        // рефересный тип с большой буквы всегда за иск массивов
//        Long L = 10L;
//        long l = 1;
//
//        Double D = 10.0;
//        double d = 1;
//
//        Integer[] aa = new Integer[5];
//        int[] bb = new int[5];
//
//        System.out.println(Arrays.toString(aa));
//        System.out.println(Arrays.toString(bb));

//        String str = null;
//        str = "Sergey";
//
//        String str2 = str.toLowerCase();
//
//        System.out.println(str.indexOf("s")); // поиск символа
//        System.out.println(str.toLowerCase()); // понижение регистра. основную строку не меняет
//        System.out.println(str);
//
//        str = str.replace('r', '!');
//        System.out.println(str);
//        // ctrl + Q у функции и клик по функции = описание функции

//        int[] arr = {10, 5, 3, 8, 2, 6};
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//
//                if (min > arr[i]) {
//                    min = arr[i];
//                }
//
//        }
//        System.out.println(min);
//// guru99
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//
//        }
//        System.out.println(max);
//
//
//        String str2 ="Sergey is programmer";
//        for (int i = 0; i < str2.length(); i++) {
//            System.out.println(str2.charAt(i));
//
//        }

        int[] arr = {1, 2, 3};
        int[] arr2 = arr;
        int[] arr3 = {1, 2, 3};
        System.out.println(arr == arr2);
        System.out.println(arr == arr3);
        System.out.println(Arrays.equals(arr, arr3));

        Integer a = 10;
        Integer b = 10;

        System.out.println(a == b);


    }
}
