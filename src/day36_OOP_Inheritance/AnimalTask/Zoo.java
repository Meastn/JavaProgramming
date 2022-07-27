package day36_OOP_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Tiger tiger1 = new Tiger();
        dog1.SetInfo("Fluffy", "Husky", "white", 'M', 5, 7);
        dog1.move();
        dog1.eat();
        dog1.sleep();
        dog1.drink();
        dog1.bark();

        System.out.println(dog1);
        cat1.SetInfo("Silver", "Scott", "Grey",'F', 2, 6);
        cat1.move();
        cat1.eat();
        cat1.sleep();
        cat1.drink();
        cat1.scratch();
        System.out.println(cat1);
    
    }
}
