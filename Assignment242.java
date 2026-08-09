// Write a program to accepet file name from user and open the file name and display the contents on scree

import java.io.*;
import java.util.*;

class Assignment242 {

    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in);
        FileReader fobj = null;
        String Fname = null;
        int iRet  = 0;
        

        try
        {
            System.out.println("Enter the file name : ");
            Fname = sobj.nextLine();
            fobj = new FileReader(Fname);

            while((iRet = fobj.read()) != -1)
            {
                System.out.print((char)iRet);
            }

        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }
}
