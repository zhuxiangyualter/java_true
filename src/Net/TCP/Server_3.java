package Net.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 * 字符流
 */
public class Server_3 {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);
        //本机的9999端口监听  等待连接
        Socket socket = serverSocket.accept();
        //有客户端连接时，返回socket对象
        System.out.println(socket.getClass());
        //通过inputstream读取
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);


        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("client, 字符类");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();
    }
}
