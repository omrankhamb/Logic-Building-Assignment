import java.io.*;
import java.util.*;

// Write a program to accepet file name from user and open the file name and display the contents on scree

class Assignment243 {

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        FileInputStream fiobj = null;
        String Fname =  null;
        int iRet = 0;
        

        try
        {
            System.out.println("Enter File Name : ");
            Fname = sobj.nextLine();

            fobj = new File(Fname);

            fiobj = new FileInputStream(fobj);

            byte Buffer[] = new byte[50];

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                System.out.print(new String(Buffer));
            }
            


        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }

    }
    
}
