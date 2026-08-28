import com.sun.nio.sctp.HandlerResult;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

class Assignment309
{
    public static void main(String Arg[])
    {
        try
        {
            ServerSocket serverSocket  = new ServerSocket(9000);

            System.out.println("------------------------------------------------------------------");
            System.out.println("-----------------Omprasad server is runnning----------------------");
            System.out.println("------------------------------------------------------------------");


            while (true) { 
                
                Socket socket = serverSocket.accept();
                System.out.println("Connectio with server is done");

                Thread t = new Thread(()->HandleRequest(socket));
                t.start();
            }


        }
        catch(Exception e)
        {
            System.out.println("Exception is : " + e);
        }
    }

        public static void HandleRequest(Socket socket) {
            try {
                System.out.println("Server has accepted");

                DataInputStream dis = new DataInputStream(socket.getInputStream());
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

                dos.writeUTF("Enter the operation");
                dos.flush();

                while (true) {
                    String str = dis.readUTF().toUpperCase();
                    String[] command = str.split(" ");

                    if (command[0].equals("QUIT")) {
                        dos.writeUTF("Server is Down");
                        dos.flush();
                        System.out.println("Server is off");
                        break;
                    }

                    if (command.length < 3) {
                        dos.writeUTF("Invalid input. Format: OP num1 num2");
                        dos.flush();
                        continue;
                    }

                    double d1 = Double.parseDouble(command[1]);
                    double d2 = Double.parseDouble(command[2]);
                    double result = 0.0;

                    switch (command[0]) {
                        case "ADD":
                            result = d1 + d2;
                            break;
                        case "SUB":
                            result = d1 - d2;
                            break;
                        case "MULT":
                            result = d1 * d2;
                            break;
                        case "DIV":
                            result = d1 / d2;
                            break;
                        case "MOD":
                            result = d1 % d2;
                            break;
                        case "MAX":
                            result = Math.max(d1, d2);
                            break;
                        case "MIN":
                            result = Math.min(d1, d2);
                            break;
                        default:
                            dos.writeUTF("Unknown operation");
                            dos.flush();
                            continue;
                    }

                    dos.writeUTF("Result is: " + result);
                    dos.flush();
                }

                socket.close();
            } catch (Exception e) {
                System.out.println("Exception is : " + e);
            }
        }

}