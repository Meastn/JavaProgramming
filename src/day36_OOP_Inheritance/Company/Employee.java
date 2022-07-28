package day36_OOP_Inheritance.Company;

public class Employee {

    public String name, jobTitle;
    public int age, salary, id;
    public char gender;
    public static String companyName;

    static {
        companyName = "CodeBulls";
    }
    public void setInfo(String name, String jobTitle, int age, int salary, int id, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
        this.id = id;
        this.gender = gender;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", id=" + id +
                ", gender=" + gender +
                ", company name=" + companyName +
                '}';
    }
}






/*
Create an Employee SUPER CLASS
variables = name, gender, age, jobTitle, id, salary, companyName
methods   = work(), toString(), setInfo()

Create SUB CLASSES of Tester, Developer, Scrum Master

 */