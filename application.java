// Simple Java Program Example
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Print a message
        System.out.println("Hello, World!");

        // Taking input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Displaying user input
        System.out.println("Welcome, " + name + "!");

        scanner.close();
    }
}
