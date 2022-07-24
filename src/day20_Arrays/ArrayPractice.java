package day20_Arrays;
import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
        String months[] = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September",
                "October", "November", "December"};
        System.out.print("As a incrementing list: ");
        for (int i = 0; i <months.length ; i++) {
            System.out.print(months[i] + ", ");
        }
        System.out.println();
        System.out.println("-----------");
        System.out.println("As an Array : " + Arrays.toString(months));
        System.out.println("-----------");
        System.out.print("As a decrementing list: ");
        for (int j = months.length-1; j >= 0 ; j--) {
            System.out.print(months[j] + ", ");
        }
    }
}
