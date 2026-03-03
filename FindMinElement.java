class FindMinElement {
    
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
            System.out.println(m.returnSmallElement(b));
            
            
}
        
    
}