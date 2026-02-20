
public class  ThirdLargestArray {

    public int secondLargestArray(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i] > max) {
                third=secmax;
                secmax = max;
                max = arr[i];
            } else if (arr[i] > secmax && arr[i] < max) {
                    third=secmax;
                    secmax=arr[i];            
              
            }

            else if(arr[i]>third &&secmax >third && max>third){

                        third=arr[i];
            }

        }

        return third;

    }

    public static void main(String args[]) {

        int arr[] = {-12, -35, -29, -10, -34, -1};

        ThirdLargestArray sc = new ThirdLargestArray();
        System.out.println(sc.secondLargestArray(arr));

    }
}
