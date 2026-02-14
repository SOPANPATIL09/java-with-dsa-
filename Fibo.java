public class Fibo{
  public static void main(String args[]){
 
    int first=0;
    int sec=1;

 
  for(int i=1; i<=10; i++){
        System.out.println(first); 
        int sum=first+sec;
        first=sec;
        sec=sum;     
  
 }

}

}