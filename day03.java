//simple calculator//

import java.util.Scanner;
public class day3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, %): ");
        String operator = input.next();

        double result;

        if (operator.equals("+")) {
            result = num1 + num2;

        } else if (operator.equals("-")) {
            result = num1 - num2;

        } else if (operator.equals("*")) {
            result = num1 * num2;

        } else if (operator.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                input.close();
                return;
            }

        } else if (operator.equals("%")) {
            result = num1 % num2;

        } else {
            System.out.println("Invalid operator!");
            input.close();
            return;
        }

        System.out.println("Result: " + result);
        input.close();
    }
}
