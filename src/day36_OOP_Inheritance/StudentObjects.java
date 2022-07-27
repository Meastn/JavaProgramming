package day36_OOP_Inheritance;

public class StudentObjects {
    public static void main(String[] args) {

        Student s1 = new Student("Jack", 34,'M','C');
        System.out.println(s1);
        Student s2 = new Student("Joanna",21,'F','A' );

        s2.setName("Zi zU Ang");
        System.out.println(s2);
    }
}
