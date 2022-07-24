package practice;
import java.util.Scanner;
public class DistanceAU {
    public static void main(String[] args) {
        double lightSecond = 299792.458;
        double lightMinute = lightSecond*60;
        double lightHour= lightMinute*60;
        double lightDay=lightHour*24;
        double lightMonth= lightDay*30;
        double lightYear = lightDay*365;
        double au = 149597871.0;
        double distanceVoyager1= 23316048500.0;

        System.out.println(" 1 light day equals to " + au/lightSecond+ " light seconds");
    }

}
