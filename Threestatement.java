import java.util.Scanner;

public class Threestatement{
    public static void main(String args []){
          Scanner sc =new Scanner(System.in);
          System.out.println("\n enter a your age ");
        int age=sc.nextInt();


      if(age>=18){
        System.out.println("adult");
      }
      else if(age>13 && age<18){
        System.out.println("teenagers ");

      }
      else {
        System.out.println("minors");
      }

    }
 }