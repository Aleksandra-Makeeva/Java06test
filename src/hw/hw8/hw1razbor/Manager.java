package hw.hw8.hw1razbor;

public class Manager extends BaseEmployee{

    private int workersCount;

    public Manager(String name, int age, String gender, int daySalary, int workersCount) {
        super(name, age, gender, daySalary);
        this.workersCount = workersCount;
    }

    public int getWorkersCount() {
        return workersCount;
    }

    public void setWorkersCount(int workersCount) {
        this.workersCount = workersCount;
    }

    public int getSalary(int days) {

        int salary = getDaySalary() * days;

        return (int)(salary + salary * (getWorkersCount() / 100.0));

    }











}
