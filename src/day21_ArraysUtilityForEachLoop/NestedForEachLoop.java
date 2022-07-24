package day21_ArraysUtilityForEachLoop;

public class NestedForEachLoop {
    public static void main(String[] args) {
        String[] words = {"Ali", "Ayşe", "Mehmet", "Ahmet","Ali", "Hasan", "Remzi", "Ahmet", "Mehmet"};

        for (String each : words) {
            int frequency = 0;
            for (String beach : words) {
                if (each.equals(beach)){
                    frequency ++;

                }
            } if (frequency == 1) {
                System.out.print( each + ", ");
            }
        }

    }
}


/*
 String[] words = {"java", "kerbel", "java", "C#", "C#", "Python"};


        for (int j = 0; j < words.length; j++) {
            String element = words[j];
            int frequency = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.println(element);
            }
 */