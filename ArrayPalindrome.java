public class ArrayPalindrome {
    
    public boolean checkPalindrome(int arr[]){

                 int left=0;
                 int right=arr.length-1;

                 while(left<right){
                    if(arr[left]!=arr[right]){
                        return false;
                
                    }

                    left++;
                    right--;
                 }

                 return true;



    }

    public static void main(String args[]){
        int b[]={1,2,3,3,2,1};
        ArrayPalindrome ap=new ArrayPalindrome();

        System.out.println(ap.checkPalindrome(b));
    }
    
}
