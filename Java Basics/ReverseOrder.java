/**
 * @author Brianna Barkema
 * WorkAtTech
 * Prints out "WORKATTECH" one letter at a time
 */
import java.util.Scanner;
public class ReverseOrder {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        scnr.nextLine();
        String nums = scnr.nextLine();
        String[] strArr = nums.split(" ");

        for(int i = amt - 1; i >= 0; i--){
            if(!strArr[i].equals(strArr[0])){
                System.out.print(strArr[i] + " ");
            }
        }
        System.out.print(strArr[0]);
    }
}
