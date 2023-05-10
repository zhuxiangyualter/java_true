package Time_Master;/**
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

public class test01 {
    public static void main(String[] args) {
        demo1 demo1 = new demo1();
        Thread thread = new Thread(demo1);
        thread.start();
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        demo1.setLoop(false);
    }
}
class demo1 implements Runnable{
    int times = 0 ;
    boolean loop = true;
    @Override
    public void run() {
        //自己的业务代码
        while (loop){
            times++;
            System.out.println("喵喵喵，想吃猫"+times+"线程名"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
            if (times == 80){
                System.out.println("小猫是很容易铥的，要小心");
                break;

            }
        }
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}