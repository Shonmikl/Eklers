package _2023_04_23;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        // stream --> inter() --> termin()
        int[] arr = {1, 2, 3, 65, 47, 89};
        long s = Arrays.stream(arr)
                .map(el -> el *10)
                .count();
        /**
         * int[] arr = {1, 2, 1}
         */
    }
}
