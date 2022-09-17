package practice;

public class ShoppingList {
    public static void denemeMethod (){
        System.out.println("deneme method");
    }
    public static void main(String[] args) {

        String item1, item2, item3;
        double price1, price2, price3;


        item1 = "Tomatoe";
        item2 = "Potatoes";
        item3 = "Cucumbers";
        price1 = 2.34;
        price2 = 4.41;
        price3 = 1.21;
        double result=price1 + price2 + price3;

        System.out.println("Price Report");
        System.out.println( item1 + " = " + "$ " + price1 );
        System.out.println( item2 + " = " + "$ " +  price2);
        System.out.println( item3 + " = " + "$ " +  price3);
        System.out.println( "Total Price is : "+ "$ " + result);
    }




    /*
    In this assignment you will write a program to create a shopping list and prices.

Enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

Example:

Enter Item1 and its price:
Tomatoes
5.5
"Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
     */
}
