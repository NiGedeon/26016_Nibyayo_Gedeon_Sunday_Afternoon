/*The program prompts the user to input a string and attempts to convert it to an integer using 
 * Integer.parseInt(). If the string is not a valid integer, a NumberFormatException is thrown and 
 * caught. The Scanner is closed in the finally block.*/
package exceptionhandling;

import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number (as a string): ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input); // Invalid string format for number
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } finally {
            // Close the scanner in the finally block
            scanner.close();
        }
    }
}


