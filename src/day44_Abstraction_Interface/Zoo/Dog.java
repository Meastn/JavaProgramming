package day44_Abstraction_Interface.Zoo;

public final class Dog extends Animal implements Playable{

    public void eat () {
        System.out.println(getName() + " eats dog food.");
    }

    public Dog(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName() + " barks just like other dogsd");
    }

    @Override
    public void play() {
        System.out.println(getName() + "plays with people");
    }
}
