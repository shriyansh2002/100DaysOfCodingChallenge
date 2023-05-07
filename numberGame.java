import java.util.Scanner;

public class numberGame {
    public static void main (String[] args){ 
    Scanner sc = new Scanner (System.in);
    int yourNumber = (int)(Math.random()*100);
    int userNumber = 0;

         do {
                System.out.println(" Guess my number(1-100) :");
                 userNumber = sc.nextInt();

            if(userNumber == yourNumber) {
                System.out.println("great !!!!!!!!!!!!!!!!!!!.. YOU have guess the number correctly");
                break;



            }

        else if (userNumber > yourNumber) {


            System.out.println("your number is to large");

        } 
        else {
            System.out.println("your number is to small");

        }



    }
    while (userNumber >=0);

    System.out.print("the number was :");
    System.out.println(yourNumber);

    sc.close();
}
}
