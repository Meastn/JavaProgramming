package day39_Recap_Encapsulation_Inheritance.Shapes.CydeoTask;

public class Employee extends Person {

    private int employeeID;
    private String jobTitle;
    private double salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isBlank() || jobTitle.isEmpty()) {
            System.out.println("Invalid name entry!");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0 || salary >150000) {
            System.err.println("Invalid salary entry!");
            System.exit(1);
        }
        this.salary = salary;
    }

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setSalary(salary);
        setJobTitle(jobTitle);
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " with ID No: " + employeeID + " is working now.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
