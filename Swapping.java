public class Swapping {
    public static void main(String args[]){
         String str="INDIA";
         String s="";
          s +=str.charAt(str.length()-1);

          for(int i=1; i<=str.length()-2; i++){
               s+=str.charAt(i);
          }
            s+=str.charAt(0);

          

          System.out.println(s);




    }
    
}
