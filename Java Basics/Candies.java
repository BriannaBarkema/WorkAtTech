import java.util.Scanner;
/**
 * @author Brianna Barkema
 * WorkAtTech
 * Determines if you can equally distribute a set amount of candies to a group of people
 */
public class Candies {
    public static String answer(int num1, int num2){
        if(num1 % num2 == 0){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        System.out.println(Candies.answer(num1, num2));
    }
}
