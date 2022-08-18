package day43_Abstraction.EmployeeTask;

public final class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " as a " + getJobTitle() + " develops code");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 8 hours a day");
    }

    public void unitCoding(){
        System.out.println(getName() + " as a " + getJobTitle() + "carries out unit tests");
    }

}
