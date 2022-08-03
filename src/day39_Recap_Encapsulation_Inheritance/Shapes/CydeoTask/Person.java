package day39_Recap_Encapsulation_Inheritance.Shapes.CydeoTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            System.out.println("Invalid name entry!");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 10 || age > 75) {
            System.err.println("Invalid age!");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender != 'F' && gender != 'M'){
            System.out.println("Invalid gender entry!");
            System.exit(1);
        }
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat() {
        System.out.println(name + " eats meal");
    }

    public void sleep() {
        System.out.println(name + " sleeps");
    }

    public void drink() {
        System.out.println(name + " drinks");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
