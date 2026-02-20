public class AppendSumOFNum {


public int appendSumAtLast(int n){
         int temp=n;
         int sum=0;
         
         while(temp!=0){

              sum +=temp%10;
              temp/=10;

         }

         if(sum<10){
            n *=10;
         }

         else {
            n*=100;
         }

         return n+sum;
          
 
}

public static void main(String args[]){

    AppendSumOFNum a=new AppendSumOFNum();

    System.out.println(a.appendSumAtLast(1255));
}
    
}
