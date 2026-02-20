public class CheckPalindrome {

    public boolean checkPalindrome(int n){
        int temp=n;
       int sum=0;
       while(temp!=0){
              sum*=10;
              sum +=temp%10;
              temp/=10;

       }
       return sum==n;
    
    }
    public static void main(String args[]){
        CheckPalindrome cp=new CheckPalindrome(); 
             int count=0;
         for(int i=1; i<=1000; i++){
             if(cp.checkPalindrome(i)){
                System.out.println(i);
                    count++;}
    }
          System.out.println("  count="+count);
}
}