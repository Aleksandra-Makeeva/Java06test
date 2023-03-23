package hw.hw8.hw2razbor;

public class Director extends BaseManager{

    public Director(String name, int numberOfSubordinates) {
        super(name, numberOfSubordinates);
    }

    public int getSalaryDirctor(){
        if(getNumberOfSubordinates() == 0){
            return getBaseSalary();
        }
        else {
            return (int) (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9));
        }
    }
}
