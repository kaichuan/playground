package me.kc.javapg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kc. <br/>
 * Date: 13/09/2017.
 */
public class ReentranctLockExample {

    int count = 0;
    private void increament() {
        for (int i=0;i<10000;i++){
            count ++;
        }
        List a = new ArrayList();

        a.add(5);
    }

    public void firstThread(){
        increament();
    }
    public void secondThread(){
        increament();
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
