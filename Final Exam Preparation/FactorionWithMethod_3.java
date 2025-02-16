

import java.util.Scanner;
public class FactorionWithMethod_3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range : ");
        int lb = sc.nextInt();
        System.out.print("Enter the upper bound of the range : ");
        int ub = sc.nextInt();
        boolean check = false;
        System.out.println("Factorion numbers in the range : ");
        for (int i = lb; i <= ub; i++) {
            if (CheckFactorion(i)) {
                System.out.println(i);
                check = true;
            }
        }
        if (!check) {
            System.out.println("No factorion numbers found in the given range.");
        }
        sc.close();
    }
    public static boolean CheckFactorion(int num) {

        int orgNum = num;
        long sum = 0;
        while (num != 0) {
            int r = num % 10;
            sum = sum + fact(r);
            num = num / 10;
        }
        return sum == orgNum;
    }
    public static long fact(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

}
