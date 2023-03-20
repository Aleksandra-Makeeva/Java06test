package hw.hw8.hw8_part1;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Manager manager = new Manager();

        employee.setSalaryPerDay(50);

        System.out.println(employee.getSalary(5));

        manager.setNumberOfEmployees(10);
        manager.setSalaryPerDay(10);

        System.out.println(manager.getSalary(10));


    }
}
