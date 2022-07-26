package day31_CustomClass_Constructors;

public class Person {

    public String name;
    public char gender;
    public int age;


    // THIS IS A CONTRUCTOR USED INSTEAD OF SETINFO METHOD


    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
