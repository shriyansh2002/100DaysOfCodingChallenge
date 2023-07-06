import java.util.*;
public class closestPair {





public static void printClosest(int[] arr, int n, int x)
{
	int res_l = 0,
	res_r = 0;
	int temp = Integer.MAX_VALUE;

	
	for (int i = 0; i < n - 1; i++) {
	for (int j = i + 1; j < n; j++) {
		
		if (Math.abs(arr[i] + arr[j] - x) < temp) {
		res_l = i;
		res_r = j;
		temp = Math.abs(arr[i] + arr[j] - x);
		}
	}
	}

	System.out.println("The closest pair is "
					+ arr[res_l] + " and "
					+ arr[res_r]);
}


public static void main(String[] args)
{
	int[] arr = { 1,3,33,4,44,56,32,33,90 };
	int x = 37;
	int n = arr.length;
	printClosest(arr, n, x);
}
}



    
