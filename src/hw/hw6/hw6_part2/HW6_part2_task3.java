package hw.hw6.hw6_part2;

public class HW6_part2_task3 {

    /*
     * --------------------------------------------------------------------------------------
     * Задача №3
     * --------------------------------------------------------------------------------------
     * Дана строка:
     * String s = “Посмотрите как Рите нравится ритм”;
     * необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
     * Для указанной строки ответ будет 6, 15, 29.
     */

    public static void main(String[] args) {

        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();

       for (int i = 0; i < s.length(); i++) {

           if (s.indexOf("рит", i) >= 0){

               System.out.println(s.indexOf("рит", i));
               i = s.indexOf("рит", i);
           }
          }

       // вариант 2
        s = "Посмотрите как Рите нравится ритм";

       int index =  s.indexOf("рит");
       while (index != -1){
           System.out.println(index);
           index = s.indexOf("рит", index + 1);


       }

       // вариант 3

        }
    }

