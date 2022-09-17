package day51_Maps;

import java.util.*;

public class MapPractice1 {

    public static void main(String[] args) {

        Map <String, String> employeeMap = new HashMap<>();
        employeeMap.put("Odine", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        for (String key : employeeMap.keySet()) {
            if (employeeMap.get(key).equalsIgnoreCase("m")){
                employeeMap.replace(key, "Male");
            }
            if (employeeMap.get(key).equalsIgnoreCase("f")){
                employeeMap.replace(key, "Female");
            }
        }
        System.out.println(employeeMap);

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("Male")){
                entry.setValue("Man");
            }
        }
        System.out.println(employeeMap);


        System.out.println("-----------");


        // Display the names of all Female employees
        List<String> femaleEmployees = new ArrayList<>();
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("Female")){
                 femaleEmployees.add (entry.getKey());
            }
        }
        System.out.println("Female Employees =" + femaleEmployees);
    }
}
