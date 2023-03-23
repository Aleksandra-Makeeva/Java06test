package hw.hw8.hw1razbor;

public class Employee extends BaseEmployee{

    public Employee(String name, int age, String gender, int daySalary) {
        super(name, age, gender, daySalary);
    }

    public int getSalary(int days){
        return getDaySalary() * days;
    }



}
