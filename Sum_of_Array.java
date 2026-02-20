public class Sum_of_Array {

    public int returnSumOfArray(int []arr){
                      int sum=0;
                      
                      for(int i=0; i<arr.length; i++){
                        sum+=arr[i];
                      }

        return sum;
    }

    public static void main(String args[]){

        Sum_of_Array pa=new Sum_of_Array();
       int []arr={10,20,30,40,50,60};

       System.err.println(pa.returnSumOfArray(arr));


    }
    
}
