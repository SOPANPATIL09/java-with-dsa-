public class ThirdLargestElement {
    
    public int returnThird(int arr[]){
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int temp=arr[i];
            if(temp>max){
                tmax=smax;
                smax=max;
                max=temp;
            }
            else if(temp>smax && temp<max){
                tmax=smax;
                smax=temp;
            }
           else if(temp>tmax && temp<smax && temp<max){
                tmax=temp;
            }
            
            
        }
       return tmax; 
        
    }
    public static void main(String args[]){
        int arr[]={1,-4,-2,-1};
        ThirdLargestElement m=new ThirdLargestElement();
        System.out.println(m.returnThird(arr));
    }
}