package io.bio;

import java.net.*;
import java.io.*;

public class Server extends Thread
{
    private ServerSocket serverSocket;

    public Server(int port) throws IOException
    {
        serverSocket = new ServerSocket(port);
//        serverSocket.setSoTimeout(10000);
    }

    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("�ȴ�Զ�����ӣ��˿ں�Ϊ��" + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();
                System.out.println("Զ��������ַ��" + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("лл�����ң�" + server.getLocalSocketAddress() + "\nGoodbye!");
                server.close();
            }catch(SocketTimeoutException s)
            {
                System.out.println("Socket timed out!");
                break;
            }catch(IOException e)
            {
                e.printStackTrace();
                break;
            }
        }
    }
    public static void main(String [] args)
    {
        int port = 5555;
        try
        {
            Thread t = new Server(port);
            t.run();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}