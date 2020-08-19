package SimpleCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        char Operator;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter firs number: ");
        num1 = scn.nextDouble();
        System.out.println("Please enter second number: ");
        num2 = scn.nextDouble();
        System.out.println("What operation ( + , - , * , /): ");
        Operator = scn.next().charAt(0);

        switch (Operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Operator);
        }
        System.out.println(num1 + " " + Operator + " " + num2 + "=" + result);


    }
}
