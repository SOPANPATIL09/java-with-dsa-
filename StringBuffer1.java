import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StringBuffer1 {

    
    public static void main(String args[])  throws IOException{

            BufferedReader sb=new BufferedReader( new InputStreamReader(System.in));
 
            System.out.println("Enter your name");
   
             String name=sb.readLine();

             System.out.println("Enter your age");

             int age=Integer.parseInt(sb.readLine());

    }
}
