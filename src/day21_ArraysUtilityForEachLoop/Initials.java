package day21_ArraysUtilityForEachLoop;

import java.util.Arrays;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"Ali Veli", "Hasan Oğlan", "Sarı Kız", "Satılmış Bakan", "Durmuş Akan", "Muzaffer Düdük"};

        String[] reversed = new String[names.length];
        System.out.println("----NORMAL ORDER-----");
        System.out.println(Arrays.toString(names));
        System.out.println("----INITIALS-----");
        for (String each : names) {
            String initials = each.charAt(0) + "." + each.charAt(each.indexOf(" ") + 1);
            System.out.print(initials + ", ");
        }
        System.out.println();
        System.out.println("----REVERSED ORDER-----");
        for (int i = names.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = names[i];
        }
        System.out.println(Arrays.toString(reversed));
        System.out.println("----INITIALS-----");
        for (String each : reversed) {
            String initials = each.charAt(0) + "." + each.charAt(each.indexOf(" ") + 1);
            System.out.print(initials + ", ");
        }

    }
}
