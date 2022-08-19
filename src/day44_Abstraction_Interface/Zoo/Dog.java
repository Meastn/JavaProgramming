package day44_Abstraction_Interface.Zoo;

public final class Dog extends Animal{

    public void eat () {
        System.out.println(getName() + " eats dog food.");
    }

    public Dog(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }
}
