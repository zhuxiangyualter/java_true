package Net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class API {
    public static void main(String[] args) throws IOException {
        InetAddress localhost =  InetAddress.getLocalHost();
        System.out.println(localhost);
        InetAddress host1 = InetAddress.getByName("www.baidu.com");
        System.out.println(host1);
        //base on主机名
        InetAddress host2 = InetAddress.getByName("DESKTOP-A80M1SS");
        System.out.println(host2);
        // 通过InetAddress对象获取地址
        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress);
        //获取主机名/域名
        String HostName = host2.getHostName();
        System.out.println(HostName);
        Socket socket = new Socket();
        socket.getInputStream();
        socket.getOutputStream();
        //读写数据  通常在不同主机
    }
}
