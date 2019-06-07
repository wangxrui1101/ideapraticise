package demo_0607_xiancheng;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketThread implements Runnable {
    static private int ticket = 50;
    Lock rt = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            rt.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(20);
                    System.out.println(Thread.currentThread().getName() + "ticket is" + ticket);
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    rt.unlock();
                }
            }
        }
    }
}
