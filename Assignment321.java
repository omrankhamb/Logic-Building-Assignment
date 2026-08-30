
import java.io.*;
import java.net.*;
import java.net.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

class Assignment321
{
    public static void main(String Arg[])
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(9000);

            System.out.println("------------------------------------------------------------------------");
            System.out.println("----------------------- server is running ------------------------------");
            System.out.println("------------------------------------------------------------------------");

            while (true) { 
                Socket socket = serverSocket.accept();
                System.out.println("Connection with client");
                Thread t = new Thread(()-> HandleRequest(socket));
                t.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception : " + e);
        }
    }

    public static void HandleRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            System.out.println("Come in while loop");

            String str = dis.readUTF();
            File fobj = null;

            fobj = new File(str);

            if(fobj.exists())
            {
                dos.writeUTF("File alredy exist");
            }
            else
            {
                fobj.createNewFile();
                dos.writeUTF("File successfully created successfullly");
            }
            FileOutputStream file = new FileOutputStream(fobj);
            while(true)
            {
                str = dis.readUTF();
                
                byte obj[] = str.getBytes();
                file.write(obj);
                dos.flush();    
                dos.writeUTF("data get added in file successfully");   
            }

            
        }
        catch(Exception e)
        {
            System.out.println("exception is  " +e);
        }
        
    }
}