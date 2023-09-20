/**
 * @author Brianna Barkema
 * WorkAtTech
 * Calculates circumference if triangle could be formed
 */
import java.util.Scanner;
class Triangle
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int tests = scnr.nextInt();
        for(int i = 0; i < tests; i++){
            int side1 = scnr.nextInt();
            int side2 = scnr.nextInt();
            int side3 = scnr.nextInt();
            int max = 0;
            if(side1 > side2 && side1 > side3){
                max = side1;
            }
            else if(side2 > side1 && side2 > side3){
                max = side2;
            }
            else{
                max = side3;
            }
            if(side1 + side2 + side3 - max > max){
                System.out.println(side1 + side2 + side3);
            }
            else{
                System.out.println(-1);
            }

        }
    }
}