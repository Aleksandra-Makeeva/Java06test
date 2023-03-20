package hw.hw8.hw8_part2;

public class Manager extends Worker {

    private int numberOfSubordinates;

    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }

    public double getSalaryManager(){

        if (numberOfSubordinates == 0){
            return getSalaryWorker();
        } else{
            double salaryManager = getBaseSalary() * (numberOfSubordinates / 100 * 3);
            return salaryManager;
        }
    }


}
