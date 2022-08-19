package Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        int dividend = 0;
        int remainder =0;

        //TODO: Write your code below.

        for (int i = binary.length-1; i >=0 ; i--) {

            if (decimal % 2 == 1) {
                binary[i] = 1;
            } else if (decimal % 2 == 0) {
                binary[i] = 0;
            } else {
                binary [i] =0;
            }
            decimal /= 2;
        }
        System.out.println(Arrays.toString(binary));
        }


    }

/*
A Binary number is a number expressed in the base-2 numeral
system or binary numeral system,
which uses only two symbols: 0 (zero) and 1 (one).
Each digit is referred to as a bit.


Given an int variable **decimal**,
write java program to calculate binary value of
the **decimal** variable and assign it to a binary array.
Print out value of binary array matching below format.
Feel free to use additional arrays or formulas.

Example:

```
decimal -> 3

binary -> [0, 0, 0, 0, 0, 0, 1, 1]
```

```
decimal -> 35

binary -> [0, 0, 1, 0, 0, 0, 1, 1]
```

```
decimal -> 255

binary -> [1, 1, 1, 1, 1, 1, 1, 1]

To convert numbers from decimal to binary,
the given decimal number is divided repeatedly by 2 and the remainders are noted down
till we get 0 as the final quotient.
The following steps is considered as the decimal to binary formula
that shows the procedure of conversion.
------
Step 1: Divide the given decimal number by 2 and note down the remainder.
Step 2: Now, divide the obtained quotient by 2, and note the remainder again.
Step 3: Repeat the above steps until you get 0 as the quotient.
Step 4: Now, write the remainders in such a way that the last remainder is written first, followed by the rest in the reverse order.
Step 5: This can also be understood in another way which states that the Least Significant Bit (LSB) of the binary number is at the top and the Most Significant Bit (MSB) is at the bottom. This number is the binary value of the given decimal number.
Let us understand this with an example.


 */