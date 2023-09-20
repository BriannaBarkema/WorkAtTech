/**
 * @author Brianna Barkema
 * WorkAtTech
 * Determines if number is divisile by 6 or not
 */
import java.util.Scanner;
public class DivisibleBySix {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        for (int i = 0; i < amt; i++) {
            int val = scnr.nextInt();
            if (val % 6 == 0) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
