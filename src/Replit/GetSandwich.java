package Replit;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class GetSandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String keyword = "bread";
        int firstindex=0;
        int lastindex=0;
        firstindex = str.indexOf(keyword);
        firstindex = firstindex + keyword.length();
        lastindex = str.lastIndexOf (keyword);

        if (firstindex >= 0  && lastindex >=0 && str.length()>10 ) {
            System.out.println(str.substring(firstindex,lastindex));
        } else {
            System.out.println("nothing");
        }

        }
    }



                // if (str.startsWith(keyword)){

               // }
                /* if (str.contains(keyword+given) || str.contains(given+keyword)) {
                    System.out.println("nothing");
                } else {
                    System.out.println(given);
                }
                break;
                */







