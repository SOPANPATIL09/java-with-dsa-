public class Armstrong{
   
  
public boolean checkArmstrong(int n){
             int temp=n;
             int sum=0;
             int length=0;
             while(temp!=0){

                              length +=1;

                              temp/=10;
             }
            temp=n;
             while(temp!=0){
              
                     sum+=Math.pow(temp%10, length);

                     temp/=10;
                       
             }
               
 
return n==sum;
}

public static void main(String args[]){
    Armstrong p=new Armstrong();
     System.out.println(p.checkArmstrong(153));
}
}