//Check whether a number is positive or negative
import java.io. BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Weathercheck{
    public void checkweather(int n){
        if(n>0){
            System.out.println("weather is positive");
        }
        else{
            System.out.println("weather is negative");
        }
    }
    public static void main(String args[])throws IOException{ 
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));   
         
         System.out.println("Enter a number");
         int num=Integer.parseInt(br.readLine());
         Weathercheck wc=new Weathercheck();
         wc.checkweather(num);
        
        
    }
}