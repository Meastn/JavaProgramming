package day48_Collections;

import java.util.*;

public class CollectionsIntro {

    public static void main(String[] args) {

        //POLYMORPHISM
        List<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list1.get(0)); //ArrayList is the fastest in accessing an element

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60)); //LinkedList is the fastest in adding elements
        System.out.println(list2.get(0));

        List <Integer> list3= new Vector<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list3.get(0));

        List <Integer> list4= new Stack<>();
        list4.addAll(Arrays.asList(10,20,30,40,50,60)); //60 is the last inserted object.
        System.out.println(list4.get(0));


        System.out.println("list1 as ArrayList   = " + list1);
        System.out.println("list2 as LinkedList  = " + list2);
        System.out.println("list3 as Vector      = " + list3);
        System.out.println("list4 as Vector/Stack= " + list4);

        // list4.pop --> you can not call the method from a subclass since list4 is an object created with polymorphnig to parent interface
                ((Stack) list4).pop(); // we take the last entry out. with using upcasting we can call the pop method of the grand-child Stack class
        System.out.println("list4 after the pop = " + list4);
        ((Stack) list4).push(110);
        System.out.println("list4 after the push = " + list4);
    }
}
