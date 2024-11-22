import java.io.*; // For file handling
import java.nio.file.*; // For reading lines from the input file
import java.text.SimpleDateFormat; // For formatting the current date and time
import java.util.*; // For utilities like Scanner, List, and ArrayList

public class Rahim_kids1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean playAgain;

        do {
            int score = 0;
            List<String> expressions = Files.readAllLines(Paths.get("input.txt"));
            List<String> userAnswers = new ArrayList<>();

            System.out.print("Enter your name: ");
            String userName = scanner.nextLine();

            for (String expression : expressions) {
                if (expression.trim().isEmpty()) continue;

                System.out.print("Solve: " + expression + " = ");
                double userAnswer = scanner.nextDouble();
                userAnswers.add(expression + " = " + userAnswer);

                // Evaluate the correct answer
                double correctAnswer = evaluateExpression(expression);
                if (Math.abs(userAnswer - correctAnswer) < 0.0001) { // Handle floating-point precision issues
                    score++;
                }
            }

            String date = sdf.format(new Date());
            saveResults(userName, userAnswers, score, date);

            System.out.println("Your score: " + score + "/" + expressions.size());
            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine(); // Consume leftover newline
            playAgain = scanner.nextLine().equalsIgnoreCase("yes");

        } while (playAgain);

        scanner.close();
    }

    private static double evaluateExpression(String expression) {
        expression = expression.trim();
        if (expression.contains("+")) {
            String[] parts = expression.split("\\+");
            return Double.parseDouble(parts[0].trim()) + Double.parseDouble(parts[1].trim());
        } else if (expression.contains("-")) {
            String[] parts = expression.split("-");
            return Double.parseDouble(parts[0].trim()) - Double.parseDouble(parts[1].trim());
        } else if (expression.contains("*")) {
            String[] parts = expression.split("\\*");
            return Double.parseDouble(parts[0].trim()) * Double.parseDouble(parts[1].trim());
        } else if (expression.contains("/")) {
            String[] parts = expression.split("/");
            return Double.parseDouble(parts[0].trim()) / Double.parseDouble(parts[1].trim());
        } else {
            throw new IllegalArgumentException("Invalid expression: " + expression);
        }
    }

    private static void saveResults(String userName, List<String> userAnswers, int score, String date) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
            writer.write("User Name :\t\t\t\t Score :\t\t\t\t Date & Time : ");
            writer.newLine();
            writer.write(userName +" \t\t\t\t" +score +" \t\t\t\t" +date );

            writer.newLine();
            writer.newLine();
            writer.newLine();
            writer.write("Answers:");
            writer.newLine();
            for (String answer : userAnswers) {
                writer.write(answer);
                writer.newLine();
            }
            writer.write("------------");
            writer.newLine();
        }
    }
}