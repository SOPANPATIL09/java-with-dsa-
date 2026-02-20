
import java.util.Arrays;

public class rotateArray{

public static void main(String []args){
    int arr[]={12, 35, 29, 10, 34, 1};

   
    int d=3;
          for(int i=0; i<d; i++){
               int temp =arr[i];

               for(int j=0; j<arr.length-1; j++){
                                  arr[j]=arr[j+1];
                          
               }
                arr[arr.length-1]=temp;

          } 

          System.out.println(Arrays.toString(arr));
    }

}   
    
