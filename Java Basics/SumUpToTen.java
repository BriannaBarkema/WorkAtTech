/**
 * @author Brianna Barkema
 * WorkAtTech
 * Prints out sum of 1 to 10
 */
class SumUpToTen
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
