
    // Java program to check WHETHER IT IS ISOGRAM OR NOT

import java.io.*;
import java.util.*;
public class isogram {
	// Function to check
	// if a given string is isogram or not
	static boolean is_isogram(String str)
	{
		// Convert the string in lower case letters
		str = str.toLowerCase();
		int len = str.length();

		char arr[] = str.toCharArray();

		Arrays.sort(arr);
		for (int i = 0; i < len - 1; i++) {
			if (arr[i] == arr[i + 1])
				return false;
		}
		return true;
	}

	// driver program
	public static void main(String[] args)
	{
		String str1 = "Algorism";
		System.out.println(is_isogram(str1));

		String str2 = "pasSword";
		System.out.println(is_isogram(str2));

		String str3 = "consecutive";
		System.out.println(is_isogram(str3));

		String str4 = "Alphabet";
		System.out.println(is_isogram(str4));
	}
}

// Contributed by ANIKET MISHRA

    

