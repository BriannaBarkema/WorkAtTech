/**
 * @author Brianna Barkema
 * WorkAtTech
 * Greets person by name provided and adds one to age
 */
import java.util.Scanner;
public class AddOne {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        String line = scnr.nextLine();
        String[] strArr = line.split(" ");
        System.out.println("Hello " + strArr[0] + "! Next year, you will be " + (Integer.parseInt(strArr[1]) +1) + " years old");
    }
}
