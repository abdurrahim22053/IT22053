
import java.util.Scanner;
import java.math.BigInteger;

public class Factorial_BigInt_Q14 {
    static BigInteger factorial(BigInteger n) {
        BigInteger fact = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            fact = fact.multiply(i);
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        BigInteger num = sc.nextBigInteger();
        System.out.println("Factorial of " + num + " is:\n" + factorial(num));
        sc.close();
    }
}