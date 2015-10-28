
import java.util.*;
public class CompareAdjacentValues
{
    public static final double EPSILON = 1e-12;
    public static void checkForDuplicates()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a series of numbers or characters to quit.");
        
        double input = scan.nextDouble();

        while(scan.hasNextDouble())
        {
             double previousInput = input;
             input = scan.nextDouble();
             String text = Double.toString(Math.abs(input));
             int integerPlace = text.indexOf('.');
            System.out.println(text.length());
             if (text.length()>12+integerPlace)
            {
                System.out.println("Stop trying to cheat the system");
            }
            else
            {
                if(Math.abs(input - previousInput) <EPSILON)
                {
                    System.out.println("Duplicate Input");
                }
            }
        }

    }
}
