public class FrequencyOfArray{
    
public void returnFrequency(int a, int b){
                     int  arr[] = {10,5,10,15,10,5};
                     int count1=0;
                     int count2=0;
                     for(int i=0; i<arr.length; i++){
                              if(arr[i]==a){
                                  count1++;
                              }
                              
                              else if(arr[i]==b){
                                  
                                  count2++;
                              }
                     }
                     
                     System.out.println(a+" "+count1);
                     System.out.println(b+ " "+count2);
    
}
public static void main(String args[]){
    
    FrequencyOfArray m=new FrequencyOfArray();
      int a=5;
      int b=15;
    m.returnFrequency(a,b);
}
}