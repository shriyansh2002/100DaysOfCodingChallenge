
import java.util.*;
public class condition {
    public static void main (String[] args){ 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
    
        int m = sc.nextInt();
       

        if(n==m){
        System.out.println("equal");
    
    }else{
    if(n>m){
        System.out.println("first number is greater");
    }
        else{
        System.out.println("second number  is greater");
    }
    }
        
        
        sc.close();

    }
    
}

    
