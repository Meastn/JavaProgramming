package day44_Abstraction_Interface.Zoo;

public abstract class Animal {
// Declare variables
    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private char size;
    private final String color;

    public final static boolean canBreathe;

    static {
        canBreathe = true;
    }

// Declare a Constructor
    public Animal (String name, String breed, char gender, int age, char size, String color) {
        setAge(age);
        setName(name);
        setSize(size);
        this.breed = breed;
        if (!(gender == 'M' || gender == 'F')){
            throw new RuntimeException("Invalid gender:" + gender);
        }
        this.gender = gender;
        this.color = color;
    }

// Getters for private variables
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public char getSize(){
        return size;
    }
    public char getGender(){
        return gender;
    }
    public String getColor(){
        return color;
    }

// Setters for non-final private variables
    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new RuntimeException("Name not provided");
        }
        this.name = name;
    }
    public void setAge(int age){
        if (age >120 || age <0){
            throw new RuntimeException("Invalid age: " + age);
        }
        this.age = age;
    }
    public void setSize(char size){
        this.size = size;
    }
// Abstract methods common to all animals
    public  abstract void eat(); // each animal eats different things so it needs multiple differend implementations therefore we
    // we use the abstract method without a bodyss
    public final void drink(){ // if method is acted exactly the same by all subclasses than it can be final and unchangeable
        System.out.println(name + " drinks water like all other animals");
    }

    // toString method

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
