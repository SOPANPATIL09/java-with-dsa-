import java.util.Arrays;
public class BubbleSort{
    
    public String sortArraybubbleSort(int num[]){
             int n =num.length;
             
             for(int i =0; i<n-1; i++){
                     for(int j=0; j<n-i-1; j++){
                         if(num[j]>num[j+1]){
                             int temp=num[j+1];
                             num[j+1]=num[j];
                             num[j]=temp;
                         }
                         
                     }
                 
             }
            
        return Arrays.toString(num);
    }
    public static void main(String args[]){
        BubbleSort m =new BubbleSort();
        int arr[]={12,86,265,9,59,6,98,6,89,};
        System.out.println(m.sortArraybubbleSort(arr));
    }
}
