package day44_Abstraction_Interface.Zoo;

public class Eagle extends Animal implements Flight {
    public Eagle(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly");
    }
}
