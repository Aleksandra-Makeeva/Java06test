package hw.hw8.hw2razbor;

public class Manager extends BaseManager{

    public Manager(String name, int numberOfSubordinates) {
        super(name, numberOfSubordinates);
    }

    public int getSalaryManager(){
        if(getNumberOfSubordinates() == 0){
            return getBaseSalary();
        }
        else {
            return (int) (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3));
        }
    }

}
