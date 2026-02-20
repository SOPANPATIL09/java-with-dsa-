public class CountVowelsUsingContain {

    public  int CountVowels(String str){

                    int count=0;
                    String s1="aeoiuAEOIU";

                    for(int i=0; i<str.length(); i++){

                          if(s1.contains(String.valueOf(str.charAt(i)))){

                            count++;
                          }
                    }
                    return count;

    }

    public static void main(String[] args) {
        
         String str="hi i am the cricket lover AND I MY FAVOURATE PLAYER IS ROHIT SHARMA";
          
         CountVowelsUsingContain c=new CountVowelsUsingContain();

               System.out.println(c.CountVowels(str));
    }
    
}
