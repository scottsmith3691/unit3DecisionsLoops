import java.util.*;

/**
 * Write a description of class LeapYear here.
 * 
 * @Scott SMith
 * @version 10/21/15
 */
public class LeapYear
{
    /**
     * Default constructor for objects of class LeapYear
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What year would you like to check for being a leap year or not: ");
        double year=scan.nextDouble();
        if (year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("This is a leap year!");

        }
        else
        {
            System.out.println("This isnt a leap year!");
        }
    }
}
