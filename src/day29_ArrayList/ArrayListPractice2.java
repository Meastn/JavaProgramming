package day29_ArrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Danile", "Aaron", "Ahmed", "David", "Shay"));
        employees.retainAll(Arrays.asList("Ahmed", "David"));
        System.out.println(employees);

        System.out.println("---------");
        String [] employeeList ={"Ali", "David", "Ahmed", "Jimmy", "Danile", "Aaron", "Ahmed", "David", "Shay"};

        ArrayList<String> list = new ArrayList<> (Arrays.asList(employeeList));

        list.removeIf(p -> p.charAt(0) == 'D');


       employeeList=  list.toArray(new String[0]);
        System.out.println(Arrays.toString(employeeList));


    }
}


/*
Remove all the employees from the list other than Ahmet and David
 */