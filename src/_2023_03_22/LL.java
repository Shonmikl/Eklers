package _2023_03_22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LL {
    // 1, 2, 5, 2, 1, 5, 5 -- 10

    //Написать метод, который
    // - генерирует числа ( 20 штук диапазоном до 20 )
    // - принимает число Х
    //Надо пройтись по вашему листу и вернуть лист
    //который содержит нужные последовательности чисел
    //которые в сумме дают Х
    //И вывести длину минимальной последовательности

    public static void main(String[] args) {
        List<Integer> digit = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            digit.add(new Random().nextInt(20));
        }
        System.out.println(digit);
    }
}
