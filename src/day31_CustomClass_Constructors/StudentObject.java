package day31_CustomClass_Constructors;

public class StudentObject {
    public static void main(String[] args) {

       Student student1 = new Student("Jack", 'M',17, 'F');
       Student student2 = new Student("Jane", 'F',17, 'B');
       Student student3 = new Student("Joanna", 'F',16, 'C');

        System.out.println(student1);
        System.out.println(student2);
    }
}
