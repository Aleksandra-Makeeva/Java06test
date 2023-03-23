package review;

import java.util.Random;

public class ReviewKaterina2003 {

    public static void main(String[] args) {

        int [] mas = new int[13];
        for (int i = 0; i < mas.length; i++) {
            Random rnd = new Random();
            mas[i] = rnd.nextInt(13);
            System.out.println(mas[i]);

        }

    }
}
