public class StrongNumber {

    public boolean checkStrong(int n){
       int temp=n;
       int sum=0;
        
       while(temp!=0){
              int fact=1;
             for(int i=1; i<=temp%10; i++){
                  fact *=i; 
              
             }
             sum +=fact;
             temp/=10;

       }
          return n==sum;
    }
       public static void main(String[] args) {
           StrongNumber sn=new StrongNumber();


           System.out.println(sn.checkStrong(121));
       }

}
