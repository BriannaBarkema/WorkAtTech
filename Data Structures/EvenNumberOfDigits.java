import java.util.ArrayList;
import java.util.List;

/**
 * @author Brianna Barkema.
 * WorkAtTech
 * Returns value if it has an even number of digits in given array
 */
public class EvenNumberOfDigits {
    List<Integer> getEvenDigitNumbers (int[] arr) {
        List<Integer> answer = new ArrayList<Integer> ();
        for(int i = 0; i < arr.length; i++){
            if(Integer.toString(arr[i]).length() % 2 == 0){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}
