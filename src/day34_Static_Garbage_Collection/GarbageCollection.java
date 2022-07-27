package day34_Static_Garbage_Collection;

import day31_CustomClass_Constructors.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 =list1;
        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list1=list2);
        System.out.println("----------");

        Student student1= new Student("Abby", 'F', 18,'F');
        student1.grade = 'A';
        Student student2 = student1;
        student1.name ="Lobby";
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("---------------");
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Mava");
        l2 =l1;
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);





    }

}
