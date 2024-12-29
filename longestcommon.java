public class longestcommon {
    public static void main(String[] args){
        String s = "bagsatish";

        System.out.print(common(s));
    }

    static int common(String s){
        StringBuilder sb = new StringBuilder();
        int i =0;
        int j =0;

        while(i<s.length()){ 
            if(j == s.length()){
                break;
            }  else if( ischeck(s.charAt(i), sb)== false){
                sb.append(s.charAt(i));
                System.out.println(sb.toString());
            }else{
                sb.deleteCharAt(i);
                sb.append(s.charAt(i));
                System.out.println("z");
                j++;
            }   
            i++;      
        }
        return sb.length();
    }
       static boolean ischeck(char a, StringBuilder sb){
        for(int i = 0;i<sb.length();i++){
            if(a == sb.charAt(i)){
                return true;
            }
        }
        return false;
       }
    
}
