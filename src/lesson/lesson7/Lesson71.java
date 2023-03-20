package lesson.lesson7;

public class Lesson71 {

    public static void sumOfThree(int firstValue, int secondValue, int thirdValue){
        int sum = firstValue + secondValue  + thirdValue;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Utils utils = new Utils();
        int a = 10;
        int b = 11;
        utils.sum(a,b);

        int c = 12;
        int d = 13;
        sumOfThree(c, d, a);

    }
}
