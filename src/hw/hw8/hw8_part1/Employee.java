package hw.hw8.hw8_part1;

public class Employee {

    private String name;
    private int age;
    private String gender;
    private int salaryPerDay;

    public void setName(String name) {
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

    public void setSalaryPerDay (int salaryPerDay){
        this.salaryPerDay = salaryPerDay;
    }

    public int getSalary(int days){
        return days * salaryPerDay;
    }



}
