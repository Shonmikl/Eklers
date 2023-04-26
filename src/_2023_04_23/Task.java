package _2023_04_23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task {
    private static boolean getSize(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        return set.size() == arr.length;
    }

    private static boolean isDuplicated(int[] arr) {
        return !(arr.length == Arrays.stream(arr).distinct().count());
    }

    public static void main(String[] args) {
        // stream --> inter() --> termin()
        int[] arr = {1, 2, 3, 65, 47, 89};
        long s = Arrays.stream(arr)
                .map(el -> el * 10)
                .count();
        /**
         * int[] arr = {1, 2, 1}
         */
    }
}
