package day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aaabbffdddduufuaacdc";
        String result = ""; // it should give abfduc

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // a
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i); // each character representing index i
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains(""+ch)) {
                continue;
            }
            result += ch;
            result += count;

        }

        System.out.println(result);

    }
}
