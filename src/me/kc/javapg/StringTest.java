package me.kc.javapg;

/**
 * Created by kc. <br/>
 * Date: 16/09/2017.
 */
public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String a = null;
        sb.append(a);
        System.out.println(sb.toString());

        StringBuffer sb2 = new StringBuffer();
        sb2.append(a);
        System.out.println(sb2.toString());
//        String s1 = "abc";
//        String s2 = "ab";
//        String s3 = "c";
//        String s4 = s2 + s3;
//
//        String st0 = "helloworld";
//        String st1 = "helloworld";
//        String st2 = "hello" + "word";
//
//        System.out.println(st0 == st2);
//        System.out.println(s1 == (s2 + s3));
//        System.out.println(s1 == s4);
    }

    public void test(){
        System.out.println("hellsss");
    }
}
