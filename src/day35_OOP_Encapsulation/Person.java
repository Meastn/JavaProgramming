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

    public static void printPlanetName (){  // STATIC METHOD IT USES ONLY A STATIC VARIABLE THERE FORE BEST TO MAKE IT STATIC ALSO
        System.out.println("Planet name is : " + planet);
    }

    public void eat (String food){  // THIS METHOD USES AN INSTANCE VARIABLE (NAME) THEREFORE CAN NOT BE A STATIC METHOD
        System.out.println(name + " is eating " + food);
    }

    public void drink (String drink){ // THIS METHOD USES AN INSTANCE VARIABLE (NAME) THEREFORE CAN NOT BE A STATIC METHOD
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' + // YOU CAN ADD STATIC VARIABLES INTO TOSTRING
                '}';
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