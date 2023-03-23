package hw.hw8.hw2razbor;

public class Main {

    public static void main(String[] args) {

        Employee katya = new Employee("Katy");

        Employee toly = new Employee("Toly");

        EmployeeUtils utils = new EmployeeUtils();

        System.out.println(utils.findByName("Toly", new Employee[]{katya, toly}));





    }


}
