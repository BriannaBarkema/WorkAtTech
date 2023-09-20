/**
 * @author Brianna Barkema
 * WorkAtTech
 * Finds largest integer in matrix
 */
import java.util.Scanner;
public class MaxInMatrix {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);

        String lineOne = scnr.nextLine();
        String[] amtArr = lineOne.split(" ");
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < Integer.parseInt(amtArr[0]); i++){
            String lineTwo = scnr.nextLine();
            str.append(lineTwo);
            str.append(" ");
        }

        String[] last = str.toString().split(" ");
        int max = 0;
        for(int i = 0; i < last.length; i++){
            if(Integer.parseInt(last[i]) > max){
                max = Integer.parseInt(last[i]);
            }
        }
        System.out.println(max);

    }
}
