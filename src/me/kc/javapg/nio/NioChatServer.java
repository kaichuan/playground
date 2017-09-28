package me.kc.javapg.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * Created by kc. <br/>
 * Date: 17/09/2017.
 */
public class NioChatServer {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.bind(new InetSocketAddress(9998));
        ssc.configureBlocking(false);
        Selector selector = Selector.open();
        ssc.register(selector, SelectionKey.OP_ACCEPT);
        ByteBuffer byteBuffer = ByteBuffer.allocate(256);
        while (ssc.isOpen()) {
            // wait for accept or new message
            selector.select();
            Iterator<SelectionKey> keys = selector.selectedKeys().iterator();
            while (keys.hasNext()) {
                SelectionKey key = keys.next();

                // process accept event
                if (key.isAcceptable() && key.channel() == ssc) {
                    SocketChannel sc = ssc.accept();
                    if (sc != null){
                        sc.configureBlocking(false);
                        String address = (new StringBuilder(sc.socket().getInetAddress().toString())).append(":").append(sc.socket().getPort()).toString();
                        sc.register(selector, SelectionKey.OP_READ, address);
                        keys.remove();
                    }

                }

                // process message
                if (key.isReadable() && key.channel() != ssc) {
                    SocketChannel sc = (SocketChannel) key.channel();
                    byteBuffer.clear();
                    try {
                        sc.read(byteBuffer);
                    } catch (IOException e){
                        key.cancel();
                    }
                    byteBuffer.flip();
                    for (SelectionKey c : selector.keys()) {
                        if (c.isValid() && c.channel() != ssc && c.channel() != sc) {
                            SocketChannel cli = (SocketChannel) c.channel();
                            cli.write(byteBuffer);
                            byteBuffer.rewind();
                        }
                    }
                }
            }
        }
    }


}
