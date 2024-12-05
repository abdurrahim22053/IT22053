import java.util.Scanner;
public class StrongNumberApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range (start and end):");
        int start = input.nextInt();
        int end = input.nextInt();

        StrongNumberChecker checker = new StrongNumberChecker();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (checker.isStrongNumber(i)) {
                count++;
                System.out.println("Strong number: " + i);
            }
        }

        System.out.println("Number of strong numbers in the given range: " + count);
        if (count == 0) {
            System.out.println("There are no strong numbers in the given range.");
        }
        
        input.close();
    }
}
