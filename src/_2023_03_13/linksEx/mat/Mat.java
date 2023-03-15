package _2023_03_13.linksEx.mat;

public class Mat {
    int get(int a, int b) {
        int q = doA(a);
        int w = doB(b);
        return q + w;
    }

    private static int doB(int b) {
        return b - 22;
    }

    private static int doA(int a) {
        return a * 10;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(new Mat().get(5, 4));
    }
}