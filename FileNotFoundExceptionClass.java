/*The program attempts to read and print the contents of a file line by line, handling exceptions 
 * for file not found and other I/O errors, and ensures proper resource cleanup by closing the file 
 * reader in a finally block.*/

package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionClass {

    public static void main(String[] args) {
        BufferedReader fis = null;
        try {
            // Try to open a file that doesn't exist
            fis = new BufferedReader(new FileReader("C:\\Users\\HP\\OneDrive\\Documents\\iba"));
            String line;
            while ((line = fis.readLine()) != null) { // Read line by line until EOF
                System.out.println(line); // Print each line
            }
        } catch (FileNotFoundException e) {
            // Catch and handle the FileNotFoundException
            System.out.println("FileNotFoundException caught: " + e.getMessage());
            
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            // Close the BufferedReader in the finally block to release resources
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Error closing BufferedReader: " + e.getMessage());
                }
            }
        }
    }
}

