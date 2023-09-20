/**
 * @author Brianna Barkema
 * WorkAtTech
 * Creates star pattern with number of rows based on user input
 */
import java.util.Scanner;
public class StarPattern2 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int lines = scnr.nextInt();
        StringBuilder str = new StringBuilder();
        for(int i = 1; i <= lines; i++){
            str.append("*");
            System.out.println(str.toString());
        }
    }
}
