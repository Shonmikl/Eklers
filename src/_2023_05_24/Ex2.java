package _2023_05_24;

public class Ex2 {
    public static void main(String[] args) {
        ThreadEx1 ex1 = new ThreadEx1();
        ThreadEx2 ex2 = new ThreadEx2();

        ex1.start();
        ex2.start();
    }
}

class ThreadEx1 extends Thread {

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadEx1: " + i);
        }
    }
}

class ThreadEx2 extends Thread {

    @Override
    public void run(){
        for (char i = 'a'; i < 'u'; i++) {
            System.out.println("ThreadEx2: " + i);
        }
    }
}