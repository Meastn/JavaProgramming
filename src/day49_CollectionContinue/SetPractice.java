package day49_CollectionContinue;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {
        String [] arr ={"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Coke", "Eggs", "Paper Towels" };

        Set <String> orderedWithoutDuplicates = new TreeSet<>();

        Set <String> inorderedWithoutDuplicates = new HashSet<>();

        orderedWithoutDuplicates.addAll(Arrays.asList(arr));
        inorderedWithoutDuplicates.addAll(Arrays.asList(arr));
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("orderedWithoutDuplicates = " + orderedWithoutDuplicates);
        System.out.println("inorderedWithoutDuplicates = " + inorderedWithoutDuplicates);

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);

        System.out.println("arr = " + Arrays.toString(arr));

    }
}
