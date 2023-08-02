import java.util.*;
public class equal0and1 {






	static int countSubarrWithEqualZeroAndOne(int arr[],
											int n)
	{
		
		Map<Integer, Integer> um = new HashMap<>();
		int curr_sum = 0;

	
		for (int i = 0; i < n; i++) {
			curr_sum += (arr[i] == 0) ? -1 : arr[i];
			um.put(curr_sum, um.get(curr_sum) == null
								? 1
								: um.get(curr_sum) + 1);
		}

		int count = 0;

	
		for (Map.Entry<Integer, Integer> itr :
			um.entrySet()) {

		
			if (itr.getValue() > 1)
				count += ((itr.getValue()
						* (itr.getValue() - 1))
						/ 2);
		}

		
		if (um.containsKey(0))
			count += um.get(0);

		return count;
	}

	
	public static void main(String[] args)
	{
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		int n = arr.length;
		System.out.println(
			"Count = "
			+ countSubarrWithEqualZeroAndOne(arr, n));
	}
}



    

