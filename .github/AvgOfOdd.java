public class AvgOfOdd {

    public int avgOfOddArray(int a[]){
             int sum=0;
             int count=0;

             for(int i=0; i<a.length; i++){
                 
                if(a[i]%2==0){

                }
                else{
                    sum +=a[i];
                    count++;
                }
             }
         return sum/count;

    }

    public static void main(String[] args) {
        AvgOfOdd ao=new AvgOfOdd();
        
        int []arr={10,23,46,49,61,70,45};
         System.out.println(ao.avgOfOddArray(arr));


       }
    
}
