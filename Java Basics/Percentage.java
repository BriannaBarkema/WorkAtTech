/**
 * @author Brianna Barkema
 * WorkAtTech
 * Finds average percentage from scores given, each subject is out of 80
 */
import java.util.Scanner;
public class Percentage {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        double sum = 0;
        for(int i = 0; i < amt; i++){
            double score = scnr.nextInt();
            sum += score;
        }
        System.out.format("%.2f", ((sum / amt) / 0.8));
        System.out.print("%");
    }
}
