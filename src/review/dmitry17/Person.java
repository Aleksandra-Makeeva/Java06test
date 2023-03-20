package review.dmitry17;

public class Person {

    private String name;
    private int age;
    private int[] agesOfChildren;

    public Person(String name, int age, int[] agesOfChildren) {
        this.name = name;
        this.age = age;
        this.agesOfChildren = agesOfChildren;
    }



    public String introduceYourself (){
        String s = "I am " + name;
        if (age > 40){
            s += ". I am old";
        }
        return s;
    }

    public void setChildrenAges(int[] agesOfChildren){
        this.agesOfChildren = agesOfChildren;
    }




}
