package day35_OOP_Encapsulation.Encapsulation;

public class PersonObjects {

    public static void main(String[] args) {
        Person p1 = new Person();
        //p1.name = "Daniel"; // doesn't allow setting encapsulated data
        //p1.age = 34;

        p1.setAge(2000);;
        p1.setName("Daniel");

        System.out.println( p1.getName() + " is " + p1.getAge() + " years old.");

    }


}
