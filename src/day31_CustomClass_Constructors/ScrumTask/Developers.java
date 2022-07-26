package day31_CustomClass_Constructors.ScrumTask;

public class Developers {

    public String name, jobTitle;
    public int employeeID, salary;

    public Developers(String name, String jobTitle, int employeeID, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String toString() {
        return "Developers{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }

    public void coding() {
        System.out.println(name + "is coding");
    }

    public void unitTesting() {
        System.out.println(name + "is unit testing");
    }

    public void fixingBug() {
        System.out.println(name + "is fixing a bug");
    }

}
