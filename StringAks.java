public class StringAks{
    public String reverseString(String s){
                  
                 String arr[]=s.split(" ");
                    StringBuilder sb=new StringBuilder();
                    for(int i=arr.length-1;i>=0;i--){
                        for(int j=0; j<arr[i].length();j++){
                            sb.append(arr[i].charAt(j));
                        }
                        if(i!=0)
                            sb.append(" ");
                    }

        return sb.toString();
    }

    public static void main(String args[]){

         StringAks r=new StringAks();
             String str="hello i am java developer";
         System.out.println(r.reverseString(str));

    }
}