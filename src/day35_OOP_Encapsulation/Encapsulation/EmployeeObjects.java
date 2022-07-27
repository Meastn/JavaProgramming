package day35_OOP_Encapsulation.Encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee("au",'M',12,3000.00);
        Employee e2 = new Employee("Joanna",'F',37,45000.00);
/*
        e1.setName("Michael");e2.setName("Joanna");
        e1.setGender('M'); e2.setGender('F');
        e1.setAge(23); e2.setAge(37);
        e1.setSalary(3000.00);e2.setSalary(45000.00);
*/
        System.out.println(e1);
        System.out.println(e2);
        e2.setSalary(64000.00);
        System.out.println(e2.getName() + " got a salary rise. Congrats!");
        System.out.println(e2);

    }
}
