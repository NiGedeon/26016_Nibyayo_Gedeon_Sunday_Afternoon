/*This program prompts the user to input two numbers and attempts to divide them. If the second 
 * number is zero, an ArithmeticException (division by zero) is caught, and an error message is 
 * displayed. The Scanner is closed in the finally block.*/
package exceptionhandling;
import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.print("Enter another number to divide by: ");
            int divisor = scanner.nextInt();
            int result = num / divisor; // Division by zero causes ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            // Close the scanner in the finally block
            scanner.close();
        }
    }
}

