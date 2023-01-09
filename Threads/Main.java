package Threads;

public class Main {
    public static void main(String[] args) {
        Thread thread=new Thread(new OneMoreThread());
        thread.start();
        thread.getPriority();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();
    }
}
