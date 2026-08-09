
import java.io.*;
import java.util.Scanner;

class new
{
    public static void main(String Arg[])
    {

        Scanner sobj = new Scanner(System.in);
        int iRet = 0;
        File fsrc = null;
        File fdest = null;

        String strsrc = null;
        String strdest = null;

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        try
        {
            System.out.println("Enter SOurce File Name : ");
            strsrc = sobj.nextLine();

            System.out.println("Enter Destination File : ");
            strdest = sobj.nextLine();

            fsrc = new File(strsrc);
            fdest = new File(strdest);

            if(!fdest.exists())
            {
                fdest.createNewFile();
            }

            fiobj = new FileInputStream(fsrc);
            foobj = new FileOutputStream(fdest);
            byte Buffer[] = new byte[20];


            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

        }catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }


    }
}