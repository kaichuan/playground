package me.kc.javapg;

import java.util.*;

/**
 * Created by kc. <br/>
 * Date: 14/09/2017.
 */
public class Gener {
    static class Fruit {}
    static class Apple extends Fruit {}
    static class Jonathan extends Apple {}
    static class Orange extends Fruit {}

    public static void main(String[] args) {
//        Fruit[] fruit = new Apple[10];
//        fruit[0] = new Apple(); // OK
//        fruit[1] = new Jonathan(); // OK
//        // Runtime type is Apple[], not Fruit[] or Orange[]:
//        try {
//            // Compiler allows you to add Fruit:
//            fruit[0] = new Fruit(); // ArrayStoreException
//        } catch(Exception e) { System.out.println(e); }
//        try {
//            // Compiler allows you to add Oranges:
//            fruit[0] = new Orange(); // ArrayStoreException
//        } catch(Exception e) { System.out.println(e); }
//        List<? extends Fruit> flist = new ArrayList<Apple>();
//        flist.add(null);
        List<Object> o = new ArrayList<>();
        o.add(1);
        o.add("df");

        List<?> oo = new ArrayList<>();
        oo.size();

        List ooo = new ArrayList<String>();
        ooo.add("dd");

        List list =  Arrays.asList(1,2,3);
        Hashtable t = new Hashtable<>();


    }

    public static void setCo(List<Object> os){
        System.out.println(os.size());
    }
}
