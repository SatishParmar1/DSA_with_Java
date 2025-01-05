public class pattern {
public static void main(String[] args){
    for(int i =1;i<=4;i++){
        for(int j =1;j<=3;j++){
            if(i==j){
                System.out.print(j);
            }else{
                System.out.print(" ");
            }   
        }
        for(int j =4;j>=1;j--){
            if(i==j){
                System.out.print(j);
            }else{
                System.out.print(" ");
            }    
        }
        System.out.println(" ");
    }
    for(int i =1;i<=3;i++){
        for(int j =1;j<=3;j++){
          
            if((i+j)==4){
                System.out.print(j);
            }else{
                System.out.print(" ");
            }
        }
        for(int j =4;j>=1;j--){
            if((i+j)==4){
                System.out.print(j);
            }else{
                System.out.print(" ");
            }      
        }
        System.out.println(" ");
    }
}   
}




/*
 * 1       1
 *  2     2
 *   3   3
 *     4
 *   3   3
 *  2     2
 * 1       1  
 * 
 * 123
 * 12
 * 1
 * 
 */