package day37_Inheritance.Zoo;



public class Tiger extends Animal{

    public Tiger(String name, String breed, String color, char gender, int size, int age) {
        super(name, breed, color, gender, size, age);
    }

    public void hunt(){
        System.out.println(name + " is hunting");
    }

    public void roar(){
        System.out.println(name + " is roaring");
    }

}
