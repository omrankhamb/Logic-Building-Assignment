import java.io.*;
import java.net.*;

class Assignment327
{
    public static void main(String Arg[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("------------------------------------------------------------------------");
            System.out.println("---------------------- server is up om ---------------------------------");
            System.out.println("------------------------------------------------------------------------");

            while (true) { 
                Socket socket = serversocket.accept();
                System.out.println("Client conneced to server");

                Thread t = new Thread(() -> HandleRequest(socket));
                t.start();
            }

        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }

    public static void HandleRequest(Socket socket)
    {
        try
        {   
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            while (true) { 

                dos.writeUTF("Enter the source File Name : ");
                String srcFile = dis.readUTF();

                File src = new File(srcFile);
                System.out.println("File found");

                dos.writeUTF("Enter the Destination File Name :");

                String desFile = dis.readUTF();

                File des = new File(desFile);

                FileInputStream fileInputStream  = new FileInputStream(src);
                FileOutputStream fileOutputStream = new FileOutputStream(des);

                byte buffer[] = new byte[1024];

                int iRet = 0;

                while((iRet = fileInputStream.read(buffer)) != -1)
                {
                    fileOutputStream.write(buffer,0,iRet);
                }

                dos.writeUTF("file data written successfully");


            }


        }
        catch(Exception e)
        {
            System.out.println("Exeption is : " + e);
        }
    }
}