public class StrongNumberChecker {
    // Method to check if a number is a strong number
    public boolean isStrongNumber(int num) {
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int rem = temp % 10;
            sum += factorial(rem);
            temp /= 10;
        }

        return sum == num;
    }

    // Helper method to calculate the factorial of a digit
    private int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
