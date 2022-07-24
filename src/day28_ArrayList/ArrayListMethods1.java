package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);
        numbers.add(10); // 0- add method adds a new element after the last index -0
        numbers.add(20); // 1- add method adds a new element after the last index -1
        numbers.add(30); // 2- add method adds a new element after the last index -2
        numbers.add(40); // 4- this is shifted after add method adds en element before it
        numbers.add(50); // 6- this is shifted after add method adds en element before it
        numbers.add(60); // 7-  add method adds a new element after the last index -0
        System.out.println(numbers);
        numbers.add(3, 35); // adds element at index 3 and shift the others by one
        System.out.println(numbers);
        numbers.add(5, 45);
        System.out.println(numbers);
        System.out.println("There are currently " + numbers.size() + " elements in your array");

        int lastIndex = numbers.size() - 1;
        System.out.println("lastIndex number in your array is = " + lastIndex);
        System.out.println("third element in your array is " + numbers.get(3));

        Integer num = numbers.get(5); // creates a wrapper object from the ArrayList
        System.out.println("Integer Wrapper Object = " + num);
        int num1 = numbers.get(5); // creates a primitive by unboxing from the ArrayList
        System.out.println("Primitive Data = " + num1);
        System.out.println("-----------------");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.println("----SET METHOD-----");
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Java");
        list.add("Phython");
        list.add("Pascal");
        System.out.println("OLd List: " + list);
        list.set(2, "Javalist");
        System.out.println("New List: " + list);
        System.out.println("-------REMOVE METHOD ----------");
        ArrayList <String> employees = new ArrayList<>();
        employees.add("Ali");
        employees.add("Veli");
        employees.add("Kırkdokuz");
        employees.add("Elli");
        employees.add("Jacquleen");
        employees.add("Mark");
        employees.add("Tuck");
        System.out.println("Old Employee List :" + employees);
        String fired = employees.get(3);
        employees.remove("Elli");
        System.out.println("New list after " + fired +  " gets fired :" + employees);
        employees.remove(0);
        System.out.println("After Ali gets fired = " + employees);
        employees.remove(employees.size()-1);
        System.out.println("Tuck is fired :" + employees);
        boolean r1 = employees.remove("Mark");
        System.out.println("Is Mark fired from the company? " + r1);
        System.out.println("employees = " + employees);
        employees.clear();
        System.out.println(employees.size());



    }
}
