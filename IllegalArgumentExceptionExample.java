/*This program asks the user to input a sleep duration. If the input is negative, an 
IllegalArgumentException will be thrown when attempting to call Thread.sleep(). The exception is 
caught, and the error message is displayed. The Scanner is closed in the finally block.

*/
package exceptionhandling;

import java.util.Scanner;

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter sleep duration in milliseconds (positive number): ");
            long duration = scanner.nextLong();
            Thread.sleep(duration); // IllegalArgumentException if duration is negative
            System.out.println("Slept for " + duration + " milliseconds.");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught: " + e.getMessage());
        } finally {
            // Close the scanner in the finally block
            scanner.close();
        }
    }
}

