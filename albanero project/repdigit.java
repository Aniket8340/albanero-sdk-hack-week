public class repdigit {
    // Java implementation to check
// if a number is Repdigit


    // Function to check if a number
    // is a Repdigit number
    static boolean isRepdigit(int num, int b)
    {
        // To store previous digit (Assigning
        // initial value which is less than any
        // digit)
        int prev = -1;
    
        // Traverse all digits from right to
        // left and check if any digit is
        // smaller than previous.
        while (num != 0)
        {
            int digit = num % b;
            num /= b;
            if (prev != -1 && digit != prev)
                return false;
            prev = digit;
        }
        return true;
    }
    
    // Driver code
    public static void main(String args[])
    {
        int num = 2000, base1 = 7;
        if(isRepdigit(num, base1))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
    }
    
    // This code is contributed by aniket mishra
    
    

