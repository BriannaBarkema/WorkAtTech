/**
 * @author Brianna Barkema.
 * WorkAtTech
 * Counts amount of itentical twins from array provided
 */
public class IdenticalTwins {
    int getIdenticalTwinsCount (int[] arr) {
        int twins = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    twins += 1;
                }
            }
        }
        return twins;
    }
}
