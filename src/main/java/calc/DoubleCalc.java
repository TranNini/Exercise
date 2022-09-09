package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleCalc {

    public static void main(String[] args) throws IOException {
        final BufferedReader terminalSource = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(terminalSource.readLine());
        double b = Double.parseDouble(terminalSource.readLine());
        String operator = terminalSource.readLine();

   //     System.out.println(add(a, b));
//        System.out.println(substract(a, b));
//        System.out.println(multi(a, b));
        System.out.println(divide(a, b));
        System.out.println(calc(a,b,operator));
        System.out.println(power(a,b));
    }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double substract(double number1, double number2) {
        return number1 - number2;
    }

    public static double multi(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("division by 0 is not defined");
            return 0;
        } else {
            return number1 / number2;
        }
    }

    public static double calc(double number1, double number2, String operator) {
        switch (operator) {
            case "+" :
                return number1 + number2;
            case "-" :
                return number1 - number2;
            case "*" :
                return number1 * number2;
            case "/" :
                return number1 / number2;
            default:
                System.out.println("Operator not supported.");
                return 0;
        }
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);                        //another option (lazy version)
//        double sum = 1;
//        for (int i = 1; i <= exponent; i++) {
//            sum = base * sum;
//        }
//        return sum;
    }
}
