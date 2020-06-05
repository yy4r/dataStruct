package io.bio;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        String serverName = "args[0]";
        int port = 5555;
        try {
            System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
            //连接主机地址 和端口
            Socket client = new Socket("127.0.0.1", port);
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            //得到主机的相应 输出流
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            //使用输出流发送数据  到服务器端
            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            //得到服务器端相应
            InputStream inFromServer = client.getInputStream();
            //获得输入流  输入流是到程序 （客户端）
            DataInputStream in = new DataInputStream(inFromServer);
            //读取输入的流
            System.out.println("服务器响应： " + in.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}