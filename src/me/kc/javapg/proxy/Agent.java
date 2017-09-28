package me.kc.javapg.proxy;

/**
 * Created by kc. <br/>
 * Date: 17/09/2017.
 */
public class Agent implements ProxyIf {
    @Override
    public void checkA() {
        System.out.println("a");
    }

    @Override
    public void checkB() {
        System.out.println("b");
    }
}
