package ExerciseWithW3resource;

public class Thread_Task_2 {
    public static void main(String[] args) {
        Thread thread=new Thread(new THread1());
        Thread thread1=new Thread(new THread2());
        thread.start();
        thread1.start();
    }
}

class THread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <25 ; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num){
        if (num==1){
            return false;
        }
        boolean flag=true;
        for (int i = 2; i <num/2 ; i++) {
            if (num%i==0){
                flag=false;
            }
        }
        return flag;
    }
}class THread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            if (i%2==0){
                System.err.println(i);
            }
        }
    }

}
