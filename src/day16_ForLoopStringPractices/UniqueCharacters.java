package day16_ForLoopStringPractices;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabbcc";
        String result = "";


        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = "" + str.charAt(i);
            //System.out.println(ch);
            if (!result.contains(ch)) {
                result += ch;
            }
        }
        System.out.print(result);
    }
}
