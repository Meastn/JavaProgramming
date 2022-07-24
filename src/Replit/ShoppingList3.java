package Replit;
import java.util.Scanner;

public class ShoppingList3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item="";
        String list="";
        int count=1;
        //String continue = "";
        double price = 0;

        double totalPrice = 0;

        for (int i=1; i<=10;i++) {
            count ++;
            System.out.println("Enter item"+count + " and its price");
            item = scan.nextLine();
            list= item+item;
            price = scan.nextDouble();
            price ++;

        }
    }
}

