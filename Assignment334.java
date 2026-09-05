import java.io.*;
import java.net.*;
import java.time.LocalDate;

class Assignment334
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
                String ans = "";
                if(dir.isDirectory() && dir.exists())
                {
                    String FileNames[] = dir.list();
                    for(String name : FileNames)
                    {
                        File currFile = new File(name);

                        if(currFile.exists() && currFile.isFile())
                        {
                            ans += "File : < " + name + " >\n";
                        }
                        else 
                        {
                            ans += "Directory : < "+ name + "> \n";
                        }
                        
                    }
                }

                dos.writeUTF(ans);
            }


        }
        catch(Exception e)
        {
            System.out.println("Exeption is : " + e);
        }
    }
}