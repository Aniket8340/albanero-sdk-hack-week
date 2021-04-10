
    // Java program for the above approach
import java.io.*;
import java.util.*;
public class sol10 {



	// Function to find positive integers
	// from 1 to N that are not present in the array
	static void findMissingNumbers(int[] arr, int len)
	{
		int M = 15;

		// Declare bitset
		BitSet bset = new BitSet(M);

		// Iterate from 0 to M - 1
		for (int i = 0; i < M; i++)
		{
			bset.set(i);
		}

		// Iterate from 0 to len - 1
		for (int i = 0; i < len; i++)
		{
			bset.set(arr[i] - 1, false);
		}

		// Iterate from bset._Find_first()
		// to bset.size() - 1
		for (int i = bset.nextSetBit(0); i >= 0;
			i = bset.nextSetBit(i + 1))
		{
			if (i + 1 > len)
				break;
			System.out.println(i + 1);
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		int[] arr = new int[] { 1, 2, 4, 6, 8, 9 };
		int n = arr.length;
		findMissingNumbers(arr, n);
	}
}

// This code is contributed by aniket mishra

    

