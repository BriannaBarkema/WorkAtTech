import java.util.Scanner;
/**
 * @author Brianna Barkema
 * WorkAtTech
 * Decides if you won the game if you find the maximum number. If the maximum is an even number, you win and if it is odd, you lose.
 */
class Game{
    /**
     * Decides if you won
     * @param amt  integer
     * @param nums  array, initially string separated by spaces
     * @return   "LOST" or "WON"
     */
    public static String status(int amt, int nums[]){
        int max = -99;
        for(int i = 0; i < amt; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        if(max % 2 == 1){
            return "LOST";
        }
        else{
            return "WON";
        }
    }
}
class WinOrLose
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        int amt = scnr.nextInt();
        int[] nums = new int[amt];

        for(int i = 0; i < amt; i++){
            int val = scnr.nextInt();
            nums[i] = val;
        }
        System.out.println(Game.status(amt, nums));

    }
}
