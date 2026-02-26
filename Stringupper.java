public class Stringupper {


    public static void main(String args[]){
              String s="hi i am java developer";
              String arr[]=s.split(" ");

              StringBuilder sb=new StringBuilder();

              String s1="";
            
               for(int i=arr.length-1; i>=0; i--){
                             
                           for(int j=0; j<arr[i].length(); j++){
                                    
                                      sb.append(Character.toUpperCase(arr[i].charAt(j)));


                           }

                           if(i!=0){
                            sb.append(" ");
                           }

               }


               
      
     System.out.println(sb.toString());

     

    }  
    }
    

