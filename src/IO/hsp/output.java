package IO.hsp;/**
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * import org.junit.jupiter.api.Test;
 * @Test添加该注释  可以直接运行method
 */

public class output {
    public static void main(String[] args) {
        new output().write();
    }

    void write(){
        int readt = 0 ;
        String filepath = "C:\\Users\\15708\\Desktop\\book2\\io2.txt";
        FileOutputStream fileoutputStream = null;
        try {
            String str = "hello";
            fileoutputStream = new FileOutputStream(filepath,true);
            fileoutputStream.write('a');
            fileoutputStream.write(str.getBytes());
            fileoutputStream.write(str.getBytes(),0,str.length()-1);
            /**
             * 这三个会叠加 但如果之前有东西  会覆盖
             */
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileoutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
