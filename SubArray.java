public class SubArray {
    public static void main(String args[]){
             int sum=0;
               int a[]={1,2,3,-6,-9,5,6,7};

               for(int i=0; i<a.length; i++){
                for(int j=i; j<a.length; j++){
                    for(int k=i; k<=j; k++){
                        System.out.print(a[k]+" ");
                        sum +=a[k];
                    }

                    
                   System.out.println();

                }
               }

               
            
    }
    
}
