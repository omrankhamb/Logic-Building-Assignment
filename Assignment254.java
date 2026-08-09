// write a java program to accepet directory name from user and write names of all files from that directory into one newley created file named as Marvellous.txt
import java.io.*;
import java.util.*;

class Assignment254
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;
        File fobj = null;
        File fdest = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        String Fname = null;
        System.out.println("Enter File name : ");
        Fname = sobj.nextLine();

        String strdest = null;
        System.out.println("Enter Destination File name : ");
        strdest = sobj.nextLine();

        
        try
        {
            fobj = new File(Fname);

            if( (fobj.exists()) && (fobj.isDirectory()) )
            {
                File fArr[] = fobj.listFiles();
                fdest = new File(strdest);

                foobj = new FileOutputStream(fdest);

                for(int i = 0 ; i < fArr.length ; i++)
                {
                    String name = fArr[i].getName();
                    String length = String.valueOf(fArr[i].length());

                    String x = "Name of file : " + name + "\n" +"Length of File :" + length + "\n";

                    byte Buffer[] = x.getBytes();

                    foobj.write(Buffer);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception : " + e);
        }
    }
}

