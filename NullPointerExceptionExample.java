/*The program asks the user to enter a string. If the user types "null", it simulates a null 
 * reference. When the program attempts to access the length of the string, a NullPointerException 
 * is thrown and caught. The Scanner is closed in the finally block.*/
package exceptionhandling;
import java.util.Scanner;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a string (or type 'null' to simulate NullPointerException): ");
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("null")) {
                str = null; // Simulate null reference
            }
            System.out.println("String length: " + str.length()); // Accessing a null reference
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } finally {
            // Close the scanner in the finally block
            scanner.close();
        }
    }
}

