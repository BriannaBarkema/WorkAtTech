/**
 * @author Brianna Barkema
 * WorkAtTech
 * Finds amount of interest earned
 */
import java.util.Scanner;
public class SimpleInterest {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        double p = scnr.nextDouble();
        double r = scnr.nextDouble();
        double t = scnr.nextDouble();
        r /= 100;
        System.out.format("%.6f", (p*r*t));
    }
}
