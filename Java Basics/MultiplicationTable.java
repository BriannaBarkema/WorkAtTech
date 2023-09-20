/**
 * @author Brianna Barkema
 * WorkAtTech
 * Prints out multiplication table for integer up until 10th multiple
 */
import java.util.Scanner;
public class MultiplicationTable {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        StringBuilder str = new StringBuilder();
        String[] output = new String[amt];
        for(int i = 0; i < amt; i++){
            int multi = scnr.nextInt();
            for(int j = 1; j <= 10; j++){
                str.append(j * multi);
                if(j != 10){
                    str.append(" ");
                }
            }
            output[i] = str.toString();
            str.setLength(0);
        }
        for(int i = 0; i < amt; i++){
            System.out.println(output[i]);
        }
    }
}
