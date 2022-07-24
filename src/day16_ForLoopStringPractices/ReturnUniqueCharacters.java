package day16_ForLoopStringPractices;

public class ReturnUniqueCharacters {
    public static void main(String[] args) {
    String str ="aaabcccdzzzt";
    String result ="";


    // first index of a is 0, last index of a is 2 then a is not unique
        // for a unique character both index and lastIndex would be equal
    for (int i=0; i<=str.length()-1; i++) {
        char ch = str.charAt(i);
        if (str.indexOf(ch)== str.lastIndexOf(ch)){ // if the first and last index numbers are equal
        result += ch; // then the character is unique and added to the result String
        }
    }
        System.out.println(result); // print should be out of the loop to provide the final result of the loop
    }
}

/*

Write a programl that can return the unique characters from a
String

Ex
input :
AABCCD
output:
BD
Hint. You will need indexOf() and lastIndexOf()
if the first and last index numbers of characters
are same, then it's unique
indexOf ('A')
 */