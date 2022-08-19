package day44_Abstraction_Interface.Zoo;

public final class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println(getName() + " eats cat food");
    }


    public Cat(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }
}
