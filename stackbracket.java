import java.util.Stack;

public class stackbracket {
    public static void main(String[] args){
        String sn = ")}][(}";
        String sa = "[{(]})";
        Stack<Character> sb = new Stack<Character>();
        for(int i =0;i<6;i++){
            sb.push(sa.charAt(i));
        }
        put(sb,sn);
    }
    public static void put(Stack<Character> sb, String sn){
       for(int j = 0;j<6;j++){
        if(sb.pop() == sn.charAt(j)){
            System.out.println("founded"+sn.charAt(j));
        }else{
            System.out.println("not found"+sn.charAt(j));
        }
    }
}
}
