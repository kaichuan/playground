package me.kc.javapg.leak;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ClassAInvocationHandler
 * @author Pierre-Hugues Charbonneau
 *
 */
public class ClassBInvocationHandler implements InvocationHandler {

	private Object classBImpl;

	public ClassBInvocationHandler(Object impl) {
	   this.classBImpl = impl;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	   return method.invoke(classBImpl, args);
	}
}
