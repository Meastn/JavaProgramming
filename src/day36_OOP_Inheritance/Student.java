package day36_OOP_Inheritance;

public class Student {
    private String name;
    private int age;
    private char gender, grade;
    private static String schoolName;
    // STATIC INITIALIZATION
    static {
        schoolName = "Cydeo School";
    }
    // GETTERS
    public String getName (){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public char getGrade(){
        return grade;
    }
    public String getSchoolName(){
        return schoolName;
    }
    // SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age <5 || age > 90){
            System.err.println("Invalid entry. Age not set");
            return;
        }

        this.age = age;
    }
    public void setGender(char gender){
        if (gender != 'F' && gender != 'M'){
         System.err.println("Gender not set");
        return;
        }
        this.gender = gender;
    }
    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B'|| grade == 'C'|| grade == 'D'|| grade == 'E'|| grade == 'F')){
            System.err.println("Invalid Entry. Grade not set");
            return;
        }
        this.grade = grade;
    }
    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    // CONSTRUCTOR
    public Student(String name, int age, char gender, char grade) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
    }
    // METHODS
    public void study(){
        System.out.println(name + " is studying");
    }
    // TOSTRING
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", school name=" + schoolName +
                '}';
    }
}
