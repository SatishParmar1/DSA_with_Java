import java.util.*;

public class Interval {
    // Java program to insert a new Interval in sorted and 
// non-overlapping interval array using insertion and merging

    // Function to merge overlapping intervals
    static ArrayList<int[]> mergeOverlap(int[][] intervals) {

        // Sort intervals based on start values
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        ArrayList<int[]> res = new ArrayList<>();

        // Insert the first interval into the result
        res.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            
            // Find the last interval in the result
            int[] last = res.get(res.size() - 1);
            int[] curr = intervals[i];

            // If current interval overlaps with the last interval
            // in the result, merge them 
            if (curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            } 
            else {
                res.add(curr);
            }
        }

        return res;
    }

    static ArrayList<int[]> insertInterval(int[][] intervals, 
                                            int[] newInterval) {
        
        // Create a new ArrayList to hold the intervals
        ArrayList<int[]> intervalList = 
                new ArrayList<>(Arrays.asList(intervals));
        intervalList.add(newInterval);
        return mergeOverlap(intervalList.toArray(new int[0][]));
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {4, 5}, {6, 7}, {8, 10}};
        int[] newInterval = {5, 6};

        ArrayList<int[]> res = insertInterval(intervals, newInterval);
        for (int[] interval : res) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}

