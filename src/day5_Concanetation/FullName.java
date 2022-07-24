package day5_Concanetation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Melih Rüştü";
        String lastName = "Çalıkoğlu";
        String fullName = firstName + " " + lastName + " ";
        String companyName = "Microhard Corp.";
        int age = 49;
        String jobTitle = "JSDET";
        double salary = 46000.50;
        char currency = '€';

        System.out.println("Full name of the person is : " + firstName + " " + lastName);
        System.out.println(fullName + "is " + age + " years old.");
        System.out.println(fullName + "works as a " + jobTitle + " at " + companyName);
        System.out.println(fullName + "receives a annual salary of" + currency + " " + salary  );
    }
}
