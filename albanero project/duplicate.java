
    // Java program to remove duplicates
// from unsorted array

import java.util.*;
public class duplicate {



	// Function to remove duplicate from array
	public static void removeDuplicates(int[] arr)
	{
		LinkedHashSet<Integer> set
			= new LinkedHashSet<Integer>();

		// adding elements to LinkedHashSet
		for (int i = 0; i < arr.length; i++)
			set.add(arr[i]);

		// Print the elements of LinkedHashSet
		System.out.print(set);
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
	
		// Function call
		removeDuplicates(arr);
	}
}

    

