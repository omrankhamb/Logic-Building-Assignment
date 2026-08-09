// write a program which accepet file name from user and create directory create that directory

import java.io.File;
import java.util.*;

class program250
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

            if(fobj.mkdir())
            {
                System.out.println("Directory created successfully");
            }
            else
            {
                System.out.println("Directory npt created");
            }

        }
        catch(Exception e )
        {
            System.out.println("Exception is : " + e);
        }

    }
}