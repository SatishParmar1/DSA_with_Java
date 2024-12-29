import java.util.ArrayList;

public class nothing {
    public static void main(String[] args){
        int n = 3;
        int[] arr = {1, 4, 3, 6, 8, 9};
        ArrayList<Integer> an = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            an.add(0);
        }
        for (int i = 0; i < arr.length; i++) {
            an.set((i + n) % arr.length, arr[i]);
            arr[i] = an.get(i);
        }
        System.out.println(an);
    }
}
