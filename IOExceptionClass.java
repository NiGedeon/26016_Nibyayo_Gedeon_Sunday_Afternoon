/*
 * -The BufferedReader Library helps to to read text from a character input stream, buffering 

 characters to provide efficient reading of characters, arrays, and lines. and It is often 
 used to wrap around a FileReader to enhance performance.

* -FileReader Library helps to read data directly from a file, character by character, making 
it suitable for simple text file reading tasks.

*-IOException: This exception class is the superclass of all exceptions that can be thrown 
during input-output operations. It is a checked exception that needs to be handled in 
scenarios where input-output errors may occur.
*
*/

/* This program reads the contents of a text file located at a specified path 
 * (C:\\Users\\HP\\OneDrive\\Desktop\\text.txt) line by line using a BufferedReader wrapped 
 * around a FileReader. It prints each line to the console. The program also handles potential
 *IOException errors during file reading and ensures that resources are released by closing 
 *the BufferedReader in a finally block. */
package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\HP\\OneDrive\\Desktop\\text.txt"));
			String line;
			while ((line = br.readLine()) != null) { // Read line by line until EOF
	                System.out.println(line); // Print each line
	            }
			
		}
		
		catch(IOException e){
			System.out.println("IOException is caught "+ e.getMessage());
		}
		
		finally {
            // Close the BufferedReader in the finally block to release resources
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Error closing BufferedReader: " + e.getMessage());
                }
            }
        }

	}

}

