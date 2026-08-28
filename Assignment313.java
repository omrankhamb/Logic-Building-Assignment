
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

                str = (Command[1]);

                switch (Command[0]) {
                    case "UPPER":
                        dos.writeUTF(str.toUpperCase());
                        break;

                    case "LOWER":
                        str = str.toLowerCase();
                        dos.writeUTF(str);
                        break;
                    case "LENGTH":
                        int len = str.length();
                        dos.writeUTF("Length of string is : " + len);
                        break;
                    case "REVERSE":
                        char arr[] = str.toCharArray();

                        int left = 0;
                        int right = arr.length-1;

                        while(left <= right)
                        {
                            char ch = arr[left];
                            arr[left] = arr[right];
                            arr[right] =  ch;
                            left++;
                            right--;
                        }

                        str = new String(arr);
                        dos.writeUTF(str.toLowerCase());
                        break;
                    case "PLAINDROME":

                        String str2 = str;
                        char arr2[] = str.toCharArray();

                         left = 0;
                         right = arr2.length - 1;

                        while(left <= right)
                        {
                            char ch = arr2[left];
                            arr2[left] = arr2[right];
                            arr2[right] =  ch;
                            left++;
                            right--;
                        }

                        str = new String(arr2);
                        dos.writeUTF(str);

                        if(str2.equals(str))
                        {
                            dos.writeUTF("string is palindrome");
                        }
                        else
                        {
                            dos.writeUTF("string is not palindrome");
                        }
                        break;
                    case "VOWELS":
                        String ans = "";

                        for(int i = 0 ; i < str.length() ; i++)
                        {
                            if((str.charAt(i) == 'A') || (str.charAt(i) == 'E') || (str.charAt(i) == 'I') || (str.charAt(i) == 'O') || (str.charAt(i) == 'U') )
                            {
                                ans = ans + str.charAt(i);
                            }
                        }
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