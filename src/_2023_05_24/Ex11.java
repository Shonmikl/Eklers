package _2023_05_24;

public class Ex11 {
    static int count = 0;
    public static synchronized void incr() {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());

        thread1.start();
        thread2.start();

        System.out.println(count);
    }
}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Ex11.incr();
        }
    }
}