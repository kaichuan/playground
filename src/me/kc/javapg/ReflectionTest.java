package me.kc.javapg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kc. <br/>
 * Date: 20/09/2017.
 */
public class ReflectionTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class aClass = StringTest.class;
        Method method = aClass.getDeclaredMethod("main", new Class[]{});
        method.invoke(aClass, new Object[]{});
        ReentrantLock reentrantLock = new ReentrantLock(false);
        reentrantLock.lock();
    }

}
