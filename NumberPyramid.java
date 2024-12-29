import java.util.*;

public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 5; 
        int num = 1;  

        for (int i = 1; i <= rows; ++i) {
          
            for (int j = 1; j <= rows - i;j++) {
                System.out.print(0);
            }
            for (int j = 1; j <= 2 * i - 1;j++) {
                System.out.print( num);
                num++; 
            }
            System.out.println(); 
        }
        System.out.println(); 
        System.out.println(); 
        
        for (int i = 5; i <0; i--) {
            System.out.println("*");
        }
    }
}
