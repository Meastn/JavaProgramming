package day11_Switch_Scanner;

import java.util.Scanner;

public class Browser {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of your browser:");
        String browserName = scan.next();
        String result = "";

        boolean validBrowser = browserName.equals ("chrome") || browserName.equals ("firefox")
                || browserName.equals ("safari") || browserName.equals ("edge") || browserName.equals ("opera");

        if (validBrowser) {
            if (browserName.equals ("chrome")) {
                result = "Chrome Browser is selected";
            } else if (browserName.equals ("firefox")) {
                result = "Firefox Browser is selected";
            } else if (browserName.equals ("safari")) {
                result = "Safari Browser is selected";
            } else if (browserName.equals ("opera")) {
                result = "Opera Browser is selected";
            } else {
                result = "Edge Browser is selected";
            }
        } else {
            System.out.println("Invalid browser name");
        }
        System.out.println(result);
    }
}
