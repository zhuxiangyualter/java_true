package Net.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class Client_2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println(socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello".getBytes());
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readlen=0;
        while ((readlen = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readlen));
            //根据实际长度  读取字符串
        }

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
