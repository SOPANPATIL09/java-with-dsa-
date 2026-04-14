public class EqualibriumArray {

    public static void main(String[] args) {
        int[] arr = { 2, 3, -1, 8, 4 };
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int leftsum = 0;
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (leftsum == sum) {
                System.out.println("Equilibrium index is " + i);
                return;
            }
            leftsum += arr[i];
        }
        System.out.println("No equilibrium index found");
    }
    
}
