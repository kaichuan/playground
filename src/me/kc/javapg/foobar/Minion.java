package me.kc.javapg.foobar;

import java.util.HashMap;

/**
 * Created by kc. <br/>
 * Date: 21/09/2017.
 */
public class Minion {

    public static int[] answer(int[] data, int n) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int x : data) {
            Integer currentCount = counts.get(x);
            if (currentCount == null) currentCount = 0;
            currentCount += 1;
            counts.put(x, currentCount);
        }
        int removeCount = 0;
        for (int x : counts.keySet()){
            if (counts.get(x) > n){
                removeCount += counts.get(x);
            }
        }
        int[] result = new int[data.length - removeCount];
        int j = 0;
        for (int aData : data) {
            if (counts.get(aData) <= n) {
                result[j++] = aData;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3,3,3,3,3,3,3,3,4,3,2,3,4,3,2,1,77,5};
        int n = 4;
        for (int x : answer(data,n)){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
