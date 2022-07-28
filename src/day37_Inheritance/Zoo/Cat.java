package day37_Inheritance.Zoo;



public class Cat extends Animal {

    // THIS IS THE CONSTRUCTOR OF A CHILD CLASS CALLING PARENT CLASSES CONSTRUCTOR
    public Cat(String name, String breed, String color, char gender, int size, int age) {
        super(name, breed, color, gender, size, age);
    }
    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
