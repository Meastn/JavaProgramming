package day37_Inheritance.Zoo;


public class Dog extends Animal { // Dog is an Animal
//           child       Parent


    public Dog(String name, String breed, String color, char gender, int size, int age) {
        super(name, breed, color, gender, size, age);
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}


/*
dog : has 0 variables  and 0 methods but inherits 6 variables and 6 methods from Animal
 */