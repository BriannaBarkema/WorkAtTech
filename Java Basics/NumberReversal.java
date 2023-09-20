/**
 * @author Brianna Barkema
 * WorkAtTech
 * Reverses 3-digit number
 */
import java.util.Scanner;

class NumberReversal
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int value = scnr.nextInt();
        String valueString = Integer.toString(value);
        StringBuilder reverse = new StringBuilder();
        for(int i = valueString.length() - 1; i >= 0; i--){
            if(valueString.charAt(i) != '0'){
                reverse.append(valueString.charAt(i));
            }
        }
        System.out.println(reverse.toString());
        //If you wanted to return an integer,
        //use Integer.parseInt(reverse.toString()));
        //.parseInt() converts string to integer
    }
}
