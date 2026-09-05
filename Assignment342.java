import java.util.*;

/*
    A Bamking system recieves transaction id's
    Identfiy duplicate transaction id's 

    Expected output : 
        TX101
        TX102
*/

class Assignment342
{
    public static void main(String Arg[])
    {

        String arr[] = {"TX101","TX102","TX103","TX101","TX104","TX102"};

        HashMap<String , Integer > frequency = new HashMap<String , Integer>();

        for(String cha :  arr)
        {
            frequency.put(cha , frequency.getOrDefault(cha , 0) + 1);
        }

        for(Map.Entry<String , Integer > en : frequency.entrySet())
        {
            if(en.getValue() == 2)
            {
                System.out.println(en.getKey());
            }
        }

       
    }
}