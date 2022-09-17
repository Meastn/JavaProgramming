package day51_Maps;

import java.util.*;

public class MapPractice3 {

    public static void main(String[] args) {

//        String [] group1 = {"Ali", "Veli", "Ayşe", "Habire", "Sabire"};
//        String [] group2 = {"James", "Shakira", "Arnold", "Kerem", "Merve"};
//        String [] group3 = {"Vladimir", "Recep", "Xi", "Esad", "Saddam"};
//        String [] group4 = {"Elizabeth", "Suleyman", "Alexander", "Frederick", "Nikolai"};
//        String [] group5 = {"Smiley", "Totoro", "Doraemon", "Nobita", "Lulu"};

        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayşe", "Habire", "Sabire"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Vladimir", "Recep", "Xi", "Esad", "Saddam"));
        ArrayList<String> group3 = new ArrayList<>(Arrays.asList("Elizabeth", "Suleyman", "Alexander", "Frederick", "Nikolai"));
        ArrayList<String> group4 = new ArrayList<>(Arrays.asList("Smiley", "Totoro", "Doraemon", "Nobita", "Lulu"));


        Map <Integer, ArrayList> groups = new TreeMap<>();


        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);

        System.out.println(groups);
        System.out.println(groups.get(2).get(3)); // first get the ArrayList (group2) thna get the index n. 3


        System.out.println("--------");

        for (ArrayList <String> eachGroup : groups.values()){
            for(String eachName : eachGroup){
                System.out.println(eachName);
            }
        }
    }

}
