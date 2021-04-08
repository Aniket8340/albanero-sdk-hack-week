import java.util.Scanner;

public class square {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int num;
         System.out.print("enter an integer");
         num=sc.nextInt();
         System.out.println("your square number is:"+square(num));

        
    }
    public static int square(int num) {
        return num*num;
        
    }
    
}
