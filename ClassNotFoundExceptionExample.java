/*This program demonstrates handling ClassNotFoundException, which occurs when a class is not 
 * found at runtime. The code attempts to dynamically load a class (com.mysql.cj.jdbc.Driver) 
 * using Class.forName(). If the class is missing from the class path, the exception is caught, 
 * and a message is displayed advising to ensure the class is available.*/
package exceptionhandling;

public class ClassNotFoundExceptionExample {

    public static void main(String[] args) {
        try {
            // Attempt to load a class dynamically using Class.forName()
            Class.forName("com.mysql.cj.jdbc.Driver"); // Replace with the class you want to load
            System.out.println("Class loaded successfully!");
        } catch (ClassNotFoundException e) {
            // Handle ClassNotFoundException
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
            System.out.println("Make sure the required class is available in the classpath.");
        }
    }
}

