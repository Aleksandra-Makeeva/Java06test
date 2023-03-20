package hw.hw8.hw8_part1;

public class Manager {

    private String name;
    private int age;
    private String gender;
    private int salaryPerDay;
    private int numberOfEmployees;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setSalaryPerDay(int salaryPerDay){
        this.salaryPerDay = salaryPerDay;
    }

    public int getSalaryPerDay(){
        return salaryPerDay;
    }

    public void setNumberOfEmployees(int numberOfEmployees){
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public double getSalary(int days){
        int totalSalary = salaryPerDay * days; //100
        double salary = totalSalary + totalSalary * 0.01 * numberOfEmployees;
        return salary;
    }






}
