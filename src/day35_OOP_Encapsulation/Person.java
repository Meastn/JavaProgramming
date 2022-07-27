package day35_OOP_Encapsulation;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfHead,numberOfWings ;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static {
        planet = "Earth";
        numberOfHead =1;
        numberOfWings =0;
        isHuman = true;
        hasNose = true;

    }

    public void printPlanetName (){
        System.out.println(planet);
    }

    public static void main(String[] args) {
        printPlanetName
    }


}


/*
Create a class named Person:
Variables:
name,age,gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

Add a constructor to initialize all fields
Add a static block to initialize all the statics

Methods:

printPlanetName ();
eat (String food)
drink (String drink)
toString()
 */