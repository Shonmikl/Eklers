package _2023_03_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            list.add(new Random().nextInt(99));
        }

        list.stream()
                .filter(el -> el % 2 == 0);

    }
}
