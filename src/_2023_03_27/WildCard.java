package _2023_03_27;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {


    }

    public static int get(ArrayList<? super Number> al) {
        int a = 0;
        for (int i = 0; i < al.size(); i++) {
            a = a + a;
        }
        return a;
    }
}

class X{

}

class Y extends X {

}