/**
 * @author Brianna Barkema.
 * WorkAtTech
 * Finds cumulative sum of array as it progresses through
 */
public class CumulativeSum {
    int[] getCumulativeSum (int[] arr) {
        int[] sum = new int[arr.length];
        int amt = 0;
        for(int i = 0; i < arr.length; i++){
            amt += arr[i];
            sum[i] = amt;
        }
        return sum;
    }
}