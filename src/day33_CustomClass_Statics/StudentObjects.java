package day33_CustomClass_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student std1 = new Student("Jayleen");
        Student std2= new Student("Bob",'M');
        Student std3 = new Student("Jack", 12345);
        Student std4= new Student("Kraken",12346,'F' );
        Student std5 = new Student("Leanna", 'M', 18);
        Student std6 = new Student("Keoks",'F', 15, 12348);
        Student std7 = new Student("Libinanni", 'M', 'F', 18, 12349);

        System.out.println(std1==std2);
        Student [] students = {std1,std2, std3,std4,std5,std6,std7};

        System.out.println(Arrays.toString(students));

    }
}
