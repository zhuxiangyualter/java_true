package Net.TCP;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class Client_3 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println(socket.getClass());
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("server,字符类");
        bufferedWriter.newLine();//插入一个字符   表写入内容结束  要求对方使用readline
        bufferedWriter.flush();  //字符类需要手动刷新  否则数据不会写入数据通道

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);


        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
