// DemoApp.java
import java.util.Scanner;

public class DemoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to DemoApp ===");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int squared = number * number;

        System.out.println("\nHello, " + name + "!");
        System.out.println("You entered: " + number);
        System.out.println("The square of " + number + " is " + squared);
        System.out.println("\nThanks for trying the demo!");
    }
}