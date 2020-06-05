package io.bio;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        String serverName = "args[0]";
        int port = 5555;
        try {
            System.out.println("���ӵ�������" + serverName + " ���˿ںţ�" + port);
            //����������ַ �Ͷ˿�
            Socket client = new Socket("127.0.0.1", port);
            System.out.println("Զ��������ַ��" + client.getRemoteSocketAddress());
            //�õ���������Ӧ �����
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            //ʹ���������������  ����������
            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            //�õ�����������Ӧ
            InputStream inFromServer = client.getInputStream();
            //���������  �������ǵ����� ���ͻ��ˣ�
            DataInputStream in = new DataInputStream(inFromServer);
            //��ȡ�������
            System.out.println("��������Ӧ�� " + in.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}