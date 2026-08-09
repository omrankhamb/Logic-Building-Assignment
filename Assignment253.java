// write a java program to accepet file name from user and display all names of files from that directory which are regular file

import java.io.*;
import java.util.*;

class Assignment253
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        String Fname = null;
        System.out.println("Enter File name : ");
        Fname = sobj.nextLine();
        try
        {
            fobj = new File(Fname);

            if( (fobj.exists()) && (fobj.isDirectory()) )
            {
                File fArr[] = fobj.listFiles();

                for(int i = 0 ; i < fArr.length ; i++)
                {
                    if(fArr[i].isFile())
                    {
                        System.out.println("Name of file is : " + fArr[i].getName());
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception : " + e);
        }
    }
}

