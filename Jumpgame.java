import java.util.Arrays;
public class Jumpgame {
    // Java program to find the minimum number
// of jumps to reach the end of the array




    static int minJumpsRecur(int i, int[] arr) {
        
        // Return 0 when last element is reached.
        if (i >= arr.length - 1)
            return 0;

        // Traverse through all the points
        // reachable from arr[i].
        // Recursively, get the minimum number
        // of jumps needed to reach array end from
        // these points.
        int ans = Integer.MAX_VALUE;
        for (int j = i + 1; j <= i + arr[i]; j++) {
            int val = minJumpsRecur(j, arr);
            if (val != Integer.MAX_VALUE)
                ans = Math.min(ans, 1 + val);
        }

        return ans;
    }

    static int minJumps(int[] arr) {

        int ans = minJumpsRecur(0, arr);
        
        // If end cannot be reached.
        if (ans == Integer.MAX_VALUE) 
            return -1;
            
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println(minJumps(arr));
    }
}
