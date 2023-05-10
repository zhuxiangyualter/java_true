package jdbc_demo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 * MySql 的连接和关闭
 */
public class Util {
        //只需要一份  static
    private  static  String user;
    private  static  String password;
    private  static  String url;
    private  static  String driver;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\mysql.properties"));
            //这个name里面的东西需要自己搞
             user = properties.getProperty("user");
             password = properties.getProperty("password");
             url = properties.getProperty("url");
             driver = properties.getProperty("driver");
        } catch (IOException e) {
            //实际开发中
            //调用者可以捕获  也可以默认处理
            throw new RuntimeException(e);
        }

    }
    //连接
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param set
     * @param statement
     * @param connection
     * 需要关闭就传入对象 否则传入null
     */
    public static void close(ResultSet set, Statement statement,Connection connection){
        try {
            if (set != null){
                set.close();
            }
            if (statement != null){
                statement.close();
            }
            if (connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
