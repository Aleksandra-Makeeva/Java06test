package hw.hw7;

import java.util.Arrays;

public class Salary {

    int salary;
    Employee employee;


    public int getSum(Employee[] employeeArray){

        int sum = 0;

        for (int i = 0; i < employeeArray.length; i++) {

            System.out.println(employeeArray[i].salary);

           sum += employeeArray[i].salary;

        }

        return sum;
    }

}
