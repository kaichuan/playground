package me.kc.javapg.multithread;

/**
 * Created by kc. <br/>
 * Date: 23/09/2017.
 */
public class TryLock {
    public static void main(String[] args) {
        int c = 0x000f & 0x0002;
        System.out.println(c);
    }
}
