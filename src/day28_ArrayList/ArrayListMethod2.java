package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod2 {
    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('S');
        characters.add('E');

        int a = characters.indexOf('A'); // 0
        int b = characters.lastIndexOf('A'); // 5
        System.out.println(a);
        System.out.println(b);

        if (a == b) {
            System.out.println("This character is unique");
        } else {
            System.out.println("Not unique");
        }

        System.out.println(" The list contains S :" + characters.contains( 'S'));
        System.out.println("-------");
        ArrayList <Integer> list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(100);
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        System.out.println(list == list1);
        System.out.println(list.equals(list1));
        System.out.println("Is list empty? " + list.isEmpty());
        list.clear();
        System.out.println("Are you sure? Is the list empty now? " + list.isEmpty());
        System.out.println("------BULK OPERATIONS ADD ALL-------");
        // we need a collection type to operate bulk operatins asList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9)); // from array utility class
        System.out.println(numbers);
    }
}
