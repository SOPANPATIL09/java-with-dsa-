public class PerfectNUmber {


    public boolean checkperfect(int n){
                
             
                 int sum=0;
            
                


                                  for(int i=1; i<=n/2; i++){
                                         
                                              if(n%i==0){

                                                sum+=i;
                                              }
                                     

                                  }

              

                     return sum==n;
 
    }  
    
    public static void main(String args[]){


         PerfectNUmber pn=new PerfectNUmber();

       for(int i=1; i<=1000; i++){ 
           if(pn.checkperfect(i))
                          System.out.println(i);

       }
    }
}
