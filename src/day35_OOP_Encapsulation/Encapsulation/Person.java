package day35_OOP_Encapsulation.Encapsulation;

public class Person {

    private String name;
    private int age;

    public String getName (){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
        if (age > 120  || age <1) {
            System.err.println("Invalid age");
            System.exit(0);
        }
    }


}
