
public class ReverseNumber4 {


    public String reverseNumber(int n){
           StringBuilder sb=new StringBuilder();
          int sum=0;
        while(n!=0){
                 if(n%10==0)
                     sb.append(0);
                 else {
                     sb.append(n%10);
                 }
                 n/=10;
        }
      


  return sb.toString();
    }

    public static void main(String args[]){

         ReverseNumber4 r=new ReverseNumber4();

         System.out.println(r.reverseNumber(+100));

    }
    
}
