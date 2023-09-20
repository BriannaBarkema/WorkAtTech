/**
 * @author Brianna Barkema
 * WorkAtTech
 * Prints out "WORKATTECH" two letters in one line
 */
import java.util.Scanner;
public class TwoCharacterLine {
    public static void main (String[] args) throws java.lang.Exception
    {
        String word = "WORKATTECH";
        for(int i = 0; i < word.length() - 1; i++){
            System.out.print(word.charAt(i));
            System.out.println(word.charAt(i += 1));
        }
    }
}
