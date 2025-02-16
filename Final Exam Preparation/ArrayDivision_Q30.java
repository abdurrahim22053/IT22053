import java.util.Scanner;

public class ArrayDivision_Q30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the first array (n > 20): ");
        int n = scanner.nextInt();
        
        if (n <= 20) {
            System.out.println("The size must be greater than 20.");
            return;
        }

        int[] firstArray = new int[n];
        System.out.println("Enter elements for the first array (size n):");
        for (int i = 0; i < n; i++) {
            firstArray[i] = scanner.nextInt();
        }

        int m = (int) Math.ceil(n / 10.0); 
        int[] secondArray = new int[m];
        System.out.println("Enter elements for the second array (size n/10):");
        for (int i = 0; i < m; i++) {
            secondArray[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < n; i++) {
            int divisorIndex = i % m;
            if (secondArray[divisorIndex] == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                
                double quotient = Math.ceil((double) firstArray[i] / secondArray[divisorIndex]);
                int remainder = firstArray[i] % secondArray[divisorIndex];
                System.out.println("For element " + firstArray[i] + " and divisor " + secondArray[divisorIndex] + ":");
                System.out.println("Quotient (ceiling): " + quotient);
                System.out.println("Remainder: " + remainder);
                scanner.close();
            }
        }
    }
}
