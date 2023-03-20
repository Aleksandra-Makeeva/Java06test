package hw.hw8.hw8_part2;

public class Director extends Manager{

    public double getSalaryDirector(){

        if(getNumberOfSubordinates() == 0){
            return getSalaryWorker();
        } else {
            double salaryDirector = getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
            return salaryDirector;
        }
    }
}
