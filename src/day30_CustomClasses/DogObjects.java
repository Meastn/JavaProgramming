package day30_CustomClasses;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1= new Dog(); // data type should be dog to create a dog object
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender ='F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog();
        dog2.setInfo("Bradd", "German Shepherd",1, 'M', "Big", "Brown");


        Dog dog3 = new Dog();
        dog3.setInfo("Fluffy","Kangal", 11, 'F',"Big", "Brown");

        Dog dog4 = new Dog();

        System.out.println("dog 1 = " + dog1);
        System.out.println("dog 2 = " +dog2);
        System.out.println("dog 3 = " +dog3);
        System.out.println("dog 4= " + dog4); // dog4 does not have variable values for that it will use standart variable values such as null, 0, 0.0
        System.out.println("--------");
        dog1.eat();
        dog2.bark();
        dog3.sleep();
        dog1.sleep();
        dog2.sleep();

    }
}
