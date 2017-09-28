package me.kc.javapg.multithread;

import java.util.concurrent.TimeUnit;

/**
 * Created by kc. <br/>
 * Date: 23/09/2017.
 */
public class DeadLockTest {
    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {
        new Thread(()->{
            synchronized (A) {
                System.out.println("1 get a");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (B) {
                    System.out.println("1 get b");
                }
            }

        }).start();
        new Thread(()->{
            synchronized (B) {
                System.out.println("2 get b");
                synchronized (A) {
                    System.out.println("2 get a");
                }
            }

        }).start();
    }
}
