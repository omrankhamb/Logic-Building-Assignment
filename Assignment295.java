import java.util.*;

// Write a program to check whehter given String is anagrma or not


class Assignment295
{
    public static boolean Anagram(String s1, String s2)
    {


        if(s1.length() != s2.length())
        {
            return false;
        }
        boolean flag = true;

        HashMap<Character , Integer> freq = new HashMap<Character , Integer>();

        char arr[] = s1.toCharArray();

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(freq.containsKey(arr[i]))
            {
                int x = freq.get(arr[i]);
                freq.put(arr[i], x+1);
            }
            else
            {
                freq.put(arr[i],1);
            }
        }

        arr = s2.toCharArray();

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(freq.containsKey(arr[i]))
            {
                int x = freq.get(arr[i]);
                x = x - 1;
                if(x < 0)
                {
                    flag = false;
                    break;
                }

                freq.put(arr[i], x);

            }   
        }

        for(char ch : freq.keySet())
        {   
            int x = freq.get(ch);
            if( x != 0)
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

        System.out.println("Enter a second string : ");
        str2 =  sobj.nextLine();
        str2.trim();
        str2.replaceAll("\\s+", " ");
        str2 = str2.toLowerCase();

        flag = Anagram(str , str2);

        if(flag)
        {
            System.out.println("String is Anagram");
        }
        else
        {
            System.out.println("String is not Not Anagram");
        }
    }
}