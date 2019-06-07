package demo_0607_xiancheng;

public class WaitingAndNotify {
    public static void main(String[] args) {
        Object ob=new Object();

        //使用匿名内部类来建立顾客买包子线程

        new Thread(){
            @Override
            public void run() {
                synchronized (ob){
                    System.out.println("通知老板要买包子");
                    try{
                        ob.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("包子已经吃掉了");
                }

            }
        }.start();

        //使用匿名内部类来建立包子铺卖包子的线程

        new Thread(){
            @Override
            public void run() {

                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (ob){
                    System.out.println("包子已经做好了。可以吃了");
                    ob.notify();
                }

            }
        }.start();

    }
}

/*注意事项：

1.两者的锁对象是相同的，
2.匿名内部类的使用方法
3.同步代码块的位置（除此之外还可以使用同步方法，和锁机制来解决线程安全问题）；


 */

