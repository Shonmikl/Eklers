package _2023_05_31.ex;

public class Ex1 {
    private static final Object LOCK = new Object();
    public int get(int a, int b) {
        synchronized (LOCK) {
            int q1 = m1(a);//m1() return 10
            int q2 = m2(b);//m2() return 20
            return q1 + q2;
        }

    }

    private int m1(int a) {
        return a*10;
    }

    private int m2(int a) {
        return a*20;
    }
}
