package hw.hw2;

public class HW2_task2 {
    /*
     * --------------------------------------------------------------------------------------
     * Экстра задача
     * --------------------------------------------------------------------------------------
     * Также вывести остаток от деления и сделать проверку на четность этих переменных.
     */
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        int rem = a % b;
        System.out.println(rem);

        if (a % 2 == 0){
            System.out.println("a четное");
        } else {
            System.out.println("a не четное");
        }

        if (b % 2 == 0){
            System.out.println("b четное");
        } else {
            System.out.println("b не четное");
        }

    }
}
