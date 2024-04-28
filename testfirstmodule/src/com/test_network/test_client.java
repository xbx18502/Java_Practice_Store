package com.test_network;

import java.io.*;
import java.net.Socket;

public class test_client {
    public static void main(String[] args) throws IOException {
        System.out.println("launch client");
        Socket s  = new Socket("172.20.10.4",8888);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("hello");
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String s1 = dis.readUTF();
        System.out.println(s1);
        dis.close();
        is.close();

        dos.close();
        os.close();
        s.close();

    }
}
