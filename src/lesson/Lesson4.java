package lesson;

public class Lesson4 {
    public static void main(String[] args) {

        int a =10;
        if (a == 0) {
            System.out.println("hi!");
        }

        for (int i = 1; i < 5; i ++) {

            System.out.println("Hi");

        }
        System.out.println("End");

        // цикл с предусловием
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            System.out.println("Hi");
            i = i + 1;
        }
        // sout выведет 5

        // цикл с пост условием, всегда отработает минимум 1 итерация
        // Shift + f6 массовое переименование
        do {
            System.out.println(i);
            System.out.println("Hi");
            i = i + 1;
        } while (i < 5);

    }
}
