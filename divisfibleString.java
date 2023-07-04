import java.io.*;

public class divisfibleString {
 



	
	static boolean isDivisibleBy7(int num)
	{
		// If number is negative, make it positive
		if( num < 0 )
			return isDivisibleBy7( -num );

		// Base cases
		if( num == 0 || num == 7 )
			return true;
		if( num < 10 )
			return false;

		// Recur for ( num / 10 - 2 * num % 10 )
		return isDivisibleBy7( num / 10 - 2 * ( num - num / 10 * 10 ) );
	}

	
	// Driver program
	public static void main (String[] args)
	{
		int num = 616;
		if(isDivisibleBy7(num))
			System.out.println("Divisible");
		else
			System.out.println("Not Divisible");
	}

}



    

