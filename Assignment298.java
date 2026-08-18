import java.util.*;

// Write a program to Duplicate chareacter from string


class Assignment298
{
    public static void Frequency(String s)
    {
        boolean flag = true;
        HashMap<Character , Integer> freq = new HashMap<Character , Integer>();
        char Arr[] = s.toCharArray();

        for(int i = 0 ; i < Arr.length ; i++)
        {
            int x = 0;
            if(freq.containsKey(Arr[i]))
            {
                x = freq.get(Arr[i]);
                x = x + 1;
                freq.put(Arr[i] , x);
            }
            else{
                freq.put(Arr[i] , 1);
            }           
        }

        for(char ch : freq.keySet())
        {
            System.out.println(ch  + "-> " + freq.get(ch));
        }

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

        Frequency(str);

        
    }
}