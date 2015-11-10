import java.util.*;
public class FactorIntegers
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input=scan.nextInt();
        for (int i=1;i<=input;i++)
        {
            if (input%i==0)
            {
                for (double num=i/Math.sqrt(input); input<num; num++)
                {
                    if (input%num!=0)
                    {
                       System.out.println(i);
                    }
                }
            }
        }
    }
}
