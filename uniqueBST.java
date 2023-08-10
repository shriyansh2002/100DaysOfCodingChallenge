import java.io.*;
    import java.util.Arrays;

public class uniqueBST {
    
    
  
        public static int dp[] = new int[20];
        static int numberOfBST(int n)
        {
            
            if (n <= 1)
                return 1;
            
            if (dp[n] > 0)
                return dp[n];
            for (int i = 1; i <= n; i++)
                dp[n]
                    += numberOfBST(i - 1) * numberOfBST(n - i);
            return dp[n];
        }
    
       
        public static void main(String[] args)
        {
            int n = 3;
            System.out.println("Number of structurally "
                            + "Unique BST with " + n
                            + " keys are : "
                            + numberOfBST(n));
        }
    }
    
   
    
    
