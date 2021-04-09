
    import java.util.*;
    public class sol4 {

  public static int[] arrayOfMultiples(int num, int length) {
    final int LIMIT = length, MULTIPLE = num;
    
    int[] list = new int[LIMIT];
    for (int index = 0; index < LIMIT; index++)
        
            list[index] = (MULTIPLE *2);
    
    return list;
  }
 }
    

