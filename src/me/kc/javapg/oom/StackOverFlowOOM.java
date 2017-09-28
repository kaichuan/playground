package me.kc.javapg.oom;

/**
 * Created by kc. <br/>
 *
 * Date: 16/09/2017.
 */
public class StackOverFlowOOM {

    private static int stackHeight = 0;

    public static void callstack(){
        stackHeight++;
        callstack();
    }

    /*
     vm options:  -Xms2m -Xmx2m -Xss230k  -XX:+PrintGC -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void main(String[] args) {
       callstack();
    }

}
