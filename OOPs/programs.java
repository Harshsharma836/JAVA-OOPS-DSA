//Getter and Setter

//class Cars{
//     private String carName = "";
//     public void setName(String name){
//         this.carName = name;
//     }
//     public void getName(){
//         System.out.println(this.carName);
//     }
//}


// Abstract

//abstract class CarsRequiere{
//    abstract void carGates();
//    void carLigths(){
//        System.out.println("Total 4 front 2 and back 2");
//    }
//}
//
//class NewWagnar extends CarsRequiere{
//    void carGates(){
//        System.out.println("Total 4 gates");
//    }
//}

// Inheritance
//
//class Hospital{
//    Hospital(){
//        System.out.println("Super class constructor");
//    }
//    String PatientName (String patient){
//        return patient;
//    }
//}
//
//class ManipalHospital extends Hospital{
//    ManipalHospital(){
//        System.out.println("Child class constructor");
//    }
//}








// Thread

class MyThread extends Thread{
    public void run(){
        int temp = 0;
        while(temp <= 100){
            System.out.println("I am thread 1");
            temp++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int temp = 0;
        while(temp <= 100){
            System.out.println("I am thread 2");
            temp++;
        }
    }
}

class MyThread3 implements Runnable{
    public void run(){
        int temp = 100;
        while(temp >= 0){
            System.out.println("i am a thread 3");
            temp--;
        }
    }
}

public class programs {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        MyThread2 thread2 = new MyThread2();
        thread1.start();
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.start();

        MyThread3 thread3 = new MyThread3();
        Thread thread = new Thread(thread3);
        thread.start();
    }
}
