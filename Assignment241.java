import  java.io.*;
import java.util.*;
class Assignment241
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        String Fname = null;
        File fobj = null;
        try
        {
            System.out.println("Enter File Name : ");
            Fname = sobj.nextLine();

            fobj = new File(Fname);

            fobj.createNewFile();

            
        }
        catch(Exception e)
        {
            System.out.println("Exception is : "+ e);
        }
        finally
        {
            System.out.println("Program ende successsfully");
            
        }
       
    }
}