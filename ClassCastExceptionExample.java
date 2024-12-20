/*The program asks the user for a string and attempts to cast it to an Integer, which is invalid 
 * and causes a ClassCastException. The exception is caught, and the error message is displayed. 
 * The Scanner is closed in the finally block.*/
package exceptionhandling;

import java.util.Scanner;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string (this will simulate an Object): ");
            Object obj = scanner.nextLine();
            Integer num = (Integer) obj; // Invalid cast
            System.out.println("Converted number: " + num);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        } finally {
            // Close the scanner in the finally block
            scanner.close();
        }
    }
}

