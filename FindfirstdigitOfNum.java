public class FindfirstdigitOfNum {
    

    public int findFirstDigit(int n){
                                  
                  while(n>9){
                         
                        n/=10;

                  }

                  return n;

    }

    public static void main(String[] args) {
         FindfirstdigitOfNum f=new  FindfirstdigitOfNum();

         System.out.println(f.findFirstDigit(25));
    }



}
