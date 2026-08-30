import java.io.*;
import java.net.*;
import java.util.*;

class Assignment328
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
           Socket socket = new Socket("127.0.0.1",9000);

           System.out.println("Connection with server is done ");

           DataInputStream dis = new DataInputStream(socket.getInputStream());
           DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
           String str;

           while (true) { 
                str = dis.readUTF();
                System.out.println(str);
                str = sobj.nextLine();
                dos.writeUTF(str);

                str = dis.readUTF();
                System.out.println(str);
                str = sobj.nextLine();
                dos.writeUTF(str);

                str = dis.readUTF();
                System.out.println(str);

           }

        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }

}