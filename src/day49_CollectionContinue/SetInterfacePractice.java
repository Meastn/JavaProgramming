package day49_CollectionContinue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfacePractice {

    public static void main(String[] args) {

        Set <Integer>  newList = new HashSet<>();
        newList.addAll(Arrays.asList(200,10,56,73,345));

        System.out.println(newList );

    }
}
