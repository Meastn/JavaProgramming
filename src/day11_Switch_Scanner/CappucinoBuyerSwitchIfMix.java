package day11_Switch_Scanner;

import java.util.Scanner;

public class CappucinoBuyerSwitchIfMix {

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
        if (chose >= 1 && chose <= 3) {
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
                default:
                    result = "Venti";
                    price = 4.29;
                    calories = 150;
            }

        } else {
            result = "Invalid Size";
        }
        System.out.println("Your order: \t" + result + "\n\t\t\t\tprice : $" + price + "\n\t\t\t\t" + calories + " calories");
    }
}

/*
Create a class called  CappuccinoBuyer.
A variable named Size is given, write a program that
can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:
						tall:
								price is $3.69
								90 calories
						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories
			If the size is invalid then the output should be "Invalid Size"
			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixe
 */
 /* if (chose >=1 && chose <=3) {
            if (chose ==1) {
                result = "Tall";
                price = 3.69;
                calories = 90;
            } else if (chose== 2){
                result = "Grande";
                price = 3.99;
                calories = 120;
            } else {
                result = "Venti";
                price = 4.29;
                calories = 150;
            }
        }else {
            result = "Invalid Size";
        }
        System.out.println("Your order: \t" + result + "\n\t\t\t\tprice : $" + price + "\n\t\t\t\t" + calories + " calories");
*/