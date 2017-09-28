package me.kc.javapg.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by kc. <br/>
 * Date: 17/09/2017.
 */
public class Client {

    public static void main(String[] args) {
        ProxyIf agent = new Agent();
        Handler handler = new Handler(agent);
        ClassLoader classLoader = agent.getClass().getClassLoader();
        Class[] interfaces = agent.getClass().getInterfaces();

        ProxyIf proxy = (ProxyIf)Proxy.newProxyInstance(classLoader, interfaces, handler);
        proxy.checkA();
        proxy.checkB();

    }
}
