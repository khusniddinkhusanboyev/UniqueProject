package ExerciseWithW3resource;

public class Thread_Task_1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Person person=new Person();
        Thread thread=new Thread(person);
        thread.start();
        System.out.println("Hello");
    }
}

class Person implements Runnable{
    @Override
    public void run() {
        System.err.println("Husniddin Husanboyev");
    }
}
