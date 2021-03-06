package me.kc.javapg;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by kc. <br/>
 * Date: 22/09/2017.
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "hello", "bye", "ciao", "bye", "ciao");
        Map<String, Integer> counts = list.parallelStream().
                collect(Collectors.toConcurrentMap(
                        w -> w, w -> 1, Integer::sum));
        System.out.println(counts);
    }
}
