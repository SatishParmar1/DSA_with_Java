// Java Program to check for pangram string by searching 
// for each character

class Panagram{

    // Java method to check for pangram string by searching
    // for each character
    static boolean checkPangram(String s) {

        // Iterate over all the characters
        for(char ch = 'a'; ch <= 'z'; ch++) {
            boolean found = false;

            // Search for the character in the string
            for(int i = 0; i < s.length(); i++) {
                if(ch == Character.toLowerCase(s.charAt(i))) {
                    found = true;
                    break;
                }
            }

            // If ch is not present in s, return false
            if(found == false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "The quick brown fox jumps over the lazy dog";
        if (checkPangram(s) == true)
            System.out.println("true");  
        else
            System.out.println("false");  
    }
}