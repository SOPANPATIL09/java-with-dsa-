public class StringReverse1{


    public String reverseString(String str){

              String arr[]=str.split(" ");
                  
               StringBuilder sb=new StringBuilder();
                  
              for(int i=0; i<arr.length; i++){

                          int j=arr[i].length()-1;
                         while(j>=0){

                                     sb.append(arr[i].charAt(j));
                                     j--;

                         }
                             


                         if(  i !=arr.length-1){
                                         sb.append(" ");}
            
                      
                              
              }

               return sb.toString();
           

    }

    public static void main(String args[]){

         StringReverse1 sr=new StringReverse1();
         String s="hello i am java developer";
        System.out.println(sr.reverseString(s));
          
    }
}