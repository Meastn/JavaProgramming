package day34_Static_Garbage_Collection;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;


     static {
        schoolName = "Cydeo School";
    }
    public CydeoStudent(String studentName) {
        this.studentName = studentName;
    }


    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Blinker");
        CydeoStudent student2 = new CydeoStudent("Blonker");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

    }
}


