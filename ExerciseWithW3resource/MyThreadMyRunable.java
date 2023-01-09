package ExerciseWithW3resource;

public class MyThreadMyRunable {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();

        MyRunnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
    }
    
    
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i+": is from MyThread");

        }
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = -100; i <=0 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.err.println(i+": is from MyRunnable");

        }
    }
}
