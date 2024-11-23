// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create a Circle object
        Circle circle = new Circle(radius);

        // Calculate and display the area
        double area = circle.calculateArea();
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        scanner.close();
    }
}
