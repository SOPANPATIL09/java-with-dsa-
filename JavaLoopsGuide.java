import java.util.Scanner;

/**
 * Comprehensive guide to loops in Java
 * This class demonstrates all types of loops with practical examples
 */
public class JavaLoopsGuide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== JAVA LOOPS COMPREHENSIVE GUIDE ===\n");
        
        // 1. FOR LOOP
        System.out.println("1. FOR LOOP Examples:");
        System.out.println("Basic for loop (printing numbers 1-5):");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // For loop with different increment
        System.out.println("For loop with step 2 (even numbers 2-10):");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Reverse for loop
        System.out.println("Reverse for loop (countdown 5-1):");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // 2. WHILE LOOP
        System.out.println("2. WHILE LOOP Examples:");
        System.out.println("Basic while loop (printing squares of 1-5):");
        int num = 1;
        while (num <= 5) {
            System.out.println(num + "² = " + (num * num));
            num++;
        }
        
        // While loop with user input
        System.out.println("Enter a number to find its factorial (or 0 to skip): ");
        int factNum = sc.nextInt();
        if (factNum > 0) {
            int factorial = 1;
            int temp = factNum;
            while (temp > 0) {
                factorial *= temp;
                temp--;
            }
            System.out.println("Factorial of " + factNum + " = " + factorial);
        }
        System.out.println();
        
        // 3. DO-WHILE LOOP
        System.out.println("3. DO-WHILE LOOP Examples:");
        System.out.println("Menu-driven program (executes at least once):");
        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Say Hello");
            System.out.println("2. Current Time");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Hello! Welcome to Java Loops!");
                    break;
                case 2:
                    System.out.println("Current time: " + java.time.LocalTime.now());
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
            System.out.println();
        } while (choice != 3);
        
        // 4. ENHANCED FOR LOOP (for-each)
        System.out.println("4. ENHANCED FOR LOOP (for-each) Examples:");
        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
        System.out.println("Fruits array using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        System.out.println("Sum of array elements using enhanced for loop:");
        for (int number : numbers) {
            sum += number;
            System.out.print(number + " ");
        }
        System.out.println("= " + sum + "\n");
        
        // 5. NESTED LOOPS
        System.out.println("5. NESTED LOOPS Examples:");
        System.out.println("Multiplication table (5x5):");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        
        // Pattern printing with nested loops
        System.out.println("\nStar pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // 6. LOOP CONTROL STATEMENTS
        System.out.println("\n6. LOOP CONTROL STATEMENTS:");
        
        // Break statement
        System.out.println("Break statement example (stop at 7):");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println("Breaking at " + i);
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Continue statement
        System.out.println("Continue statement example (skip odd numbers):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 7. INFINITE LOOPS (commented to prevent actual infinite execution)
        System.out.println("\n7. INFINITE LOOPS (examples - commented to prevent execution):");
        System.out.println("// while(true) { System.out.println(\"Infinite loop\"); }");
        System.out.println("// for(;;) { System.out.println(\"Infinite loop\"); }");
        System.out.println("// do { System.out.println(\"Infinite loop\"); } while(true);");
        
        System.out.println("\n=== LOOP COMPARISON ===");
        System.out.println("1. FOR LOOP: Best when you know the number of iterations");
        System.out.println("2. WHILE LOOP: Best when condition is checked before execution");
        System.out.println("3. DO-WHILE LOOP: Best when you need at least one execution");
        System.out.println("4. ENHANCED FOR LOOP: Best for iterating over arrays/collections");
        
        sc.close();
    }
}
