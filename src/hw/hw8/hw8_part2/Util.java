package hw.hw8.hw8_part2;

    /*
     * Необходимо создать класс со следующими методами:
     * поиск сотрудника в массиве по его имени
     * поиск сотрудника в массиве по вхождению указанной строки в его имени
     * подсчет зарплатного бюджета для всех сотрудников в массиве
     * поиск наименьшей зарплаты в массиве
     * поиск наибольшей зарплаты в массиве
     * поиск наименьшего количества подчиненных в массиве менеджеров
     * поиск наибольшего количества подчиненных в массиве менеджеров
     * поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
     * поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
     */

public class Util {

    Employee[] employeeArray;


    public void searchNameWorker(String name) {

        for (int i = 0; i < employeeArray.length; i++) {

            String str;

            if (employeeArray[i].getName().equals(name)){

                System.out.println(employeeArray[i].getName());
            }
        else {
                System.out.println("Error");
            }
        }

    }
}