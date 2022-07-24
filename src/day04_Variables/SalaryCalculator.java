package day04_Variables;

public class SalaryCalculator {

    public static void main(String [] args) {
// hourly Rate, Weekly hours
        int hourlyRate = 65;
        int weeklyHours = 45;
        int numberOfWeeks = 52;

        int salary= hourlyRate * weeklyHours * numberOfWeeks;

        System.out.println("\t Weekly Working Hours = " + weeklyHours);
        System.out.println("\t Hourly Working Rate  = $ " + hourlyRate);
        System.out.println("\n\t Your salary (annual) = $ " + salary);

    }
}
