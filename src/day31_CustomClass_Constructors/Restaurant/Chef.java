package day31_CustomClass_Constructors.Restaurant;

public class Chef {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;
    public String status;

    public Chef(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void cookOrder() {
        System.out.println(name + "is cooking an order");
    }

    public void washDishes() {
        System.out.println(name + "is washing the dishes");
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
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime +
                ", status='" + status + '\'' +
                '}';
    }
}
