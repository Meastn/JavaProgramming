package day43_Abstraction.EmployeeTask;

public final class Tester extends Employee {

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + "  is a tester working in the Development team");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " sleep during the day as a Tester");
    }

    public void bugreport(){
        System.out.println(getName() + " creates bug reports");
    }
}
