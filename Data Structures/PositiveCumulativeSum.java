import java.util.ArrayList;
import java.util.List;

/**
 * @author Brianna Barkema.
 * WorkAtTech
 * Finds cumulative sum of array as it progresses through but excludes negative values
 */

public class PositiveCumulativeSum {
    List<Integer> getPositiveCumulativeSum (int[] arr) {
        List<Integer> posSum = new ArrayList<Integer>();
        int val = 0;
        for(int i = 0; i < arr.length; i++){
            val += arr[i];
            if(val > 0){
                posSum.add(val);
            }
        }
        return posSum;
    }
}
