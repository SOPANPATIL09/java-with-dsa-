import java.util.Scanner;
class Main{
    public static void main(String []args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = obj.nextInt();
        int c = 2;

        while (c * c <= num) {
            c += 1;
            if (num % c == 0) {

                System.out.println(num + "number is not a prime");
                break;
            }


            else
            {
                System.out.println(num + ":-number is prime");
                break;
            }

        }



        }

    }
