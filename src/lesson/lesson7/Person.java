package lesson.lesson7;

import lesson.lesson7.Name;

public class Person {

    Name name;
    int age;

    String getFullInfo(){
        return "name: " + name.getFullName() + " age: " + age;
    }
}
