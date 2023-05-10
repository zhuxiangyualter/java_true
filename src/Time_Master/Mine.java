package Time_Master;/**
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Mine {

    public static void main(String[] args) {
        test demo = new test();
        Thread thread = new Thread(demo);
        thread.start();
    }
}

/**
 * 最后需要重新设置各种时间
 */
 class test implements Runnable{
     final Scanner scanner = new Scanner(System.in);
     static int i = 1 ;
     @Override
     public void run() {

     }
     void read(){
         int readt = 0 ;
         //String filepath = "C:\\Users\\15708\\Desktop\\book2\\io2.txt";
         String filepath = scanner.next();
         FileInputStream fileInputStream = null;
         try {
             fileInputStream = new FileInputStream(filepath);
             while ((readt = fileInputStream.read()) != -1){
                 System.out.println((char) readt);
             }
         } catch (IOException e) {
             throw new RuntimeException(e);
         }finally {
             try {
                 fileInputStream.close();
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
         }
     }
     /**
      * 上传读取文件实例方法
      * 接下来是交互
      */
     void stop(){
         while (i != 0){
             try {
                 Thread.sleep(20*1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             i--;
         }
         i++;
     }

     /**
      * 暂停时间
      */
     public void begin1(){
         System.out.println("Hi,I am an OpenAI Language Model.How can i assist you?");
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }//仅测试
     }

     /**引入头
      *
      */
     void begin2(){
         String sc1 =scanner.next();
         while (i != 0){
             try {
                 Thread.sleep(20*1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             i--;
         }
         i++;
         System.out.println("您好，请上传您的个人信息,以供我可以更好的分析。");

     }
     /**
      * 提示上传
      */
    void begin3(){
        //想起来了...需要IO流
        //编写程序  读取文件
        while (i != 0){
            try {
                Thread.sleep(20*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i--;
        }
        i++;
        read();
        System.out.println("正在读取文件中...");
        System.out.println("...");
        while (i != 0){
            try {
                Thread.sleep(20*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i--;
        }
        i++;
        System.out.println("读取成功");
    }
    /**上传文件
     */

     void analysis(){
         System.out.println("正在分析中...");
         System.out.println("...");
         while (i != 0){
             try {
                 Thread.sleep(20*1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             i--;
         }
         i++;
     }
     void answer(){
         System.out.println("根据分析，您与数学和解的可能行最大");
         System.out.println("正在分析您与数学和解的可能性");
         while (i != 0){
             try {
                 Thread.sleep(20*1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             i--;
         }
         i++;
     }

    }

