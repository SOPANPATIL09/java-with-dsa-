
import java.util.Arrays;
class Selectionsort {
    public String selectionSort(int arr[]){
         
         for(int i=0; i<arr.length; i++){
             
             int index=i;
             for(int j=1+i; j<arr.length; j++){
                       if(arr[j]<arr[index]){
                           index=j;
                       }
             }
             if(index !=i){
                 int temp =arr[i];
                 arr[i] =arr[index];
                 arr[index] =temp;
             }
         }
      return Arrays.toString(arr);   
        
    }
    
    public static void main(String[] args) {
             Selectionsort m =new Selectionsort();
             int s[]={12,855,8,9,89,4,9};
             System.out.println(m.selectionSort(s));
    }
}