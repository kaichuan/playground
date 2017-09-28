package me.kc.javapg;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/**
 * Created by kc. <br/>
 * Date: 14/09/2017.
 */
public class CollectionTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "hello");
        Hashtable hashtable;


//        hashMap.put(11, "yes");
//        hashMap.put(null, "null");
//        hashMap.remove(10);
//        System.out.println(hashMap.get(11));
//
//        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(16, 0.75f,
//                true);
//
//        linkedHashMap.put(1, "jad");
//        linkedHashMap.put(2, "jad2");
//        linkedHashMap.put(3, "jad3");
//        linkedHashMap.put(4, "jad4");
//
//        System.out.println("1. Iterating default LinkedHashMap: ");
//        listAll(linkedHashMap);
//
//
//        System.out.println("get 1 " + linkedHashMap.get(3));
//        listAll(linkedHashMap);
        LinkedHashMapLRU lru = new LinkedHashMapLRU(5);
        for (int i = 0; i < 6; i++){
            lru.put(i, i);
            listAll(lru);
        }
        System.out.println(lru.get(3));
        lru.put(6,6);
        listAll(lru);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    System.out.println("sub");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        while (true){
            System.out.println("hdhd");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
    public static void listAll(LinkedHashMap linkedHashMap){
        linkedHashMap.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }
  //  -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.local.only=false -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false
}
