import java.util.Scanner;
/**
 * @author Brianna Barkema
 * WorkAtTech
 * Finds surface area and volume of a cube
 */
class Cube
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int input = scnr.nextInt();
        int sArea = 6 * (input * input);
        int Volume = input * input * input;
        System.out.println(sArea + " " + Volume);
    }
}
