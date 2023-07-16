import java.io.*;
import java.util.*;

public class palindromicSubstring {
    




	static int palindromeSubStrs(String str,
								Set<String> set)
	{
	
		int n = str.length();
		boolean dp[][] = new boolean[n][n];

		for (int gap = 0; gap < n; gap++) {
			for (int i = 0, j = gap; j < n; i++, j++) {
				if (gap == 0)
					dp[i][j] = true;
				else if (gap == 1)
					dp[i][j]
						= str.charAt(i) == str.charAt(j);
				else
					dp[i][j]
						= (str.charAt(i) == str.charAt(j)
						&& dp[i + 1][j - 1]);

				if (dp[i][j])
					set.add(str.substring(i, j + 1));
			}
		}
		return set.size();
	}
	public static void main(String[] args)
	{
		String str = "abaaa";
		Set<String> set = new TreeSet<>();
		palindromeSubStrs(str, set);
		System.out.println(
			"No of distinct palindromic substrings are : "
			+ palindromeSubStrs(str, set));

		for (String s : set)
			System.out.println(s);
	}
}



    

