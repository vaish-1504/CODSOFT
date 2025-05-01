import java.util.Scanner;
import java.util.Random;

public class NumberGame{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    int number = random.nextInt(100)+1;
    int guess;
    int MaxAttempts=10;
    int attempts=0;
    int score = 100;

    System.out.println("WELCOME TO THE NUMBER GUSSING GAME");
    System.out.println("YOU WANT TO GUESS A NUMBER BETWEEN 1 TO 100");

    while (attempts<MaxAttempts) 
    {
        System.out.print("Attempt " + (attempts + 1) + ": ");
        System.out.println("Enter your guess number");
        guess = sc.nextInt();
        attempts++;
        
        if(guess<number)
        {
            System.out.println("NUMBER IS SMALL, Try Again");
            score = score - 10;
        }
        else if(guess>number)
        {
            System.out.println("NUMBER IS BIGGER,Try Again" );
            score = score - 10;

        }
        else
        {
            System.out.println("Congratulations you guess the correct number in "+ attempts + " attempts");
            System.out.println("YOUR SCORE IS "+score);
            break;
        }
        if(attempts==MaxAttempts)
        {
            System.out.println("OOPS YOU HAVE NO ATTEMPTS LEFT.");
            System.out.println("Actual number is "+number);
            System.out.println("YOUR SCORE IS 0 ");
        }
    }
    }
    
}
