package day30_CustomClasses;

public class Employees {

    public String name;
    public int ID;
    public char gender;
    public String jobTitle;
    public int salary;
    public boolean isFullTime;

    public void setInfo (String name, int ID, char gender, String jobTitle, int salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work () {
        System.out.println(name + " is working");
    }

    public void sleep () {
        System.out.println(name + " is sleeping");
    }
}


// name, ID, gender, jobTitle, salary, isFullTime (boolean)