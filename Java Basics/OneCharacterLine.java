/**
 * @author Brianna Barkema
 * WorkAtTech
 * Prints out "WORKATTECH" one letter at a time
 */
import java.util.Scanner;
public class OneCharacterLine {
    public static void main (String[] args) throws java.lang.Exception
    {
        String word = "WORKATTECH";
        for(int i = 0; i < word.length() - 1; i++){
            System.out.println(word.charAt(i));
        }
        System.out.print(word.charAt(word.length() - 1));
    }
}
