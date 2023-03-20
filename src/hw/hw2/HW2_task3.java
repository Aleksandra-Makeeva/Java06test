package hw.hw2;

public class HW2_task3 {
    /*
     * --------------------------------------------------------------------------------------
     * Экстра задача
     * --------------------------------------------------------------------------------------
     * Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
     */

    public static void main(String[] args) {

        String smile = "\uD83D\uDE00";
        smile = "\uD83D\uDE08";
        System.out.println(smile);
        System.out.print(Character.toChars(0x1f600));
        System.out.println();

    }
}
