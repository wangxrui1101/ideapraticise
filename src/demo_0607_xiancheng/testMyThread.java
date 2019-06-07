package demo_0607_xiancheng;

public class testMyThread {
    public static void main(String[] args) {
        //用第一种方法构造Thread子类的方法启动新线程1
        MyThread mt=new MyThread();
        mt.start();


        //用实现runnable接口的方式创建新线程，并启动新线程；
        MyThread2 mt2=new MyThread2();
        Thread th=new Thread(mt2);
        Thread th2=new Thread(mt2);

        th.start();
        th2.start();


        //启动主线程方法
        for (int i = 0; i <10 ; i++) {
            System.out.println("This is main Thread"+i);
        }

    }
}
