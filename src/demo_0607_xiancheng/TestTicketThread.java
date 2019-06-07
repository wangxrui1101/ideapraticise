package demo_0607_xiancheng;

public class TestTicketThread {
    public static void main(String[] args) {
            TicketThread tt=new TicketThread();
            Thread th1=new Thread(tt);
            Thread th2=new Thread(tt);
            Thread th3=new Thread(tt);
            th1.start();
            th2.start();
            th3.start();

    }
}
