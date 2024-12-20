/*The program displays the contents of an array and asks the user to input an index to access. If 
 * the user inputs an invalid index, an ArrayIndexOutOfBoundsException is thrown and caught. The 
 * Scanner is closed in the finally block.*/
package exceptionhandling;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] array = {10, 20, 30, 40, 50};
            System.out.print("Array contents: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.print("Enter an index to access: ");
            int index = scanner.nextInt();
            System.out.println("Array element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            // Close the scanner in the finally block
            scanner.close();
        }
    }
}

