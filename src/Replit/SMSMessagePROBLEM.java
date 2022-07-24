package Replit;
import java.util.Scanner;
public class SMSMessagePROBLEM {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String message = scan.nextLine();




    String body = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";

    String sender = body.substring(0,7) + " " + body.substring((body.indexOf("<")+1), body.indexOf(">"));
    String phoneNumber = "Phone Number: " + body.substring((body.indexOf("[")+1), body.indexOf("]"));
    String messageBody = "Message body: " + body.substring((body.indexOf("{")+1), body.indexOf("}"));

    System.out.println(sender);
    System.out.println(phoneNumber);
    System.out.println(messageBody);

}
}

