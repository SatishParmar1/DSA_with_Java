// Java program to reverse words in a string

import java.util.*;

class Reverseword{

    static String reverseWords(String str) {
        
        // Split the input string by '.' while 
        // ignoring multiple consecutive dots
        List<String> words = new ArrayList<>();
        String[] parts = str.split("\\.");
        
        for (String word : parts) {
            if (!word.isEmpty()) {
                
                // Ignore empty words caused by multiple dots
                words.add(word);
            }
        }
        
        // Reverse the words
        Collections.reverse(words);
        
        // Join the reversed words back into a string
        return String.join(".", words);
    }

    public static void main(String[] args) {
        String str = "..geeks..for.geeks.";
        System.out.println(reverseWords(str));
    }
}