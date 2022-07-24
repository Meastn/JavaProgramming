package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIfMethod {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
 /*
        for (int i=0; i<list.size(); i++) {
            if (list.get(i) %2 !=0) {
                list.remove(i); // this can not remove all duplicates because it works with index number which changes every time
                // an element is removed
            }
        }
        System.out.println(list);
  */
        list.removeIf( p -> p<5); // Lambda expression ( (predicate) -> is the TOKEN that does the job) create a variable p and allows to create boolean expressions and conditions
        // with that p
        System.out.println("list = " + list);
        list.removeIf(each -> each%2==0);
        System.out.println(list);
        
    }
}


// we can not use remove in loops when working with ARRAYLISTS. Because in an ArrayList index numbers always change
// Therefore we have to use REMOVIIF METHOD