package day14_Strings;
import java.util.Locale;
import java.util.Scanner;

public class EmailDomain_Substring {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
        System.out.println("Please provide your email: ");
        String email = scan.next();
        String domain = email.substring (email.indexOf("@")+1, email.lastIndexOf("."));

        int beginningIndex = email.indexOf("@")+1;
        int endingIndex = email.lastIndexOf(".");
        String domain2 = email.substring(beginningIndex, endingIndex);
        domain2 = domain2.toUpperCase(Locale.ROOT);
        System.out.println("Your Email Provider is: " + domain);
        System.out.println("Your Email Provider is: " + domain2);
    }
}

/*
Write a program that can get the domain of an email.(assume a valid domain is given).
ex :
email= Cydeo.School@cydeo.com

output:
cydeo
 */