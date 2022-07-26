package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog(); // data type should be dog to create a dog object
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog();
        dog2.setInfo("Bradd", "German Shepherd", 1, 'M', "Big", "Brown");


        Dog dog3 = new Dog();
        dog3.setInfo("Fluffy", "Kangal", 11, 'F', "Big", "Brown");

        Dog dog4 = new Dog();
        dog4.setInfo("Blop", "Terrier", 4, 'M', "Small", "White");

        Dog dog5 = new Dog();
        dog5.setInfo("Daisy", "Dalmation", 8, 'F', "Medium", "Dotted");


        System.out.println("dog 1 = " + dog1);
        System.out.println("dog 2 = " + dog2);
        System.out.println("dog 3 = " + dog3);
        System.out.println("dog 4= " + dog4); // dog4 does not have variable values for that it will use standard variable values such as null, 0, 0.0
        System.out.println("--------");
        dog1.eat();
        dog2.bark();
        dog3.sleep();
        dog1.sleep();
        dog2.sleep();
        System.out.println("-------ARRAYLISTS-------");

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        femaleDogs.addAll (Arrays.asList(dog1, dog2, dog3, dog4, dog5));
        femaleDogs.removeIf(p -> p.gender=='M');
        System.out.print("Female Dogs: ");
        for (Dog each : femaleDogs) {
            System.out.print(each.name + ", ");
        }
        System.out.println();

        ArrayList<Dog> maleDogs = new ArrayList<>();
        maleDogs.addAll (Arrays.asList(dog1, dog2, dog3, dog4, dog5));
        maleDogs.removeIf(p -> p.gender=='F');
        System.out.print("Male Dogs: ");
        for (Dog each : maleDogs) {
            System.out.print(each.name + ", ");
        }

    }
}
