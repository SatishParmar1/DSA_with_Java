public class removespace {
        public static void main(String[] args) {
       
        String str = "This is a test string";
       
        String trimmedStr = removeWhiteSpaces(str);
       
        System.out.println("String after removing white spaces: " + trimmedStr);
       
        }
       
        public static String removeWhiteSpaces(String str) {
       
        return str.replaceAll(" ", "");
       
        }
       
       }
    

