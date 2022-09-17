package day51_Maps;

import java.util.*;

public class MapClasses {

    public static void main (String[] args){

       // Map <Integer, String> map1= new ArrayList<>();
        // There is no IS A relation between Collection and Maps. Therefore you
        // can not polymorph an ArrayList to a Map
        //    key      value
        Map <Integer, String> hashmap1= new HashMap<>();
        Map <Integer, String> linkedHashMap= new LinkedHashMap<>();
        Map <Integer, String> hashtable= new Hashtable<>();
        Map <Integer, String> treeMap= new TreeMap<>();


        hashmap1.put(45, "Ayşe");
        hashmap1.put(46, "Alex");
        hashmap1.put(47,"George");
        linkedHashMap.put(null, "Zibidi");
        hashmap1.put(null, "Hobidi");
        //treeMap.put(null, "hulahup"); // Treemap will give a NullPointerException since it does not accept null keys or values
        // hashtable.put(null, "lillabop"); // Hashtable will give a NullPointerException since it does not accept null keys or values
        linkedHashMap.putAll(hashmap1);

        System.out.println("hashmap1 = " + hashmap1);
        System.out.println("linkedHashMap = " + linkedHashMap);
        System.out.println("hashmap1 2nd run = " + hashmap1);
        System.out.println(hashmap1.get(46));

    }
}
