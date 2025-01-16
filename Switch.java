
import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the food number");
        int variable=sc.nextInt();
        switch (variable){

            case 1:
                System.out.println("samosa");
                break; 
            case 2: 
                System.out.println("vada");
                break;
            case 3: 
                System.out.println("idli");
                break;
            default: System.out.println("no food");
       
    }
}
}