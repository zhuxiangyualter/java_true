package IO.hsp;/**
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class input {
    public static void main(String[] args) {
        new input().read1();
    }
    void read1(){
        int readt = 0 ;
        String filepath = "C:\\Users\\15708\\Desktop\\book2\\io2.txt";
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
    void read2(){
        int readt = 0 ;
        String filepath = "C:\\Users\\15708\\Desktop\\book2\\io2.txt";
        byte[] buf = new byte[8];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filepath);
            while ((readt = fileInputStream.read(buf)) != -1){
                System.out.println(new String(buf,0, buf.length));
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
}
