import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class series_sum{
    public static void main(String[] args) {
        try {
        File inputFile =new File("F:\\JavaCode\\java_for_beginners\\input.txt");
        Scanner scanner =new Scanner(inputFile);
        File outputFile =new File("F:\\JavaCode\\java_for_beginners\\output.txt");
        PrintWriter writer =new PrintWriter(outputFile);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int sum =0;
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            writer.println(sum);
        }
        scanner.close();
        writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}