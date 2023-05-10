package IO.hsp;/*
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

import java.io.File;
import java.io.IOException;

public class create1 {
    public static void main(String[] args) {
        create1 create1 = new create1();
        create1.write1();
        create1.write2();
        create1.write3();
        create1.delete();
        create1.dir();
    }

    public void write1(){
        String filepath = "C:\\Users\\15708\\Desktop\\book2\\io.txt";
        File file = new File(filepath);
        try {
            file.createNewFile();
            System.out.println("created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void  write2(){
        File file = new File("C:\\Users\\15708\\Desktop\\book2\\");
        String filename = "io2.txt";
        File file1 = new File(file,filename);
        //在内存里创建了对象  硬盘里没有    只是创建了对象
        try {
            file1.createNewFile();
            System.out.println("第二个成功了");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void write3(){

        String parentpath = "C:\\Users\\15708\\Desktop/book2/";
        String filename = "io3.txt";
        File file = new File(parentpath,filename);
        try {
            file.createNewFile();
            System.out.println("第三个成功了");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void delete(){
        String filepath = "C:\\Users\\15708\\Desktop\\book2\\io.txt";
        File file = new File(filepath);
        File file1 = new File("C:\\Users\\15708\\Desktop\\book2\\temp");
        try {
            file1.createNewFile();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            file.createNewFile();
            System.out.println("created");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (file.delete()){
            System.out.println("删除成功");
        }else {
            System.out.println("没有该文件");
        }

    }
    public void dir(){
        String dirpath = "C:\\Users\\15708\\Desktop\\book2\\a\\b";
        File file = new File(dirpath);
        if (file.exists()){
            System.out.println("存在目录");
        }else {
            if (file.mkdirs()){
                System.out.println(dirpath+"创建了目录");
            }else {
                System.out.println("falied");
            }
        }
    }
}
