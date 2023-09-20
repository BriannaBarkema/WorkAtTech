/**
 * @author Brianna Barkema
 * WorkAtTech
 * Converts Centrigrade to Fahrenheit
 */
import java.util.Scanner;
public class TemperatureConversion {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        for(int i = 0; i < amt; i++){
            double temp = scnr.nextDouble();
            System.out.format("%.2f", (((9 * temp) / 5) + 32));
            System.out.println();
        }
    }
}
