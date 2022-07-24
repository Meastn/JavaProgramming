package day09_IfStatements;
public class Calculator {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 20;
        char mathOperator = '*';
        int result=0;

        boolean valid = mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/';
        
        if (valid) {

            if (mathOperator == '+') {
                result = n1 + n2;
            } else if (mathOperator == '-') {
                result = n1 - n2;
            } else if (mathOperator == '*') {
                result = n1 * n2;
            } else {
                result = n1 / n2;
            }
        } else {
            System.out.println("Invalid Entry");
        }
        System.out.println("Result is:" + result);
    }




    /*
        if (mathOperator=='+' || mathOperator=='-' || mathOperator=='*' || mathOperator == '/') {

            if (mathOperator=='+') {
                result = n1 + n2;
            } else if (mathOperator=='-') {
                result = n1 - n2;
            }else if (mathOperator=='*') {
                result = n1 * n2;
            } else {
                result = n1 / n2;
            }
        } else {
            System.out.println("Invalid Entry");
        }
        System.out.println("result = " + result);
        
    }
}
*/


    }


/*
Create a class called Calculator, Given two double variables named n1 
& n2, and a char variable named mathOperator, write a program that can 
calculate result of n1&n2 based on the given math Operator.
char operator -> -, +, *, /
when operator is + : add num1, num2
when operator: - : minus num1, num2
when operator: * : multiply num1, num2
when operator: / : divide num1, num2
for any other operators: print "invalid operator"
Ex:
n1 = 10, n2= 20, mathOperator = '+'
output:
30
 */

/*
PROBLEM . when using a double result; as a variable and putting result inside the else if statements
the result variable gives an error that it is not initialized,
 */