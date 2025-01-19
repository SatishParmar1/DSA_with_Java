import java.util.Arrays;
public class Smallestmissingnumber {
    // Java program to find the first positive missing number 
// using Sorting
    
    // Function to find the first positive missing number
    static int missingNumber(int[] arr) {
        Arrays.sort(arr);

        // res will hold the current smallest missing number,
        // initially set to 1
        int res = 1;
        for (int i = 0; i < arr.length; i++) {

            // If we have found 'res' in the array,
            // 'res' is no longer missing, so increment it
            if (arr[i] == res) {
                res++;
            }

            // If the current element is larger than 'res',
            // 'res' cannot be found in the array,
            // so it is our final answer
            else if (arr[i] > res) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        System.out.println(missingNumber(arr));
    }
}
