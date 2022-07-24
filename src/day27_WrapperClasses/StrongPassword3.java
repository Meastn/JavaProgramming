package day27_WrapperClasses;

public class StrongPassword3 {
    public static void main(String[] args) {
        String password = "cMdeo1990r";

        int countUpperCase =0;
        int countLowerCase=0;
        int countDigits=0;
        int countSpecialChar =0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)) {
                countUpperCase ++;
            } else if (Character.isLowerCase(each)){
                countLowerCase ++;
            } else if (Character.isDigit(each)){
                countDigits++;
            } else {
                countSpecialChar ++;
            }


        }

        boolean hasUpperCase = countUpperCase >0;
        boolean hasLowerCase = countLowerCase >0;
        boolean hasDigits= countDigits >0;
        boolean hasSpecialChars = countSpecialChar >0;
        boolean strongPassword = false;

        if (password.length()>=8) {
            if (!password.contains(" ")){
                if (hasUpperCase) {
                    if (hasLowerCase){
                        if (hasDigits) {
                            if (hasSpecialChars){
                                strongPassword =true;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("strongPassword = " + strongPassword);
    }
}
