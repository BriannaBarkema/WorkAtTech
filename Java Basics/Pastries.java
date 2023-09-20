/**
 * @author Brianna Barkema
 * WorkAtTech
 * Tracks amount of pastries after each person's purchase
 * States "Enjoy your dessert!" if some can be served to the customer
 * States "Sorry, we are all out!" if they cannot be served
 */
import java.util.Scanner;
public class Pastries {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        String line = scnr.nextLine();
        String[] setup = line.split(" ");
        int pastries = Integer.parseInt(setup[0]);
        for(int i = 0; i < Integer.parseInt(setup[1]); i++){
            int purchase = scnr.nextInt();
            if(pastries > purchase){
                System.out.println("Enjoy your dessert!");
                pastries -= purchase;
            }
            else{
                System.out.println("Sorry, we're all out!");
            }
        }
    }
}
