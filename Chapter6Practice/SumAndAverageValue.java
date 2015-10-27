
import java.util.*;
/**
 * Write a description of class SumAndAverageValue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumAndAverageValue
{
    public static double averageInputs()
    {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        int count = 0;
        System.out.println("Enter a series of doubles or any character to quit. ");
        
        while(scan.nextDouble())
        {
            double num = scan.nextDouble();
            total+=num;
            count++;
        }
        
        double average = 0;
        if(count > 0)
        {
            average = total/count;
        }
        return average;
    }
}
