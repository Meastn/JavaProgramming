package day44_Abstraction_Interface.Zoo;

public final class Tiger extends Animal implements Hunting{
    @Override
    public void eat() {
        System.out.println(getName() + " is a tamed Tiger. But he still eats deer");
    }

    @Override
    public void hunt(){
        System.out.println(getName() + " can hunt other animals");
    }

    public Tiger(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }
}
