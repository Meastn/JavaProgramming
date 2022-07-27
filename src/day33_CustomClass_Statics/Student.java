package day33_CustomClass_Statics;

public class Student {

    public String name;
    public char gender, grade;
    public int age, studentID;

    public Student (String name) {
        this.name = name;
    }
    public Student (String name, char gender) {
        this (name);
        this.gender=gender;
    }

    public Student (String name, int StudentID) {
        this.name =name;
        this.studentID = studentID;

    }
    public Student (String name, int studentID, char grade){
        this(name, studentID);
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID) {
        this (name, gender, age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, char grade, int age, int studentID) {
        this (name, gender, age, studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }
}
