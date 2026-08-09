
import java.io.*;
import java.util.Scanner;


class program245
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        File fobj = null;
        FileWriter foobj = null;
        String str = null;
        String data = "Omprasad Rankhamb";

        try
        {
            System.out.println("Enter the File Name To write :");
            str = sobj.nextLine();

            fobj = new File(str);

            foobj = new FileWriter(fobj);

            foobj.write(data);

            foobj.close();


        }
        catch(Exception e)
        {
            System.out.println("Exeption is : " + e);
        }
        finally
        {
            System.out.println("Program is ended successfully");
        }

    }
}