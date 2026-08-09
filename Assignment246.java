// Write a program which accepet file name from user ans create a new file of that name if it is not existing

import java.io.*;
import java.util.Scanner;

class program246
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        String Fname = null;
        boolean bobj = false;

        try
        {
            System.out.println("Enter  A File Name : ");
            Fname = sobj.nextLine();

            fobj = new File(Fname);

            if(fobj.exists())
            {
                System.out.println("File exist");
            }
            else
            {

                System.out.println("File not exist \n File created successfully");
                fobj.createNewFile();
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }


    }
}