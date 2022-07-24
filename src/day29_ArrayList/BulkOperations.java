package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,3,3,5,5,9));
        System.out.println(list);

        list.removeAll(Arrays.asList(3));
        System.out.println(list);
        list.retainAll(Arrays.asList(2,8,4));
        System.out.println(list);

        ArrayList <String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles);
        System.out.println("-------------");
        ArrayList <Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean r1 = nums.contains (10);
        System.out.println(r1);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(7); // if you need to verify if multiple elements exist use containsAll method
        System.out.println(r2);
        boolean r3 = nums.containsAll(Arrays.asList(2,5,7));
        System.out.println("r3 = " + r3);
        System.out.println("-------------");
        String [] names = {"Joshua", "Boshua", "Koshua", "Shay", "Ronald"};
        ArrayList <String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names)); // you have to use asList method to convert names Array to nameList ArrayList
        System.out.println(nameList);
        // another way to convert array to arraylist
        ArrayList <String> namesList2 = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList2); // this conversion only works from non-primitive types like String
        System.out.println("-------------");
        int [] arr = {1,2,3,4,5,6,7,8,9,10}; // can not be converted directly to ARRAYLIST
        Integer [] arr1 = {1,2,3,4,5,6,7,8,9,10}; // can be converted to ARRAY LIST
        ArrayList <Integer> arrList = new ArrayList<>(Arrays.asList(arr1)); // you can not directly convert primiteve array to Array List
        System.out.println("arrList = " + arrList);
        System.out.println("-------------");
        int [] arr3 = {1,2,3,4,5,6,7,8,9,10}; // now we can use our custom method
        ArrayList <Integer> arrList2 = new ArrayList<>(convertArrayToArrayList(arr3));
        System.out.println("arrList2 = " + arrList2);
    }
    
    public static ArrayList<Integer> convertArrayToArrayList (int [] array) {
        
        ArrayList <Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }

}

// BULK OPERATION METHODS
    /*
    addAll(CollectionType): adds collection of values to an ArrayList
    removeAll(CollectionType): removes all the matching elements from the ArrayList even if they are repeated multiple times
    retainAll(CollectionType): removes all the non-matching elements from the ArrayList even if they are repeated multiple times
    containsAll(CollectionType): checks if all the given elements are contained in the arrayList


Arrays:
    asList (array of values) =====> returns the array as Collection TYpe, it is a must to use bulk methods for ArrayLists
    */
// To work with a group of data instead of working one by one

/*
REMOVE FUNCTIONS:

    remove () : when we remove a single element. DO NOT USE WITHIN A LOOP
    removeAll () : when we remove multiple elements (if elements that we want to remove are  known
    retainAll () . when  we want to retain certain  and known multiple elements and get rid of all others
    removeIf () : when we remove multiple or single elements under a condition (if the elements we want to remove are unknown)
 */