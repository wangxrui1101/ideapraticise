package demo_0607_xiancheng;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("This is runnable interference implements_mythread2"+i);
        }
    }
}
