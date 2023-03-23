package hw.hw8.hw2razbor;

public class BaseManager extends Employee {

    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public BaseManager(String name, int numberOfSubordinates) {
        super(name);
        this.numberOfSubordinates = numberOfSubordinates;
    }


}
