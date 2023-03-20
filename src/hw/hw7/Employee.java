package hw.hw7;

public class Employee {

    /*
     * --------------------------------------------------------------------------------------
     * Задача №2
     * --------------------------------------------------------------------------------------
     * Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
     * Класс должен иметь метод isSameName(Employee employee) который возвращает
     * true, если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр,
     * одинаковое имя.
     */

    int salary;

    String name;
    int age;
    String gender;

    int[] employeeArray;

    public boolean isSameName(Employee employee) {
        if (employee.name == name) {

            return true;
        } else {
            return false;
        }

    }

}







