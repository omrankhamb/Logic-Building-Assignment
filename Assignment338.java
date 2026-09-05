import java.io.*;
import java.net.*;

class Assignment338
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

                dos.writeUTF("Enter the  File Directory : ");
                String srcFile = dis.readUTF();

                File dir = new File(srcFile);
                dos.writeUTF("Enter the  File Name : ");
                srcFile = dis.readUTF();

                String string = "";
                if(dir.isDirectory() && dir.exists())
                {
                    String FileNames[] = dir.list();
                    for(String name : FileNames)
                    {
                        if(name.equals(srcFile))               
                        {
                            File src = new File(srcFile);
                            FileInputStream fileInputStream = new FileInputStream(src);

                            int iRet = 0;
                            byte buffer[] = new byte[1024];
                            while((iRet = fileInputStream.read(buffer))!= -1)
                            {
                                String curr= new String(buffer,0,iRet);
                                string += curr;
                            }
                            break;
                        }
                    }
                }
                System.out.println(string);
                // character ; word ; line ; uppercase ;lowercase ; digtit ; space
                dos.writeUTF(string);
            }


        }
        catch(Exception e)
        {
            System.out.println("Exeption is : " + e);
        }
    }
}