package Time_Master;/**
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

import java.util.Scanner;

public class test00 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Runtime runtime = Runtime.getRuntime();
        int i = runtime.availableProcessors();
        System.out.println(i);
        //获取当前机器CPU数量
        me me = new me();
        Thread thread = new Thread(me);
        System.out.println(new Thread(me).getState());
        new Thread(me).start();

        //第一个进程
//        new Thread(me).start();
        //第二个进程
//        new Thread(me).start();
        //第三个进程
        cat cat = new cat();
        cat.setDaemon(true);

    }
}
// 使用线程
class cat extends Thread{
    int times = 0 ;
    @Override
    public void run() {
        //自己的业务代码
        while (true){
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
}
class U extends Thread{
    int times_1 = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("hello,world"+"次数是"+ (++times_1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times_1 == 10){
                break;
            }
        }
    }
}
class me implements Runnable{
    int time2 = 0;
    @Override
    public void run() {
        while (true){
            ++time2;
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
class demo extends cat implements Runnable{
    int zeo = 0;
    @Override
    public void run() {
        while (true) {
            zeo++;
            System.out.println("子线程里面的线程"+zeo);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            if (zeo == 4){
                System.out.println("孙子没了");
                break;
            }
        }
    }
}
class winsum{
    public static int number0 = 100;
    public void sells(){
        number0--;
    }
    public int destructor(){
        return number0;
    }
}
class win1 extends winsum implements Runnable{

    @Override
    public void run() {
        while (true){
            number0--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class win2 extends winsum implements Runnable{
    @Override
    public void run() {
        while (true){
            number0--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
class win3 extends winsum implements Runnable{
    @Override
    public void run() {
        while (true){
            number0--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
