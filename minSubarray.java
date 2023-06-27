
import java.util.*;

class minSubarray{
	
	
	
	
	static int findMin(int arr[], int n)
	{
		int min_ele = arr[0];
	
		for (int i = 0; i < n; i++) {
		if (arr[i] < min_ele) {
			min_ele = arr[i];
		}
		}
	
		return min_ele;
	}
	
	public static void main (String[] args) {
		int arr[] = { 4,5,2,4,6,4,3, };
		int N = arr.length;
		System.out.println(findMin(arr, N));
	}
	}
	
	
	