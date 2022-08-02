package day37_Inheritance.ScrumTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void coding (){
        System.out.println(getJobTitle() + " " + getName() + " is coding");
    }

    public void fixBugs (){
        System.out.println(getJobTitle() + " " + getName() + " is fixing bugs");
    }
}
