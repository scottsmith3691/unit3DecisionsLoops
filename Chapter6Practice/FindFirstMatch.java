
public class FindFirstMatch
{
    public static int findFirstMatch(String str)
    {
        boolean found = false;
        int position = 0;
        
        while (! found && position < str.length())
        {
            char ch = str.charAt(position);
            if (ch== ' ')
            {
                found = true;
            }
            else
            {
                position++;
            }
        }
        return position;
    }
}
