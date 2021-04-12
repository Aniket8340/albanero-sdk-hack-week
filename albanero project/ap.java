
    // Java program to check if a given array
// can form arithmetic progression
import java.util.Arrays;
public class ap {



	// Returns true if a permutation of
	// arr[0..n-1] can form arithmetic
	// progression
	static boolean checkIsAP(int arr[], int n)
	{
		if (n == 1)
			return true;

		// Sort array
		Arrays.sort(arr);

		// After sorting, difference between
		// consecutive elements must be same.
		int d = arr[1] - arr[0];
		for (int i = 2; i < n; i++)
			if (arr[i] - arr[i - 1] != d)
				return false;

		return true;
	}

	// driver code
	public static void main(String[] args)
	{
		int arr[] = { 20, 15, 5, 0, 10 };
		int n = arr.length;

		if (checkIsAP(arr, n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

// This code is contributed by aniket mishra.

    

