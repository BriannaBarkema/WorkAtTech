/**
 * @author Brianna Barkema.
 * WorkAtTech
 * Returns square root of number
 */
public class SquareRoot {
    int searchRoot (int num) {
        int lower = 0;
        int upper = num / 2;
        int mid = (lower + upper) / 2;
        int ans = mid;
        if(num == 0 || num == 1){
            return num;
        }
        else{
            while(lower <= upper){
                mid = (lower + upper) / 2;
                if( mid * mid <= num){
                    lower = mid + 1;
                    ans = mid;
                }
                else{
                    upper = mid - 1;
                }
            }
        }
        return ans;
    }
}
