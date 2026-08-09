// write a program which accepet file name from user and disply all name of files from that directory and size of each file on screen

import java.io.File;
import java.util.*;

class program252
{
    public static void main(String Arg[])
    {   
        Scanner sobj = new Scanner(System.in);

        File fobj = null;
        String Fname = null;

        System.out.println("Enter A file name : ");
        Fname = sobj.nextLine();
        try
        {
            fobj = new File(Fname);

            if(fobj.exists() && fobj.isDirectory())
            {
                File fArr[] = fobj.listFiles();

                for(int i = 0 ; i < fArr.length ; i++)
                {
                    System.out.println("Name of file : " + fArr[i].getName() + "  Length of file : " + fArr[i].length());
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }
}