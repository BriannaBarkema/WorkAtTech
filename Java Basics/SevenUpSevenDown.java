/**
 * @author Brianna Barkema
 * WorkAtTech
 * Determines if number greater, equal, or less than 7
 */
import java.util.Scanner;
class CloseToSeven{
    public static String answer(int num){
        if(num > 7){
            return "UP";
        }
        else if(num == 7){
            return "EQUAL";
        }
        else{
            return "DOWN";
        }
    }
}
public class SevenUpSevenDown {
    public static void main (String[] args) throws java.lang.Exception{
        Scanner scnr = new Scanner(System.in);
        int numVal = scnr.nextInt();
        for(int i = 0; i < numVal; i++){
            int num = scnr.nextInt();
            System.out.println(CloseToSeven.answer(num));
        }
    }
}
