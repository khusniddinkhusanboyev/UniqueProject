package Threads;

public class OneMoreThread implements Runnable{
    @Override
    public void run() {
        int i=1;
        for (;;) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Dastur toxtadi");
                return;
            }
        }
    }
}
