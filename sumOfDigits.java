
    import java.io.Console;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class sumOfDigits {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number to calculate sum of digits");
        int number = sc.nextInt();

        // Remember number/10 reduces one digit from number
        // and number%10 gives you last digit
        int sum = 0;
        int input = number;
        while (input != 0) {
            int lastdigit = input % 10;
            sum += lastdigit;
            input /= 10;
        }

        System.out.printf("Sum of digits of number %d is %d", number, sum);

        // closing Scanner to prevent resource leak
        sc.close();

    }

}

