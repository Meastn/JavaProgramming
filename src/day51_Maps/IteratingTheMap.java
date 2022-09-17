package day51_Maps;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 65);
        students.put("Aplika", 94);
        students.put("Alex", 83);
        students.put("Sammy", 71);
        students.put("Attika", 55);
        students.put("Kemo", 45);
        students.put("Prat", 91);


        System.out.println(students);
        System.out.println("**********");
        ;

        Map<String, Integer> earlyBirds = new HashMap<>();
        Map<String, Integer> angryBirds = new HashMap<>();

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value >= 90) {
                earlyBirds.put(key, value);
            } else {
                angryBirds.put(key, value);
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);

        Set<String> namesOnly = students.keySet();
        System.out.println("namesOnly = " + namesOnly);
        Collection<Integer> pointsOnly = students.values();
        List<Integer> scores = new ArrayList<>();
        System.out.println("pointsOnly = " + pointsOnly);


        System.out.println("-------Find Maximum, Find Minimum---");

        int maxScore = Integer.MIN_VALUE; // use MIN-VALUE method from Integer Wrapper class
        int minScore = Integer.MAX_VALUE;
        int totalScore = 0;
        for (Integer score : students.values()) {
            totalScore += score;
            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
        }

        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);
        System.out.println("totalScore = " + totalScore);
        System.out.println("Average Score=" + (float) totalScore / students.size());


        System.out.println("-------");
        int max = Collections.max(students.values());
        int min = Collections.min(students.values());
        // There are also COLLECTIONS utility class methods min and max that can be used to achieve
        // the same result. But in interviews they can block you to use them. If so apply the above for loop

        int max2 = Collections.max(students.values());
        int min2 = Collections.min(students.values());
        System.out.println("min2 = " + min2);
        System.out.println("max2 = " + max2);


        System.out.println("------");

        int count=0;
        for (Integer eachScore : students.values()) {
            if (eachScore >=90){
                count ++;
            }
        }

        System.out.println(students);
        System.out.println("Students with a score greater than 90: " + count);
        System.out.println("---------");
        count=0;
        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if (eachScore <=50){
                count ++;
            }
        }
        System.out.println("Students with a score lower than 50 : " + count);
        System.out.println("------");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }




    }




}
