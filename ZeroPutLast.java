import java.util.Arrays;

public class ZeroPutLast {
    public static void main(String args[]){
            int a[]={4,0,24,6,0,6,6,0,3,0};
            int n=a.length;
           int j=0;
            for(int i=0; i<n; i++){

                if(a[i]!=0){
                    
                    a[j++]=a[i];    
                }
             
            }

            while(j<n){
                a[j++]=0;
            }
              System.out.println(Arrays.toString(a));
    }
    
}
