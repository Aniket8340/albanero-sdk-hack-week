import java.util.ArrayList;

public class sol0 {
    public static void even(int arr[]){
        ArrayList<Integer>a1=new ArrayList<>();
             for (int i = 0; i < arr.length; i++){
              if (i % 2 ==0){
               a1.add(arr[i]);
                
            }
        }
        System.out.println(a1);
    }
    public static void main(String[] args){
        int arr[] = { 2, 3, 4, 5, 6 };
        
        even(arr);
    }
}


      
    

      
    
    


    


