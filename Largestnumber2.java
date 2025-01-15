
import java.util.Scanner;

public class Largestnumber2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    System.out.println("enter a three number");
     
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      int num3=sc.nextInt();
      int max=num1;
       
      if(max<num2){
        max=num2;
      }
      if (max<num3) {
          max=num3;   
          System.out.println(max+ "number is biggest number ");
      }
      else {
        System.out.println(max +"number is biggest number");
      }
    }
    
}
