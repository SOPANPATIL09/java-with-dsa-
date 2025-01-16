
import java.util.Scanner;

public abstract class StudentPass {
    public static void main(String args[]){
         Scanner Scanner = new Scanner(System.in);
         System.out.println("Enter the marks");
       int marks=Scanner.nextInt();
       String result =(marks>40)?"pass":"Fails";

       System.out.println(result);

    }
    
}
