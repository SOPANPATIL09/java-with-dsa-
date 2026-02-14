import java.util.Scanner;
public class ReverseNUmber2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");

        int rev =0;
        int n =sc.nextInt();
        while(n>0){
            int Lastdigit=n%10;
            rev=(rev*10)+Lastdigit;
            n=n/10;
        
    }
    System.out.println(rev);
}}
