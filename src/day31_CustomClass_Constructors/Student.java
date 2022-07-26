package day31_CustomClass_Constructors;

public class Student {
    public String name;
    public char gender;
    public int age;
    public char grade;

    public Student(String name, char gender, int age, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
