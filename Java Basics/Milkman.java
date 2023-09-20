import java.util.Scanner;
/**
 * @author Brianna Barkema
 * WorkAtTech
 * Finds volume of cylinder
 */
public class Milkman {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int r = scnr.nextInt();
        int h = scnr.nextInt();
        System.out.format("%.2f", (((3.14*(r*r)*h)/ 1000) * 40));
    }
}
