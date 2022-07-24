package day17_BranchingWhile;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int divider;
        int remaining = 0;
        int divideBy15 = 0, divideBy3 = 0, divideBy5 = 0;

        // this part divides the number to 15
        divider = 15;
        remaining = num1 - (num1 % divider); // each time the divider changes the value of remaining must be recalculated
        if (remaining % 15 == 0) { // to be sure remaining is limited not to leave a remainder
            System.out.print(" Divisible by 15: ");
            for (int i = 15; i <= remaining; i = i + 15) {
                divideBy15 += 15;
                System.out.print(divideBy15 + " ");
            }
        }

        // this part divides the number to 3
        divider = 3;
       remaining = num1 - (num1 % divider); // remaining is recalculated for dividing with 3
        if (remaining % 3 == 0) { // not to print other options
            System.out.println(); // to create a new line before declaring next set
            System.out.print(" Divisible by 3 : "); // title with no new line to receive the numbers side by side
            for (int y = 3; y <= remaining; y = y + 3) { // to create a loop that will ensure it repeats itself by adding 3(divider) each time
                divideBy3 += 3; // divide is recalculated to be printed each time
                if (divideBy3 % 15 == 0) { // to be sure division by 15's are excluded from the set
                    continue; // skipping numbers that can both be divided by 3 and 15
                }
                System.out.print(divideBy3 + " "); // printing each added number to the set side by side
            }

            // this part divides the number to 5
            divider = 5;
            remaining = num1 - (num1 % divider); // remaining is recalculated for dividing with 5
            if (remaining % 5 == 0) {
                System.out.println();
                System.out.print(" Divisible by 5 : ");
                for (int z = 5; z <= remaining; z = z + 5) {
                    divideBy5 += 5;
                    if (divideBy5 % 15 == 0) {
                        continue;
                    }
                    System.out.print(divideBy5 + " ");

                }

            }
        }
    }
}

/*
    int times = scan.nextInt();

    int num1 = 0, num2=1, sum=0;

        for (int i=1; i<=times; i++) {
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;
                }

/*
Write a program that can print the numbers between
1 ~ N that can be divisible by 3, 5, and 15.
	 if the number can be divisible by 3, 5 and 15,
	 then it should only be displayed in DivisibelBy15' section

	 if the number can be divisible by 3 but cannot be divisible by 15,
	 then it should only be displayed in DivisibelBy3' section

	 if the number can be divisible by 5 but cannot be divisible by 15,
	 then it should only be displayed in DivisibelBy5' section

	 EX:
	 input: 100

	 Output:
	 Divisible By 15 15 30 45 60 75 90
	 Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
	 Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96
 */