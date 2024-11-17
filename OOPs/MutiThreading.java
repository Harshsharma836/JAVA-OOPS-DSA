// Using extend thread class

class Thread1 extends Thread{
    @Override
    public void run(){
        int a = 100;
        while(a > 0) {
            System.out.println("Hi i am thread 1");
            a--;
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        int a = 100;
        while(a > 0) {
            System.out.println("Hi i am thread 2");
            a--;
        }
    }
}


// Implementing Runnable interface

class MyThreadRunnable1 implements Runnable{
   public void run(){
       System.out.println("I am a thread 1 ");
   }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread 2 ");
    }
}


// Main Class

public class MutiThreading {
    public static void main(String[] args) {

        //        Thread1 first = new Thread1();
        //        Thread2 second = new Thread2();
        //        first.start();
        //        second.start();


        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread one = new Thread(t1);
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread two = new Thread(t2);
        one.start();
        two.start();

    }

    // Life cycle of thread

}