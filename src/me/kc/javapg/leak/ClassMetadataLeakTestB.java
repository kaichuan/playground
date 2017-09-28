package me.kc.javapg.leak;

import java.lang.reflect.Proxy;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

/**
 * PermGenRemovalValidator
 * 
 * @author Pierre-Hugues Charbonneau
 * 
 */
public class ClassMetadataLeakTestB {

	private static Map<String, Object> classLeakingMap = new HashMap<>();
	private final static int NB_ITERATIONS_DEFAULT = 50000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int nbIterations = (args != null && args.length == 1) ? Integer.parseInt(args[0]) : NB_ITERATIONS_DEFAULT;

		try {

			for (int i = 0; i< nbIterations; ++i) {
				String fakeLoader = "loader" + i + ".jar";
				URL[] fakeLoaderUrls = new URL[]{new URL(fakeLoader)};
				URLClassLoader loader = new URLClassLoader(fakeLoaderUrls);
				classLeakingMap.put(fakeLoader, Proxy.getProxyClass(loader, ClassB.class));
			}


		} 
		catch (Throwable any) {
			System.out.println("ERROR: " + any);
		}

		System.out.println("Done!");
	}
}