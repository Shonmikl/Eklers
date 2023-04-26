package _2023_04_24.parStream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    private static final Random RANDOM = new Random();
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            list.add(RANDOM.nextInt(22));
        }

        System.out.println(list.parallelStream().reduce(Integer::sum).get());

        int[] arr = {1, 23, 65, 4, 78, 9, 6, 54, 1, 23};

//        Arrays.stream(arr)
//                .distinct();

        //Arrays.stream(arr) - array
        //list.stream() - collections

        Stream<String> s = Stream.of("asd", "ASDF", "asdfg", "qwert");

//        long l = s
//                .distinct()
//                .count();
//        System.out.println(l);



//
//        long time = System.currentTimeMillis();
//        double sum = list.stream().reduce(Integer::sum).get();
//        System.out.println("SUM: " + sum);
//        System.out.println("TIME: " + (System.currentTimeMillis() - time));

    }
}