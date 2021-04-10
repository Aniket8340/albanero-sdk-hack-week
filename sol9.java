
    // Java program to find the sum
// of each row and column of a matrix

import java.io.*;
public class sol9 {


	// Get the size m and n
	static int m = 4;
	static int n = 4;

	// Function to calculate sum of each row
	static void row_sum(int arr[][])
	{

		int i, j, sum = 0;

		System.out.print("\nFinding Sum of each row:\n\n");

		// finding the row sum
		for (i = 0; i < m; ++i) {
			for (j = 0; j < n; ++j) {

				// Add the element
				sum = sum + arr[i][j];
			}

			// Print the row sum
			System.out.println("Sum of the row " + i + " = "
							+ sum);

			// Reset the sum
			sum = 0;
		}
	}

	// Function to calculate sum of each column
	static void column_sum(int arr[][])
	{

		int i, j, sum = 0;

		System.out.print(
			"\nFinding Sum of each column:\n\n");

		// finding the column sum
		for (i = 0; i < m; ++i) {
			for (j = 0; j < n; ++j) {

				// Add the element
				sum = sum + arr[j][i];
			}

			// Print the column sum
			System.out.println("Sum of the column " + i
							+ " = " + sum);

			// Reset the sum
			sum = 0;
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int i, j;
		int[][] arr = new int[m][n];

		// Get the matrix elements
		int x = 1;
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				arr[i][j] = x++;

		// Get each row sum
		row_sum(arr);

		// Get each column sum
		column_sum(arr);
	}
}
// This code is contributed by aniket mishra..

    
