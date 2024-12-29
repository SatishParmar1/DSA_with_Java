import java.util.LinkedList;
import java.util.Queue;

class reversequeue{
    public static void main(String[] args){
        Queue<Integer> sb = new LinkedList<Integer>();

        sb.add(10);
        sb.add(10);
        sb.add(30);
        sb.add(40);
        sb.add(20); 
        reverse(sb);
        System.out.println(sb);
    }

    public static void reverse(Queue<Integer> sb){

        if(sb.isEmpty()){
            return;
        }
        int data = sb.poll();
        reverse(sb);
        sb.add(data);
        
    }
}