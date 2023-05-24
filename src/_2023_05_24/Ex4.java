package _2023_05_24;

public class Ex4 extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Ex4 thread = new Ex4();
        thread.start();

        Thread.sleep(1500);
        System.out.println("After 1.5 sec........");

        thread.b = false;
        thread.join(); //дождись пока thread закончит работу.

        System.out.println("Main end");
    }
}