public class AvgOfArray {

    public int avgOfArray(int a[]){
                int sum=0;
                
                for(int i=0; i<a.length; i++){
                    sum +=a[i];
                }
                
         return sum/a.length;
    }

    public static void main(String[] args) {
        AvgOfArray aa=new AvgOfArray();

       int []arr={10,20,30,40,50,60};

       System.out.println(aa.avgOfArray(arr));

    }
    
}
