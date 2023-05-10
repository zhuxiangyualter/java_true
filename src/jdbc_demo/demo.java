package jdbc_demo;

/**
 * @author 渚相玉
 * @verion 2.6.5
 * @Session Study
 */
import java.sql.*;

public class demo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306"; // 数据库连接URL
        String user = "root"; // 数据库登录用户名
        String password = "root"; // 数据库登录密码
        String sql1 = "SHOW DATABASES";
        String sql2 = "USE demo";
        try {
            Connection conn = DriverManager.getConnection(url, user, password); // 连接数据库
            Statement stmt = conn.createStatement(); // 创建Statement对象

            ResultSet rs = stmt.executeQuery("SHOW DATABASES"); // 执行SQL查询语句并获取结果集




            while (rs.next()) { // 遍历结果集并输出每个数据库名
                System.out.println(rs.getString(1));
            }

            rs.close(); // 关闭结果集
            stmt.close(); // 关闭Statement对象
            conn.close(); // 关闭数据库连接
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
