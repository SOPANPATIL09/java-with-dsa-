public class SubArraySum {

   public int returnSubArraySum(int a[]){

         int sum=0;
         int n=a.length;
         
          for(int i=0; i<a.length; i++){
            sum += a[i] *(i+1)*(n-i);

            
          }
     return sum;
   } 

   public static void main(String args[]){

                int a[]={1,2,3,4,5,6,7};
                
                 SubArraySum s=new SubArraySum();
                 
                 System.out.println(s.returnSubArraySum(a));


   }
}
