package me.kc.javapg;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kc. <br/>
 * Date: 13/09/2017.
 */
public class MakesureT1T2T3 {
    private static ReentrantLock lock = new ReentrantLock();
    private static int state = 0;

    public static void main(String[] args) {
        MakesureT1T2T3 make = new MakesureT1T2T3();
        make.usingReentrantLock();
    }

    public void usingReentrantLock() {
        new ThreadA().run();
        new ThreadB().run();
        new ThreadC().run();
    }

    public static class ThreadA extends Thread {
        @Override
        public void run() {
//            lock.lock();
            for (int i = 0; i < 10; i++) {
                System.out.print("A");
            }
//            lock.unlock();
        }
    }
    public static class ThreadB extends Thread {
        @Override
        public void run() {
//            lock.lock();
            for (int i = 0; i < 10; i++) {
                System.out.print("B");
            }
//            lock.unlock();
        }
    }
    public static class ThreadC extends Thread {
        @Override
        public void run() {
//            lock.lock();
            for (int i = 0; i < 10; i++) {
                System.out.print("C");
            }
//            lock.unlock();
        }
    }


}
