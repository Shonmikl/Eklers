package _2023_05_24;

public class Ex3 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new T1());
        Thread thread2 = new Thread(new T2());
        Thread thread3 = new Thread(()-> System.out.println("!!!!"));
        Thread thread4 = new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("******");
            }
        });

        thread1.setName("THREAD: DB-1234/11");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
class T1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("T1: " + i);
        }
    }
}

class T2 implements Runnable {

    @Override
    public void run() {
        for (char i = 'a'; i < 'u'; i++) {
            System.out.println("T2: " + i);
        }
    }
}