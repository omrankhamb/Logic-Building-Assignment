import java.io.*;
import java.util.Scanner;

class Assignment249
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

            if(fobj.isFile())
            {
                System.out.println("Yes it is file");
            }
            else
            {
                System.out.println("It is not file");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }


    }
}