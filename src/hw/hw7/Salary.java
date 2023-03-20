package hw.hw7;

public class Salary {

    int salary;
    Employee employee;


    public int getSum(Employee[] employeeArray){

      employeeArray = employee.employeeArray;

        int sum = 0;

        for (int i = 0; i < employee.employeeArray.length; i++) {

        sum += employee.employeeArray[i];

        }

        return sum;
    }

}
