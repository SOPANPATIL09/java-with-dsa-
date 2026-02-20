public class CountVowels{

        
 public int countVowels(String str){

            int count=0;

       

            for(int i=0; i<str.length(); i++){

                   if('a'==str.charAt(i) || 'o'==str.charAt(i) || 'e'==str.charAt(i) || 'u'==str.charAt(i)||'i'==str.charAt(i) ||'A'==str.charAt(i) || 'O'==str.charAt(i) || 'E'==str.charAt(i) || 'U'==str.charAt(i)||'I'==str.charAt(i)){


                    count++;
                   }


            }

            return count;
 }

 public static void main(String args[]){

    

            CountVowels s=new CountVowels();
                    String f="HELLO i am java developer";

                    System.out.println(s.countVowels(f));
 }


}