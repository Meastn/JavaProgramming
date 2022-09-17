package day50;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        // Remove all the elements which are less than 4
        // simple for loop does not work to remove elements from the data Structure
        for (int i=0; i<list.size();i++){
            if (list.get(i)<4){
                list.remove(i);
            }


        }
        System.out.println(list);

        System.out.println("--------APPLYING ITER LOOP");
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        Iterator<Integer> it =list2.iterator();
        boolean r1 = it.hasNext(); // returns boolean
        System.out.println(r1);
        //System.out.println(it.next());
        System.out.println(list2);
        while (it.hasNext()){
            if (it.next() < 4){
                it.remove();
            }

        }
        System.out.println(list2);

        System.out.println("--------APPLYING ITER WITH FOR LOOP");
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for (Iterator<Integer> i=list3.iterator(); i.hasNext();){

        }
        }
    }

