import java.util.*;
public class countingSubstrings {




	
	static long getSubstringWithEqual012(String s)
	{

		ArrayList<String> arr = new ArrayList<>();
		int n = s.length();
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				String s1 = "";
				for (int k = i; k <= j; k++) {
					s1 += s.charAt(k);
				}
				arr.add(s1);
			}
		}
		int count = 0;
		int countZero, countOnes, countTwo;
		
		for (int i = 0; i < arr.size(); i++) {
			countZero = 0;
			countOnes = 0;
			countTwo = 0;
			String curs = arr.get(i);
			for (int j = 0; j < curs.length(); j++) {
				if (curs.charAt(j) == '0')
					countZero++;
				if (curs.charAt(j) == '1')
					countOnes++;
				if (curs.charAt(j) == '2')
					countTwo++;
			}
			
			if (countZero == countOnes
				&& countOnes == countTwo) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args)
	{
		String str = "0102010";
		System.out.println(getSubstringWithEqual012(str));
	}
}


    
