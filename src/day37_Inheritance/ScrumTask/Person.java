package day37_Inheritance.ScrumTask;

public class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat(String food) {  // THIS METHOD USES AN INSTANCE VARIABLE (NAME) THEREFORE CAN NOT BE A STATIC METHOD
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) { // THIS METHOD USES AN INSTANCE VARIABLE (NAME) THEREFORE CAN NOT BE A STATIC METHOD
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
