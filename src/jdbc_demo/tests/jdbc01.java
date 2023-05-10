package jdbc_demo.tests;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
public class jdbc01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //连接方式1
        /**
            Driver driver = new Driver() {
                @Override
                public Connection connect(String url, Properties info) {
                    return null;
                }

                @Override
                public boolean acceptsURL(String url) {
                    return false;
                }

                @Override
                public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) {
                    return new DriverPropertyInfo[0];
                }

                @Override
                public int getMajorVersion() {
                    return 0;
                }

                @Override
                public int getMinorVersion() {
                    return 0;
                }

                @Override
                public boolean jdbcCompliant() {
                    return false;
                }

                @Override
                public Logger getParentLogger() {
                    return null;
                }
            };
            String url = "jdbc:mysql://localhost:3306/demo";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","root");

            Connection connection =  driver.connect(url,properties);

        String sql = "show tables";
        Statement statement = connection.createStatement();
        int rows = statement.executeUpdate(sql);
        //若是dml语句 返回影响行数
        System.out.println(rows>0?"success":"fail");
        statement.close();
        connection.close();
 */
        //连接方式2
        /**
         * 使用反射加载driver类
        Class<?> clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)clazz.newInstance();
        String url = "jdbc:mysql:localhost:3306/jdbc_db";
        Properties info = new Properties();
        info.setProperty("uesr","root");
        info.setProperty("password","root");
        Connection connection = driver.connect(url,info);
        System.out.println(connection);
    */
        /**way3
         public void connect03() {
             Class<?> clazz = Class.forName("com.mysql.jdbc.Driver");
             Driver driver = (Driver) clazz.newInstance();
             String url = "jdbc:mysql:localhost:3306/jdbc_db";
             String user = "root";
             String password = "root";
             DriverManager.registerDriver(driver);
             Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println(connection);
        }
            */

    }
}
