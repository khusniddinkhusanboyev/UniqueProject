package ExerciseWithW3resource;

public class ThreadOddEven {
    public static void main(String[] args) {
        ThreadOdd threadOdd=new ThreadOdd();
        ThreadEven threadEven=new ThreadEven();
        Thread thread=new Thread(threadEven);
        threadOdd.start();
        try {
            threadOdd.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.start();




    }
}
class ThreadOdd extends Thread{
    @Override
    public void run() {
        System.out.println("Odd Numbers: ");
        for (int i = 1; i < 20; i++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}

class ThreadEven implements Runnable{
    @Override
    public  void run() {
        System.err.println("Even Numbers: ");
        for (int i = 1; i <=20 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i%2==0){
                System.err.println(i);
            }
        }
    }
}

class Color{
    public static final String BLACK="";
}
