/**
 * @author Brianna Barkema
 * WorkAtTech
 * Determines weather: Hot and Humid (>=30 and >=90), Hot(>=30 and <90),
 * Cool and Humid (<30 and >=90), and Cool (<30 and <90).
 */
import java.util.Scanner;
public class Weather {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        scnr.nextLine();
        String[] responses = new String[amt];
        for(int i = 0; i < amt; i++){
            String line = scnr.nextLine();
            String[] weather = line.split(" ");
            if(Integer.parseInt(weather[0]) >= 30 && Integer.parseInt(weather[1]) >= 90){
                responses[i] = "Hot and Humid";
            }
            else if(Integer.parseInt(weather[0]) >= 30 && Integer.parseInt(weather[1]) < 90){
                responses[i] = "Hot";
            }
            else if(Integer.parseInt(weather[0]) < 30 && Integer.parseInt(weather[1]) >= 90){
                responses[i] = "Cool and Humid";
            }
            else if(Integer.parseInt(weather[0]) < 30 && Integer.parseInt(weather[1]) < 90){
                responses[i] = "Cool";
            }
        }
        for(int i = 0; i < amt; i++){
            System.out.println(responses[i]);
        }
    }
}
