import java.util.*;

/**
 * Write a description of class Spectum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spectum
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class Spectum
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a wavelength on the electromagnetic spectrum: ");
        double wl=scan.nextDouble();
        if (wl>10e-1)
        {
            System.out.println("Radio Waves");
        }
        else if (wl<10e-1 && wl>10e-3)
        {
            System.out.println("Microwaves");
        }
        else if (wl<(7*10e-7) && wl>10e-3)
        {
            System.out.println("Infared");
        }
        else if (wl<(4*10e-7) && wl>(7*10e-7))
        {
            System.out.println("Visible Light");
        }
        else if (wl<10e-8 && wl>(4*10e-7))
        {
            System.out.println("Ultraviolet");
        }
        else if (wl<10e-11 && wl>10e-8)
        {
            System.out.println("X-rays");
        }
        else if (wl<10e-11)
        {
            System.out.println("Gamma Rays");
        }
    }
}
