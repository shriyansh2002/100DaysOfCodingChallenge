public class substring2 {
    


static boolean issubstring(String str2,
						String rep1)
{
	int M = str2.length();
	int N = rep1.length();


	for (int i = 0; i <= N - M; i++)
	{
		int j;


		for (j = 0; j < M; j++)
			if (rep1.charAt(i + j) != str2.charAt(j))
				break;

		if (j == M) 
			return true;
	}

	return false;
}


static int Min_repetation(String A, String B)
{

	int ans = 1;
	
	String S = A;
	
	
	while(S.length() < B.length())
	{
		S += A;
		ans++;
	}
	
	if (issubstring(B, S)) return ans;
	
	if (issubstring(B, S + A))
		return ans + 1;
	
	return -1;
}


public static void main(String[] args)
{
	String A = "abcd", B = "cdabcdab";
	

	System.out.println(Min_repetation(A, B));
}
}

    

