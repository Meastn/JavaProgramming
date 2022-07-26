package day32_CustomClass_Constructors;

public class Employee {

    public String name, jobTitle;
    public char gender;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String jobTitle) {
        this (name); // DONT DUPLICATE CODE, CALL THE CONSTRUCTOR WITHIN ANOTHER CONSTRUCTOR THAT ALREADY HAS THE CODE
        // this.Employee(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, char gender) {
        this (name, jobTitle);
        this.gender = gender;
    }

    public Employee(String name, String jobTitle, char gender, double salary) {
        this(name, jobTitle,gender);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
