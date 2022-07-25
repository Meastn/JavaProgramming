package day30_CustomClasses;

public class Dog {

    // FOR A CUSTOM CLASS WE FIRST DECLARE INSTANCE VARIABLES (ATTRIBUTES)
    public String name;
    public String breed;
    public char gender;
    public int age;
    public String color;
    public String size;

    // CREATE A METHOD THAT WILL MAKE IT EASIER TO ENTER DATA FOR EACH DOG OBJECT
    public void setInfo (String dogName,String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor ){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;


    }

    // FOLLOWING THE ATTRIBUTES WE DECLARE INSTANCE METHODS (ACTIONS)

    public void eat (){ // we don't use STATIC since there will more than one objects using this method
                        // STATIC means there will be only one copy created
        System.out.println(name + " is eating its food");
    }
    public void bark (){

        System.out.println(name + " is barking loud.");
    }
    public void sleep (){
        if (age < 2) {
            System.out.println(name + " is " + age + " years old. It is a puppy. It sleeps frequently");
        } else if (age > 8){
            System.out.println(name + " is " + age + " years old. She is old. She sleep a lot");
        } else {
            System.out.println(name + " is sleeping now");
        }
    }
    public void play (){
        System.out.println(name + "is playing happily.");
    }



    // YOU NEED A TOSTRING METHOD INSIDE THE CLASS IN ORDER TO PRINT THE DATA
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}


/*

Attributes (instance variables): - all dogs will have an instance of those attributes
name, age, gender, breed, size, color

Actions (instance methods): -- all dogs will perform those actions seperately

Dog             dog1            = new                           Dog ();
(Class name)    (Object name)     (object creating keyword)     (Constructor)

 */