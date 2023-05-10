package jdbc_demo.tests;

import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;
import java.sql.*;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class Result {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        Class<?> clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)clazz.newInstance();
        String url = "jdbc:mysql:localhost:3306/jdbc_db";
        Properties info = new Properties();
        info.setProperty("uesr","root");
        info.setProperty("password","root");
        Connection connection = driver.connect(url,info);
        System.out.println(connection);
        Statement statement = connection.createStatement();
        String sql = "select id,name from actor";
        //执行指定SQL语句  返回单个result对象
        ResultSet resultSet = statement.executeQuery(sql);
        //while取出数据
        while (resultSet.next()){
            int id =resultSet.getInt(1);
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date date =resultSet.getDate(4);
            System.out.println(id+"\t"+name+"\t"+sex+date);

        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
