 public class Arraysec{

     public static void main(String args[]){

                  int arr[]={10,20,30,40,55,65};

                   int max=0;
                   int secmax=0;
                    
                 for(int i=0; i<=arr.length-1; i++){

                                int a=arr[i];

                               if(a>max){
                                           max=a;
                                           secmax=max;
                                         }
                                else if(a>secmax && a!=max){
                                           secmax=a;

}
                                          System.out.println(secmax);
                               
                                  
                               

                   

         }

} 
