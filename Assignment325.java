
import java.io.*;
import java.net.*;
import java.net.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

class Assignment323
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
            FileInputStream file = new FileInputStream(fobj);
            while(true)
            {
                Scanner sc = new Scanner(fobj);

                String filecontext = "";
                while (sc.hasNextLine()) {
                filecontext += sc.nextLine() + "\n";   // concatenation
            }
                sc.close();

                dos.writeUTF(filecontext);
            }

            
        }
        catch(Exception e)
        {
            System.out.println("exception is  " +e);
        }
        
    }
}