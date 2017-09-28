package me.kc.javapg.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by kc. <br/>
 * Date: 17/09/2017.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        ByteBuffer byteBuffer = ByteBuffer.allocate(256);
        if (socketChannel.connect(new InetSocketAddress(9999))){
            socketChannel.read(byteBuffer);
            byteBuffer.flip();
            byte[] b = new byte[byteBuffer.limit()];
            byteBuffer.get(b);
            String result = new String(b);
            System.out.println(result);
        }

    }
}
