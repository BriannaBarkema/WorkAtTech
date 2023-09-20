/**
 * @author Brianna Barkema
 * WorkAtTech
 * Prints out two-digit numbers with space inbetween
 */
import java.util.Scanner;

public class PrintDigits {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        for(int i = 0; i < amt; i++){
            StringBuilder str = new StringBuilder();
            int val = scnr.nextInt();
            int first = val / 10;
            str.append(first);
            str.append(" ");
            int second = val % 10;
            str.append(second);
            System.out.println(str.toString());
        }
    }
}
