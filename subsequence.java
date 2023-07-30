import java.io.*;
import java.lang.Math;
import java.util.*;


public class subsequence {
 


	
	public static void subsequences(Set<String> sn,
									char[] s, char[] op,
									int i, int j, int n)
	{
		
		if (i == n) {
			op[j] = '\0';

			
			sn.add(String.valueOf(op));
			return;
		}

		
		else {
			
			op[j] = s[i];
			subsequences(sn, s, op, i + 1, j + 1, n);

			
			subsequences(sn, s, op, i + 1, j, n);
			return;
		}
	}

	public static void main(String[] args)
	{
		char[] str = { 'g', 'g', 'g' };
		int m = str.length;
		int n = (int)Math.pow(2, m) + 1;

		
		Set<String> sn = new HashSet<String>();

		
		char[] op = new char[m + 1]; 
									

		subsequences(sn, str, op, 0, 0, m);

		
		System.out.println(sn.size());
		sn.clear();

		
	}
}

    

