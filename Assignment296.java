import java.util.*;

// Write a program to check whehter given String is panagram or not


class Assignment296
{
    public static boolean Panagram(String s)
    {
        boolean flag = true;
        char Arr[] = s.toCharArray();
        HashMap<Character , Integer> freq = new HashMap<Character , Integer>();

        for(int i = 97 ; i <= 122 ; i++)
        {
            freq.put((char)i, 1);
        }

        for(int i = 0 ; i < Arr.length ; i++)
        {
            int x = freq.get(Arr[i]);
            x = x -1;
            freq.put(Arr[i],x);
        }

        for(char ch : freq.keySet())
        {
            int x = freq.get(ch);
            if( x > 0)
            {
                flag = false;
                break;
            }
        }

        return flag;
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;
        String str2 = null;
        boolean flag = false;
        
        System.out.println("Enter a string : ");
        str = sobj.nextLine();
        str.trim();
        str.replaceAll("\\s+", " ");
        str = str.toLowerCase();

        flag = Panagram(str);

        if(flag)
        {
            System.out.println("String is Panagram");
        }
        else
        {
            System.out.println("String is not Panagram");
        }
    }
}