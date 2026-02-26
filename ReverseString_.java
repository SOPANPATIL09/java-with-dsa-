public class ReverseString_ {
    public String reverseString(String str){
              
              

            char arr[]=str.toCharArray();
            int first=0;
            int last=arr.length-1;

            while(first<last){
                      char temp=arr[first];
                      arr[first]=arr[last];
                      arr[last]=temp;
                      
                      first++;
                      last--;
                      
            }
             
          String s =new String(arr);

          return s.toString();
    }

    public static void main(String args[]){

        ReverseString_ r=new ReverseString_();

        System.out.println(r.reverseString("sop  *-an"));
    }
    
}
