import java.util.HashSet;

import java.util.Set;

public class longestsbstring{

 public static void main(String[] args) {

 String str = "abcabcbb";

 System.out.println("Longest substring without repeating characters: " + longestSubstring(str));

 }

 public static int longestSubstring(String s) {

 Set<Character> set = new HashSet<>();

 int left = 0, right = 0, maxLen = 0;

 while (right < s.length()) {

 if (!set.contains(s.charAt(right))) {

 set.add(s.charAt(right++));

 maxLen = Math.max(maxLen, set.size());

 } else {

 set.remove(s.charAt(left++));

 }

 }

 return maxLen;

 }

}