
import java.util.Scanner;
/**
 * Write a description of class Epsilon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Epsilon
{
    public final static double EPSILON = 1e-12;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double i= in.nextDouble();
        
        String adj = "";
        if(Math.abs(i)< 1.0)
        {
            adj= "small";
        }
        else if(Math.abs(i)> 1000000)
        {
            adj="large";
        }
        
        
        System.out.println(adj);
        
        if(Math.abs(i)<EPSILON)
        {
            System.out.println("It's a zero.");
        }
        else if(i>0)
        {
            System.out.println("It's a "+adj+" postive number.");
        }
        else
        {
            System.out.println("It's a " + adj + " negative number.");
        }
    }
}
