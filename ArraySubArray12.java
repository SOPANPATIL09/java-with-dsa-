public class ArraySubArray12 {


    public int returnSubarray(int a[]){


           if(a.length==0){
            return 0;
           }
           int currentmax=a[0];
           int finalmax=a[0];
           int i=1;
           while(i<a.length){
            currentmax=Math.max(a[i], currentmax+a[i]);
            finalmax=Math.max(finalmax, currentmax);
                    
            i++;
           }
          return finalmax;
    }

    public static void main(String args[]){

        int a[]={1,2,-3,1,3};
        ArraySubArray12 as=new ArraySubArray12();

        System.out.println(as.returnSubarray(a));

    }
    
}
