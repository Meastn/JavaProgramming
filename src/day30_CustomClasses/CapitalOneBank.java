package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CapitalOneBank {

    public static void main(String[] args) {

        Employees employee1 = new Employees();
        employee1.setInfo("Jack", 11155, 'M', "SDET", 49000, true);
        Employees employee2 = new Employees();
        employee2.setInfo("James", 11156, 'M', "Developer", 69000, true);
        Employees employee3 = new Employees();
        employee3.setInfo("Jacquleen", 12150, 'F', "Junior SDET", 29000, false);
        Employees employee4 = new Employees();
        employee4.setInfo("Mary", 11157, 'F', "Developer", 79000, true);
        Employees employee5 = new Employees();
        employee5.setInfo("Hope", 12151, 'F', "Scrum Master", 59000, false);

        Employees[] employeeList = {employee1, employee2, employee3, employee4, employee5};

        ArrayList<String> fullTime = new ArrayList<>();
        ArrayList<Employees> allEmployees = new ArrayList<>();
        allEmployees.addAll(Arrays.asList(employeeList));
        int countFullTime = 0;
        int countPartTime = 0;
        int max = employeeList[0].salary;
        int min = employeeList[0].salary;
        for (Employees employee : employeeList) {
            if (employee.isFullTime) {
                fullTime.add(employee.name);
                countFullTime ++;
            } else {
                countPartTime ++;
            }
            if (employee.salary > max ) {
                max = employee.salary;
            }
            if (employee.salary < min ) {
                min = employee.salary;
            }
        }
        System.out.println("Our Full Time Employees : " + fullTime);
        System.out.println("There are " + countFullTime + " full time employees");
        System.out.println("There are " + countPartTime + " part time employees");
        System.out.println("Highest salary is : " + max);
        System.out.println("Lowest salary is : " + min);



    }
}
