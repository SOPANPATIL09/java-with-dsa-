public class Practice_Array {

  public  int fiboSum(int n){
                int first=0;
                int second=1;
                int sum=0;
                for(int i=0; i<=n; i++){
                        
                      int temp=first+second;
                      first=second;
                      second=temp;   
                       
                       if(first%2==0){
                        sum+=first;
                       }
                }
                return sum;
  }

  public static void main(String[] args) {
      
    Practice_Array p=new Practice_Array();

    System.out.println(p.fiboSum(8));
  }

    
}
