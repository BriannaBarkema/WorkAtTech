/**
 * @author Brianna Barkema
 * WorkAtTech
 * Returns sum of all numbers in line (no spaces)
 */
import java.util.Scanner;
public class DigitSum {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        int[] response = new int[amt];
        int sum = 0;
        for(int i = 0; i < amt; i++){
            int num = scnr.nextInt();
            String numWord = Integer.toString(num);
            sum = 0;
            for(int j = 0; j < numWord.length(); j++){
                sum += numWord.charAt(j) - '0';
            }
            response[i] = sum;

        }
        for(int i = 0; i < amt; i++){
            System.out.println(response[i]);
        }
    }
}
