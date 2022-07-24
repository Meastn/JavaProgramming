package day7_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int number = 100;
        System.out.println("number = " + number);
        
        number = 200;
        System.out.println("number = " + number);

        String name = "Java";
        System.out.println("name = " + name);
        name = "c##";
        System.out.println("name = " + name);

        System.out.println("-----------------");

        int x = 100;
        System.out.println("x = " + x);

        x += x;
        System.out.println("x = " + x);

        String str = "Wooden";
        System.out.println("str = " + str);
        str += " Block";
        System.out.println("str = " + str);
        System.out.println("-----");
        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1 += num1;
        System.out.println("num1 = " + num1);
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        System.out.println("--------------");

        double availableBalance = 1000.5;

        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);
        
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("--------");

        double salary = 50000.50;
        System.out.println("Current salary = " + salary);
        salary *= 1.25; // % 25 increase to salary
        System.out.println("Updated salary = " + salary);

        System.out.println("----------Remainder-----");

        double num2 = 100;
        
        num2 %= 5;
        System.out.println("num2 = " + num2);

        double amount = 127.0;

        amount %= 25;
        System.out.println("amount = " + amount);

        int y = 300;

        y %= 16;
        System.out.println("y = " + y);

        System.out.println("----------------");

         int balance = 3500;
         // insurance fee = $153
        int months;
        months = balance / 153;
        balance %= 153;

        System.out.println("How many months that can be paid = " + months + " months");
        months += 1;
        System.out.println("On the " + months + "rd month you will have $" + balance + " left.");
        System.out.println("And you'll need $" + (153 - balance) + " more to pay your next insurance fee ");




    }

}

/*
Assignment Operator  = it assigns a value ie. x=y

Addition Assignment x+=y meaning x= x + y
Subtraction Assignment x-=y meaning x= x-y
Multiplication Assignment x*=y meaning x = x * y
Division Assignment x/=y meaning x = x / y
Remainder Assignment x%=y meaning x = x % y

 */