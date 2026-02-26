public class LeapYear{
    public boolean checkLeapYear(int n){
                
                        if(n%400==0 || n%4==0){
                            return true;
                        }
                        else{
                            return false;
                        }

         
    }


    public static void main(String args[]){

        LeapYear l=new LeapYear();

        System.out.println(l.checkLeapYear(2002));
    }
}