package me.kc.javapg;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by kc. <br/>
 * Date: 15/09/2017.
 */
public class LinkedHashMapLRU extends LinkedHashMap<Integer, Integer> {

    private final int MAX_CACHE_SIZE;

    public LinkedHashMapLRU(int cacheSize) {
        super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true);
        MAX_CACHE_SIZE = cacheSize;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        System.out.println("eld: " + eldest.getKey());
        return size() > MAX_CACHE_SIZE;
    }
}
