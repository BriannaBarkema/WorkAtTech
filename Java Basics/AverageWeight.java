/**
 * @author Brianna Barkema
 * WorkAtTech
 * Finds average weight among 10 people
 */
import java.util.Scanner;
class Task{
    /**
     * x is added y times. Both x and y are non-negative.
     * @param weights array
     * @return   average as a double from array
     */
    public static double average(double weights[]){
        double sum = 0;
        for(int i = 0; i < 10; i++){
            sum += weights[i];
        }
        return sum / 10;
    }
}
class AverageWeight
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scnr = new Scanner(System.in);
        double[] weights = new double[10];
        for(int i = 0; i < 10; i++){
            double val = scnr.nextDouble();
            weights[i] = val;
        }
        System.out.format("%.6f", Task.average(weights));
    }
}