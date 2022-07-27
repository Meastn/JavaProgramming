package day36_OOP_Inheritance.AnimalTask;

public class Animal {

    public String name, breed, color;
    public char gender;
    public int size, age;

    public void SetInfo(String name, String breed, String color, char gender, int size, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.size = size;
        this.age = age;
    }


    public void eat (){
        System.out.println(name + " is eating");
    }

    public void sleep (){
        System.out.println(name + " is sleeping");
    }

    public void move (){
        System.out.println(name + " is moving");
    }

    public void drink (){
        System.out.println(name + " is drinking");
    }
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
}


// THIS IS THE SUPER CLASS (PARENT CLASS)
/*
Create a super class called Animal
    Variables = name, breed, gender, size, age, color
    Methods = setInfo(), eat(), drink(), move(), sleep(), toString()
 */