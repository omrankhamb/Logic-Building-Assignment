// write a program which accepet file name from user and open that file name write mode and arite some data at end of file

import java.io.*;
import java.util.*;

class Assignment244
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        FileOutputStream fiobj = null;
        String Fname = null;
        File fobj = null;
        String data = "Omprasad Rankhamb";

        try
        {
            System.out.println("Enter The File name : ");

            Fname = sobj.nextLine();

            fobj = new File(Fname);

            fiobj = new FileOutputStream(fobj);
            byte Buffer[] = data.getBytes();

            fiobj.write(Buffer);

            
            
        }
        catch(Exception e)
        {

        }


    }
}