package day39_Recap_Encapsulation_Inheritance.Shapes.CydeoTask;

public class Student extends Person {

    private int studentID;
    private String fieldOfStudy;

    public int getStudentID(){
        return studentID;
    }
    public void setStudentId (int studentID){
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentId(studentID);
        setFieldOfStudy(fieldOfStudy);
    }

    public void work () {
        System.out.println("As a student " + getName() + " works in a part time job");
    }

    public void study() {
        System.out.println(getName() + " is studying history.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
