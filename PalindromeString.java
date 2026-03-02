public class PalindromeString {
    
 
 public static void main(String args[]){
             
                  String str="naman";
                  int left=0;
                  int right=str.length()-1;
                   
                  while(left<right){
                                          char a=str.charAt(right);
                                          char b=str.charAt(left);
                                     if(a!=b){

                                        System.out.println("false");
                                        break;

                                     }

                                     left++;
                                     right--;


                  } 
      

                  System.out.println("true");


 }    
}
