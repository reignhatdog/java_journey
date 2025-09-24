
// exception handling 

import java.util.Scanner;

public class day13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Day 13: Exception Handling\n");


        try {
            int[] numbers = {10, 20, 30};
            System.out.println("Accessing index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException!");
        } finally {
            System.out.println("Finally block always runs.\n");
        }

        try {
            String text = "123a";
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Cannot convert text to number.");
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        } finally {
            System.out.println("Conversion attempt finished.\n");
        }

        System.out.print("Enter amount to withdraw: ");
        double amount = 0;
        try {
            amount = sc.nextDouble();
            withdraw(amount);
        } catch (Exception e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Withdrawal attempt finished.\n");
        }

        System.out.println("Program continues after handling exceptions.");
        sc.close();
    }

    public static void withdraw(double amount) throws Exception {
        double balance = 1000;
        if (amount > balance) {
            throw new Exception("Insufficient funds. Your balance is only " + balance);
        } else {
            System.out.println("Withdrawal successful! Remaining balance: " + (balance - amount));
        }
    }
}
