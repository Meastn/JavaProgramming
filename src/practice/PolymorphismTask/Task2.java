package practice.PolymorphismTask;

import day43_Abstraction.EmployeeTask.Developer;
import day43_Abstraction.EmployeeTask.Employee;
import day43_Abstraction.EmployeeTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
public class Task2 {
    public static void main(String[] args) {
        Tester employee1 = new Tester("Sherali", 32, 'M', 1, "QA", 110000);
        Tester employee2 =  new Tester("Veli", 32, 'M',1, "QA", 110000);
        Tester employee3 =  new Tester("Ali", 32, 'M',1, "QA", 110000);
        Employee[] employees = {employee1,employee3,employee2};

//                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
//                new Tester("George", 28,'M', 3, "SDET", 120000),
//                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
//                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
//                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
//                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
//                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
//                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
//                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
//                new Tester("Timur",  29, 'M',11, "SDET", 115000),
//                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
//                new Tester("Iryna",  24, 'F',13, "QE", 125000),
//                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
//                new Tester("Mikael",  30, 'M',15, "SDET", 105000),


        Arrays.sort((Tester)employees);
        System.out.println(Arrays.toString(employees));
//      //  2.1 store all the developers & testers into the following List of employees
//          List<Employee> scrumMembers = new ArrayList<>();
//                scrumMembers.addAll(Arrays.asList(employees));
//
//                //2.2 store all the testers into the following List of testers:
//             List<Tester> testers = new ArrayList<>();
//        for (Employee each : scrumMembers) {
//            if (each instanceof  Tester){
//                testers.add((Tester)each);
//            }
//        }
//        //2.3 store all the developers into the following List of developers:
//        List<Developer> developers = new ArrayList<>();
//        for (Employee each : scrumMembers) {
//            if (each instanceof  Developer){
//                developers.add((Developer)each);
//            }
//        }
//
//        System.out.println(testers);
//        System.out.println(developers);
//        System.out.println(scrumMembers);
//
//    }
    }
}
/*
Given the following array that contains Employee objects:


            (import them from day43 package)










 */