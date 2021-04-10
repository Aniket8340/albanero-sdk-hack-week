
    import java.util.Arrays;
import java.util.Collections;
public class sum {

// Java code to find sum of
// maximum of all subsets of array


	// Method returns sum of maximum of all subsets
	static int sumOfMaximumOfSubsets(Integer arr[], int N)
	{
		// sorting array in decreasing order
		Arrays.sort(arr, Collections.reverseOrder());

		// initializing sum with first element
		int sum = arr[0];
		for (int i = 1; i < N; i++)
		{
			// calculating evaluation similar to horner's rule
			sum = 2 * sum + arr[i];
		}

		return sum;
	}

	// Driver code
	public static void main(String[] args)
	{
		Integer arr[] = {3, 2, 5};
		int N = arr.length;
		System.out.println(sumOfMaximumOfSubsets(arr, N));
	}
}

/* This code contributed by aniket mishra */

    
}
