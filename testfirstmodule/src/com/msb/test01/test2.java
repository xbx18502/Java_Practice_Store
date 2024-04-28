package com.msb.test01;

import java.io.*;

public class test2 {
    public static void main(String[] args) throws IOException {
        File f = new File("testfirstmodule\\src\\com\\msb\\test01\\test.txt");

        FileWriter fw = new FileWriter(f);
        String i = "114514";
        fw.write(i);
        System.out.println("success");
        fw.close();

        FileReader fr = new FileReader(f);
        char n1;
        while(true){
            n1 = (char)fr.read();
            if(n1==(char)(-1)) break;
            System.out.println(n1);

        }
        fr.close();

    }
}
