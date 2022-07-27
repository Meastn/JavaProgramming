package day35_OOP_Encapsulation.Encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;


    // GETTERS
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    //SETTERS
    public void setName(String name) {

        if (name == ""){
            System.err.println("Invalid name");
            return;
        }
        this.name = name;
    }
    public void setAge(int age){

        if (age >= 90  || age < 16) {
            System.err.println("Invalid age. Age not set");
            return;
        }
        this.age = age;
    }
    public void setGender(char gender){

        if (gender != 'F' && gender != 'M'){
            System.err.println("Invalid gender. Gender not set");
            return;
        }
        this.gender = gender;
    }
    public void setSalary(double salary){

        if (salary <=0) {
            System.err.println("Invalid salary. Salary not set");
            return;
        }
        this.salary = salary;
    }

    // WRONG WAY OF CREATIN CONSTRUCTOR FOR ENCAPSULATED DATA
    /* public Employee(String name, char gender, int age, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

     */

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge (age);
        setSalary (salary);
    }

    // TOSTRING

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

/*
Create an employee class
variables
name, gender, age, salary

encapsulate all the private fields
1. name can not be empty
2. gender can not be anythin other than F or M
3. age cannot be 0 or below 0 and bigger than 150
4. salary can not be 0 or negative
 */