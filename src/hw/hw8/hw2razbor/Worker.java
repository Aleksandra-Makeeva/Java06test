package hw.hw8.hw2razbor;

public class Worker extends Employee{


    public Worker(String name) {
        super(name);
    }

    public  int getSalaryWorker(){
        return getBaseSalary();
    }
}
