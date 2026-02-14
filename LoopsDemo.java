/**
 * Simple demonstration of all Java loop types
 * No user input required - just shows the concepts
 */
public class LoopsDemo {
    public static void main(String[] args) {
        System.out.println("=== JAVA LOOPS DEMONSTRATION ===\n");
        
        // 1. FOR LOOP
        System.out.println("1. FOR LOOP:");
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // 2. WHILE LOOP
        System.out.println("2. WHILE LOOP:");
        System.out.println("Printing even numbers from 2 to 10:");
        int num = 2;
        while (num <= 10) {
            System.out.print(num + " ");
            num += 2;
        }
        System.out.println("\n");
        
        // 3. DO-WHILE LOOP
        System.out.println("3. DO-WHILE LOOP:");
        System.out.println("Countdown from 5 to 1:");
        int countdown = 5;
        do {
            System.out.print(countdown + " ");
            countdown--;
        } while (countdown > 0);
        System.out.println("\n");
        
        // 4. ENHANCED FOR LOOP (for-each)
        System.out.println("4. ENHANCED FOR LOOP (for-each):");
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        System.out.println("Colors in array:");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println("\n");
        
        // 5. NESTED LOOPS
        System.out.println("5. NESTED LOOPS:");
        System.out.println("Simple multiplication table (3x3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        
        // 6. BREAK and CONTINUE
        System.out.println("\n6. BREAK STATEMENT:");
        System.out.println("Loop from 1 to 10, break at 6:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking!");
                break;
            }
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n7. CONTINUE STATEMENT:");
        System.out.println("Numbers 1 to 10, skip multiples of 3:");
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue; // Skip multiples of 3
            }
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n=== LOOP SUMMARY ===");
        System.out.println("• FOR: Use when you know iteration count");
        System.out.println("• WHILE: Use when condition is checked first");
        System.out.println("• DO-WHILE: Use when you need at least one execution");
        System.out.println("• ENHANCED FOR: Use for arrays/collections");
        System.out.println("• NESTED: Use for multi-dimensional operations");
    }
}
