import java.util.Arrays;
public class Array1{

    public int[]  returnFirstNumberInArray(int a[]){

                      int arr[]=new int[a.length];

                      for(int i=0; i<a.length; i++){
                          
                             int temp=a[i];

                             while(temp>9){

                                temp/=10;

                             }
                             arr[i]=temp;

                           
                      }
 

            return arr;       
        

    }
    

    public static void main(String args[]){

               
               

                     Array1 a=new Array1();
                     int arr[]={215,1,449,54,65,666,66,86,8,6,8885};
                        System.out.println(Arrays.toString(a.returnFirstNumberInArray(arr)));

            }}