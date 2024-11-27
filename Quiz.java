import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int score = 0;
            System.out.println("\nWelcome to Rahim's quiz !");
            System.out.println("How many districts have in Bangladesh ?\na)63 \nb)64 \nc)65");
            System.out.print("Enter your Answer:");
            char ch;
            ch = input.next().charAt(0);
            if (ch == 'b') {
                System.out.println("Your Answer is Correct! You have got 5 points.");
                score += 5;

            } else {
                System.out.println("Answer is wrong!");
                score--;
            }
            System.out.println(
                    "\nWho is the most demandable player in IPL-2024 ? \na)Virat Kholi \nb)MS Dhoni \nc)Rishab Pant");
            System.out.print("Enter your Answer:");
            ch = input.next().charAt(0);
            if (ch == 'c') {
                System.out.println("Your Answer is Correct! You have got 5 points.");
                score += 5;

            } else {
                System.out.println("Answer is wrong!");
                score--;
            }
            System.out.println(
                    "\nWho was the fastest bowler in cricket history till 2020?\na)Shoaib Akhtar \nb)Mitchel Starc \nc)Jaspit Bumrah");
            System.out.print("Enter your Answer:");
            ch = input.next().charAt(0);
            if (ch == 'a') {
                System.out.println("Your Answer is Correct! You have got 5 points.");
                score += 5;

            } else {
                System.out.println("Answer is wrong!");
                score--;
            }
            System.out.println("\nWhat is the next number in the sequence? \n 2,4,8,16,........? \na)8 \na)16 \nc)32");
            System.out.print("Enter your Answer:");
            ch = input.next().charAt(0);
            if (ch == 'c') {
                System.out.println("Your Answer is Correct! You have got 5 points.");
                score += 5;

            } else {
                System.out.println("Answer is wrong!");
                score--;
            }
            System.out.println("\nHow many department have in Enginnering faculty at MBSTU? \na)3 \nb)4 \nc)5");
            System.out.print("Enter your Answer:");
            ch = input.next().charAt(0);
            if (ch == 'b') {
                System.out.println("Your Answer is Correct! You have got 5 points.");
                score += 5;

            } else {
                System.out.println("Answer is wrong!");
                score--;
            }

            System.out.println("\nYou have earned total" + " " + score + " " + "points");
            System.out.println("Do you want to play again? If yes then press '1' otherwise press'0'for exiting.");
            int num = input.nextInt();
            if (num == 0) {
                System.out.println("You are Exiting.....");
                break;
            }

        }

        input.close();
    }

}