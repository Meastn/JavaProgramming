package day37_Inheritance.Zoo;

public class Zoo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fluffy", "Husky", "white", 'M', 5, 7);
        Cat cat1 = new Cat("Silver", "Scott", "Grey",'F', 2, 6);
        Tiger tiger1 = new Tiger ("Jumper", "Siberian", "orange", 'F', 12, 15);
        // dog1.SetInfo("Fluffy", "Husky", "white", 'M', 5, 7);
        dog1.move();
        dog1.eat();
        dog1.sleep();
        dog1.drink();
        dog1.bark();

        System.out.println(dog1);
        // cat1.SetInfo("Silver", "Scott", "Grey",'F', 2, 6);
        cat1.move();
        cat1.eat();
        cat1.sleep();
        cat1.drink();
        cat1.scratch();
        System.out.println(cat1);


        tiger1.name="HORRİTIİ";
        tiger1.move();
        tiger1.eat();
        tiger1.sleep();
        tiger1.drink();
        tiger1.roar();
        tiger1.hunt();
        System.out.println(tiger1);
    
    }
}
