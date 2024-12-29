import java.util.LinkedList;
import java.util.Queue;

public class staticusingqueue {
    public static void main(String[] args){
        Queue<Integer> sb = new LinkedList<Integer>();
        sb.add(10);
        sb.add(20);
        sb.add(30);
        sb.add(40);
        sb.add(50);
        sb.add(60);
        System.out.println("first queue sb"+sb);
        Queue<Integer> sn = new LinkedList<Integer>();
        stack(sb, sn);
        put(sb,sn);
        
        System.out.println("reverse queue sb"+sb);

    }

    public static void stack(Queue<Integer> sb, Queue<Integer> sn){
        if(sb.isEmpty()){
            return;
        }
        int data = sb.poll();
        stack(sb, sn);
        sn.add(data);
    }

    public static void put(Queue<Integer> sb, Queue<Integer> sn){
        if(sn.isEmpty()){
            return;
        }
        int data = sn.poll();
        sb.add(data);
        put(sb,sn);
    }
}
