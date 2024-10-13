package Basic;
import java.util.Scanner;

public class Scan_k {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        name = scanner.nextLine();  // Read the name from the user
        
        // Print the name
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }

}
