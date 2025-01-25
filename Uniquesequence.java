import java.io.*;
import java.lang.Math;
import java.util.*;
public class Uniquesequence {
    // java program to print distinct
// subsequences of a given string

    // Function for generating the subsequences
    public static void subsequences(Set<String> sn,
                                    char[] s, char[] op,
                                    int i, int j, int n)
    {
        // Base Case
        if (i == n) {
            op[j] = '\0';

            // Insert each generated
            // subsequence into the set
            sn.add(String.valueOf(op));
            return;
        }

        // Recursive Case
        else {
            // When a particular character is taken
            op[j] = s[i];
            subsequences(sn, s, op, i + 1, j + 1, n);

            // When a particular character isn't taken
            subsequences(sn, s, op, i + 1, j, n);
            return;
        }
    }

    public static void main(String[] args)
    {
        char[] str = { 'g', 'g', 'g' };
        int m = str.length;
        int n = (int)Math.pow(2, m) + 1;

        // Create an empty set to store the subsequences
        Set<String> sn = new HashSet<String>();

        // Output array for storing
        // the generating subsequences
        // in each call
        char[] op = new char[m + 1]; // extra one for having
                                     // \0 at the end

        // Function Call
        subsequences(sn, str, op, 0, 0, m);

        // Output will be the number
        // of elements in the set
        System.out.println(sn.size());
        sn.clear();

        // This code is contributed by Aditya Sharma
    }
}

