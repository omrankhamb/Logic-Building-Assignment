import java.util.*;

/*
    A message application wansts to identify the first character in a message that occuurs only once

    Input : 
        programming 

    Ouptut :
        first non - repeting character : p
        the solution should preserve the original character order
*/

class Assignment341
{
    public static void main(String Arg[])
    {

        String arr = "programming";

        HashMap<Character , Integer > frequency = new HashMap<Character , Integer>();

        for(int i = 0 ; i < arr.length() ; i++)
        {
            frequency.put(arr.charAt(i), frequency.getOrDefault(arr.charAt(i), 0) + 1);
        }

        for(Map.Entry<Character , Integer > en : frequency.entrySet())
        {
            if(en.getValue() == 1)
            {
                System.out.println(en.getKey());
                break;
            }
        }
    }
}