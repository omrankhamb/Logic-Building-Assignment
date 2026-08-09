import java.io.*;
import java.util.*;

class program247
{
    public static void main(String Arg[])
    {
        File fobj = null;
        Scanner sobj = new Scanner(System.in);
        String Fname = null;
        System.out.println("Enter File Name : ");
        Fname = sobj.nextLine();

        try
        {
            fobj = new File(Fname);

            if((fobj.isDirectory()) && (fobj.exists()))
            {
                File fArr[]  = fobj.listFiles();

                System.out.println("Count of Files are : " + fArr.length);

                for(int i = 0 ; i < fArr.length ; i++)
                {
                    System.out.println("File Name is ::" + fArr[i].getName());
                    System.out.println("Length of File is : "+fArr[i].length());
                }

            }
            else
            {
                System.out.println("Folder not exist");;
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }
}