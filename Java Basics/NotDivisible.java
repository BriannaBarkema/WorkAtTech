/**
 * @author Brianna Barkema
 * WorkAtTech
 * Prints all numbers from 1 to number provided that are not divisible by 3
 */
import java.util.Scanner;
class Problem{
    static String divisible(int num){
        StringBuilder str = new StringBuilder();
        for(int i = 1; i <= num; i++){
            if(i % 3 != 0){
                str.append(i);
                if(i != num){
                    str.append(" ");
                }
            }
        }
        return str.toString();
    }
}

public class NotDivisible {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        for(int i = 0; i < amt; i++){
            int num = scnr.nextInt();
            System.out.println(Problem.divisible(num));
        }
    }
}
