public class leetcode442 {
   

	public static void main(String args[])
	{
		int numRay[] = { 0, 4, 3, 2, 7,5,5,4,3,2,5,6,7,5,4,3,2, 8, 2, 3, 1 };

		for (int i = 0; i < numRay.length; i++) {
			numRay[numRay[i] % numRay.length]
				= numRay[numRay[i] % numRay.length]
				+ numRay.length;
		}
		System.out.println("The repeating elements are : ");
		for (int i = 0; i < numRay.length; i++) {
			if (numRay[i] >= numRay.length * 2) {
				System.out.println(i + " ");
			}
		}
	}
}

    

