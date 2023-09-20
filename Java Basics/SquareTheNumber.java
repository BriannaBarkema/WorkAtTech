/**
 * @author Brianna Barkema
 * WorkAtTech
 * Determines square of number
 */
import java.util.Scanner;
public class SquareTheNumber {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        for(int i = 0; i < amt; i++){
            int num = scnr.nextInt();
            System.out.println(num*num);
        }
    }
}
