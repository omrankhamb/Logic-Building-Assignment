
import java.io.*;
import java.net.*;
import java.net.*;

class Assignment311
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

            while(true)
            {
                String str = dis.readUTF();
                str = str.toUpperCase();
                str = str.replaceAll("\\s+", " ");
                String Command[] = str.split(" ");

                Integer iNo = Integer.parseInt(Command[1]);

                switch (Command[0]) {
                    case "EVEN":
                        if(iNo % 2 == 0)
                        {
                            dos.writeUTF("Number is Even");
                        }
                        else
                        {
                            dos.writeUTF("Number is not Even");
                        }
                        break;

                    case "ODD":
                        if(iNo % 2 != 0)
                        {
                            dos.writeUTF("Number is ODD");
                        }
                        else 
                        {
                            dos.writeUTF("Number is not ODD");
                        }
                        break;
                    case "PRIME":
                        boolean bflag = true;
                        for(int i = 2 ; i < (iNo / 2 + 1) ; i++)
                        {
                            if(iNo % i == 0)
                            {
                                bflag = false;
                            }
                        }

                        if(bflag == false)
                        {
                            dos.writeUTF("NUMBER is Not Prime");
                        }
                        else
                        {
                            dos.writeUTF("NUMBER is Prime");
                        }
                        break;
                    case "PERFECT":
                        break;
                    case "FACTORIAL":
                        int factorial = 1;

                        while(iNo != 1)
                        {
                            factorial = factorial * iNo ;
                            iNo--;
                        }
                        dos.writeUTF("Factorial is : " + factorial);
                        break;
                    case "REVERSE":
                        int ians = 0;

                        while(iNo != 0)
                        {
                            int digit = iNo % 10;
                            ians = ians * 10  + digit;
                            iNo = iNo  / 10;
                        }
                        dos.writeUTF("Reverse number is : " + ians);
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("exception is  " +e);
        }
        
    }
}