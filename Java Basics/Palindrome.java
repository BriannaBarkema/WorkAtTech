/**
 * @author Brianna Barkema
 * WorkAtTech
 * Determines if word is a palindrome
 */
import java.util.Scanner;
public class Palindrome {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        scnr.nextLine();
        int count = 0;
        String[] responses = new String[amt];
        for(int i = 0; i < amt; i++){
            String word = scnr.nextLine();
            for(int j = 0; j < word.length() / 2; j++){
                if(word.charAt(j) != (word.charAt(word.length() - j - 1))){
                    count += 1;
                }
            }
            if(count == 0){
                responses[i] = "True";
            }
            else if(count != 0){
                responses[i] = "False";
            }
        }
        for(int i = 0; i < amt; i++){
            System.out.println(responses[i]);
        }
    }
}
