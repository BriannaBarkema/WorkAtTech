/**
 * @author Brianna Barkema
 * WorkAtTech
 * Says "Incorrect Guess" or "Correct Guess" if guess equal to birthdate
 */
import java.util.Scanner;
class Actions{
    public static void check(int guess, int birthday){
        if(guess != birthday){
            System.out.println("Incorrect Guess");
        }
        else if(guess == birthday){
            System.out.println("Correct Guess");
        }
    }
}
public class Guess {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int birthday = scnr.nextInt();
        int guess = 0;
        while(guess != birthday){
            guess = scnr.nextInt();
            Actions.check(guess, birthday);
        }
    }
}
