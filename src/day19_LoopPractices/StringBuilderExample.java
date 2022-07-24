package day19_LoopPractices;

public class StringBuilderExample {
        public static void main(String[] args) {
            String result = "";


            String str = "fafabccfdf";
            int before = str.length();
            int frequency = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                char c = str.charAt(i);
                //  str=str.replace(c + "", "");
                int after = str.replace(c + "", "").length();
                frequency = before - after;
                System.out.println(new StringBuilder().append(c).append(" is repeated ").append(frequency).append(" times").toString());
//            System.out.println(new StringBuilder().append(c).append(" is repeated ").append(frequency.get()).append(" times.").toString());
                StringBuilder sb = new StringBuilder();
                ;
                if (c == str.charAt(i + 1)) {

                    System.out.println(c + " first duplicated char");
                    break;
                }
            }
            System.out.println(result);
        }
    }

    /*
    public static void main(String[] args) {
        String str = "aabccddd";
        String result = "";
        int freq = 1;
        for (int i = 0; i < str.length(); i++) {
            int before = str.length();
            char c = str.charAt(i);
            String replaced = str.replace(c + "", "");
            int after = replaced.length();
            freq = before - after;
            //  System.out.println(str.charAt(i) + " is repeated " + freq + " times");


            if (result.contains(c + "")) {
                //    continue;
            } else {
                System.out.println();
                result = result + c + freq;
            }
        }
        System.out.println(result);

    }
}
     */