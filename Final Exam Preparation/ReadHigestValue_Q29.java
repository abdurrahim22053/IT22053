import java.io.*;
import java.util.*;

public class ReadHigestValue_Q29 {
    public static void main(String[] args) {
        try {
            Scanner inputFile = new Scanner(new File("input.txt"));
            int sum = 0;
            int highest = Integer.MIN_VALUE;

            while (inputFile.hasNextInt()) {
                int number = inputFile.nextInt();
                sum += number;
                if (number > highest) {
                    highest = number;
                }
            }
            
            inputFile.close();
            PrintWriter outputFile = new PrintWriter(new File("output.txt"));
            
            outputFile.println("Sum of numbers: " + sum);
            outputFile.println("Highest value: " + highest);
            outputFile.close();
            
            System.out.println("Processing complete! Check output.txt for results.");
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
