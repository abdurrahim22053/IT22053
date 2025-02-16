import java.util.Scanner;

public class Circle_QN_25 {
    private double radius;
    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        try {
            circle.setRadius(radius);
            System.out.println("Area of the circle: " + circle.calculateArea());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
