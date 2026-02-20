
public class SecondLargestArray {

    public int secondLargestArray(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i] > max) {

                secmax = max;
                max = arr[i];
            } else if (arr[i] > secmax && arr[i] < max) {

                secmax = arr[i];
            }

        }

        return secmax;

    }

    public static void main(String args[]) {

        int arr[] = {12, 35, 1, 10, 34, 1};

        SecondLargestArray sc = new SecondLargestArray();
        System.out.println(sc.secondLargestArray(arr));

    }
}
