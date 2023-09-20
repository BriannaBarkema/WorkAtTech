import java.util.Scanner;
/**
 * @author Brianna Barkema
 * WorkAtTech
 * finds number of words in sentence
 */
public class WordsInSentence {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        String line = scnr.nextLine();
        String[] arr = line.split(" ");
        System.out.println(arr.length);
    }
}
