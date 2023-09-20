/**
 * @author Brianna Barkema
 * WorkAtTech
 * "yes" if number from user input has adjacent zeroes, "No" if not
 */
import java.util.Scanner;
public class AdjacentZeros {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        String[] ans = new String[amt];
        scnr.nextLine();
        for(int i = 0; i < amt; i++) {
            String binary = scnr.nextLine();
            if (binary.contains("00")) {
                ans[i] = "Yes";
            } else {
                ans[i] = "No";
            }
        }
        for(int i = 0; i < amt; i++) {
            System.out.println(ans[i]);
        }
    }
}
