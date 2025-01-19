import java.util.Arrays;
public class Productofarray { 
      // Function to calculate the product of all 
    // elements except the current element
    static int[] productExceptSelf(int[] arr) {
        int n = arr.length;

        // Initialize the result array as 1
        int[] res = new int[n];
        Arrays.fill(res, 1);
        for (int i = 0; i < n; i++) {

            // Compute the product of all except arr[i]
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    res[i] *= arr[j];
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = productExceptSelf(arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
