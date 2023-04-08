package com.baijinjing.BIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketIO {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9090);
        System.out.println("服务端启动");

        System.out.println("阻塞");
        Socket client = server.accept();//阻塞
        System.out.println("阻塞结束");
        System.out.println("客户端连接"+client.getPort());

        InputStream in = client.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        System.out.println(reader.readLine());//阻塞
        while (true){

        }
    }
}
