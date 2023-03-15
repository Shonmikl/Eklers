package _2023_03_15.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class COLL {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(22));
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 == 0 && list.get(i) != 0) {
                list2.add(list.get(i));
            }
        }

        System.out.println(list);
        System.out.println(list2);
    }
}
