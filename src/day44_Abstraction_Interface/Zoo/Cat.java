package day44_Abstraction_Interface.Zoo;

public final class Cat extends Animal implements  Playable{

    @Override
    public void eat() {
        System.out.println(getName() + " eats cat food");
    }




    public Cat(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void play() {
        System.out.println(getName() + "plays with people");
    }
}
