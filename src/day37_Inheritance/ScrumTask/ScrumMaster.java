package day37_Inheritance.ScrumTask;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }

    public void manageProject (){
        System.out.println(getJobTitle() + " " + getName() + "is managing the project ");
    }
}
