
import java.awt.*;
import java.util.*;

public class encrypt {
	static String convertToHex(int num)
	{

		StringBuilder temp = new StringBuilder();
		while (num != 0) {
			int rem = num % 16;
			char c;
			if (rem < 10) {
				c = (char) (rem + 48);
			}
			else {
				c = (char) (rem + 87);
			}
			temp.append(c);
			num = num / 16;
		}

		return temp.toString();
	}

	static String encryptString(String S, int N)
	{

		StringBuilder ans = new StringBuilder();

		
		for (int i = 0; i < N; i++) {

			char ch = S.charAt(i);
			int count = 0;
			String hex;

			
			while (i < N && S.charAt(i) == ch) {

				count++;
				i++;
			}

		
			i--;

			
			hex = convertToHex(count);

			
			ans.append(ch);

			
			ans.append(hex);
		}


		ans.reverse();

	
		return ans.toString();
	}

	public static void main(String[] args)
	{
	
		
		String S = "abc";
		int N = S.length();

		System.out.println(encryptString(S, N));
	}
}



    

