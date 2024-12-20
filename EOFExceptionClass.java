/* This program demonstrates handling the EOFException when reading binary data from a file 
 * using DataInputStream. It attempts to read integers continuously from a binary file 
 * (data.bin). When the end of the file is reached, an EOFException is caught, indicating the 
 * end of data, and the loop terminates gracefully. Any other I/O errors are handled by the 
 * outer IOException catch block*/

package exceptionhandling;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class EOFExceptionClass {

    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            while (true) {
                try {
                    // Read an integer from the binary file
                    int number = dis.readInt();
                    System.out.println("Read number: " + number);
                } catch (EOFException e) {
                    // Handle the end-of-file condition
                    System.out.println("End of file reached.");
                    break; // Exit the loop when EOF is reached
                }
            }
        } catch (IOException e) {
            // Handle any other I/O exceptions
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

