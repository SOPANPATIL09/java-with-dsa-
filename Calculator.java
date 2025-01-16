
import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
 
      Scanner sc = new Scanner(System.in);
      System.out.println("\nenter a number :");
      int a=sc.nextInt();
      System.out.println("\nenter b number:");
      int b=sc.nextInt();
        System.out.println("\nenter operator:");
      char operator =sc.next().charAt(0);
         
      switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");

      }  
    }
}
