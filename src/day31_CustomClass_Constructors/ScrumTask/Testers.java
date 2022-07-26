package day31_CustomClass_Constructors.ScrumTask;

public class Testers {


    // ATTRIBUTES
    public String name, jobTitle;
    public int employeeID, salary;

    // CONSTRUCTOR
    public Testers(String name, String jobTitle, int employeeID, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }
// TOSTRING
    public String toString() {
        return "Testers{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }

    public void smokeTesting() {
        System.out.println(name + "is doing a smoke testing");
    }

    public void creatingTicket() {
        System.out.println(name + "is creating tickets");
    }

    public void dailyStandUp() {
        System.out.println(name + "is at the daily stand up meeting");
    }


}

/*
Create a class called Tester

Attributes:
name, employeeID, JobTitle, Salary
Add a constructor that can set all the fields

Actions:
smokeTesting(), creatingTicket(), dailyStandUp (), toString ()
 */