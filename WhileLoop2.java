import java.util.Scanner;
public class WhileLoop2 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("how many number you want to print enter that number ");
         int n=sc.nextInt();
         System.out.println("entered number is :"+n);
        int  counter=1;
         while(counter<=n){
            System.out.println(counter);
            counter++;
         }
         System.out.println("Series printed by:"+n);

    



    }
    
}
