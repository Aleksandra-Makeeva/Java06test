package lesson.lesson8;

public class Worker extends Person {

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int  salary;


    public Worker(String name, int age) {
        super(name, age);
    }
}
