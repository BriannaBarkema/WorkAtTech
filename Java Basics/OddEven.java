/**
 * @author Brianna Barkema
 * WorkAtTech
 * Determines if number is odd or even
 */
import java.util.Scanner;

class Task1{
    public static String parity(int num){
        if(num % 2 == 1){
            return "ODD";
        }
        else{
            return "EVEN";
        }
    }
}

class OddEven
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int total = scnr.nextInt();
        for(int i = 0; i < total; i++){
            int num = scnr.nextInt();
            System.out.println(Task1.parity(num));
        }
    }
}