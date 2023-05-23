package Net.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class Server_2 {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);
        //本机的9999端口监听  等待连接
        Socket socket = serverSocket.accept();
        //有客户端连接时，返回socket对象
        System.out.println(socket.getClass());
        //通过inputstream读取
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readlen=0;
        while ((readlen = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readlen));
            //根据实际长度  读取字符串
        }

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hi,client".getBytes());
        socket.shutdownOutput();
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
