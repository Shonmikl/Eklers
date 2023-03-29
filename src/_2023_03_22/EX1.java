package _2023_03_22;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class EX1 {
    public static void main(String[] args) {
//        Info<Integer> info = new Info<>(55555);
//        System.out.println(info);
//        Integer a = info.getValue();
//        System.out.println(a);

    }
}

@AllArgsConstructor
@ToString
class Info<T extends Number & INTER & PORTER> {
    private T value;

    public T getValue() {
        return value;
    }
}

class W {
    public static <T extends Number> T get(ArrayList<T> al) {
        return null;
    }
}

interface INTER {

}

interface PORTER {

}