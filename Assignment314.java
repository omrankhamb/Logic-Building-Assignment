import java.io.*;
import java.net.*;
import java.util.*;

class Assignment314
{
    public static void main(String Arg[]) {
        try {
            Socket socket = new Socket("127.0.0.1", 9000);
            Scanner sobj = new Scanner(System.in);

            System.out.println("Connection is completed");

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            System.out.print("Enter the Operation (or type 'end' to quit): ");

            while (true) {
                System.out.print("Client : \n");
                String str = sobj.nextLine();

                // send message to server
                dos.writeUTF(str);
                dos.flush();

                if (str.equalsIgnoreCase("end")) {
                    System.out.println("Closing connection...");
                    break;
                }

                // read reply from server
                String reply = dis.readUTF();
                System.out.println("Server: \n" + reply);
            }

            socket.close();
            sobj.close();
        } catch (Exception e) {
            System.out.println("Exception is " + e);
        }
    }
}
