package day28_ArrayList;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayListIntro {
    // ArrayList is part of COLLECTIONS
    // Therefore it can only contain Objects and does not accept primitive data types
    // ArrayList adjust its size automatically, and you don't have to define a size or recalculate it each time.
    // It determines its size by the number of elements in its Array
    // therefore it contains ADD/REMOVE ELEMENTS method by default
    // we have to import the ArrayList class first by import java.util.ArrayList;
    // METHODS OF ARRAY LIST
    /*
    add (Data)  : adds the data after the last index number of the ArrayList
    add (index, Data) : inserts the data at a given index and shifts the others by one
    size () : returns the total number of elements in an Array list
    get (index) : returns the value of a specific element at given index
    set (index, Data) : replaces the value of element at a given index with a given new value
    remove (index) : it removes the element at the given index DONT USE IN A LOOP
    remove (Object) : remove the given object from Arraylist and returns a boolean value DON'T USE IN A LOOP
    clear () : it removes all the elements from an ArrayList, it
    indexOf (Data) .: returns the first matching index number of the given Data. it retuns an int
    lastIndexOf (Data): returns the last matching index number of the given Data. it returrns an int
    contains (Data) : returns if the element is contained in the last and returns a boolean value
    equals(Arraylist) : compares if two Arraylists contain same elements. returns a boolean value, Equals mean same elements in same order
    isEmpty() : checks if an Arraylist is empty or not. If it is empty it retuns boolean value of true
    BULK OPERATION METHODS
    containsAll()
    addAll()
    removeAll()
    retainAll()
     */
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>(); //second data type declation is optional, don't use normally
        ArrayList <String> names = new ArrayList<>();
        System.out.println(numbers); // we don't have to recall toString to print Arraylist it implicitly does it having the method already defined
        System.out.println(names);
    }





}

