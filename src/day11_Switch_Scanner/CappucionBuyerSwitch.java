package day11_Switch_Scanner;

import java.util.Scanner;

public class CappucionBuyerSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which size of Cappucino do you prefer?");
        System.out.println("1) Tall");
        System.out.println("2) Grande");
        System.out.println("3) Venti");
        System.out.println("==========");
        int chose = scan.nextInt();
        double price = 1;
        int calories = 1;
        String result = "";

        switch (chose) {
            case 1:
                result = "Tall";
                price = 3.69;
                calories = 90;
                break;
            case 2:
                result = "Grande";
                price = 3.99;
                calories = 120;
                break;
            case 3:
                result = "Venti";
                price = 4.29;
                calories = 150;
                break;
            default:
                result = "Invalid Size";
        }
        System.out.println("Your order: \t" + result + "\n\t\t\t\tprice : $" + price + "\n\t\t\t\t" + calories + " calories");
    }
}
