import java.util.Scanner;

public class classwork {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value");
        int a= sc.nextInt();
        System.out.println("enter the value");
        int b= sc.nextInt();
        System.out.println("the number before swapping are"+"a= "+ a+"and b="+b);
        a= a^b;
        b= a^b; 
        a= a^b;
         System.out.println("the number after  swapping are"+"a= "+ a+"and b="+b);


    }
    
}
