package IO.hsp;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class Read {
    public static void main(String[] args) {
        String srcfilepath = "C:\\Users\\15708\\Desktop\\book2\\io2.txt";
        try {
            FileReader fileReader = new FileReader(srcfilepath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
