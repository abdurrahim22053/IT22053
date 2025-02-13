import java.util.Scanner;

public class Factorion_QN03 {
    
    // Function to calculate factorial
    private static int factorial(int num) {
        int fact = 1;
        for (int j = 1; j <= num; j++) {
            fact *= j;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, num, temp;
        
        System.out.println("Enter your range number:");
        i = input.nextInt();
        num = input.nextInt();
        
        int count = 0;
        
        for (int k = i; k <= num; k++) {
            temp = k;
            int sum = 0;
            
            while (temp != 0) {
                int rem = temp % 10;
                sum += factorial(rem);
                temp /= 10;
            }

            if (sum == k) {
                count++;
                System.out.print("\nStrong number is: " + sum);
            }
        }
        
        System.out.print("\nNumber of Strong number lies in given range : " + count);
        
        if (count == 0)
            System.out.print("\nThere is no Strong number given that range.");
        
        input.close();
    }
}
