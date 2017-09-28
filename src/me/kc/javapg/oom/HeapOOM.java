package me.kc.javapg.oom;

import java.util.ArrayList;

/**
 * Created by kc. <br/>
 *
 * Date: 16/09/2017.
 */
public class HeapOOM {

    /*
     vm options:  -Xms2m -Xmx2m  -XX:+PrintGC -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        while (true) {
            objects.add(new Object());
        }
    }
}
