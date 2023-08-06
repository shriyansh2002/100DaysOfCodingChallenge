
   
import java.util.Arrays;
import java.util.Collections;


	public class kSmallest {
	public static int kthSmallest(Integer[] arr, int K)
	{
		
		Arrays.sort(arr);

	
		return arr[K - 1];
	}

	
	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19,3,45,3,2,4,5,4,3 };
		int K = 4;

		
		System.out.print("K'th smallest element is "
						+ kthSmallest(arr, K));
	}
}


    

