package Replit.Arrays;

import day21_ArraysUtilityForEachLoop.toCharArray;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        String emailID = "";
        String domain = "";
        int count =0;

        String [] emailComponents = email.split("@");

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@'){
                count ++;
            }
        }

        if (count == 0 || count >=2) {
            System.out.println("invalid email");
        } else {

            emailID = emailComponents[0];
            domain = emailComponents[1];

            System.out.println("Email id: " + emailID);
            System.out.println("Email domain: " + domain);
        }

    }
}



/*
Given a String variable **email**,
write code using split method to print email id and domain in separate lines.

Example:

```
email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
```

If email contains no @ character or multiple @ characters then print _**invalid email**_:

```
email -> hello-gmail.com

Output:
invalid email
```

```
email -> my@fancy@email.com

Output:
invalid email
```
 */