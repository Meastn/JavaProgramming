package day32_CustomClass_Constructors;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Jack");
        System.out.println(employee1);

        Employee employee2 = new Employee("John", "SDET");

        System.out.println(employee2);
    }
}
