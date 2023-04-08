package com.baijinjing.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.LinkedList;

public class SocketNIO {
    public static void main(String[] args) throws Exception {
        LinkedList<SocketChannel> clients = new LinkedList<>();
        ServerSocketChannel ss = ServerSocketChannel.open();
        ss.bind(new InetSocketAddress(9090));
        ss.configureBlocking(false);

        while (true) {
            Thread.sleep(1000);
            SocketChannel client = ss.accept();
            if (client == null) {
                System.out.println("null...");
            } else {
                client.configureBlocking(false);
                int port = client.socket().getPort();
                System.out.println("port:" + port);
                clients.add(client);
            }
            ByteBuffer buffer = ByteBuffer.allocateDirect(4096);

            for (SocketChannel c : clients) {
                int nums = c.read(buffer);
                if (nums > 0) {
                    buffer.flip();
                    byte[] target = new byte[buffer.limit()];
                    buffer.get(target);
                    String aaa = new String(target);
                    System.out.println(c.socket().getPort()+":"+aaa);
                    buffer.clear();
                } else if (nums == 0) {

                } else {

                }
            }
        }
    }
}
