//addition of two numbers
java.util.Scanner;
public class AdditonofTwoNumbers {
    public static void main(String args[]);
    {
        //variable declaration
        int a,b,c;

        //creating object of scanner class
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the first number:=");
        a=sc.nextInt();

        Sysetm.out.println("Enter the second number:=");
        b=sc.nextInt();
        //addition of two numbers
        System.out.println("Addition of two numbers is ="+(c=a+b));
    }
}