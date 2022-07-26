package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Catherine", 'F',24,00112, 'B' );

        Student student2 = new Student();
        student2.setInfo("Jacqlueen", 'F',35,00113, 'C' );

        Student student3 = new Student();
        student3.setInfo("George", 'M',28,00114, 'A' );

        Student student4 = new Student();
        student4.setInfo("Bob", 'M',43,00115, 'D' );

        Student student5 = new Student();
        student5.setInfo("Margaret", 'F',31,00116, 'A' );


        Student [] students = {student1,student2, student3, student4, student5};

        for (Student  student : students) {
            System.out.println(student);
        }

        System.out.println("-----------------------------");
        ArrayList <Student> earlyBirds = new ArrayList<>(); // which student has grade A
        ArrayList<Student> angryBirds = new ArrayList<>(); // other than grade A

        for (Student student : students) {

            if(student.grade == 'A') {
                earlyBirds.add(student);
            } else {
                angryBirds.add(student);
            }
            
        }
        System.out.println("Early Birds : " + earlyBirds);
        System.out.println("Angry Birds : " + angryBirds);

    }
}
