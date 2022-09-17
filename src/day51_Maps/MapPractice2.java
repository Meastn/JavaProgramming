package day51_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 119000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;

        String nameWithMax = "";
        String nameWithMin = "";

        Map<String, Integer> topSalaries = new HashMap<>();
        Map<String, Integer> lowSalaries = new HashMap<>();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();
            if (eachValue > maxSalary) {
                maxSalary = eachValue;
                nameWithMax = eachKey;
            }
            if (eachValue < minSalary) {
                minSalary = eachValue;
                nameWithMin = eachKey;
            }

        }
        System.out.println("Employee with the highest salary = " + nameWithMax);
        System.out.println("Employee with the lowest salary = " + nameWithMin);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 120000 && entry.getValue() < 150000) {
                topSalaries.put(entry.getKey(), entry.getValue());
            }
            if (entry.getValue()<118000){
                lowSalaries.put(entry.getKey(), entry.getValue());
            }

        }
        System.out.println("Employees with salaries >120000 USD and <15000 USD= " + topSalaries);
        System.out.println("Employees with salaries <118000 USD = " + lowSalaries);

        System.out.println("-----------------");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            entry.setValue(entry.getValue()+5000);
        }
        System.out.println("New salaries = " + map);
    }
}



/*
Given the following map that contains
the employee name and their salary



1.1 Who has the maximum salary?
1.2 Who has the minimum salary?
1.3 How many employees have salaries
between 120k-150k?
1.4 display the names of the employees
with salaries less then 118k?
1.5. increase the salary of each employee
by 10k


 */