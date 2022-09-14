package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class IntCalc {

    public static void main(String[] args) throws IOException {
        final BufferedReader terminalSource = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                a = Integer.parseInt(terminalSource.readLine());
                b = Integer.parseInt(terminalSource.readLine());
                validInput = true;
            } catch (NumberFormatException nfe) {
                System.out.println("not possible");
            }
        }

        String operator = terminalSource.readLine();

        System.out.println("sum: " + sum(a, b));
        System.out.println("dif: " + dif(a, b));
        System.out.println("multiply: " + multiply(a, b));

        try {
            System.out.println("divide: " + divide(a, b));
        } catch (ArithmeticException ae) {
            System.out.println("invalid");
        }

        try {
            System.out.println("calc: " + calc(a, b, operator));
        } catch (ArithmeticException ae) {
            System.out.println("Divided by 0 not allowed");
        }

            System.out.println("power: " + power(a, b));
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int dif(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static int divide(int number1, int number2) {
        return number1 / number2;
    }

//    public static int divide ( int number1, int number2){
//        try {
//            return number1 / number2;
//        }
//        catch (ArithmeticException ae) {
//            System.out.println("invalid");
//            return 0;
//        }
//    }

    public static int calc(int number1, int number2, String operator) {
        if (operator.equals("+")) {                             //== only works for primitive types
            return sum(number1, number2);
        }
        if (operator.equals("-")) {
            return dif(number1, number2);
        }
        if (operator.equals("*")) {
            return multiply(number1, number2);
        }
        if (operator.equals("/")) {
            return divide(number1, number2);
        }
        return 0;
    }

    public static int power(int base, int exponent) {
        int sum = base;
        for (int i = 1; i < exponent; i++) {                 //other option (int i = 0; i < exponent - 1; i++)
            System.out.println("sum = " + base + "*" + sum);
            sum = base * sum;
        }
        return sum;
    }
}

//other option: (int i = 1; i <= exponent; i++) = (int i = 0; i < exponent; i++)
// example: exponent 5; i counts until 6                i counts until 5, starts from 0
