import java.util.Scanner;

/**
 * Practical examples of loops in real-world scenarios
 */
public class LoopsPracticalExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== PRACTICAL LOOP EXAMPLES ===\n");
        
        // 1. Number guessing game using while loop
        System.out.println("1. Number Guessing Game:");
        int secretNumber = 42;
        int guess = 0;
        int attempts = 0;
        
        System.out.println("I'm thinking of a number between 1-100. Can you guess it?");
        while (guess != secretNumber && attempts < 5) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts!");
            }
        }
        
        if (guess != secretNumber) {
            System.out.println("Sorry! The number was " + secretNumber);
        }
        System.out.println();
        
        // 2. Prime number checker using for loop
        System.out.print("2. Enter a number to check if it's prime: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        System.out.println(num + " is " + (isPrime ? "prime" : "not prime"));
        System.out.println();
        
        // 3. Fibonacci series using while loop
        System.out.print("3. Enter number of Fibonacci terms to generate: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series:");
        
        int first = 0, second = 1;
        int count = 0;
        
        if (n >= 1) {
            System.out.print(first + " ");
            count++;
        }
        if (n >= 2) {
            System.out.print(second + " ");
            count++;
        }
        
        while (count < n) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
            count++;
        }
        System.out.println("\n");
        
        // 4. Grade calculator using do-while
        System.out.println("4. Grade Calculator:");
        char continueCalc;
        do {
            System.out.print("Enter student marks (0-100): ");
            int marks = sc.nextInt();
            
            String grade;
            if (marks >= 90) grade = "A+";
            else if (marks >= 80) grade = "A";
            else if (marks >= 70) grade = "B";
            else if (marks >= 60) grade = "C";
            else if (marks >= 50) grade = "D";
            else grade = "F";
            
            System.out.println("Grade: " + grade);
            System.out.print("Calculate another grade? (y/n): ");
            continueCalc = sc.next().charAt(0);
        } while (continueCalc == 'y' || continueCalc == 'Y');
        
        // 5. Array operations using enhanced for loop
        System.out.println("\n5. Array Statistics:");
        int[] scores = {85, 92, 78, 96, 88, 73, 91, 87, 82, 95};
        
        System.out.print("Scores: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        
        // Find max, min, and average
        int max = scores[0], min = scores[0], sum = 0;
        for (int score : scores) {
            if (score > max) max = score;
            if (score < min) min = score;
            sum += score;
        }
        
        double average = (double) sum / scores.length;
        System.out.println("Maximum score: " + max);
        System.out.println("Minimum score: " + min);
        System.out.printf("Average score: %.2f\n", average);
        
        // Count grades
        int[] gradeCount = new int[6]; // A+, A, B, C, D, F
        for (int score : scores) {
            if (score >= 90) gradeCount[0]++;
            else if (score >= 80) gradeCount[1]++;
            else if (score >= 70) gradeCount[2]++;
            else if (score >= 60) gradeCount[3]++;
            else if (score >= 50) gradeCount[4]++;
            else gradeCount[5]++;
        }
        
        String[] gradeLabels = {"A+", "A", "B", "C", "D", "F"};
        System.out.println("Grade Distribution:");
        for (int i = 0; i < gradeLabels.length; i++) {
            System.out.println(gradeLabels[i] + ": " + gradeCount[i] + " students");
        }
        
        // 6. Pattern printing examples
        System.out.println("\n6. Pattern Examples:");
        
        // Right triangle
        System.out.println("Right Triangle:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Inverted triangle
        System.out.println("Inverted Triangle:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Number pyramid
        System.out.println("Number Pyramid:");
        for (int i = 1; i <= 5; i++) {
            // Print spaces
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        sc.close();
        System.out.println("\nProgram completed successfully!");
    }
}
