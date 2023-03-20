package hw.hw7;

public class HW7_task1 {


    public static void main(String[] args) {

        Person john = new Person();
        Employee johnEmp = new Employee();
        Salary johnSalary = new Salary();

        john.name = "John";
        john.age = 36;
        john.gender = "male";

        johnEmp.name = "John";
        johnEmp.salary = 1000;

        Person jane = new Person();
        Employee janeEmp = new Employee();


        jane.name = "Jane";
        jane.age = 35;
        jane.gender = "female";

        janeEmp.name = "Janee";
        janeEmp.salary = 500;

        System.out.println(janeEmp.isSameName(janeEmp));
        System.out.println(johnEmp.isSameName(janeEmp));

        //System.out.println(johnSalary.getSum(new Employee[]{johnEmp, janeEmp}));

       // System.out.println(janeEmp.setEmployeeArray(new int[] {100, 200}));


        //System.out.println(janeEmp.isSameName(janeEmp));
        //System.out.println(john.isSameName(johnEmp));

        //System.out.println(jane.(new int[]{johnEmp.salary, janeEmp.salary}));


    }
}
