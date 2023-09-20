/**
 * @author Brianna Barkema
 * WorkAtTech
 * Takes user input for people's name and temp (one line per person)
 * returns names of those with a temperature above 98.6
 */
import java.util.Scanner;
public class HighFever {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        scnr.nextLine();
        String[] highTemp = new String[amt];
        for(int i = 0; i < amt; i++){
            String line = scnr.nextLine();
            String[] info = line.split(" ");
            if(Double.parseDouble(info[1]) > 98.6) {
                highTemp[i] = info[0];
            }
        }
        for(int i = 0; i < highTemp.length; i++){
            if(highTemp[i] != null) {
                System.out.print(highTemp[i]);
            }
            if(highTemp[i] != null && i != highTemp.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
