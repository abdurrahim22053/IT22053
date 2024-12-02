import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int earnc1, earnc2, earnc3;
        double cgp1 = 0, cgp2 = 0, cgp3 = 0;

        // First courseIt
        System.out.print("Enter your Student Id: ");
        String Id = input.nextLine();
        System.out.print("Enter your Course Code : ");
        String C1 = input.nextLine();
        System.out.print("Enter your Course Credit(Max 3): ");
        int c1 = input.nextInt();
        System.out.print("Enter your CT marks(Max 30): ");
        int CT1 = input.nextInt();
        System.out.print("Enter your AT marks(Max 10): ");
        int AT1 = input.nextInt();
        System.out.print("Enter your FE marks(Max 60): ");
        int FE1 = input.nextInt();
        int total1 = CT1 + AT1 + FE1;

        if (total1 >= 40)
            earnc1 = 3;
        else
            earnc1 = 0;
        // Course1 cgp1 calculating
        if (total1 < 40)
            cgp1 = 0.00;
        if (total1 >= 40 && total1 <= 44)
            cgp1 = 2.00;
        if (total1 >= 45 && total1 <= 49)
            cgp1 = 2.25;
        if (total1 >= 50 && total1 <= 54)
            cgp1 = 2.50;
        if (total1 >= 55 && total1 <= 59)
            cgp1 = 2.75;
        if (total1 >= 60 && total1 <= 64)
            cgp1 = 3.00;
        if (total1 >= 65 && total1 <= 69)
            cgp1 = 3.25;
        if (total1 >= 70 && total1 <= 74)
            cgp1 = 3.50;
        if (total1 >= 75 && total1 <= 79)
            cgp1 = 3.75;
        if (total1 >= 80 && total1 <= 100)
            cgp1 = 4.00;

        System.out.println("Total marks: " + total1);

        input.nextLine(); // Consume the leftover newline

        // Second course
        System.out.print("Enter your Course Code: ");
        String C2 = input.nextLine();
        System.out.print("Enter your Course Credit(Max 3): ");
        int c2 = input.nextInt();

        System.out.print("Enter your CT marks(Max 30): ");
        int CT2 = input.nextInt();
        System.out.print("Enter your AT marks(Max 10): ");
        int AT2 = input.nextInt();
        System.out.print("Enter your FE marks(Max 60): ");
        int FE2 = input.nextInt();
        int total2 = CT2 + AT2 + FE2;
        if (total2 >= 40)
            earnc2 = 3;
        else
            earnc2 = 0;
        // Course2 cgp2 calculating
        if (total2 < 40)
            cgp2 = 0.00;
        if (total2 >= 40 && total2 <= 44)
            cgp2 = 2.00;
        if (total2 >= 45 && total2 <= 49)
            cgp2 = 2.25;
        if (total2 >= 50 && total2 <= 54)
            cgp2 = 2.50;
        if (total2 >= 55 && total2 <= 59)
            cgp2 = 2.75;
        if (total2 >= 60 && total2 <= 64)
            cgp2 = 3.00;
        if (total2 >= 65 && total2 <= 69)
            cgp2 = 3.25;
        if (total2 >= 70 && total2 <= 74)
            cgp2 = 3.50;
        if (total2 >= 75 && total2 <= 79)
            cgp2 = 3.75;
        if (total2 >= 80 && total2 <= 100)
            cgp2 = 4.00;
        System.out.println("Total marks: " + total2);

        input.nextLine(); // Consume the leftover newline

        // Third course
        System.out.print("Enter your Course Code: ");
        String C3 = input.nextLine();
        System.out.print("Enter your Course Credit(Max 3): ");
        int c3 = input.nextInt();

        System.out.print("Enter your CT marks(Max 30): ");
        int CT3 = input.nextInt();
        System.out.print("Enter your AT marks(Max 10): ");
        int AT3 = input.nextInt();
        System.out.print("Enter your FE marks(Max 60): ");
        int FE3 = input.nextInt();
        int total3 = CT3 + AT3 + FE3;
        if (total3 >= 40)
            earnc3 = 3;
        else
            earnc3 = 0;
        // Course3 cgp3 calculating
        if (total3 < 40)
            cgp3 = 0.00;
        if (total3 >= 40 && total3 <= 44)
            cgp3 = 2.00;
        if (total3 >= 45 && total3 <= 49)
            cgp3 = 2.25;
        if (total3 >= 50 && total3 <= 54)
            cgp3 = 2.50;
        if (total3 >= 55 && total3 <= 59)
            cgp3 = 2.75;
        if (total3 >= 60 && total3 <= 64)
            cgp3 = 3.00;
        if (total3 >= 65 && total3 <= 69)
            cgp3 = 3.25;
        if (total3 >= 70 && total3 <= 74)
            cgp3 = 3.50;
        if (total3 >= 75 && total3 <= 79)
            cgp3 = 3.75;
        if (total3 >= 80 && total3 <= 100)
            cgp3 = 4.00;
        System.out.println("Total marks: " + total3);
        // output Section
        int totalcredit = c1 + c2 + c3;
        int totalearn = earnc1 + earnc2 + earnc3;
        double totalcgp = (cgp1 * earnc1 + cgp2 * earnc2 + cgp3 * earnc3);
        double cgpa;
        if (totalcgp != 0) {
            cgpa = totalcgp / totalearn;
        } else
            cgpa = totalcgp;

        String grade = "FAIL";
        if (cgpa == 0)
            grade = "FAIL";
        if (cgpa == 4.0)
            grade = "A+";
        else if (cgpa >= 3.75 && cgpa < 4.0)
            grade = "A";
        else if (cgpa >= 3.50 && cgpa < 3.75)
            grade = "A-";
        else if (cgpa >= 3.25 && cgpa < 3.50)
            grade = "B+";
        else if (cgpa >= 3.00 && cgpa < 3.25)
            grade = "B";
        else if (cgpa >= 2.75 && cgpa < 3.00)
            grade = "B-";
        else if (cgpa >= 2.50 && cgpa < 2.75)
            grade = "C+";
        else if (cgpa >= 2.25 && cgpa < 2.50)
            grade = "C";
        else if (cgpa >= 2.00 && cgpa < 2.25)
            grade = "D";

        // Desired Output
        System.out.print("\n\n\n");
        System.out.print("\nStudent ID : " + Id);
        System.out.print("\nCredit Taken : " + totalcredit);
        System.out.print("\nCredit Earned : " + totalearn);
        System.out.print("\nCGPA : " + cgpa);
        System.out.print("\nGrade : " + grade);

        input.close();
    }
}
