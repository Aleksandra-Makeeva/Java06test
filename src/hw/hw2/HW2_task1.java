package hw.hw2;

public class HW2_task1 {

    public static void main(String[] args) {

        /*
         * --------------------------------------------------------------------------------------
         * Задача №1
         * --------------------------------------------------------------------------------------
         * Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор
         * и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание,
         * деление и вывести результат.
         */

        int a = 5;
        int b = 2;

        int sum = a + b;
        int mult = a * b;
        int sub = a - b;
        int div = a / b;
        double div1 = a * 1.0 / b;
        double div2 = (double)a / b;

        System.out.println(sum);
        System.out.println(mult);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(div1);
        System.out.println(div2);


    }


}
