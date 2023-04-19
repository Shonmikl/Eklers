package _2023_04_17;

import java.util.concurrent.ArrayBlockingQueue;

public class BQ {
    public static void main(String[] args) {

        //todo
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);


        Thread producer = new Thread(() -> {
            String[] words = new String[] {"123456", "abc", "qwerty", "queue", "stack", "array", "list", "nikalay", "mikhail;"};

            for (int i = 0; i < words.length && !Thread.interrupted();) {
                try {
                    Thread.sleep(2000);
                    queue.put(words[i]);
                    System.out.println("producer: записал в очередь " + words[i] +
                            ", число элементов в очереди: " + queue.size());
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            StringBuilder sb = new StringBuilder();
            while (!Thread.interrupted()) {
                try {
                    sb.setLength(0);
                    Thread.sleep(4000);
                    sb.append(queue.take());
                    System.out.println("consumer: обработал из очереди " + sb.reverse() + ", число элементов в очереди: " + queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        consumer.start();
    }
}