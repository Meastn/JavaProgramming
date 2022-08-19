package day44_Abstraction_Interface.Zoo;

public final class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println(getName() + " is a tamed Tiger. But he still eats deer");
    }


    public Tiger(String name, String breed, char gender, int age, char size, String color) {
        super(name, breed, gender, age, size, color);
    }
}
