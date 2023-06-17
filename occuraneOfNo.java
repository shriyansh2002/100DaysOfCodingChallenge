public class occurance {


	
	public static int countOccurrences(int arr[], int n, int x)
	{
		int res = 0;
		for (int i=0; i<n; i++)
			if (x == arr[i])
			res++;
		return res;
	}
	
	public static void main(String args[])
	{
		int arr[] = {1, 2, 4,5,3,4,5,4,3,5,76,7,6, 3, 4, 7 ,8 ,8 };
		int n = arr.length;
		int x = 4;
		System.out.println(countOccurrences(arr, n, x));
	}
}

    
