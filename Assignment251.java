// write a program which accepet file name from user and calculate checksum of that file and display on screen

import java.io.File;
import java.util.*;

class program251
{
    public static void main(String Arg[])
    {   
        Scanner sobj = new Scanner(System.in);
        File fobj  = null;
        String Fname = null;

        System.out.println("Enter A File Name : ");
        Fname = sobj.nextLine();

        try
        {
            fobj = new File(Fname);

            fobj.c;

        }
        catch(Exception e )
        {
            System.out.println("Exception is : " + e);
        }

    }
}