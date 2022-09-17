package day47_Polymorphism;

import day39_Recap_Encapsulation_Inheritance.Shapes.Shapes.Circle;
import day39_Recap_Encapsulation_Inheritance.Shapes.Shapes.Shape;
import day44_Abstraction_Interface.Zoo.Animal;
import day44_Abstraction_Interface.Zoo.Dog;

public class Reference_Type_Casting {


    public static void main(String[] args) {

        Animal animal = new Dog("Max", "husky", 'M', 3, 'S', "White");
        // we created a new Dog object named "animal"
        // using a generic name like "animal" is good when polymorphing since there could be other animals added

        Dog dog = (Dog) animal; // downcasting the new object to the animal object.
        // both "animal" and "dog" objects are the same with different references
        //let us check with calling their names

        String animalName = animal.getName();
        String dogName = dog.getName();

        if (dogName.equals(animalName)){
            System.out.println("Both dog Name (" + dogName + ") and animal name (" + animalName + ") are the same.");
            System.out.println("because they are the same object");
        } else {
            System.out.println("dog name (" + dogName + ") and animal name (" + animalName + ") are not same");
        }
// now lets call the unique methods of dog class

       // animal).bark(); // animal can not bark even if it is also a dog
        dog.bark(); // dog can bark since it is already an object from the subclass

        ((Dog) animal).bark(); // downcasting


    }
}
