import java.util.Scanner;
public class SumofFirstNaturalNO {
    public static void main(String args []){
        Scanner sc =new Scanner (System.in);
        System.out.println("entre a nummber:");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while (i<=n) { 
            sum+=i;
            
            i++;
        }
         System.out.println(sum);
    


    }
    
}
