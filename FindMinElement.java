
import static java.lang.System.out;

class FindMinElement {
      static int var=10;
    public int returnSmallElement(int arr[]){
               int small=Integer.MAX_VALUE;
               
             
               for(int i=0; i<arr.length; i++){
                   
                    if(arr[i]<small){
                        small=arr[i];
                    }
                   
                   
               }
     return small;   
    }
public static void main(String args[]){
        
            int b[]={1,2,3,-4,8,-1};
            FindMinElement m=new FindMinElement();
            FindMinElement v=new FindMinElement();
            v.var=10;
            m.var=10;
            System.out.println(m.hashCode());
            System.out.println(v.hashCode());
            System.out.println(m.equals(v));
            
            
}
        
    
}