package lesson.lesson8;

public class Person {

    private String name;
    private int age; // если указать age = 30 это дефолд значение
    // alr + insert = генератор для сетовров гетером и конструктгра

    // this - резер переменная в которой хранится текущий объект
    // если убрать сетеры то объект имутебр не изменяемый, через конструктоподаются зхначения, изменить нельзя
   // если есть контруктор и наслоедование от класса в котором ест ьконтруктор обязательно создать контруктор у наследниква
    // в наследуемом классе поля родителя в super() object -супер класс



    public String getName() {
        return name;
    }



    public int getAge() {
//        if ("Anna".equals(name)) {
//            return 16;
//        }
        return age;
    }
    public  Person(String  name, int age){
        this.name = name;
        this.age = age; // если указать age = 30 это дефолд значение
    }
//

}

// имутобл объект