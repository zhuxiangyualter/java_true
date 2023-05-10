package jdbc_demo.tests;

//import java.io.FileInputStream;
//import java.io.IOException;
//import java.sql.*;
//import java.util.Properties;
//import java.util.Scanner;
//
///**
// * @author 渚相玉
// * @verion 2.6.5
// * @Session Study
// */
//@SuppressWarnings({"all"})
//public class preparedstate {
//    public static void main(String[] args) throws Exception{
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        String pwd = scanner.nextLine();
//        String url = "jdbc:mysql:localhost:3306/jdbc_db";
//        Properties properties = new Properties();
//        try {
//            properties.load(new FileInputStream("src\\mysql.properties"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        String user = properties.getProperty("user");
//        String password = properties.getProperty("password");
//        String driver = properties.getProperty("driver");
//
//        try {
//            Class.forName(driver);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        Connection connection = DriverManager.getConnection(url,user,password);
//        String sql = "";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1,name);
//        preparedStatement.setString(2,pwd);
//        ResultSet resultSet =preparedStatement.executeQuery();
//        resultSet.close();
//        preparedStatement.close();
//        connection.close();
//        //前面已经赋值了  不需要再写SQL
//
//    }
//}
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**

 @author 渚相玉

 @verion 2.6.5

 @Session Study
 */
@SuppressWarnings({"all"})
public class preparedstate {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String pwd = scanner.nextLine();
        String url = "jdbc:mysql://localhost:3306";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("mysql.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection = DriverManager.getConnection(url,user,password);
        String sql = "select * from user where name=? and pwd=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,pwd);
        ResultSet resultSet =preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("name")+" "+resultSet.getString("pwd"));
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}