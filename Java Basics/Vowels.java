/**
 * @author Brianna Barkema
 * WorkAtTech
 * Distributes candies based on number of vowels in first name
 */
import java.util.Scanner;
public class Vowels {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        scnr.nextLine();
        int[] candies = new int[amt];
        for(int i = 0; i < amt; i++){
            int count = 0;
            String name = scnr.nextLine();
            for(int j = 0; j < name.length(); j++){
                if(Character.toLowerCase(name.charAt(j)) == 'a' || Character.toLowerCase(name.charAt(j)) == 'e' || Character.toLowerCase(name.charAt(j)) == 'i' || Character.toLowerCase(name.charAt(j)) == 'o' || Character.toLowerCase(name.charAt(j)) == 'u'){
                    count += 1;
                }
            }
            candies[i] = count;

        }
        for(int i = 0; i < amt; i++){
            System.out.println(candies[i]);
        }
    }
}
