package day44_Abstraction_Interface.Zoo;

public class Zoo {
    public static void main(String[] args) {

        Cat mioww = new Cat("Flurry", "Scottish", 'F', 6, 'S', "Orange");

        Tiger tiger = new Tiger ("Grizzly", "Siberian", 'M', 12, 'L', "Orange-Black");
        System.out.println(mioww);
        tiger.hunt();
        System.out.println(tiger.getName() + " is a " + tiger.getSize() + " " + tiger.getGender() + " tiger");

    }
}
