import java.util.*;

/*
    A Company records employee Id,s whenever employees enter the office

    101 102 103 101 104 102 101 105

    write a java program that displays how many times each emplyee entered the office 
    Expected Output : 

    101 -> 2
    102 -> 2
    103 -> 1
    104 -> 1
    105 -> 1
*/

class Assignment340
{
    public static void main(String Arg[])
    {

        int Arr[] = {101,102,103,104,102,101,105};

        HashMap<Integer , Integer > frequency = new HashMap<Integer , Integer>();

        for(int No : Arr)
        {
            frequency.put(No, frequency.getOrDefault(No, 0) + 1);
        }

        for(Map.Entry<Integer , Integer > en : frequency.entrySet())
        {
            System.out.println(en.getKey() + " -> " + en.getValue());
        }
    }
}