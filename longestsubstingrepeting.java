class longestsubstringrepeting{

    public static void main(String[] args) {
   
    String str = "aabcaabdaab";
   
    System.out.println("Longest repeating sequence: " + longestRepeatingSequence(str));
   
    }
   
    public static String longestRepeatingSequence(String str) {
   
    int n = str.length();
   
    int[][] dp = new int[n + 1][n + 1];
   
    int longest = 0, endIndex = 0;
   
    for (int i = 1; i <= n; i++) {
   
    for (int j = i + 1; j <= n; j++) {
   
    if (str.charAt(i - 1) == str.charAt(j - 1) && dp[i - 1][j - 1] < (j - i)) {
   
    dp[i][j] = dp[i - 1][j - 1] + 1;
   
    if (dp[i][j] > longest) {
   
    longest = dp[i][j];
   
    endIndex = i;
   
    }
   
    } else {
   
    dp[i][j] = 0;
   
    }
   
    }
   
    }
   
    return str.substring(endIndex - longest, endIndex);
   
    }
   
   }