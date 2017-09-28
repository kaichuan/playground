package me.kc.javapg.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by kc. <br/>
 * Date: 16/09/2017.
 */
public class BufferTest {
    public static void main(String[] args) throws IOException {
        ByteBuffer bb = ByteBuffer.allocate(10);
        RandomAccessFile a = new RandomAccessFile("hh", "rw");
        FileChannel c = a.getChannel();
        ByteBuffer[] bbs = {bb,bb};
        c.read(bbs);


    }
}
