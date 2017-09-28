package me.kc.javapg.oom;

import java.util.ArrayList;

/**
 * Created by kc. <br/>
 *
 * Date: 16/09/2017.
 */
public class ConstantOOM {


    /*
     vm options:  -Xms2m -Xmx2m  -XX:+PrintGC -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        int i = 0;
        while (true) {
            objects.add(String.valueOf(i++).intern());
        }
    }

}
