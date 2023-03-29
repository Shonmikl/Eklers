package _2023_03_29;

import _2023_03_13.linksEx.Link;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        M1(Test1::www);
        M1(() -> System.out.println("%%%%%"));

        List<String> list = Arrays.asList("Nikalay",
                "Vitali", "Sem", "Roma", "Olga", "Sergey", "Mikhail");

        list.forEach(System.out::println);



        Inter inter = new Inter() {
            @Override
            public void get() {
                System.out.println("^^^^^^");
            }
        };

        M1(() -> System.out.println("@@@@@"));
    }

    public static void www() {
        System.out.println("----");
        System.out.println("****");
    }

    public static void M1(Inter inter) {
        System.out.println("//////");
        inter.get();
    }
}

@FunctionalInterface
interface Inter {
    void get();
}