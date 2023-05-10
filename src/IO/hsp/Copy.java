/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
package IO.hsp;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// NullPointerException  造成断点  24
public class Copy {
    public static void main(String[] args)  {
        String srcfilepath = "C:\\Users\\15708\\Desktop\\book2\\io2.txt";
        String desfilepath = "C:\\Users\\15708\\Desktop\\book2\\io5.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            FileInputStream fileInputStream1 = new FileInputStream(srcfilepath);
            FileOutputStream fileOutputStream1 = new FileOutputStream(desfilepath);
            byte[] buf = new byte[1024];
            int readlen = 0;
            while ((readlen = fileInputStream.read(buf)) != -1){
                fileOutputStream.write(buf,0,readlen);
                //使用bug.getBytes可能读不够  因此括号中不能使用buf
            }
            System.out.println("我不好");
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fileInputStream != null){
                    fileInputStream.close();
                }
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
    }
