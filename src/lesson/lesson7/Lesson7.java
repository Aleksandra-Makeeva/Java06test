package lesson.lesson7;

public class Lesson7 {

    public static void main(String[] args) {
        //

//        Utils utils = new Utils();
//        int a = 10;
//        int b = 11;
//
//        utils.printSum(a, b);

        Person john = new Person();
        Name name = new Name();
        name.firstName = "John";
        name.lastName = "Doe";
        john.name = name;
        john.age = 36;

        Person jane = new Person();
        name = new Name();
        name.firstName = "Jane";
        name.lastName = "Doe";
        jane.name = name;
        jane.age = 35;

        System.out.println(john.getFullInfo());
        System.out.println(jane.getFullInfo());

    }


}
