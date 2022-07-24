package Replit;

import java.util.*;

public class Android {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Android version: ");
        double version = input.nextDouble();
        boolean isValid = version == 1.5 || version == 1.6 || version == 2.1 || version == 2.2 || version == 2.3 || version == 3.1 || version == 4 || version == 4.1 || version == 4.4 || version == 5.0 || version == 8.0 || version == 9.0;

        //WRITE YOUR CODE HERE:
        if (isValid) {
            if (version == 1.5) {
                System.out.println("Cupcake");
                }
                else if (version == 1.6) {
                System.out.println("Donut");
                }
                else if (version == 2.1) {
                System.out.println("Eclair");
                }
                else if (version == 2.2) {
                System.out.println("Froyo");
                }
                else if (version == 2.3) {
                System.out.println("Gingerbread");
                }
                else if (version == 3.1) {
                System.out.println("Honeycomb");
                }
                else if (version == 4.0) {
                System.out.println("Ice Cream Sandwich");
                }
                else if (version == 4.1) {
                System.out.println("Jelly Bean");
                }
                else if (version == 5.0) {
                System.out.println("Lollipop");
                }
                else if (version == 8.0) {
                System.out.println("Oreo");
                }
                else if (version == 9.0) {
                System.out.println("Pie");
            }
        } else {
                System.out.println("Sorry, I don't know this version!");
            }


        }
    }
