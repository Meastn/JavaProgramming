package day31_CustomClass_Constructors.Restaurant;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;
    public String status;

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void takeOrder() {
        System.out.println(name + "is taking an order");
    }

    public void cleanTable() {
        System.out.println(name + "is cleaning the table");
    }

    public String workStatus(String status) {
        if (isFullTime == true) {
            status = "Full Time";
        } else {
            status = "Part Time";
        }
        return status;
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime +
                ", status='" + status + '\'' +
                '}';
    }
}

