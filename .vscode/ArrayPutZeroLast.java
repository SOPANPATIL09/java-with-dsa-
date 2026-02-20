import java.util.Arrays;

public class ArrayPutZeroLast {
 
  //int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
 public int[] putZeroLast(int a[]){
                   
        int temp[]=new int[a.length];
        int j=0;
        
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                temp[j++]=a[i];
            }
            }
              while(j<a.length){
                temp[j++]=0;
              }
             
              for(int i=0; i<a.length; i++){

                       a[i]=temp[i];
              }


        
   return a;      

 }
 public static void main(String[] args) {
      int a[]={1, 2, 0, 4, 3, 0, 5, 0};
    ArrayPutZeroLast ap=new ArrayPutZeroLast();
    System.out.println(Arrays.toString(ap.putZeroLast(a)));
 }
    
}
