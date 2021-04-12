import java.util.ArrayList;

public class soln {
    public static void  find(int[] arr){
        ArrayList<Integer>evens=new ArrayList<>();
        ArrayList<Integer>odds=new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2==0)
            evens.add(arr[i]);
         else 
            odds.add(arr[i]);
            
        }
        int elen = evens.size();
        int olen = odds.size();
    
        if (elen > olen) 
            System.out.println(odds);
         else 
            System.out.println(evens);
       
        }
    public static void main(String[] args){
        int array[]={2,4,6,7,8,10};
        find(array);

    }
   
    }
      
    
    

