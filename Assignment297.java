import java.util.*;

// Write a program to Duplicate chareacter from string


class Assignment297
{
    public static void DuplicateCharacter(String s)
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

            if(x == 2)
            {
                System.out.print(Arr[i] + " ");
            }
            
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

        DuplicateCharacter(str);

        
    }
}