package Threads;


class Synchronization {

     void printNumbers(int number)  {
        for (int i = 1; i < number; i++) {
                System.out.print(i+",");
                try{
                    Thread.sleep(500);
                }catch (InterruptedException interruptedException){
                    System.out.println(interruptedException);
                }
            }
       System.out.println();

    }
}
class Thread1 extends Thread{
     Synchronization synchronization;

    public Thread1(Synchronization synchronization) {
        this.synchronization = synchronization;
    }

    @Override
    public void run() {
        synchronization.printNumbers(5);
    }
}

class Thread2 extends Thread{

     Synchronization synchronization;

    public Thread2(Synchronization synchronization) {
        this.synchronization = synchronization;
    }

    @Override
    public void run() {
        synchronization.printNumbers(10);
    }
}
 class MainClass{
    public static void main(String[] args) throws InterruptedException {
        Synchronization obj=new Synchronization();
        Thread1  thread1=new Thread1(obj);
        System.out.println();
        Thread2  thread2=new Thread2(obj);
        thread1.start();
        thread1.join();
        thread2.start();
    }
}