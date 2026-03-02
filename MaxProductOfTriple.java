public class MaxProductOfTriple {


    public int maxProductofMultiplication(int a[]){
                  
                      int n=a.length;
                           int maxProduct=Integer.MIN_VALUE;
                     
                      for(int i=0; i<n-2; i++){

                        for(int j=i+1; j<n-1; j++){
                            for(int k=j+1; k<n; k++){
                              
                                maxProduct=Math.max(maxProduct,a[i]*a[j]*a[k]); 
                            }  
                        }
                      }
   

         
        
        
        return maxProduct;
                    }


    public static void main(String args[]){


        int[] arr = { 10, 3, 5, 6, 20 };

        MaxProductOfTriple mpt=new MaxProductOfTriple();
        System.out.println(mpt.maxProductofMultiplication(arr));
    }               
    
}
