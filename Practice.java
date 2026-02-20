public class Practice{
 

    public boolean checkPrime(int n){

        boolean b=true;

        if(n==0 || n==1){
               b=false;   
        }
            
           for(int i=2; i<=n/2; i++){
            
             if(n%i==0){
                  b=false;
                   break;
                }

        }
        return b;            
    
    }
    public static void main(String args[]){
 
          Practice p= new  Practice();
          for(int i=2; i<=1000; i++){

            if(p.checkPrime(i)){
                  System.out.println(i);
            }


          }
           

    }
}
