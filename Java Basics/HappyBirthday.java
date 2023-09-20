/**
 * @author Brianna Barkema
 * WorkAtTech
 * Says happy birthday to name and states age given
 */
import java.util.Scanner;
public class HappyBirthday {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        String line = scnr.nextLine();
        String[] strArr = line.split(" ");
        System.out.println("Happy Birthday " + strArr[0] + "! Your current age is " + (2020 - Integer.parseInt(strArr[1])));
    }
}
