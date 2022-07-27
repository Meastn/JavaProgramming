package day33_CustomClass_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmet  ";
        employee1.salary = 102300.0;
        Employee employee2 = new Employee();
        employee2.name = "Jane   ";
        employee2.salary = 92800.0;
        Employee employee3 = new Employee();
        employee3.name = "Cracken";
        employee3.salary = 121100.0;

        System.out.println(employee1.name + " : " + employee1.salary + " and isHuman: " + employee1.isHuman);
        System.out.println(employee2.name+ " : " + employee2.salary + "  and isHuman: " + employee2.isHuman);
        System.out.println(employee3.name+ " : " + employee3.salary + " and isHuman: " + employee3.isHuman);


    }




}
