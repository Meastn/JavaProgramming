package day11_Switch_Scanner;

public class BrowserName {

    public static void main(String[] args) {
        String browserName = "blox";
        switch (browserName) {
            case "chrome":
                System.out.println("Selected Browser is: " + browserName);
                break;
            case "firefox":
                System.out.println("Selected Browser is: " + browserName);
                break;
            case "edge":
                System.out.println("Selected Browser is: " + browserName);
                break;
            case "safari":
                System.out.println("Selected Browser is: " + browserName);
                break;
            case "opera":
                System.out.println("Selected Browser is: " + browserName);
                break;
            default:
                System.out.println("Invalid Browser name : " + browserName);
        }
    }
}

/*
write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */