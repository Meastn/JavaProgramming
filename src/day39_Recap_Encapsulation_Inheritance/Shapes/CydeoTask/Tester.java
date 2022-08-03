package day39_Recap_Encapsulation_Inheritance.Shapes.CydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket () {
        System.out.println(getJobTitle() + " " + getName() + " is creating a ticket now.");
    }


}
