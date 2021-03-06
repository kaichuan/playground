package me.kc.javapg.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * Created by kc. <br/>
 * Date: 17/09/2017.
 */
public class BlockingEchoServer {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(9999));
        ByteBuffer byteBuffer = ByteBuffer.allocate(256);
        while (true) {
            SocketChannel socketChannel = serverSocketChannel.accept();
            socketChannel.read(byteBuffer);
            byteBuffer.flip();
            socketChannel.write(byteBuffer);
            socketChannel.close();
        }


    }
}
