package org.efire.net.common;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestApp {

    public static void main(String[] args) {
        extractA();

        var input = Stream.of("dasd", "bbsdasd", "bzz", "asdd", "ds", "bb");
        var b1 = input.filter(b -> b.startsWith("b")).count();
        System.out.println("count = " + b1);

        var integerStream = Stream.of(111, 222, 333, 111, 222, 333, 111);
        var collect = integerStream.collect(Collectors.toSet());
        collect.stream().forEach(System.out::println);

        var mapStream = Stream.of(Map.of("222", "a"),
                Map.of("11", "a11"),
                Map.of("123", "a123"),
                Map.of("2", "a"),
                Map.of("155", "a155"));

        mapStream.map(a -> a.entrySet()
                .stream().filter(e -> e.getKey().startsWith("1"))
                .map(s -> s.getValue()).collect(Collectors.toList()))
                .forEach(System.out::println);
    }

    private static void extractA() {
        var str = Stream.of("adsa", "dsfdf", "dasdsd", "aass");
        str.filter(a -> a.startsWith("a"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
