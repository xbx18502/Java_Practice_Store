package com.test_network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class test_server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str1 = dis.readUTF();
        System.out.println("launch server");
        System.out.println(str1);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("received");
        dos.close();
        os.close();

        dis.close();
        is.close();
        s.close();
        ss.close();

    }
}
