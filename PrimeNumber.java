import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = obj.nextInt();
        boolean isPrime = true;

        for (int c = 2; c * c <= num; c++) {
            if (num % c == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}