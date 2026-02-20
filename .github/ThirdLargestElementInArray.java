public class ThirdLargestElementInArray{

    public int thirdLargestElement(int a[]){
                int max=Integer.MIN_VALUE;
                int smax=Integer.MIN_VALUE;
                int tmax=Integer.MIN_VALUE;
                
                for(int i=0; i<a.length; i++){
                       int temp=a[i];

                       if(temp>max){
                        tmax=smax;
                        smax=max;
                        max=temp;
                       }
                       else if(temp>smax && smax!=max){
                            tmax=smax;
                            smax=temp;
                       }

                       else if(temp>tmax && tmax!=max && tmax!=smax )
                       {
                                      tmax=temp;


                       }
                      }

   return tmax;
                    }
      public static void main(String args[]){

        ThirdLargestElementInArray t=new ThirdLargestElementInArray();

        int []arr={45,16,1,-5,-2,56,52,-5,3,65};

        System.out.println(t.thirdLargestElement(arr));

        


      }
                  

    }
  