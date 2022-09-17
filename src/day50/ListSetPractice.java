package day50;

import javax.sound.midi.Soundbank;
import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        //Integer [] array= set.toArray(new Integer [0]
        List<Integer> list= new ArrayList<>(set);
        System.out.println(list);

        System.out.println("------POP EXAMPLE------");

        List <Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        System.out.println(chars);
        ((Stack) chars).pop();
        System.out.println(chars); // D is popped out using the STACK method .pop()

        System.out.println("--------POLL EXAMPLE-------");
        List<String> names= new LinkedList<>();
        names.addAll(Arrays.asList("Akhmet","James", "Kathy","Breanna", "Max"));

        System.out.println("-----");
        System.out.println(names);
        ((LinkedList)names).poll(); // FIFO comes from QUEUE interface to the LinkedList
        System.out.println(names);


    }
}
