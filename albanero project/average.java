
    import java.io.*;
    public class average {

 
    static int getSum(String str)
    {
        int sum = 0,n;
        n=str.length();
 
        // Traversing through the string
        for (int i = 0; i < str.length(); i++) {
 
            // Since ascii value of
            // numbers starts from 48
            // so we subtract it from sum
            sum = sum + str.charAt(i) - 48;
            
        }
        return sum/n;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        String st = "12345";
        System.out.print(getSum(st));
    }
}
    

