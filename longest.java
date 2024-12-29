public class longest {
    public static void main(String[] args){
        String text1 = "hello";
        String text2 = "hely";
        System.out.print(loingestcomman(text1,text2));
    }
    public static int loingestcomman(String text1, String text2){
        int count = 0;
        int i=0;
        int j =0;
        int n = Math.max(text1.length(),text2.length());
        int a = 0;
        while(n>0){
            if(text1.charAt(i)== text2.charAt(j)){
                i++;
                j++;
                count++;
            }else{
                i++;
                j++;
                a = 0;
            }
            n--;
        }
        if(a<count){
            System.out.println("count");
            return count;
        }else{
            System.out.println("a");
            return a;
        }
    }
    
}
