package me.kc.javapg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by kc. <br/>
 * Date: 17/09/2017.
 */
public class Handler implements InvocationHandler {
    private ProxyIf proxyIf;

    public Handler(ProxyIf proxyIf){
        this.proxyIf = proxyIf;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("BEFORE");
        method.invoke(proxyIf, args);
        System.out.printf("AFTER");
        return null;
    }
}
