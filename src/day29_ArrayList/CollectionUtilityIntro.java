package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilityIntro {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,5,2,8,34,2,9,6,12,54));
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("Sorted list with Collection Sort Utility  = " + list);
        Collections.reverse(list);
        System.out.println("Reversed list with Collection Reverse Util= " + list);
        Collections.swap(list, 3,9);
        System.out.println("Swap 9 with 1 with Collection Swap Util  =" + list);
        ArrayList <String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Merve", "İrem","Kubilay", "Melih", "Rufeyde", "Esma", "Aysel", "Selim", "Melih"));

        int countMelih = Collections.frequency(names, "Melih");
        System.out.println("frequency of "+ names.get(3) +" in the list is : " + countMelih);

    }
}


/* Collection UTILITY METHODS :

It contains very useful methods to be used with collection data sets ie. ArrayList

    sort () : it sorts an ArrayList
    reverse () : it reverses an ArrayList
    swap () : it swaps to different element within an ARRAYLIST

 */