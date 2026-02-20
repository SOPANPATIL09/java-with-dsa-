public class ReturnAvgOfNumber {

   public int  ReturnAvg(int n){
            
                 int count=0;
                 int sum=0;
                 while(n!=0){
                    
                      sum +=n%10;
                      n/=10;
                      count++;

   }        
 return   sum/count;   
}
public static void main(String args[]){

ReturnAvgOfNumber obj=new ReturnAvgOfNumber();

System.out.println(obj.ReturnAvg(96));
}


}